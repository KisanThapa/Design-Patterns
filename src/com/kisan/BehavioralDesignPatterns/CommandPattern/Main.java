package com.kisan.BehavioralDesignPatterns.CommandPattern;

import com.kisan.BehavioralDesignPatterns.CommandPattern.fx.Button;

public class Main {

    public static void main(String[] args) {

        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);

        button.click();

    }

}
