package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ball extends Application {
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle circle = new Circle(100,100,100);
        circle.setFill(Color.web("#008bff"));

        pane.getChildren().add(circle);
        Scene scene = new Scene(pane);

        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN:
                    circle.setCenterY(circle.getCenterY() + 100);
                    break;
                case UP:
                    circle.setCenterY(circle.getCenterY() - 100);
                    break;
                case LEFT:
                    circle.setCenterX(circle.getCenterX() - 100);
                    break;
                case RIGHT:
                    circle.setCenterX(circle.getCenterX() + 100);
                    break;
            }
        });

        primaryStage.setTitle("Java FX Assignment 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}