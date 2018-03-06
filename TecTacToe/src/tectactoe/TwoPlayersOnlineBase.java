package tectactoe;

import java.lang.*;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public  class TwoPlayersOnlineBase extends Pane {

    protected final Label label;
    protected final Label label0;
    protected final TextField textField;
    protected final Label label1;
    protected final TextField textField0;
    protected final Button button;
    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final MenuItem menuItem;
    protected final MenuItem menuItem0;
    protected final Menu menu0;
    protected final MenuItem menuItem1;

    public TwoPlayersOnlineBase(Stage MyStage) {

        label = new Label();
        label0 = new Label();
        textField = new TextField();
        label1 = new Label();
        textField0 = new TextField();
        button = new Button();
        menuBar = new MenuBar();
        menu = new Menu();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        menu0 = new Menu();
        menuItem1 = new MenuItem();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(475.0);

        label.setLayoutX(27.0);
        label.setLayoutY(71.0);
        label.setText("Enter Yours Names");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        label.setFont(new Font("System Bold", 18.0));

        label0.setLayoutX(81.0);
        label0.setLayoutY(146.0);
        label0.setText("Player 1");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        label0.setFont(new Font("System Bold", 18.0));

        textField.setLayoutX(184.0);
        textField.setLayoutY(144.0);
        textField.setPrefHeight(31.0);
        textField.setPrefWidth(173.0);

        label1.setLayoutX(84.0);
        label1.setLayoutY(207.0);
        label1.setText("Player 2");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        label1.setFont(new Font("System Bold", 18.0));

        textField0.setLayoutX(184.0);
        textField0.setLayoutY(202.0);
        textField0.setPrefHeight(31.0);
        textField0.setPrefWidth(173.0);
        
        
        //*****************************2 players online*************************
        button.setLayoutX(184.0);
        button.setLayoutY(286.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(39.0);
        button.setPrefWidth(97.0);
        button.setText("Play");
        button.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        button.setFont(new Font("System Bold", 18.0));
        
        button.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
               
               
            if(textField.getText().trim().isEmpty() || textField0.getText().trim().isEmpty())
               {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Information Dialog");
                        alert.setHeaderText("Information Help Dialog");
                        alert.setContentText("Please Enter Your Name ");
                        alert.showAndWait();
                }
                else
                {
                    XOGameBase xoroot=new XOGameBase(MyStage,3,textField.getText(),textField0.getText());
                    Scene scene = new Scene(xoroot, 631, 431);
                    MyStage.setScene(scene);

                }
                   
            
        }
        
        });
        
    //*****************************************menubar******************************
        menuBar.setPrefHeight(30.0);
        menuBar.setPrefWidth(631.0);

        menu.setMnemonicParsing(false);
        menu.setText("File");
        
    //***************************New Game***************************************
        menuItem.setMnemonicParsing(false);
        menuItem.setText("New Game");
        menuItem.setAccelerator(new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN));
        
        menuItem.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
            GameModesBase newroot = new GameModesBase(MyStage); 
            Scene scene = new Scene(newroot, 472, 346);
            MyStage.setScene(scene);       
            
        }
        
        
        });
        
        //***************************Exit***************************************
        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Exit");
        menuItem0.setAccelerator(new KeyCodeCombination(KeyCode.X, KeyCombination.CONTROL_DOWN));
        
        menuItem0.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
            System.exit(1);
            
        }
        
        
        });   


//********************************************************************** 
        menu0.setMnemonicParsing(false);
        menu0.setText("Help");

        menuItem1.setMnemonicParsing(false);
        menuItem1.setText("About");
        
        menuItem1.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Help");
            alert.setHeaderText("How To Play");
            alert.setContentText("press on squre in order to collect 3 of squres \n sequential in any way ");
            alert.showAndWait();                

        }
        
        
        });
        
        //**********************************************************************
        menu.getItems().add(menuItem);
        menu.getItems().add(menuItem0);
        menuBar.getMenus().add(menu);
        menu0.getItems().add(menuItem1);
        menuBar.getMenus().add(menu0);
        getChildren().add(menuBar);
        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(textField);
        getChildren().add(label1);
        getChildren().add(textField0);
        getChildren().add(button);

    }
}
