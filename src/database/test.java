package database;

public class test {
    public static void main(String[] args) {
        Database db=new Database();
//        db.addPlayer("Mina");
        
//        System.out.println(db.getPlayerID("Mina"));

//        int A[][]={{1,2,3},{4,5,-1},{7,8,-1}};
//        db.saveGame(A, "Mina", "karim", "L");

//        System.out.println(db.listMyGames("Mizo"));
           
//        System.out.println(db.recallPlayer2(7));

//        System.out.println(db.recallResult(7));  

          System.out.println(db.recallMoves(7)[0][0]); 
        
    }
}
