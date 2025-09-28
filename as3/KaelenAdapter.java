package as3;

public class KaelenAdapter implements GameCharacter {
    private final KaelenOld kaelen;

    public KaelenAdapter(KaelenOld kaelen) {
        this.kaelen = kaelen;
    }

    @Override
    public void attack() {
        kaelen.strike();
    }
}
