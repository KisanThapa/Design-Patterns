package com.kisan.BehavioralDesignPatterns.ChainofResponsibilty;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        boolean isAuthenticated = request.getUserName().equals("admin")
                && request.getPassword().equals("123");

        System.out.println("Authentication: " + isAuthenticated);
        return !isAuthenticated;
    }
}
