package com.example.graphics;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GraphicsApp extends Application {
    Stage fenster;
    Scene rectangularScene, circleScene;
    TextField widthtext, heighttext, radiustext;
    Label areaR, umfangR, areaC, umfangC;
    ExtendedButton toscene1, toscene2;

    ExtendedButton exitbutton;


    @Override
    public void start(Stage primaryStage) {
        try {

            BorderPane rectangular = new BorderPane();
            rectangular.setCenter(gridRectangular());
            rectangularScene = new Scene(rectangular, 400, 400);
            BorderPane circle = new BorderPane();
            circle.setCenter(gridCircle());
            circleScene = new Scene(circle, 400, 400);

            primaryStage.setScene(rectangularScene);
            primaryStage.setTitle("Rectengular Graphics App");
            fenster = primaryStage;
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    GridPane gridRectangular() {
        GridPane grid = new GridPane();
        //abstand von oben
        grid.setPadding(new Insets(10));
        widthtext = new TextField();
        heighttext = new TextField();
        areaR = new Label();
        umfangR = new Label();
        toscene2 = new ExtendedButton("Change to Circle", scene2);
        exitbutton = new ExtendedButton("Exit", exit);
        Button compute = new Button("Compute");
        //grid.setGridLinesVisible(true);
        compute.setOnAction(rectengularevent);
        grid.setHgap(10);
        grid.setVgap(10);
        int lablecolon = 0;
        int textfieldcolon = 4;
        int buttoncolon = 4;

        GridPane.setHalignment(toscene2, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(toscene2, javafx.geometry.VPos.CENTER);

        GridPane.setHalignment(exitbutton, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(exitbutton, javafx.geometry.VPos.CENTER);

        grid.add(new Label("Width"), lablecolon, 0);
        grid.add(widthtext, textfieldcolon, 0);
        grid.add(new Label("Height"), lablecolon, 1);
        grid.add(heighttext, textfieldcolon, 1);
        grid.add(compute, buttoncolon, 3);
        grid.add(new Label("Area"), lablecolon, 6);
        grid.add(new Label("Circumference"), lablecolon, 5);
        grid.add(areaR, textfieldcolon, 6);
        grid.add(umfangR, textfieldcolon, 5);
        grid.add(toscene2, buttoncolon, 10);
        grid.add(exitbutton, buttoncolon, 20);

        return grid;
    }

    GridPane gridCircle() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        radiustext = new TextField();
        areaC = new Label();
        umfangC = new Label();
        toscene1 = new ExtendedButton("Change to Rectangular", scene1);
        exitbutton = new ExtendedButton("Exit", exit);
        Button compute = new Button("Compute");
        //grid.setGridLinesVisible(true);
        compute.setOnAction(circleevent);
        grid.setHgap(10);
        grid.setVgap(10);
        int lablecolon = 0;
        int textfieldcolon = 4;
        int buttoncolon = 4;

        GridPane.setHalignment(toscene1, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(toscene1, javafx.geometry.VPos.CENTER);

        GridPane.setHalignment(exitbutton, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(exitbutton, javafx.geometry.VPos.CENTER);

        grid.add(new Label("Radius"), lablecolon, 0);
        grid.add(radiustext, textfieldcolon, 0);
        grid.add(new Rectangle(20, 26, Color.TRANSPARENT), lablecolon, 1);
        grid.add(compute, buttoncolon, 3);
        grid.add(new Label("Area"), lablecolon, 6);
        grid.add(new Label("Circumference"), lablecolon, 5);
        grid.add(areaC, textfieldcolon, 6);
        grid.add(umfangC, textfieldcolon, 5);
        grid.add(toscene1, buttoncolon, 10);
        grid.add(exitbutton, buttoncolon, 20);

        return grid;
    }


    void calculateRectangle() {
        double width = 0;
        double height = 0;
        try {
            width = Double.parseDouble(widthtext.getText());
            height = Double.parseDouble(heighttext.getText());
        } catch (Exception e) {
            System.out.println("Error");
        }
        var calcRect = new Rectangular(0, 0, height, width);
        double area = calcRect.computeArea();
        double umfang = calcRect.computeCircumference();
        this.areaR.setText(String.valueOf(area));
        this.umfangR.setText(String.valueOf(umfang));
    }

    void calculateCircle() {
        double radius = 0;
        try {
            radius = Double.parseDouble(radiustext.getText());
        } catch (Exception e) {
            System.out.println("Error");
        }
        var calcCirc = new Circle(0, 0, radius);
        double area = calcCirc.computeArea();
        double umfang = calcCirc.computeCircumference();
        this.areaC.setText(String.valueOf(area));
        this.umfangC.setText(String.valueOf(umfang));
    }


    EventHandler<ActionEvent> rectengularevent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            calculateRectangle();
        }

    };
    EventHandler<ActionEvent> circleevent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            calculateCircle();
        }

    };
    EventHandler<ActionEvent> scene2 = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            fenster.setTitle("Circle Graphics App");
            fenster.setScene(circleScene);
            fenster.show();
        }

    };
    EventHandler<ActionEvent> scene1 = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            fenster.setTitle("Rectangular Graphics App");
            fenster.setScene(rectangularScene);
            fenster.show();
        }

    };
    EventHandler<ActionEvent> exit = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            Platform.exit();
        }

    };

    public static void main(String[] args) {
        launch(args);
    }
}
