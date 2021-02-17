package com.example.design.two;

import java.util.ArrayList;
import java.util.List;

/**
 * Directory.
 *
 * @author zhangteng 2/8/21
 */
public class Directory extends FileSystemNode {

    private List<FileSystemNode> subNodes = new ArrayList<FileSystemNode>();

    public Directory(String path) {
        super(path);
    }

    public int countNumOfFiles() {
        int numOfFiles = 0;
        for (FileSystemNode node : subNodes) {
            numOfFiles += node.countNumOfFiles();
        }
        return numOfFiles;
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
