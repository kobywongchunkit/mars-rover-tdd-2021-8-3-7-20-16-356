package com.afs.tdd.command;

import com.afs.tdd.motioncontol.MotionControl;

public class TurnRightCommand implements Command {
    private MotionControl motionControl;

    public TurnRightCommand(MotionControl motionControl){
        this.motionControl = motionControl;
    }

    @Override
    public void execute(){
        motionControl.turnRight();
    }
}