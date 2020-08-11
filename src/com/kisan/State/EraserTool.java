package com.kisan.State;

public class EraserTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Eraser icon...");
    }

    @Override
    public void mouseUp() {
        System.out.println("Something has erased.");
    }
}
