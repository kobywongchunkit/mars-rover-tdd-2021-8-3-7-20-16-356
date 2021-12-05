package com.afs.tdd;

import com.afs.tdd.command.*;
import com.afs.tdd.motioncontol.*;

public class MarsRover {
    private MotionControl motionControl;
    private CommandInvoker commandInvoker = new CommandInvoker();

    public MarsRover(int x, int y, String direction) {
        motionControl = new MotionControl(x,y,direction);
    }

    public void executeCommand(String commands){
        commands.chars()
                .mapToObj(i -> (char)i)
                .forEach(s -> {
            commandInvoker.addOrder(getCommandByChar(s));
        });
        commandInvoker.sendOrders();
    }

    public String getStatus(){
        return motionControl.toString();
    }
    private Command getCommandByChar (char command) {
        switch (command) {
            case 'M':
                return new MoveForwardCommand(motionControl);
            case 'L':
                return new TurnLeftCommand(motionControl);
            case 'R':
                return new TurnRightCommand(motionControl);
        }
        return null;
    }
}


