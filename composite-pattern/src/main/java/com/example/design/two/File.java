package com.example.design.two;

/**
 * File.
 *
 * @author zhangteng 2/8/21
 */
public class File extends FileSystemNode {

    public File(String path) {
        super(path);
    }

    public int countNumOfFiles() {
        return 1;
    }

}
