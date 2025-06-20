//TODO: I still need to work out how to update my rr 0.5.x code to the new 1.0 rr

package org.firstinspires.ftc.teamcode.teamcode.states.autonomous.examples;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Trajectory;
import com.acmerobotics.roadrunner.TrajectoryBuilder;

import org.firstinspires.ftc.teamcode.teamcode.hardware.RobotHardware;
import org.firstinspires.ftc.teamcode.teamcode.roadrunner.MecanumDrive;
import org.firstinspires.ftc.teamcode.teamcode.stateengine.State;

public class SplinePathRR implements State {

    private boolean isDone = false;

    private RobotHardware rh = null;

    private MecanumDrive drive = null;
    private TrajectoryBuilder trajBuild = null;

    private Pose2d[] pathPoses = null;

    @Override
    public void init(RobotHardware rh) {
        this.rh = rh;
//        drive = new MecanumDrive(rh.op.hardwareMap);
//
//        drive.setPoseEstimate( pathPoses[0] );
//
//        trajBuild = drive.trajectoryBuilder( pathPoses[0] );
//
//        for (int i = 1; i < pathPoses.length; i++) {
//            trajBuild.splineTo(pathPoses[i].vec(), pathPoses[i].getHeading());
//        }
    }

    public SplinePathRR createPath(Pose2d[] pathPoses) {

        // positive X is forward
        // positive Y is left
        // X and Y are in inches
        // heading is in degrees counter-clockwise

        if (pathPoses.length <= 1) {
            return null;
        }

        this.pathPoses = pathPoses;

        return this;
    }

    @Override
    public void run() {
        isDone = true;
//        drive.followTrajectory(trajBuild.build());
    }

    @Override
    public boolean isDone() {
        return isDone;
    }
}
