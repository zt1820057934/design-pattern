package com.example.design;

/**
 * ChessPiece.
 * 象棋棋子
 * @author zhangteng 2/8/21
 */
public class ChessPiece {

    private ChessPieceUnit chessPieceUnit;

    private int positionX;

    private int postionY;

    public ChessPiece(ChessPieceUnit chessPieceUnit, int positionX, int postionY) {
        this.chessPieceUnit = chessPieceUnit;
        this.positionX = positionX;
        this.postionY = postionY;
    }

    // 省略getter、setter方法

}
