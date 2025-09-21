/** Interface for game characters. */
interface Character {
    String describe();
}

class Kaelen implements Character {
    @Override
    public String describe() {
        return "Kaelen: Demon tired of unstable underworld work, now an office worker. Loves burning deadlines.";
    }
}

class Lior implements Character {
    @Override
    public String describe() {
        return "Liór: Science student, perfectionist, shy and diligent. Solo learner.";
    }
}

class Rene implements Character {
    @Override
    public String describe() {
        return "René: Yandere, obsessed stalker, 3D artist freelancer, connected with Flynn and Liór.";
    }
}

/** Abstract factory for creating characters. */
abstract class CharacterFactory {
    abstract Character createCharacter();

    void displayCharacter() {
        Character character = createCharacter();
        System.out.println(character.describe());
    }
}

class KaelenFactory extends CharacterFactory {
    @Override
    Character createCharacter() {
        return new Kaelen();
    }
}

class LiorFactory extends CharacterFactory {
    @Override
    Character createCharacter() {
        return new Lior();
    }
}

class ReneFactory extends CharacterFactory {
    @Override
    Character createCharacter() {
        return new Rene();
    }
}

public class FactoryMethodDemo {
    private static void demonstrateFactoryMethod(CharacterFactory factory) {
        factory.displayCharacter();
    }

    public static void main(String[] args) {
        System.out.println("Factory Method Example:");
        demonstrateFactoryMethod(new KaelenFactory());
        demonstrateFactoryMethod(new LiorFactory());
        demonstrateFactoryMethod(new ReneFactory());
    }
}