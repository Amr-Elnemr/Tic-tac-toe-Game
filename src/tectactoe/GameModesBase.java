package tectactoe;

import java.lang.*;
import java.util.*;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
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
import javafx.util.Duration;

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

        label.setLayoutX(14.0);
        label.setLayoutY(24.0);
        label.setPrefHeight(40.0);
        label.setPrefWidth(202.0);
        label.setText("Choose Game Mode");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        label.setFont(new Font("System Bold", 18.0));
        
        //*******************************1 Player**************************
        button.setLayoutX(172.0);
        button.setLayoutY(111.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(40.0);
        button.setPrefWidth(153.0);
        button.setText("1 Player");
        button.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        button.setFont(new Font("System Bold", 14.0));
        
        button.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
            OnePlayerBase oproot=new OnePlayerBase(MyStage);
            Scene scene = new Scene(oproot, 472, 346);
            MyStage.setScene(scene);       
            
        }
        
        
        });
        
        
        
        
        //*******************************2 Players************************** 
        button0.setLayoutX(172.0);
        button0.setLayoutY(180.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(40.0);
        button0.setPrefWidth(153.0);
        button0.setText("2 Players");
        button0.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        button0.setFont(new Font("System Bold", 14.0));
        
        button0.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
            TwoPlayersBase tproot=new TwoPlayersBase(MyStage);
            Scene scene = new Scene(tproot, 500, 400);
            MyStage.setScene(scene);       
            
        }
        
        
        });
        
        //*******************************2 Players Online**************************
        button1.setLayoutX(172.0);
        button1.setLayoutY(243.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(40.0);
        button1.setPrefWidth(153.0);
        button1.setText("2 Players Online");
        button1.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        button1.setFont(new Font("System Bold", 14.0));
        
        button1.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
            TwoPlayersOnlineBase tporoot=new TwoPlayersOnlineBase(MyStage);
            Scene scene = new Scene(tporoot, 500, 400);
            MyStage.setScene(scene);       
            
        }
        
        
        });
        
        //*******************************Replay**************************
        button2.setLayoutX(172.0);
        button2.setLayoutY(310.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(40.0);
        button2.setPrefWidth(153.0);
        button2.setText("Replay");
        button2.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        button2.setFont(new Font("System Bold", 14.0));
        
        
        button2.setOnAction(new EventHandler<ActionEvent>(){
            
        @Override
        public void handle(ActionEvent event)
        {
            Replay toplay=new Replay(MyStage, 999, "player1", null);
            Scene scene = new Scene(toplay, 631, 500);
            MyStage.setScene(scene);       


            int temp[]={5, 2, 3, 7, 9, 1, 6, -1, -1}; //to be modified after merge***
            toplay.repl(temp);
            
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
