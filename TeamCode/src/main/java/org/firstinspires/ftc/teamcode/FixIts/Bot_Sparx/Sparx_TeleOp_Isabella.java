package org.firstinspires.ftc.teamcode.FixIts.Bot_Sparx;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name = "Sparx: Isabella")
public class Sparx_TeleOp_Isabella extends OpMode {

    public double speedMultiply = 0.50;
    public Sparx_Isabella Bot = new Sparx_Isabella();

    @Override
    public void init() {

        Bot.initSparx(hardwareMap);
    }
    @Override
    public void loop () {
        drive();
        speedControl();
        servo();
        ledControl();
    }
    public void speedControl() {
        if (gamepad1.dpad_right == true) {
            speedMultiply = 0.25;
        }
        else if (gamepad1.dpad_down == true) {
            speedMultiply = 0.50;
        }
        else if (gamepad1.dpad_left == true) {
            speedMultiply = 0.75;
        }
        else if (gamepad1.dpad_up == true) {
            speedMultiply = 1.0;
        }
    }

    public void drive() {
        if (gamepad1.left_stick_y > 0.1) {
            Bot.driveBackward(speedMultiply * gamepad1.left_stick_y);
        }
        else if (gamepad1.left_stick_y < -0.1) {
            Bot.driveForward(speedMultiply * gamepad1.left_stick_y);
        }
        else if (gamepad1.left_stick_x > 0.1) {
            Bot.rotateRight(speedMultiply * gamepad1.left_stick_x);
        }
        else if (gamepad1.left_stick_x < -0.1) {
            Bot.rotateLeft(speedMultiply * gamepad1.left_stick_x);
        }
        else
            Bot.stopMotors();
    }
    public void servo() {
        if (gamepad1.a == true ) {
            Bot.lowerFlag();
        }
        else if (gamepad1.y == true) {
            Bot.raiseFlag();
        }
        else if (gamepad1.x == true) {
            Bot.waveFlagLeft();
        }
        else if (gamepad1.b == true) {
            Bot.waveFlagRight();
        }
        else if (gamepad1.right_stick_button == true) {
            Bot.initFlag();
        }
    }
    public void ledControl() {
        if (gamepad1.left_trigger > 0.1) {
            Bot.setLedPattern(RevBlinkinLedDriver.BlinkinPattern.STROBE_RED);
        }
        else if (gamepad1.right_trigger > 0.1) {
            Bot.setLedPattern(RevBlinkinLedDriver.BlinkinPattern.STROBE_WHITE);
        }
    }

}
