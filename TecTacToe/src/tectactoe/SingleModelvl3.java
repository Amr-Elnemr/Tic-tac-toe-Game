/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tectactoe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author assem
 */
public class SingleModelvl3 {
    public static final int playerNum = 0;
    public static final int firstPlayer = 1;
    public static final int secPlayer = 2;
    public static int[][] gameArray = new int[3][3];
    public position pcMove;
    
    public boolean gameOver(){
        return playerWin(firstPlayer) || playerWin(secPlayer) || getAvailablePos().isEmpty();
    }
    
    public boolean playerWin(int player){
        if ((gameArray[0][0] == gameArray[1][1] && gameArray[0][0] == gameArray[2][2] && gameArray[0][0] == player)||(gameArray[0][2] == gameArray[1][1] && gameArray[0][2] == gameArray[2][0] && gameArray[0][2] == player)) {
            return true;
        }
        for(int i = 0; i < 3; i++){
            if((gameArray[i][0] == gameArray[i][1] && gameArray[i][0] == gameArray[i][2] && gameArray[i][0] == player)||(gameArray[0][i] == gameArray[1][i] && gameArray[0][i] == gameArray[2][i] && gameArray[0][i] == player)){
                return true;
            }
        }
        return false;
    }
    
    public List<position> getAvailablePos(){
        List<position> availablePostions = new ArrayList<>();
        
        for(int i = 0; i < 3; i++){
            for(int j =0; j <3; j++){
                if(gameArray[i][j] == playerNum)
                    availablePostions.add(new position(i , j));
            }
        }
        
        return availablePostions;
    }
    
    public boolean move(position pos, int player){
        if(gameArray[pos.x][pos.y] != playerNum)
            return false;
        
        gameArray[pos.x][pos.y] = player;
        
        return true;
    }
    
    public void displayGame(){
        System.out.println();
        
        for(int i=0; i < 3;i++){
            for(int j=0; j < 3; j++){
                String value = "?";
                
                if(gameArray[i][j] == firstPlayer)
                    value = "X";
                else if(gameArray[i][j] == secPlayer)
                    value = "O";
                
                System.out.print(value+" ");
            }
           System.out.println(); 
        }
        System.out.println();
    }
    
    public int miniMax(int depth, int turn){
        if(playerWin(firstPlayer))
            return 1;
        
        if(playerWin(secPlayer))
            return -1;
        
        List<position> availablePosition = getAvailablePos();
        
        if(availablePosition.isEmpty())
            return 0;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < availablePosition.size() ; i++){
            position pos = availablePosition.get(i);
            
            if( turn == firstPlayer){
                move(pos, firstPlayer);
                int currentScore = miniMax(depth + 1, secPlayer);
                max = Math.max(currentScore, max);
                
                if(depth == 0)
                    System.out.println("PC score for pos" + pos + "...." + currentScore);
                if(currentScore >= 0)
                    if(depth == 0)
                        pcMove = pos;
                
                if(currentScore == 1){
                    gameArray[pos.x][pos.y] = playerNum;
                    break;
                }
                if( i == availablePosition.size() -1 && max < 0)
                    if(depth == 0)
                        pcMove = pos;
            } else if(turn == secPlayer){
                move(pos, secPlayer);
                int currentScore = miniMax(depth + 1, firstPlayer);
                min = Math.min(currentScore, min);
                
                if(min == -1){
                    gameArray[pos.x][pos.y] = playerNum;
                    break;
                }
            }
            gameArray[pos.x][pos.y] = playerNum;
        }
        return turn == firstPlayer ? max: min;
    }
    
    public int getButtonToTrigger(int[] newPos){
        if(newPos[0] == 0 && newPos[1] == 0){return 1;}
        if(newPos[0] == 0 && newPos[1] == 1){return 2;}
        if(newPos[0] == 0 && newPos[1] == 2){return 3;}
        if(newPos[0] == 1 && newPos[1] == 0){return 4;}
        if(newPos[0] == 1 && newPos[1] == 1){return 5;}
        if(newPos[0] == 1 && newPos[1] == 2){return 6;}
        if(newPos[0] == 2 && newPos[1] == 0){return 7;}
        if(newPos[0] == 2 && newPos[1] == 1){return 8;}
        if(newPos[0] == 2 && newPos[1] == 2){return 9;}
        return 0;
    }
}
