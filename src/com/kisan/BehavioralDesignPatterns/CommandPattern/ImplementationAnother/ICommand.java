package com.kisan.BehavioralDesignPatterns.CommandPattern.ImplementationAnother;

/**
 * Command Interface which will be implemented by the exact commands.
 *
 */
@FunctionalInterface
public interface ICommand {
	public void execute();
}
