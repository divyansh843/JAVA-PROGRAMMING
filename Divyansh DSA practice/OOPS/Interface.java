public class Interface {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();

    }

}

interface Chessplayer {
    void moves();
}

class Queen implements Chessplayer {
    public void moves() {

        System.out.println(" up, down, left, right, diagonal ( in all 4 dirns)");

    }

}

class Rook implements Chessplayer {
    public void moves() {

        System.out.println(" up, down, left, right");

    }

}

class king implements Chessplayer {
    public void moves() {

        System.out.println(" up, down, left, right, diagonal ( by step 1 )");

    }

}

// For multiple Inheritance

interface member1 {

}

interface member2 {

}

class CommonProperties implements member1, member2 {
    // CommonProperties
}