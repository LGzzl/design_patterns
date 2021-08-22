package com.zzl.behavior.command;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 遥控器类
 * @author zzl
 * @since 2021/8/22 18:43
 */
public class RemoteControl {

    private final Queue<Command> tvCommands = new LinkedList<>();

    private final Stack<Command> historyCommand = new Stack<>();

    /**
     * 添加命令到队列
     * @param command 命令
     */
    public void addCommand(Command command){
        tvCommands.add(command);
    }

    /**
     * 执行所有命令
     */
    public void action(){
        while (!tvCommands.isEmpty()){
            Command c = tvCommands.poll();
            c.execute();
            historyCommand.push(c);
        }
        //撤销时并不需要当前的状态
        historyCommand.pop();
    }

    /**
     * 回到上一次状态,撤销操作
     * @param length 撤销几步操作
     */
    public void reverse(int length){
        for (int i = 0; i < length; i++) {
            Command command = historyCommand.pop();
            command.execute();
        }
    }
}
