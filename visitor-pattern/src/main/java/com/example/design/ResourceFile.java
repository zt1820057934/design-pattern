package com.example.design;

/**
 * ResourceFile.
 *
 * @author zhangteng 2/17/21
 */
public abstract class ResourceFile {

    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract public void accept(Visitor visitor);

}
