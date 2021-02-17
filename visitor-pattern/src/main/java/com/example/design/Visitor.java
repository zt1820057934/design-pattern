package com.example.design;

/**
 * Visitor.
 * 一个很宽泛意义的接口，抽出vistor可以更符合开闭原则，当出现新的操作时，只需要再实现此接口
 * @author zhangteng 2/17/21
 */
public interface Visitor {

    void visit(PdfFile pdfFile);

    void visit(WordFile wordFile);

}
