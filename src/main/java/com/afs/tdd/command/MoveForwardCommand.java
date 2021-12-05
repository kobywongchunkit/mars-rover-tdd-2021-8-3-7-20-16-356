package com.afs.tdd.command;

import com.afs.tdd.motioncontol.MotionControl;

public class MoveForwardCommand implements Command {
    private MotionControl motionControl;

    public MoveForwardCommand(MotionControl motionControl){
        this.motionControl = motionControl;
    }

    @Override
    public void execute(){
        motionControl.moveForward();
    }
}