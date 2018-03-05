/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tectactoe;


/**
 *
 * @author assem
 */
public class SingleModelvl1{
    public int[][] gameArray= new int[3][3];
    
    SingleModelvl1(){
        for(int i = 0; i < 3; i++){
            for(int y = 0; y < 3; y++){
                gameArray[i][y] = 20;
            }
        }
    }
    
    public void pushPlay(int x,int z,int player){
        gameArray[x][z] = player;
        
    }
    
    public int[] getNewPosition(){
        int[] newPos= new int[2];
        for(int i = 0; i < 3; i++){
            for(int y = 0; y < 3; y++){
                if(gameArray[i][y] == 20){
                    newPos[0] = i;
                    newPos[1] = y;
                    return newPos;
                }
                else{
                   continue; 
                }
            }
        }
        return null;
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
    
    public Boolean isWinner(int player)
    {
        int sumRow = 0;
        int sumCol = 0;
        int diag1 = 0;
        int diag2 = 0;

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                sumRow += gameArray[i][j];
                sumCol += gameArray[j][i];
                if(i == j)
                {
                    diag1 += gameArray[i][j];
                }
            }            

            if(sumRow == player || sumCol == player)
            {
                return true;
            }

            sumCol = 0;
            sumRow = 0;
        }

        diag2 = gameArray[0][2] + gameArray[1][1] + gameArray[2][0];

        if(diag1 == player || diag2 == player)
        {
            return true;
        }
        else{
            return false;
        }

    }
    
//    public boolean isDraw(){
//       for(int i = 0; i < 3; i++){
//            for(int y = 0; y < 3; y++){
//                if(gameArray[i][y] == 20){
//                    return false;
//                }
//                
//            }
//        }
//       return true;
//   }
}
