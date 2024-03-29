// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.lib.drivers.util.PearadoxSparkMax;
import frc.robot.Constants.ShooterConstants;

import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class Shooter extends SubsystemBase {
  /** Creates a new shooter. */
  private final PearadoxSparkMax pearadoxSparkMax = new PearadoxSparkMax(
    ShooterConstants.shooterID, MotorType.kBrushless, 
    IdleMode.kBrake, ShooterConstants.shooterLimit, false);
  public Shooter() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    

  }
}
