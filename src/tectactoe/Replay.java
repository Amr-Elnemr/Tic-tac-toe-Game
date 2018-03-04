package tectactoe;

//import java.awt.Color;

import javafx.animation.*;

import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.input.*;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Replay extends Pane {//implements Runnable{

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
    public Replay(Stage MyStage,int mode,String Player1,String Player2) {
        
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
        
        
 //*****************************Setting xo buttons positions**************************************
        Button Btns[]={button, button0, button1, button2, button3, button4, button5, button6, button7};
        int i=3, j=1;
        for (Button B: Btns){
            GridPane.setColumnIndex(B, j%i==0?3:j%i);
            j++;
            B.setMnemonicParsing(false);
            B.setPrefHeight(118.0);
            B.setPrefWidth(136.0);
        }
        
        Button RowSet1[]={button2, button3, button4};
        for (Button Br: RowSet1){
            GridPane.setRowIndex(Br, 1);
        }
        
        Button RowSet2[]={button5, button6, button7};
        for (Button Br: RowSet2){
            GridPane.setRowIndex(Br, 2);
        }

 
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
  
    }
        
////////////////////******************** REPLAY **********************************
   
        public void repl(int movesArray[]){
            Button tempo[]={button, button0, button1, button2, button3, button4, button5, button6, button7};
            
            
            final Timeline timeline = new Timeline();
            int delay=0;
            for(int pos: movesArray){
                MovesNumber++;
                delay++;

                if(Integer.valueOf(pos).equals(-1)){
                    timeline.stop();
                    break;   
                }
                
                else if(MovesNumber % 2 !=0){
                    final KeyFrame kf = new KeyFrame(Duration.seconds(delay), e -> {
                        tempo[pos-1].setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                        tempo[pos-1].setText("X");
                    });
                    timeline.getKeyFrames().add(kf);
                }
                
                else{
                    final KeyFrame kf = new KeyFrame(Duration.seconds(delay), e -> {
                        tempo[pos-1].setStyle("-fx-font-size:40; -fx-text-fill:#3451a8");  
                        tempo[pos-1].setText("O");
                    });
                    timeline.getKeyFrames().add(kf);
                }
            }
    
            timeline.play();
            
        }
    
}


