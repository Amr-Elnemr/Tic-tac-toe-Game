/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tectactoe;

/**
 *
 * @author tarek
 */
public class Game {
     protected int moves[][];

    public Game()
    {
        moves = new int[3][3];

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                moves[i][j] = 20;
    }

    public Boolean insertMove(int player, int row, int col)
    {
        if(player == 3)
        {
            moves[row][col] = 1;
        }
        else
        {
            moves[row][col] = 2; 
        }

//        if(isWinner(player)){
//           
//           
//        }
        return isWinner(player);
                  
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
                sumRow += moves[i][j];
                sumCol += moves[j][i];
                if(i == j)
                {
                    diag1 += moves[i][j];
                }
            }            

            if(sumRow == player || sumCol == player)
            {
                return true;
            }

            sumCol = 0;
            sumRow = 0;
        }

        diag2 = moves[0][2] + moves[1][1] + moves[2][0];

        if(diag1 == player || diag2 == player)
        {
            return true;
        }
        else{
            return false;
        }

    }   
}
