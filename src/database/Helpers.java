package database;
/*
This Class contains the functions that just defined to simplify the code in the main classes
they are all made static to call them directly 
*/

public class Helpers {
/////////////////// convert 3x3 array to 1 dimentional array/////////////////////////
    public static int[] mult2One(int multArr[][]){
        int arr[]=new int[9];
        int k=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[k]=multArr[i][j];
                k++;
            }
        }
        return arr;
    }

/////////////////// convert 1 dimentional array to 3x3 array /////////////////////////
    public static int[][] one2Mult(int arr[]){
        int multArr[][]=new int[3][3];
        int k=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                multArr[i][j]=arr[k];
                k++;
            }
        }
        return multArr;

    }
}
