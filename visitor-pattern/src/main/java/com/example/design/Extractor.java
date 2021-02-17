package com.example.design;

/**
 * Extractor.
 * 文本抽取
 * @author zhangteng 2/17/21
 */
public class Extractor implements Visitor {

    public void visit(PdfFile pdfFile) {
        System.out.println("抽取pdf文本内容");
    }

    public void visit(WordFile wordFile) {
        System.out.println("抽取word文本内容");
    }

}
