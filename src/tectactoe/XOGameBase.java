package tectactoe;

//import java.awt.Color;
import java.lang.*;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public  class XOGameBase extends Pane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final MenuItem menuItem;
    protected final MenuItem menuItem0;
    protected final Menu menu0;
    protected final MenuItem menuItem1;
    protected final Label label;
    public int  MovesNumber=0;
    public XOGameBase(Stage MyStage,int mode,String Player1,String Player2) {

        System.out.println(mode);
         System.out.println(Player1);
           System.out.println(Player2);


        
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        menuBar = new MenuBar();
        menu = new Menu();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        menu0 = new Menu();
        menuItem1 = new MenuItem();
        label = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(431.0);
        setPrefWidth(631.0);

        gridPane.setLayoutX(131.0);
        gridPane.setLayoutY(92.0);
        gridPane.setMaxHeight(USE_PREF_SIZE);
        gridPane.setMaxWidth(USE_PREF_SIZE);
        gridPane.setMinHeight(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(286.0);
        gridPane.setPrefWidth(370.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

 //*****************************xo buttons**************************************
        GridPane.setColumnIndex(button, 1);
        button.setMnemonicParsing(false);
        button.setPrefHeight(118.0);
        button.setPrefWidth(136.0);
        
        button.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
            if(button.getText().isEmpty())
            {

                      MovesNumber++;

                   if(MovesNumber % 2 !=0)
                   {
                     button.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button.setText("X");
                   }else
                   {
                     button.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button.setText("O");

                   }
            }
           
        }
        
        
        });
        
//******************************************************************************
        GridPane.setColumnIndex(button0, 2);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(118.0);
        button0.setPrefWidth(136.0);
        button0.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
            if(button0.getText().isEmpty())
            {

                   MovesNumber++;

                   if(MovesNumber % 2 !=0)
                   {
                     button0.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button0.setText("X");
                   }else
                   {
                     button0.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button0.setText("O");

                   }
            }
           
        }
        
        
        });
//******************************************************************************        
        GridPane.setColumnIndex(button1, 3);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(118.0);
        button1.setPrefWidth(136.0);
        button1.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
            if(button1.getText().isEmpty())
            {

                   MovesNumber++;

                   if(MovesNumber % 2 !=0)
                   {
                     button1.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button1.setText("X");
                   }else
                   {
                     button1.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button1.setText("O");

                   }
            }
           
        }
        
        
        });
//******************************************************************************
        GridPane.setColumnIndex(button2, 1);
        GridPane.setRowIndex(button2, 1);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(118.0);
        button2.setPrefWidth(136.0);
        button2.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
            if(button2.getText().isEmpty())
            {

                   MovesNumber++;

                   if(MovesNumber % 2 !=0)
                   {
                     button2.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button2.setText("X");
                   }else
                   {
                     button2.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button2.setText("O");

                   }
            }
           
        }
        
        
        });
//******************************************************************************
        GridPane.setColumnIndex(button3, 2);
        GridPane.setRowIndex(button3, 1);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(118.0);
        button3.setPrefWidth(136.0);
        button3.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
            if(button3.getText().isEmpty())
            {

                   MovesNumber++;

                   if(MovesNumber % 2 !=0)
                   {
                     button3.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button3.setText("X");
                   }else
                   {
                     button3.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button3.setText("O");

                   }
            }
           
        }
        
        
        });
//******************************************************************************
        GridPane.setColumnIndex(button4, 3);
        GridPane.setRowIndex(button4, 1);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(118.0);
        button4.setPrefWidth(136.0);
        button4.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
            if(button4.getText().isEmpty())
            {

                   MovesNumber++;

                   if(MovesNumber % 2 !=0)
                   {
                     button4.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button4.setText("X");
                   }else
                   {
                     button4.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button4.setText("O");

                   }
            }
           
        }
        
        
        });
//******************************************************************************
        GridPane.setColumnIndex(button5, 1);
        GridPane.setRowIndex(button5, 2);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(118.0);
        button5.setPrefWidth(136.0);
        button5.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
            if(button5.getText().isEmpty())
            {

                   MovesNumber++;

                   if(MovesNumber % 2 !=0)
                   {
                     button5.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button5.setText("X");
                   }else
                   {
                     button5.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button5.setText("O");

                   }
            }
           
        }
        
        
        });
//******************************************************************************
        GridPane.setColumnIndex(button6, 2);
        GridPane.setRowIndex(button6, 2);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(118.0);
        button6.setPrefWidth(136.0);
        button6.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
            if(button6.getText().isEmpty())
            {

                   MovesNumber++;

                   if(MovesNumber % 2 !=0)
                   {
                     button6.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button6.setText("X");
                   }else
                   {
                     button6.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button6.setText("O");

                   }
            }
           
        }
        
        
        });
//******************************************************************************
        GridPane.setColumnIndex(button7, 3);
        GridPane.setRowIndex(button7, 2);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(118.0);
        button7.setPrefWidth(136.0);
        button7.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
            if(button7.getText().isEmpty())
            {

                   MovesNumber++;

                   if(MovesNumber % 2 !=0)
                   {
                     button7.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button7.setText("X");
                   }else
                   {
                     button7.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                     button7.setText("O");

                   }
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
             
            
            Image img=new Image("1.jpg");
            ImageView imgviw=new ImageView(img);
            alert.setGraphic(imgviw);
//            alert.initModality(Modality.APPLICATION_MODAL);
//            MyStage=(Stage)alert.getDialogPane().getScene().getWindow();
            
            alert.showAndWait(); 
            
//            Alert winalert = new Alert(Alert.AlertType.INFORMATION);
//            winalert.setTitle("Help");
//            winalert.setHeaderText("How To Play");
//            winalert.setContentText("press on squre in order to collect 3 of squres \n sequential in any way ");
//            winalert.setGraphic();
//            winalert.showAndWait();    
            
        }
        
        
        });
        //**********************************************************************   
        label.setLayoutX(236.0);
        label.setLayoutY(48.0);
        label.setText("Tec Tac Toe");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#3451a8"));
        label.setFont(new Font("System Bold", 24.0));

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(button);
        gridPane.getChildren().add(button0);
        gridPane.getChildren().add(button1);
        gridPane.getChildren().add(button2);
        gridPane.getChildren().add(button3);
        gridPane.getChildren().add(button4);
        gridPane.getChildren().add(button5);
        gridPane.getChildren().add(button6);
        gridPane.getChildren().add(button7);
        getChildren().add(gridPane);
        menu.getItems().add(menuItem);
        menu.getItems().add(menuItem0);
        menuBar.getMenus().add(menu);
        menu0.getItems().add(menuItem1);
        menuBar.getMenus().add(menu0);
        getChildren().add(menuBar);
        getChildren().add(label);

//        switch(mode)
//        {
//            case 1:
//            case 2:
//            case 3:
//        
//        }
        
    }
}
