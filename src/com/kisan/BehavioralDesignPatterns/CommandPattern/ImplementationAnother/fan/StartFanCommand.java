package com.kisan.BehavioralDesignPatterns.CommandPattern.ImplementationAnother.fan;

import com.howtodoinjava.designpattern.command.homeautomation.ICommand;

/**
 * Fan Start Command where we are encapsulating both Object[fan] and the
 * operation[start] together as command. This is the essence of the command.
 *
 */
public class StartFanCommand implements ICommand {

	Fan fan;

	public StartFanCommand(Fan fan) {
		super();
		this.fan = fan;
	}

	public void execute() {
		System.out.println("starting Fan.");
		fan.start();
	}

}
