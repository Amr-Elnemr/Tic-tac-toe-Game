/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 *
 * @author hagarabdelwahab
 */
public class Levels extends Pane {
    
    protected final Label label;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button8;
    protected final Button button9;
    protected final Button button10;

   

    public Levels(Stage MyStage,String player1,String player2) {

        label = new Label();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button8 = new Button();
        button9 = new Button();
        button10 = new Button();
      
       

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(500.0);
 this.setStyle("-fx-background-color:#332163");
        
        label.setLayoutX(14.0);
        label.setLayoutY(24.0);
        label.setPrefHeight(40.0);
        label.setPrefWidth(202.0);
        label.setText("Choose Level");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#ffffff"));
        label.setFont(new Font("System Bold", 18.0));
        
        //*******************************Easy**************************
        button.setLayoutX(172.0);
        button.setLayoutY(111.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(40.0);
        button.setPrefWidth(153.0);
        button.setText("Easy");
//        button.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
//        button.setFont(new Font("System Bold", 14.0));
        button.setStyle("-fx-background-color:#c69cf4;-fx-font-size:14; -fx-text-fill:#ffffff;");
        
        button.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
                try{
                    XOGameBase xoroot=new XOGameBase(MyStage,11,player1,"Computer");
                    Scene scene = new Scene(xoroot, 800, 550); 
                    MyStage.setScene(scene);
                }catch(Exception e)
                {}
            
        }
        
        
        });
        
        
        
        
        //*******************************Medium************************** 
        button0.setLayoutX(172.0);
        button0.setLayoutY(180.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(40.0);
        button0.setPrefWidth(153.0);
        button0.setText("Medium");
//        button0.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
//        button0.setFont(new Font("System Bold", 14.0));
        button0.setStyle("-fx-background-color:#30c9e8;-fx-font-size:14; -fx-text-fill:#ffffff;");
        
        button0.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
                 try{
                     XOGameBase xoroot=new XOGameBase(MyStage,12,player1,"Computer");
                    Scene scene = new Scene(xoroot, 800, 550);
                    MyStage.setScene(scene);   
                 }catch(Exception e)
                 {
                 }
            
        }
        
        
        });
        
        //******************************Hard**************************
        button1.setLayoutX(172.0);
        button1.setLayoutY(243.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(40.0);
        button1.setPrefWidth(153.0);
        button1.setText("Hard");
//        button1.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
//        button1.setFont(new Font("System Bold", 14.0));
        button1.setStyle("-fx-background-color:#1663c7;-fx-font-size:14; -fx-text-fill:#ffffff;");
        
        button1.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
            try{
                 XOGameBase xoroot=new XOGameBase(MyStage,13,player1,"Computer");
          
                    Scene scene = new Scene(xoroot, 800, 550);
                    
                    MyStage.setScene(scene);       
            }catch(Exception e)
            {}
        }
        
        });

        
        //******************************************************************************
        button8.setLayoutX(200.0);
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
        button9.setLayoutX(330.0);
//        button9.setLayoutY(440.0);
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
        button10.setLayoutX(400.0);
        button10.setMnemonicParsing(false);
        button10.setText("Exit");
        button10.setStyle("-fx-font-size:18; -fx-text-fill:#ffffff;-fx-background-color:#1663c7");  
//        button10.setPrefWidth(160.0);
//        Image image = new Image(getClass().getResource("newgame.png").toExternalForm(),50,50,false,false);
//        ImageView imageView = new ImageView(image);
//        button10.setGraphic(imageView);
        button10.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
          
            System.exit(1);
           
        }
        
        
        });
        
//******************************************************************************
        
        getChildren().add(label);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(button1);
        getChildren().add(button8);
        getChildren().add(button9);
        getChildren().add(button10);
      
        
         Scene scene = new Scene(this, 500, 400);
         MyStage.setScene(scene);
        

    }
    
    
}
