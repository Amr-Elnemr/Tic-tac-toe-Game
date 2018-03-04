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
    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final MenuItem menuItem;
    protected final MenuItem menuItem0;
    protected final Menu menu0;
    protected final MenuItem menuItem1;
   

    public Levels(Stage MyStage,String player1,String player2) {

        label = new Label();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        
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
        setPrefWidth(500.0);

        label.setLayoutX(14.0);
        label.setLayoutY(24.0);
        label.setPrefHeight(40.0);
        label.setPrefWidth(202.0);
        label.setText("Choose Level");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        label.setFont(new Font("System Bold", 18.0));
        
        //*******************************1 Player**************************
        button.setLayoutX(172.0);
        button.setLayoutY(111.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(40.0);
        button.setPrefWidth(153.0);
        button.setText("Easy");
        button.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        button.setFont(new Font("System Bold", 14.0));
        
        button.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
                 XOGameBase xoroot=new XOGameBase(MyStage,11,player1,null);
          
                    Scene scene = new Scene(xoroot, 631, 431);
                    
                    MyStage.setScene(scene);       
            
        }
        
        
        });
        
        
        
        
        //*******************************2 Players************************** 
        button0.setLayoutX(172.0);
        button0.setLayoutY(180.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(40.0);
        button0.setPrefWidth(153.0);
        button0.setText("Medium");
        button0.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        button0.setFont(new Font("System Bold", 14.0));
        
        button0.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
                  XOGameBase xoroot=new XOGameBase(MyStage,12,player1,null);
                    Scene scene = new Scene(xoroot, 631, 431);
                    MyStage.setScene(scene);       
            
        }
        
        
        });
        
        //*******************************2 Players Online**************************
        button1.setLayoutX(172.0);
        button1.setLayoutY(243.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(40.0);
        button1.setPrefWidth(153.0);
        button1.setText("Hard");
        button1.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        button1.setFont(new Font("System Bold", 14.0));
        
        button1.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
                 XOGameBase xoroot=new XOGameBase(MyStage,13,player1,null);
          
                    Scene scene = new Scene(xoroot, 631, 431);
                    
                    MyStage.setScene(scene);       
            
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
//                        Image image = new Image(getClass().getResource("winner.gif").toExternalForm());
//                        ImageView imageView = new ImageView(image);
//                        alert.setGraphic(imageView);

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
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(button1);
      
        
         Scene scene = new Scene(this, 500, 400);
         MyStage.setScene(scene);
        

    }
    
    
}
