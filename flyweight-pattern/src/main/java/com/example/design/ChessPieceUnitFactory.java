package com.example.design;

import java.util.HashMap;
import java.util.Map;

/**
 * ChessPieceUnitFactory.
 * 棋子公共属性的工厂，初始化
 * @author zhangteng 2/8/21
 */
public class ChessPieceUnitFactory {

    private static final Map<Integer, ChessPieceUnit> pieces = new HashMap<Integer, ChessPieceUnit>();

    static {
        pieces.put(1, new ChessPieceUnit(1,"車", ChessPieceUnit.Color.BLACK));
        pieces.put(2, new ChessPieceUnit(2,"馬", ChessPieceUnit.Color.BLACK));
        // ....
    }

    public static ChessPieceUnit getChessPiece(int chessPieceId) {
        return pieces.get(chessPieceId);
    }

}
