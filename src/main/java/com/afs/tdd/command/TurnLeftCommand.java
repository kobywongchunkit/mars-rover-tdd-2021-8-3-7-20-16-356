package com.afs.tdd.command;

import com.afs.tdd.motioncontol.MotionControl;

public class TurnLeftCommand implements Command {
    private MotionControl motionControl;

    public TurnLeftCommand(MotionControl motionControl){
        this.motionControl = motionControl;
    }

    @Override
    public void execute(){
        motionControl.turnLeft();
    }
}