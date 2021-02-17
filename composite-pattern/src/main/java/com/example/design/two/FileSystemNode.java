package com.example.design.two;

/**
 * FileSystemNode.
 * 实现二，文件和目录区分开，提高扩展性
 * @author zhangteng 2/8/21
 */
public abstract class FileSystemNode {

    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();

    public String getPath() {
        return path;
    }

}
