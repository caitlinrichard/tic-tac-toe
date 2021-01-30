package io.github.caitlinrichard.tictactoe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.collections.ObservableList;
import javafx.scene.Node;

public class TicTacToeGame extends Application {
    @Override
    public void start(Stage stage) {
        // Layout: 
        //  - root is a vbox
        //  - hbox on top (for the game grid).
        //  - hbox below (for the controls / display etc.)
        VBox root = new VBox();
        HBox gameGridBox = new HBox();
        HBox controlsBox = new HBox();
        Button restartButton = new Button("Restart");

        gameGridBox.setAlignment(Pos.CENTER);
        controlsBox.setAlignment(Pos.CENTER);

        root.getChildren().add(gameGridBox);
        root.getChildren().add(controlsBox);
        controlsBox.getChildren().add(restartButton);

        GridPane ticTacToeGrid = new GridPane();
        ticTacToeGrid.getStyleClass().add("game-grid");

        gameGridBox.getChildren().add(ticTacToeGrid);

        restartButton.setOnMousePressed(e -> {
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    ObservableList<Node> cellNodes = ticTacToeGrid.getChildren();
                    for (Node n : cellNodes) {
                        StackPane sp = (StackPane) n;
                        Text cellText = (Text) (sp.getChildren().get(0));
                        cellText.setText("");
                    }
                }
            }
        });

        // Set column / row sizing.
        for (int i = 0; i < 3; ++i) {
            ColumnConstraints column = new ColumnConstraints(40);
            ticTacToeGrid.getColumnConstraints().add(column);

            RowConstraints row = new RowConstraints(40);
            ticTacToeGrid.getRowConstraints().add(row);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // For each cell, we want a pane with text inside of it.
                StackPane pane = new StackPane();
                Text text = new Text();
                text.setTextAlignment(TextAlignment.CENTER);
                pane.getChildren().add(text);
                StackPane.setAlignment(text, Pos.CENTER);

                // On click - set X or Y depending on whose turn it is.
                pane.setOnMouseReleased(e -> {
                    Text cellText = (Text) pane.getChildren().get(0);
                    cellText.setText("X"); // TODO: This needs to reflect whoever's turn it is.
                });

                // Set up style via CSS.
                pane.getStyleClass().add("game-grid-cell");
                if (i == 0) {
                    pane.getStyleClass().add("first-column");
                }
                if (j == 0) {
                    pane.getStyleClass().add("first-row");
                }
                ticTacToeGrid.add(pane, i, j);
            }
        }

        // Set the scene.
        Scene scene = new Scene(root, 250, 200, Color.WHITE);
        scene.getStylesheets().add(getClass().getResource("game.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
