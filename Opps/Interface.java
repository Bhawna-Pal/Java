public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface herbivore {
  
}
 
interface Carnivore {

}

class Bear implements herbivore, Carnivore{

    
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, dialonal (in all 4 direction)");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}