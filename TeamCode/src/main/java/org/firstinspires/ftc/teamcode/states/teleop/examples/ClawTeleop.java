package org.firstinspires.ftc.teamcode.teamcode.states.teleop.examples;


import org.firstinspires.ftc.teamcode.teamcode.hardware.RobotHardware;
import org.firstinspires.ftc.teamcode.teamcode.stateengine.State;

public class ClawTeleop implements State {

    RobotHardware rh = null;

    @Override
    public void init(RobotHardware rh) {
        this.rh = rh;
    }

    @Override
    public void run() {

        if ( rh.controls.clawButton() && !rh.exampleClawH.clawMoving() ) {
            rh.exampleClawH.setClaw( !rh.exampleClawH.isClawClosed() );
        }

    }

    @Override
    public boolean isDone() {
        return false;
    }
}
