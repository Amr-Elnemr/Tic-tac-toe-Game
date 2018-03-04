package tectactoe;

import java.lang.*;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public  class OnePlayerBase extends Pane {

    protected final Label label;
    protected final Button button;
    protected final Label label0;
    protected final TextField textField;
    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final MenuItem menuItem;
    protected final MenuItem menuItem0;
    protected final Menu menu0;
    protected final MenuItem menuItem1;

    public OnePlayerBase(Stage MyStage) {

        label = new Label();
        button = new Button();
        label0 = new Label();
        textField = new TextField();
        
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
        setPrefHeight(361.0);
        setPrefWidth(470.0);
       
        

        label.setLayoutX(109.0);
        label.setLayoutY(115.0);
        label.setText("Enter Your Name");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        label.setFont(new Font("System Bold", 18.0));
        
        
        label0.setLayoutX(109.0);
        label0.setLayoutY(192.0);
        label0.setText("Player 1");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        label0.setFont(new Font("System Bold", 18.0));

        textField.setLayoutX(212.0);
        textField.setLayoutY(190.0);
        textField.setPrefHeight(31.0);
        textField.setPrefWidth(173.0);
        

        
        
        //****************************************play**************************
        button.setLayoutX(192.0);
        button.setLayoutY(280.0);
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
//               System.out.println("texttttttttttttttt"+textField.getText());
               
            if(textField.getText().trim().isEmpty())
               {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Information Dialog");
                        alert.setHeaderText("Information Help Dialog");
                        alert.setContentText("Please Enter Your Name ");
                        alert.showAndWait();
                }
                else
                {
                   Levels lev=new Levels(MyStage,textField.getText(),null);
                   Scene scene = new Scene(lev, 631, 431);    
                   MyStage.setScene(scene);
                   
//                    XOGameBase xoroot=new XOGameBase(MyStage,1);
//                    
//                    Scene scene = new Scene(xoroot, 631, 431);
//                    
//                    MyStage.setScene(scene);

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
        getChildren().add(label0);
        getChildren().add(textField);
        

    }
}
