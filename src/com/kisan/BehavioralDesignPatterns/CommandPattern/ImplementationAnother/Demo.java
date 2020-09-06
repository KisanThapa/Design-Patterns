package com.kisan.BehavioralDesignPatterns.CommandPattern.ImplementationAnother;

import com.howtodoinjava.designpattern.command.homeautomation.fan.Fan;
import com.howtodoinjava.designpattern.command.homeautomation.fan.StartFanCommand;
import com.howtodoinjava.designpattern.command.homeautomation.fan.StopFanCommand;
import com.howtodoinjava.designpattern.command.homeautomation.light.Light;
import com.howtodoinjava.designpattern.command.homeautomation.light.TurnOnLightCommand;

/**
 * Demo class for HomeAutomation
 *
 */
public class Demo {
	public static void main(String[] args) {
		Light livingRoomLight = new Light();
		Fan livingRoomFan = new Fan();
		Light bedRoomLight = new Light();
		Fan bedRoomFan = new Fan();

		HomeAutomationRemote remote = new HomeAutomationRemote();

		remote.setCommand(new TurnOnLightCommand(livingRoomLight));
		remote.buttonPressed();
		System.out.println("*********************************");

		remote.setCommand(new TurnOnLightCommand(bedRoomLight));
		remote.buttonPressed();
		System.out.println("*********************************");

		remote.setCommand(new StartFanCommand(livingRoomFan));
		remote.buttonPressed();
		System.out.println("*********************************");

		remote.setCommand(new StopFanCommand(livingRoomFan));
		remote.buttonPressed();
		System.out.println("*********************************");

		remote.setCommand(new StartFanCommand(bedRoomFan));
		remote.buttonPressed();
		System.out.println("*********************************");

		remote.setCommand(new StopFanCommand(bedRoomFan));
		remote.buttonPressed();
		System.out.println("*********************************");
	}
}
