package com.kisan.BehavioralDesignPatterns.State;

public class Main {
    public static void main(String[] args) {

        var eraserCanvas = new Canvas();
        eraserCanvas.setCurrentTool(new EraserTool());

        eraserCanvas.mouseDown();
        eraserCanvas.mouseUp();

        // new selection tool
        var selectionCanvas = new Canvas();
        selectionCanvas.setCurrentTool(new SelectionTool());

        selectionCanvas.mouseDown();
        selectionCanvas.mouseUp();

    }

}
