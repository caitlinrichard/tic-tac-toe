package io.github.caitlinrichard.tictactoe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.Group;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class TicTacToeGame extends Application {
    @Override
    public void start(Stage stage) {
        double gridStartX = 200.0;
        double gridEndX = 440.0;
        double gridTopY = 50.0;
        double gridBottomY = 290.0;
        double gridIncrement = 80.0;

        // Horizontal midpoint is 320
        // Vertical midpoint is 240
        Line line = new Line();
        line.setStartX(gridStartX);
        line.setStartY(gridTopY);
        line.setEndX(gridEndX);
        line.setEndY(gridTopY);

        Line line2 = new Line();
        line2.setStartX(gridStartX);
        line2.setStartY(gridTopY + gridIncrement);
        line2.setEndX(gridEndX);
        line2.setEndY(gridTopY + gridIncrement);

        Line line3 = new Line();
        line3.setStartX(gridStartX);
        line3.setStartY(gridTopY + gridIncrement * 2);
        line3.setEndX(gridEndX);
        line3.setEndY(gridTopY + gridIncrement * 2);

        Line line4 = new Line();
        line4.setStartX(gridStartX);
        line4.setStartY(gridTopY + gridIncrement * 3);
        line4.setEndX(gridEndX);
        line4.setEndY(gridTopY + gridIncrement * 3);   
        
        Line line5 = new Line();
        line5.setStartX(gridStartX);
        line5.setStartY(gridTopY);
        line5.setEndX(gridStartX);
        line5.setEndY(gridBottomY);

        Line line6 = new Line();
        line6.setStartX(gridStartX + gridIncrement);
        line6.setStartY(gridTopY);
        line6.setEndX(gridStartX + gridIncrement);
        line6.setEndY(gridBottomY);

        Line line7 = new Line();
        line7.setStartX(gridStartX + gridIncrement * 2);
        line7.setStartY(gridTopY);
        line7.setEndX(gridStartX + gridIncrement * 2);
        line7.setEndY(gridBottomY);

        Line line8 = new Line();
        line8.setStartX(gridStartX + gridIncrement * 3);
        line8.setStartY(gridTopY);
        line8.setEndX(gridStartX + gridIncrement * 3);
        line8.setEndY(gridBottomY);

        Group root = new Group(line, line2, line3, line4, line5,
                                line6, line7, line8);

        // Set the scene.
        Scene scene = new Scene(root, 640, 480);
        
        // Handle mouse click. Will be used to detect which
        // spot of the game grid was clicked in.
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                System.out.println(e.getSceneX());
                System.out.println(e.getSceneY());
            }
        };

        scene.setOnMouseClicked(eventHandler);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
