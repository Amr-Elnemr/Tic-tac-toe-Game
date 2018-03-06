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
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public  class GameModesBase extends Pane {

    protected final Label label;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;

    public GameModesBase(Stage MyStage) {

        label = new Label();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();

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
        label.setText("Choose Game Mode");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#ffffff"));
        label.setFont(new Font("System Bold", 18.0));
        
        //*******************************1 Player**************************
        button.setLayoutX(172.0);
        button.setLayoutY(111.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(40.0);
        button.setPrefWidth(153.0);
        button.setText("1 Player");
        button.setStyle("-fx-background-color:#c69cf4;-fx-font-size:14; -fx-text-fill:#ffffff;");
        button.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
            try{
            OnePlayerBase oproot=new OnePlayerBase(MyStage);
            Scene scene = new Scene(oproot, 472, 346);
            MyStage.setScene(scene); 
            }catch(Exception e){}
            
        }
        
        
        });
        
        
        
        
        //*******************************2 Players************************** 
        button0.setLayoutX(172.0);
        button0.setLayoutY(180.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(40.0);
        button0.setPrefWidth(153.0);
        button0.setText("2 Players");
        button0.setStyle("-fx-background-color:#30c9e8;-fx-font-size:14; -fx-text-fill:#ffffff;");
        button0.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
            try{
            TwoPlayersBase tproot=new TwoPlayersBase(MyStage);
            Scene scene = new Scene(tproot, 500, 400);
            MyStage.setScene(scene);       
            }catch(Exception e){}
            
        }
        
        
        });
        
        //*******************************2 Players Online**************************
        button1.setLayoutX(172.0);
        button1.setLayoutY(243.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(40.0);
        button1.setPrefWidth(153.0);
        button1.setText("2 Players Online");
        button1.setStyle("-fx-background-color:#1663c7;-fx-font-size:14; -fx-text-fill:#ffffff;");
        button1.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
            try{
            TwoPlayersOnlineBase tporoot=new TwoPlayersOnlineBase(MyStage);
            Scene scene = new Scene(tporoot, 500, 400);
            MyStage.setScene(scene);   
            }catch(Exception e){}
            
        }
        
        
        });
        
        //*******************************View Games**************************
        button2.setLayoutX(172.0);
        button2.setLayoutY(310.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(40.0);
        button2.setPrefWidth(153.0);
        button2.setText("View Games");
        button2.setStyle("-fx-background-color:#e8308c;-fx-font-size:14; -fx-text-fill:#ffffff;");
        button2.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {

            
            try{    
                   UserName usr=new UserName(MyStage);
                   Scene scene = new Scene(usr, 472, 346);    
                   MyStage.setScene(scene);
                    
                    }catch(Exception e){}
            
        }
        
        
        });
        //****************************************************************************
        
        getChildren().add(label);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(button1);
        getChildren().add(button2);
        
         Scene scene = new Scene(this, 500, 400);
         MyStage.setScene(scene);
        

    }
}
