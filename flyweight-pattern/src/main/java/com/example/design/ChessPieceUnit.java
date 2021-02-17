package com.example.design;

/**
 * ChessPieceUnit.
 * 享元类, 棋子的公共属性
 * @author zhangteng 2/8/21
 */
public class ChessPieceUnit {

    private int id;

    private String text;

    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
        RED, BLACK
    }

}
