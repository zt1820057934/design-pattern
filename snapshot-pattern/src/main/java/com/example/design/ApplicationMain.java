package com.example.design;

import java.util.Scanner;

/**
 * ApplicationMain.
 *
 * @author zhangteng 2/17/21
 */
public class ApplicationMain {

    /*

       实现以下效果  键盘输入 -> 输出
       hello
       :list   -> hello
       word
       :list   -> helloworld
       :undo
       :list   -> hello
     */

    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if(input.equals(":list")) {
                System.out.println(inputText.toString());
            } else if(input.equals(":undo")) {
                Snapshot snapshot = snapshotHolder.popSnapshot();
                inputText.resoreSnapshot(snapshot);
            } else {
                snapshotHolder.pushSnapshot(inputText.createSnapshot());
                inputText.append(input);
            }
        }
    }

}
