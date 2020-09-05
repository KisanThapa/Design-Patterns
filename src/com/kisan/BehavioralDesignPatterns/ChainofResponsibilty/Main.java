package com.kisan.BehavioralDesignPatterns.ChainofResponsibilty;

public class Main {
    public static void main(String[] args) {

        var request = new HttpRequest("admin", "1234");

//        WebServer server = new WebServer(new Authenticator(new Logger(new Compressor(null))));

        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);

        server.serve(request);

    }
}
