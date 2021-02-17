package com.example.design;

/**
 * Use.
 *
 * @author zhangteng 2/17/21
 */
public class Use {

    public static void main(String[] args) {
        ResourceFile pdfFile = new PdfFile("a.pdf");
        ResourceFile wordFile = new WordFile("b.doc");

        Extractor extractor = new Extractor();
        pdfFile.accept(extractor);
        wordFile.accept(extractor);

        Compress compress = new Compress();
        pdfFile.accept(compress);
        wordFile.accept(compress);
    }

}
