package com.example.graphics;

import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ExtendedButton extends Button {
    public ExtendedButton(String label, EventHandler eventHandler) {
        super(label);
        this.setOnAction(eventHandler);
        //this.setPrefSize(25, 25);
    }
}
