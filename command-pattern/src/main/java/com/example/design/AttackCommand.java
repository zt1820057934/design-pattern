package com.example.design;

/**
 * AttackCommand.
 *
 * @author zhangteng 2/17/21
 */
public class AttackCommand implements Command {
    public void execute() {
        System.out.println("攻击command");
    }
}
