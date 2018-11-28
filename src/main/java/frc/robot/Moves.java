/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 * A class for making the robot move.
 */
public class Moves extends InstantCommand {
  /**
   * predefinded moves for the robot
   * @author Russell Riker
   * @version 1.1
   */
  public Moves() {
    super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
  }

  public static void rollforward(float distance, int speed){
    /***
     * Move the robot forward x amount of distance @ x speed
     * idea: could it return a true if there were encoders that could say if it was
     * a successfule move?
     * @param float distance 
     * @param int speed
     * 
     */
  }
  public static void turnrobot(int degreeofturn){
    /***
     * Takes a positive or negtive number for the number of degrees to turn. 
     * -x for left, +x for right. Max of 180
     */
  }
  public static void rollbackward(float distance, int speed){
    /***
     * Move the robot backwards x amount of distance @ x speed
     */

  }

  public static void hoverAdoveField(float targethight){
    /**
     * Lift robot off of the field
     * 
     * @param float targethight
     * 
     */
  }

} // End of Class
