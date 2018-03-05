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

public  class TwoPlayersBase extends Pane {

    protected final Label label;
    protected final Label label0;
    protected final TextField textField;
    protected final Label label1;
    protected final TextField textField0;
    protected final Button button;
    protected final Button button8;
    protected final Button button9;
    protected final Button button10;


    public TwoPlayersBase(Stage MyStage) {

        label = new Label();
        label0 = new Label();
        textField = new TextField();
        label1 = new Label();
        textField0 = new TextField();
        button = new Button();
        button8 = new Button();
        button9 = new Button();
        button10 = new Button();
               

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(475.0);
 this.setStyle("-fx-background-color:#332163");
        
        label.setLayoutX(27.0);
        label.setLayoutY(71.0);
        label.setText("Enter Yours Names");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#ffffff"));
        label.setFont(new Font("System Bold", 18.0));

        label0.setLayoutX(81.0);
        label0.setLayoutY(146.0);
        label0.setText("Player 1");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#ffffff"));
        label0.setFont(new Font("System Bold", 18.0));

        textField.setLayoutX(184.0);
        textField.setLayoutY(144.0);
        textField.setPrefHeight(31.0);
        textField.setPrefWidth(173.0);

        label1.setLayoutX(84.0);
        label1.setLayoutY(207.0);
        label1.setText("Player 2");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#ffffff"));
        label1.setFont(new Font("System Bold", 18.0));

        textField0.setLayoutX(184.0);
        textField0.setLayoutY(202.0);
        textField0.setPrefHeight(31.0);
        textField0.setPrefWidth(173.0);
        
        //*******************************2 players******************************
        button.setLayoutX(184.0);
        button.setLayoutY(286.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(39.0);
        button.setPrefWidth(97.0);
        button.setText("Play");
        button.setStyle("-fx-background-color:#3080e8;-fx-font-size:18; -fx-text-fill:#ffffff;");
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
                    try{
                    XOGameBase xoroot=new XOGameBase(MyStage,2,textField.getText(),textField0.getText());
                    Scene scene = new Scene(xoroot, 800, 550);
                    MyStage.setScene(scene);
                    }catch(Exception e){}

                }
                   
            
        }
        
        });
     //******************************************************************************
        button8.setLayoutX(230.0);
        button8.setMnemonicParsing(false);
        button8.setText("New Game");
        button8.setStyle("-fx-font-size:18; -fx-text-fill:#ffffff;-fx-background-color:#30c9e8 "); 
        button8.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
            try{
            GameModesBase newroot = new GameModesBase(MyStage); 
            Scene scene = new Scene(newroot, 472, 346);
            MyStage.setScene(scene);
            }catch(Exception e){}
           
        }
        
        
        });
        
        
    //******************************************************************************
        button9.setLayoutX(360.0);
        button9.setMnemonicParsing(false);
        button9.setText("Help");
        button9.setStyle("-fx-font-size:18; -fx-text-fill:#ffffff;-fx-background-color: #e8308c");  
        button9.setOnAction(new EventHandler<ActionEvent>(){    
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
        
//******************************************************************************
        button10.setLayoutX(430.0);
        button10.setMnemonicParsing(false);
        button10.setText("Exit");
        button10.setStyle("-fx-font-size:18; -fx-text-fill:#ffffff;-fx-background-color:#1663c7");  
        button10.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
          
            System.exit(1);
           
        }
        
        
        });
        
//******************************************************************************   
        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(textField);
        getChildren().add(label1);
        getChildren().add(textField0);
        getChildren().add(button);
        getChildren().add(button8);
        getChildren().add(button9);
        getChildren().add(button10);

    }
}
