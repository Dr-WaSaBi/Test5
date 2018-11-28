/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Moves;

public class AutonModes extends Command {
  public AutonModes() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
  
  public static void GoLeftRunOverAllRobots() {
    /***
     * This will make the robot in auton mode make a sharp left and run over all
     * alliance partners robots. Hoora!
     */

    Moves.turnrobot(-90);
    Moves.rollforward(45, 100);
  }

  public static void GoFullBoarBlowThruFarWall() {
    /***
     * Go as fast as you can and see if you
     * can hit the far wall of the field and knock 
     * as many driver stations off bench.  So much 
     * fun.
     */
    Moves.rollforward(100,100); //move at max speed forward, 
  }

  
  public static void SelfDestruct(int timer) {
    /**
     * Robot will move to center of field and detanate internal charages
     * Takes an intager as to how long to wait in seconds before blowing 
     * the C4 you've installed onboard your robot.
     */

  }
}
