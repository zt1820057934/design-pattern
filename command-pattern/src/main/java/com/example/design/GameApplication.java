package com.example.design;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.omg.CORBA.Request;

/**
 * GameApplication.
 * 获取命令、组成队列、依次执行
 * @author zhangteng 2/17/21
 */
public class GameApplication {

    private static final int MAX_HANDLED_REQ_COUNT_PER_LOOP = 100;
    private Queue<Command> queue = new LinkedList<Command>();

    public void mainloop() {

        while (true) {
            // 获取请求
            List<Request> requests = new ArrayList<Request>();
            for (Request request : requests) {
                Command command = null;
                if(request.operation().equals("attack")) {
                    command = new AttackCommand();
                } else if(request.operation().equals("start")) {
                    command = new StartCommand();
                }
                // ...
                queue.add(command);
            }

            int handledCount = 0;
            while(handledCount < MAX_HANDLED_REQ_COUNT_PER_LOOP) {
                if(queue.isEmpty()) {
                    break;
                }
                Command command = queue.poll();
                command.execute();
                handledCount++;
            }

        }
    }

}
