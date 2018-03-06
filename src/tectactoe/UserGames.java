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
/**
 *
 * @author hagarabdelwahab
 */
public class UserGames extends Pane {
    

    protected final Button button8;
    protected final Button button9;
    protected final Button button10;
    protected List<Integer> GamesId = new ArrayList<Integer>();
   
     public UserGames(Stage MyStage,String username) 
     {
      
        Database db=new Database();
        GamesId=db.listMyGames(username);
        button8 = new Button();
        button9 = new Button();
        button10 = new Button();
         
      this.setStyle("-fx-background-color:#332163");
      
      //*****************generate button****************************************
       
      int counter=0;
      for(int gameid : GamesId)
      {
        String Player2=db.recallPlayer2(gameid);
        String Result=db.recallResult(gameid);
        Button  button=new Button();
        button.setLayoutX(192.0); //constant
        button.setLayoutY(100+counter);  //changeable
        button.setMnemonicParsing(false);
        button.setText("Game"+gameid);  //game id from database
        button.setStyle("-fx-background-color:#3080e8;-fx-font-size:18; -fx-text-fill:#ffffff;");
        button.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
            //get moves from db  to every gameid  
            
            try{
                
            int[]gamemoves = Helpers.mult2One(db.recallMoves(gameid));
            Replay toplay=new Replay( MyStage,gamemoves,username,Player2,Result);
            Scene scene = new Scene(toplay, 800, 550);
            MyStage.setScene(scene);
            toplay.repl(gamemoves);
         //get this game from database              
            }catch(Exception e){}
                      
        }
        
        });
        
        
         getChildren().add(button);
         counter+=50;
      
      }
        
     
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
        button10.setOnAction(new EventHandler<ActionEvent>(){    
        @Override
        public void handle(ActionEvent event)
        {
          
            System.exit(1);
           
        }
        
        
        });
        
//******************************************************************************
       
        getChildren().add(button8);
        getChildren().add(button9);
        getChildren().add(button10);
         
         
     }
    
    
     
}
