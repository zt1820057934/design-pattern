package com.example.design;

/**
 * PdfFile.
 *
 * @author zhangteng 2/17/21
 */
public class PdfFile extends ResourceFile {

    public PdfFile(String filePath) {
        super(filePath);
    }

    // this 是 巧妙的利用多态特性，避免 vistor.vistor(resourceFile) 引起的静态编译无法通过问题
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
