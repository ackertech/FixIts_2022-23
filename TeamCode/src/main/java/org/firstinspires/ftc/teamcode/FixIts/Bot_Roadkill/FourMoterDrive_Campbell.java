package org.firstinspires.ftc.teamcode.FixIts.Bot_Roadkill;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class FourMoterDrive_Campbell {

    // Declared Variables for Motors
    public DcMotor frontLeftMotor;
    public DcMotor frontRightMotor;
    public DcMotor rearLeftMotor;
    public DcMotor rearRightMotor;

    // This is required as part of the FIRST SDK. MEMORIZE
    public LinearOpMode linearOp = null;
    public void setLinearOp (LinearOpMode linearOPModeOp) {
        this.linearOp = linearOp;
    }

    public void setMotorRunModes (DcMotor.RunMode mode) {
        frontLeftMotor.setMode(mode);
        frontRightMotor.setMode(mode);
        rearLeftMotor.setMode(mode);
        rearRightMotor.setMode(mode);
    }
    //Stops the Motors
    public void stopMotors () {
        frontLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        rearLeftMotor.setPower(0);
        rearRightMotor.setPower(0);
    }

    //Drives Forward

    public void driveForward (double power) {
        frontLeftMotor.setPower(power);
        frontRightMotor.setPower(power);
        rearLeftMotor.setPower(power);
        rearRightMotor.setPower(power);
    }

    //Drives Backwards
    public void driveBackward (double power) {
        frontLeftMotor.setPower(-power);
        frontRightMotor.setPower(-power);
        rearLeftMotor.setPower(-power);
        rearRightMotor.setPower(-power);
    }

    //Rotates Left
    public void rotateLeft (double power) {
        frontLeftMotor.setPower(-power);
        frontRightMotor.setPower(power);
        rearLeftMotor.setPower(-power);
        rearRightMotor.setPower(power);
    }

    //Rotates Right
    public void rotateRight (double power) {
        frontLeftMotor.setPower(power);
        frontRightMotor.setPower(-power);
        rearLeftMotor.setPower(power);
        rearRightMotor.setPower(-power);
    }

}
