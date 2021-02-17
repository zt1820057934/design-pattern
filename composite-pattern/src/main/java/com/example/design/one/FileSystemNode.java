package com.example.design.one;

import java.util.ArrayList;
import java.util.List;

/**
 * FileSystemNode.
 * 实现一，文件和目录没有区分
 * @author zhangteng 2/8/21
 */
public class FileSystemNode {

    private String path;

    private boolean isFile;

    private List<FileSystemNode> subNodes = new ArrayList<FileSystemNode>();

    public FileSystemNode(String path, boolean isFile) {
        this.path = path;
        this.isFile = isFile;
    }

    public int countNumOfFiles() {
        if(isFile) {
            return 1;
        }
        int numOfFiles = 0;
        for (FileSystemNode node : subNodes) {
            numOfFiles += node.countNumOfFiles();
        }
        return numOfFiles;
    }

    public String getPath() {
        return path;
    }

    public void addSubNode(FileSystemNode fileOrDir) {
        subNodes.add(fileOrDir);
    }

    public void removeSubNode(FileSystemNode fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for(; i < size; i++) {
            if(subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if(i < size) {
            subNodes.remove(i);
        }
    }

}
