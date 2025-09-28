package as3;

public class Main {
    public static void main(String[] args) {
        GameCharacter lior = new Lior();
        lior.attack();

        GameCharacter kaelen = new KaelenAdapter(new KaelenOld());
        kaelen.attack();
    }
}
