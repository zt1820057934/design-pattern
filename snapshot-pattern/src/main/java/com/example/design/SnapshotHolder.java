package com.example.design;

import java.util.Stack;

/**
 * SnapshotHolder.
 *
 * @author zhangteng 2/17/21
 */
public class SnapshotHolder {

    private Stack<Snapshot> snapshots = new Stack<Snapshot>();

    public Snapshot popSnapshot() {
        return !snapshots.isEmpty() ? snapshots.pop() : new Snapshot("");
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }

}
