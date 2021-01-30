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
        double gridLeftX = 200.0;
        double gridRightX = 440.0;
        double gridTopY = 50.0;
        double gridBottomY = 290.0;
        double gridIncrement = 80.0;

        // Horizontal midpoint is 320
        // Vertical midpoint is 240
        Line line = new Line();
        line.setStartX(gridLeftX);
        line.setStartY(gridTopY);
        line.setEndX(gridRightX);
        line.setEndY(gridTopY);

        Line line2 = new Line();
        line2.setStartX(gridLeftX);
        line2.setStartY(gridTopY + gridIncrement);
        line2.setEndX(gridRightX);
        line2.setEndY(gridTopY + gridIncrement);

        Line line3 = new Line();
        line3.setStartX(gridLeftX);
        line3.setStartY(gridTopY + gridIncrement * 2);
        line3.setEndX(gridRightX);
        line3.setEndY(gridTopY + gridIncrement * 2);

        Line line4 = new Line();
        line4.setStartX(gridLeftX);
        line4.setStartY(gridTopY + gridIncrement * 3);
        line4.setEndX(gridRightX);
        line4.setEndY(gridTopY + gridIncrement * 3);   
        
        Line line5 = new Line();
        line5.setStartX(gridLeftX);
        line5.setStartY(gridTopY);
        line5.setEndX(gridLeftX);
        line5.setEndY(gridBottomY);

        Line line6 = new Line();
        line6.setStartX(gridLeftX + gridIncrement);
        line6.setStartY(gridTopY);
        line6.setEndX(gridLeftX + gridIncrement);
        line6.setEndY(gridBottomY);

        Line line7 = new Line();
        line7.setStartX(gridLeftX + gridIncrement * 2);
        line7.setStartY(gridTopY);
        line7.setEndX(gridLeftX + gridIncrement * 2);
        line7.setEndY(gridBottomY);

        Line line8 = new Line();
        line8.setStartX(gridLeftX + gridIncrement * 3);
        line8.setStartY(gridTopY);
        line8.setEndX(gridLeftX + gridIncrement * 3);
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
                // Check which box was clicked.
                // From gridStartX to gridStartX+increment is 0
                // Take the x pos, subtract gridstartx, divide by increment
                // then you get the coordinate.
                int xCoordinate = (int) Math.floor((e.getSceneX() - gridLeftX) / gridIncrement);
                int yCoordinate = (int) Math.floor((e.getSceneY() - gridTopY) / gridIncrement);

                System.out.println(xCoordinate + " " + yCoordinate);

                // Time to draw a character.
                
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
