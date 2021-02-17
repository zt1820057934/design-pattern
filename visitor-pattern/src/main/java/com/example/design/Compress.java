package com.example.design;

/**
 * Compress.
 *
 * @author zhangteng 2/17/21
 */
public class Compress implements Visitor {

    public void visit(PdfFile pdfFile) {
        System.out.println("压缩pdf文件");
    }

    public void visit(WordFile wordFile) {
        System.out.println("压缩word文件");
    }
}
