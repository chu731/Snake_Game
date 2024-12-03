package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Snake {

    private ArrayList<Node> snakeBody;

    public Snake() {
        snakeBody = new ArrayList<>();
        snakeBody.add(new Node(80,0));
        snakeBody.add(new Node(70,0));
        snakeBody.add(new Node(60,0));
        snakeBody.add(new Node(50,0));
    }

    public ArrayList<Node> getSnakeBody() {
        return snakeBody;
    }

    public void drawSnake(Graphics g) {
        g.setColor(Color.WHITE);

        for (int i = 0; i < snakeBody.size(); i++) {
            if (i == 0) {
                g.setColor(Color.red);
            } else {
                g.setColor(Color.WHITE);
            }

            Node n = snakeBody.get(i);

            if (n.x >= Main.width) {
                n.x = 0;
            }
            if (n.x < 0) {
                n.x = Main.width - Main.CELL_SIZE;
            }
            if (n.y >= Main.hight) {
                n.y = 0;
            }
            if (n.y < 0) {
                n.y = Main.hight - Main.CELL_SIZE;
            }
            g.fillOval(n.x, n.y, Main.CELL_SIZE, Main.CELL_SIZE);
        }
    }
}


