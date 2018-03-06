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
import javafx.scene.input.MouseEvent;
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
    protected final Button button8;
    protected final Button button9;
    protected final Button button10;
    protected final Label label;
    
    protected final Label label0;
    protected final Label label1;
     protected final Label label2;
    protected final Label label3;
    public int  MovesNumber=0;
    Game multiPlayer = new Game();
   String player1;
   String player2;
    
    public XOGameBase(Stage MyStage,int mode,String p1,String p2) {
        
        gridPane = new GridPane();
        player1 = p1;
        player2 = p2;
        
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
        button8 = new Button();
        button9 = new Button();
        button10 = new Button();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);//431.0
        setPrefWidth(700.0);//631.0
        
        this.setStyle("-fx-background-color:#332163");

        gridPane.setLayoutX(210.0);//131.0
        gridPane.setLayoutY(150.0);//92.0
        gridPane.setMaxHeight(USE_PREF_SIZE);
        gridPane.setMaxWidth(USE_PREF_SIZE);
        gridPane.setMinHeight(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(286.0);
        gridPane.setPrefWidth(370.0);
        
        
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        
/*
grid.setHgap(10); //horizontal gap in pixels => that's what you are asking for
grid.setVgap(10); //vertical gap in pixels
grid.setPadding(new Insets(10, 10, 10, 10)); //margins around the whole grid
                                             //(top/right/bottom/left)        
*/
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
        GridPane.setColumnIndex(button, 0);
        GridPane.setRowIndex(button, 0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(118.0);
        button.setPrefWidth(136.0);
        button.setStyle("-fx-background-color:#e4e4e4  ");
        
//        button.setOnAction(new EventHandler<ActionEvent>(){    
//        @Override
//        public void handle(ActionEvent event)
//        {
//            if(button.getText().isEmpty())
//            {
//
//                      MovesNumber++;
//
//                   if(MovesNumber % 2 !=0)
//                   {
//                     button.setStyle("-fx-font-size:40; -fx-text-fill:#3451a8;-fx-background-color:#cce6ff");  
//                     button.setText("X");
//                   }else
//                   {
//                     button.setStyle("-fx-font-size:40; -fx-text-fill:#e41a24;-fx-background-color:#cce6ff");  
//                     button.setText("O");
//
//                   }
//                   
////                   button.setDisable(true);
//            }
//           
//        }
//        
//        
//        });
        
//******************************************************************************
        GridPane.setColumnIndex(button0, 1);
        GridPane.setRowIndex(button0, 0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(118.0);
        button0.setPrefWidth(136.0);
        button0.setStyle("-fx-background-color:#e4e4e4  ");
        
//******************************************************************************        
        GridPane.setColumnIndex(button1, 2);
        GridPane.setRowIndex(button1, 0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(118.0);
        button1.setPrefWidth(136.0);
        button1.setStyle("-fx-background-color:#e4e4e4  ");
        
//******************************************************************************
        GridPane.setColumnIndex(button2, 0);
        GridPane.setRowIndex(button2, 1);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(118.0);
        button2.setPrefWidth(136.0);
        button2.setStyle("-fx-background-color:#e4e4e4  ");
        
//******************************************************************************
        GridPane.setColumnIndex(button3, 1);
        GridPane.setRowIndex(button3, 1);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(118.0);
        button3.setPrefWidth(136.0);
        button3.setStyle("-fx-background-color:#e4e4e4  ");
        
//******************************************************************************
        GridPane.setColumnIndex(button4, 2);
        GridPane.setRowIndex(button4, 1);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(118.0);
        button4.setPrefWidth(136.0); 
        button4.setStyle("-fx-background-color:#e4e4e4  ");
        
//******************************************************************************
        GridPane.setColumnIndex(button5, 0);
        GridPane.setRowIndex(button5, 2);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(118.0);
        button5.setPrefWidth(136.0);
        button5.setStyle("-fx-background-color:#e4e4e4  ");
        
//******************************************************************************
        GridPane.setColumnIndex(button6, 1);
        GridPane.setRowIndex(button6, 2);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(118.0);
        button6.setPrefWidth(136.0);
        button6.setStyle("-fx-background-color:#e4e4e4  ");
       
//******************************************************************************
        GridPane.setColumnIndex(button7, 2);
        GridPane.setRowIndex(button7, 2);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(118.0);
        button7.setPrefWidth(136.0);
        button7.setStyle("-fx-background-color:#e4e4e4  ");
          
     //******************************************************************************
        button8.setLayoutX(526.0);
        button8.setMnemonicParsing(false);
        button8.setText("New Game");
        button8.setStyle("-fx-font-size:18; -fx-text-fill:#ffffff;-fx-background-color:#30c9e8 "); 
//        button8.setPrefHeight(50.0);
//        button8.setPrefWidth(100.0);
//        Image image = new Image(getClass().getResource("newgame.png").toExternalForm(),80,50,false,false);
//        ImageView imageView = new ImageView(image);
//        imageView.setFitHeight(50);
//        imageView.setFitWidth(100);
//        
//        button8.setGraphic(imageView);
        button8.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
            try
            {
            GameModesBase newroot = new GameModesBase(MyStage); 
            Scene scene = new Scene(newroot, 472, 346);
            MyStage.setScene(scene);
            }catch(Exception e){}
            
           
        }
        
        
        });
        
        
    //******************************************************************************
        button9.setLayoutX(652.0);
//        button9.setLayoutY(440.0);
        button9.setMnemonicParsing(false);
        button9.setText("Help");
        button9.setStyle("-fx-font-size:18; -fx-text-fill:#ffffff;-fx-background-color: #e8308c");  
//        button9.setPrefHeight(50.0);
//        button9.setPrefWidth(200.0);
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
        button10.setLayoutX(720.0);
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
   
        label.setLayoutX(305.0);
        label.setLayoutY(100.0);
        label.setText("Tic Tac Toe");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#ffffff"));
        label.setFont(new Font("System Bold", 28.0));

         //**********************************************************************   
        label0.setLayoutX(45.0);
        label0.setLayoutY(150.0);
        label0.setText(p1);
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#3080e8"));
        label0.setFont(new Font("System Bold", 24.0));
         //**********************************************************************   
        label1.setLayoutX(620.0);
        label1.setLayoutY(150.0);
        label1.setText(p2);
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#F8649E"));
        label1.setFont(new Font("System Bold", 24.0));
        //**********************************************************************
        label2.setLayoutX(80.0);
        label2.setLayoutY(180.0);
        label2.setText("X");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#3080e8"));
        label2.setFont(new Font("System Bold", 24.0));
        //**********************************************************************
        label3.setLayoutX(670.0);
        label3.setLayoutY(180.0);
        label3.setText("O");
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#F8649E"));
        label3.setFont(new Font("System Bold", 24.0));
        //**********************************************************************
//        
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
        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(label3);
        getChildren().add(button8);
        getChildren().add(button9);
        getChildren().add(button10);
        
        
         gridPane.getChildren().forEach(btn -> {
              
              btn.setOnMouseClicked(new EventHandler<MouseEvent>(){
                  
                @Override
                public void handle(MouseEvent event) {
                    Button btn = (Button) event.getSource();
                    int col = GridPane.getColumnIndex(btn);
                    int row = GridPane.getRowIndex(btn);
                    if(btn.getText().isEmpty()){
                        
                        MovesNumber++;
//                        btn.setStyle("-fx-background-color:#cce6ff ");
                        
                        if(MovesNumber % 2 !=0){
                          
                          btn.setStyle("-fx-font-size:40; -fx-text-fill:#3080e8 ;-fx-background-color:#e4e4e4 ");  
                          btn.setText("X");
                          Winner(multiPlayer.insertMove(3, row, col), p1);
                        }else{
                            //#cce6ff
                          btn.setStyle("-fx-font-size:40; -fx-text-fill:#F8649E;-fx-background-color:#e4e4e4 ");  
                          btn.setText("O");
                          Winner(multiPlayer.insertMove(6, row, col), p2);
                        }
                        
                    }                                   
                }
                  
              });               
              
          }); 

        
    }
    
    
    public void Winner(Boolean state, String name){
        if(state){
            Alert winalert = new Alert(Alert.AlertType.INFORMATION);
            winalert.setTitle("Congratulation");           
            winalert.setContentText(name + " is the winner");
            Image image = new Image(getClass().getResource("winner.gif").toExternalForm());
            ImageView imageView = new ImageView(image);
            winalert.setGraphic(imageView);
            winalert.showAndWait();            
        }else if(MovesNumber > 8){
            Alert winalert = new Alert(Alert.AlertType.INFORMATION);
            winalert.setTitle("Draw");           
            winalert.setContentText("nobody wins");
            winalert.showAndWait();   
        }
        
    }
    
    
    
}
