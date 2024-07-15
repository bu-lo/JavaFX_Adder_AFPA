package fr.afpa;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // stage.setHeight(400);
        // stage.setWidth(300);

        //TITLE IN STAGE
        stage.setTitle("Adder");

        //SCENE
        //INSTANCIATION
        //TextField
        TextField textFieldAdder = new TextField(null);
        textFieldAdder.setEditable(false);

        //Buttons 0->9
        //for (int i=0 ; i<=9 ; i++){
        //Button b{} = new Button(i);  => DOESN'T WORK
        //System.out.println(button);
        //}

        Button b0 = new Button("0");
        Button b1 = new Button("1"); 
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");

        //GridPan 5 columns and 2 lines
        GridPane gridPane10But = new GridPane(); 
        gridPane10But.add(b0,0,0);
        gridPane10But.add(b1,1,0);
        gridPane10But.add(b2,2,0);
        gridPane10But.add(b3,3,0);
        gridPane10But.add(b4,4,0);
        gridPane10But.add(b5,0,1);
        gridPane10But.add(b6,1,1);
        gridPane10But.add(b7,2,1);
        gridPane10But.add(b8,3,1);
        gridPane10But.add(b9,4,1);
        
        gridPane10But.setAlignment(Pos.CENTER);
        gridPane10But.setHgap(2);
        gridPane10But.setVgap(2);


        //Buttons "Delete All" + "Calculate"
        Button deleteAllButton = new Button("Delete All");
        Button calculateButton = new Button("Calculate");

        //HBox2Buttons
        HBox hBox2Buttons = new HBox(deleteAllButton,calculateButton);
        hBox2Buttons.setSpacing(30);
        hBox2Buttons.setAlignment(Pos.CENTER);

        //VBoxG => General : 3 lines
        VBox vBoxG = new VBox(textFieldAdder,gridPane10But,hBox2Buttons);
        vBoxG.setAlignment(Pos.CENTER);

       
        // buttonCopy.setOnAction(e -> {
        //String text = textField1.getText(); //.GETTEXT
        //textField2.setText(text);  //.SETTEXT
        // textField2.setText(textField1.getText());
        // });
        

        //ASSEMBLY
        Scene scene = new Scene(vBoxG,300,400);

        b0.setOnAction(e -> {
            String text = textFieldAdder.getText();
            if (text == null){
                String b0text = "0";
            textFieldAdder.setText(b0text);
            }else{
            String b0text = " + 0";
            textFieldAdder.setText(text + b0text);}
        });

        b1.setOnAction(e -> {
            String text = textFieldAdder.getText();
            if (text == null){
                String b1text = "1";
            textFieldAdder.setText(b1text);
            }else{
            String b1text = " + 1";
            textFieldAdder.setText(text + b1text);}
        });
        b2.setOnAction(e -> {
            String text = textFieldAdder.getText();
            if (text == null){
                String b2text = "2";
            textFieldAdder.setText(b2text);
            }else{
            String b2text = " + 2";
            textFieldAdder.setText(text + b2text);}
        });

        b3.setOnAction(e -> {
            String text = textFieldAdder.getText();
            if (text == null){
                String b3text = "3";
            textFieldAdder.setText(b3text);
            }else{
            String b3text = " + 3";
            textFieldAdder.setText(text + b3text);}
        });

        b4.setOnAction(e -> {
            String text = textFieldAdder.getText();
            if (text == null){
                String b4text = "4";
            textFieldAdder.setText(b4text);
            }else{
            String b4text = " + 4";
            textFieldAdder.setText(text + b4text);}
        });

        b5.setOnAction(e -> {
            String text = textFieldAdder.getText();
            if (text == null){
                String b5text = "5";
            textFieldAdder.setText(b5text);
            }else{
            String b5text = " + 5";
            textFieldAdder.setText(text + b5text);}
        });

        b6.setOnAction(e -> {
            String text = textFieldAdder.getText();
            if (text == null){
                String b6text = "6";
            textFieldAdder.setText(b6text);
            }else{
            String b6text = " + 6";
            textFieldAdder.setText(text + b6text);}
        });

        b7.setOnAction(e -> {
            String text = textFieldAdder.getText();
            if (text == null){
                String b7text = "7";
            textFieldAdder.setText(b7text);
            }else{
            String b7text = " + 7";
            textFieldAdder.setText(text + b7text);}
        });

        b8.setOnAction(e -> {
            String text = textFieldAdder.getText();
            if (text == null){
                String b8text = "8";
            textFieldAdder.setText(b8text);
            }else{
            String b8text = " + 8";
            textFieldAdder.setText(text + b8text);}
        });

        b9.setOnAction(e -> {
            String text = textFieldAdder.getText();
            if (text == null){
                String b9text = "9";
            textFieldAdder.setText(b9text);
            }else{
            String b9text = " + 9";
            textFieldAdder.setText(text + b9text);}
        });

        deleteAllButton.setOnAction( e-> {
            textFieldAdder.setText(null);
        });
        
        // calculateButton.setOnAction(e-> {
            // String calcul = textFieldAdder.getText();
            //Retirer Tous les + et les /
            //Ajouter les nombres
            //Afficher ligne d'avant + somme dans textFieldAdder
        // });

        //TO DO Taille TextField 
        //Espacemeent dans la VBOX
        //Boucles ???

        stage.setScene(scene);
        stage.show();
    } 

}