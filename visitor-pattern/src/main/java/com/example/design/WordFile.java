package com.example.design;

/**
 * WordFile.
 *
 * @author zhangteng 2/17/21
 */
public class WordFile extends ResourceFile {

    public WordFile(String filePath) {
        super(filePath);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
