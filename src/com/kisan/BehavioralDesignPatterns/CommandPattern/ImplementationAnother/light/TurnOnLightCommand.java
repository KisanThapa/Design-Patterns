package com.kisan.BehavioralDesignPatterns.CommandPattern.ImplementationAnother.light;

import com.howtodoinjava.designpattern.command.homeautomation.ICommand;

/**
 * Light stop Command where we are encapsulating both Object[light] and the
 * operation[turnOff] together as command. This is the essence of the command.
 *
 */
public class TurnOnLightCommand implements ICommand {

	Light light;

	public TurnOnLightCommand(Light light) {
		super();
		this.light = light;
	}

	public void execute() {
		System.out.println("Turning on light.");
		light.turnOn();
	}

}
