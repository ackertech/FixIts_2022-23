package org.firstinspires.ftc.teamcode.FixIts.Bot_Fernando;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Fernando_Daniel extends FourMotorDrive_Daniel {
        //Dedlare Robot Variables
        public Servo flag= null;
        public HardwareMap hwBot = null;
        //Default Constructor for the Robot
        public Fernando_Daniel() {}
        //Method to Initialize the Robot Hardware when User presses Init Button
        public void initRobot (HardwareMap hwMap) {

            hwBot = hwMap;
            //Hardware Mapping Between Name on Robot and Variable Name in Code
            frontLeftMotor = hwBot.dcMotor.get("front_left_motor");
            frontRightMotor = hwBot.dcMotor.get("front_right_motor");
            rearLeftMotor = hwBot.dcMotor.get("rear_left_motor");
            rearRightMotor = hwBot.dcMotor.get("rear_right_motor");

            //Direction of Motors as placed on the robot
            frontLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
            frontRightMotor.setDirection(DcMotorSimple.Direction.FORWARD);
            rearLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
            rearRightMotor.setDirection(DcMotorSimple.Direction.FORWARD);

            //Using Method from Drivetrain Class to set the motor run modes
            setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            setMotorRunModes(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

            //Motor behavior when no power is applied
            frontLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            rearLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            rearRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

            //Initializing Servos that is used for any robot mechanisms
            flag = hwBot.get(Servo.class, "flag");
            flag.setDirection(Servo.Direction.FORWARD);
        }
            //Robot Methods for Raising, Lowering, and Waving the Flag
            public void lowerFlag(){
                flag.setPosition(0);
            }
            public void raiseFlag () {

            flag.setPosition(0.475);
        }
             public void waveFlagLeft () {

            flag.setPosition(0.38);
        }
            public void waveFlagRight () {

            flag.setPosition(0.55);
        }
            public void initFlag () {

            flag.setPosition(.8);
        }
    }

