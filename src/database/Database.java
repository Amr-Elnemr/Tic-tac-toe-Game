package database;

import java.sql.*;
import java.util.*;

public class Database{
    private String dbName="localhost:3306/TicTacDB";
    private String AuthName="root";
    private String AuthPW="";
 
    Connection con;
///////////////////////////////Constructor: Establishing Connection
    public Database(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://"+ dbName +"?autoReconnect=true&useSSL=false",AuthName,AuthPW);
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
//////////////////////////// { Add new player }/////////////////////////////////
    public void addPlayer(String playerName){
        try {
            PreparedStatement pst=con.prepareStatement("INSERT INTO `Players` (`P1_ID`, `P1_Name`) VALUES (NULL, ?)");
            pst.setString(1, playerName);
            pst.executeUpdate();
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
//////////////////////////// { Get player ID giving his name }/////////////////   
    public int getPlayerID(String playerName){
        int id;
        try {
            PreparedStatement pst=con.prepareStatement("SELECT P1_ID FROM `Players` WHERE `P1_Name`=?");
            pst.setString(1, playerName);
            ResultSet rs = pst.executeQuery();
            rs.next();
            id=rs.getInt("P1_ID");
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            id= -1;
        }
        return id;
    }

//////////////////////////// { Save Game } //////////////////// 
    public void saveGame(int[][] tics, String player1Name, String player2Name, String result){
    //get playet ID for the query:
        int id=getPlayerID(player1Name);
        
        try {
        PreparedStatement pst=con.prepareStatement("INSERT INTO `Games`(`Game_ID`, `X1`, `O1`, `X2`, `O2`, `X3`, `O3`, `X4`, `O4`, `X5`, `P1_ID`, `P2_Name`, `Result`) VALUES (NULL, ?,?,?,?,?,?,?,?,?, ?, ?, ?)");
        
    //assign the mandatory first 5 squares:
        for (int i=0; i<5; i++){  
            pst.setInt(i+1, Helpers.mult2One(tics)[i]);
        }
        
    //assign the rest if not null(given value <0 if not assigned)
        for (int i=5; i<9; i++){  
            if(Helpers.mult2One(tics)[i]>0){
                pst.setInt(i+1, Helpers.mult2One(tics)[i]);
            }
            else{
                pst.setNull(i+1, -1);
            }
        }
        
        pst.setInt(10, id);
        pst.setString(11, player2Name);
        pst.setString(12, result);
        
        pst.executeUpdate();
        
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }

//////////////////////////// { List user saved Games(IDs) } ////////////////////     
    public List<Integer> listMyGames(String playerName){
            int id=getPlayerID(playerName);
            List<Integer> myGames = new ArrayList<>();
            try {
                PreparedStatement pst=con.prepareStatement("SELECT `Game_ID` FROM `Games` WHERE `P1_ID`= ? ");
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    myGames.add(rs.getInt("Game_ID"));
                }
            } 
            catch (SQLException ex) {
                ex.printStackTrace();

            }
            return myGames;
        }
    
//////////////////////// {Get Opponent of saved game using gameID} /////////////////////////////////
    public String recallPlayer2 (Integer gameID){
        String player2Name="Error";
        try {
            PreparedStatement pst=con.prepareStatement("SELECT * FROM `Games` WHERE `Game_ID`= ?");
            pst.setInt(1, gameID);
            ResultSet rs = pst.executeQuery();
            rs.next(); //to put the cursor on the first square

            player2Name = rs.getString("P2_Name");
            }
        catch (SQLException ex) {
            ex.printStackTrace();   
        }
        return player2Name;
    }

//////////////////////// {Get result of saved game using gameID} /////////////////////////////////
    public String recallResult (Integer gameID){
        String result="Error";
        try {
            PreparedStatement pst=con.prepareStatement("SELECT * FROM `Games` WHERE `Game_ID`= ?");
            pst.setInt(1, gameID);
            ResultSet rs = pst.executeQuery();
            rs.next(); //to put the cursor on the first square

            result= rs.getString("result");
            }
        catch (SQLException ex) {
            ex.printStackTrace();   
        }
        return result;
    }
            

//////////////////////// {Get moves of saved game using gameID} /////////////////////////////////
    public int[][] recallMoves(Integer gameID){
         int moves[] = new int[9];
         int movesArr[][]= new int[3][3];
         try {
                PreparedStatement pst=con.prepareStatement("SELECT * FROM `Games` WHERE `Game_ID`= ?");
                pst.setInt(1, gameID);
                ResultSet rs = pst.executeQuery();
                rs.next(); //to put the cursor on the first square
    //////get moves in an array:
                for(int i=2; i<11; i++){
                    moves[i-2]=rs.getInt(i);
                }
    //////convert array to multidimentional:
                movesArr = Helpers.one2Mult(moves);
            } 
            catch (SQLException ex) {
                ex.printStackTrace();
            }
            return movesArr;
    }
}
