package fr.afpa;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;

/**
 * JavaFX App
 */
public class App extends Application {
    private int sum = 0;
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {

        // TITLE IN STAGE
        stage.setTitle("ADDER");

        // ICON
        Image icon = new Image(getClass().getResourceAsStream("icon.png"));
        // Add icon in stage
        stage.getIcons().add(icon);

        // SCENE
        // INSTANCIATION
        // TextArea
        TextArea textAreaAdder = new TextArea(null);
        textAreaAdder.setEditable(false);
        textAreaAdder.setPrefHeight(100);
        textAreaAdder.setWrapText(true);

        // ScrollPane
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(textAreaAdder);

        // GridPan 5 columns and 2 lines
        GridPane gridPane10But = new GridPane();

        // Buttons 0->9
        for (int i = 0; i <= 9; i++) {
            Button buttoni = new Button(String.valueOf(i));

            buttoni.setOnAction(e -> {
                String text = textAreaAdder.getText();
                Button clikedButton = (Button) e.getTarget();
                String btext = clikedButton.getText();
                sum = sum + Integer.valueOf(btext); 
                if (text == null) {
                    textAreaAdder.setText(btext);
                } else {
                    textAreaAdder.setText(text + " + " + btext);
                }
            });

            if (i < 5) {
                gridPane10But.add(buttoni, i, 0);
            } else {
                gridPane10But.add(buttoni, i - 5, 1);
            }
        }

        gridPane10But.setAlignment(Pos.CENTER);
        gridPane10But.setHgap(2);
        gridPane10But.setVgap(2);

        // Buttons "Delete All" + "Calculate"
        Button deleteAllButton = new Button("Delete All");
        Button calculateButton = new Button("Calculate");

        // HBox2Buttons
        HBox hBox2Buttons = new HBox(deleteAllButton, calculateButton);
        hBox2Buttons.setSpacing(20);
        hBox2Buttons.setAlignment(Pos.CENTER);

        // VBoxG => General : 3 lines
        VBox vBoxG = new VBox(textAreaAdder, gridPane10But, hBox2Buttons);
        vBoxG.setAlignment(Pos.CENTER);
        vBoxG.setPadding(new Insets(5, 20, 5, 20));
        vBoxG.setSpacing(15);

        // ASSEMBLY
        Scene scene = new Scene(vBoxG, 300, 300);

        // ACTIONS
        deleteAllButton.setOnAction(e -> {
            textAreaAdder.setText(null);
            sum = 0;
        });

        calculateButton.setOnAction(e -> {
            textAreaAdder.setText(textAreaAdder.getText() + " = " + sum); 
        });

        stage.setScene(scene);
        stage.show();
    }

}