package com.kisan.BehavioralDesignPatterns.ChainofResponsibilty;

public class WebServer {

    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void serve(HttpRequest request) {
        handler.handle(request);
    }
}
