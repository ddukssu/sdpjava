/** Interface for game characters with abilities. */
interface GameCharacter {
    String describe();
}

/** Interface for character powers. */
interface Power {
    String usePower();
}

// Concrete products for Kaelen
class KaelenCharacter implements GameCharacter {
    @Override
    public String describe() {
        return "Kaelen: Demon office worker, loves burning deadlines.";
    }
}

class KaelenPower implements Power {
    @Override
    public String usePower() {
        return "Kaelen opens a portal between worlds.";
    }
}

// Concrete products for Lior
class LiorCharacter implements GameCharacter {
    @Override
    public String describe() {
        return "Liór: Science student, shy perfectionist.";
    }
}

class LiorPower implements Power {
    @Override
    public String usePower() {
        return "Liór senses everything with 360-degree perception.";
    }
}

// Concrete products for Rene
class ReneCharacter implements GameCharacter {
    @Override
    public String describe() {
        return "René: Yandere, obsessed stalker, 3D artist freelancer.";
    }
}

class RenePower implements Power {
    @Override
    public String usePower() {
        return "René flies with super agility in battle.";
    }
}

/** Factory for creating character and power pairs. */
interface CharacterSetFactory {
    GameCharacter createCharacter();
    Power createPower();
}

class KaelenSetFactory implements CharacterSetFactory {
    @Override
    public GameCharacter createCharacter() {
        return new KaelenCharacter();
    }

    @Override
    public Power createPower() {
        return new KaelenPower();
    }
}

class LiorSetFactory implements CharacterSetFactory {
    @Override
    public GameCharacter createCharacter() {
        return new LiorCharacter();
    }

    @Override
    public Power createPower() {
        return new LiorPower();
    }
}

class ReneSetFactory implements CharacterSetFactory {
    @Override
    public GameCharacter createCharacter() {
        return new ReneCharacter();
    }

    @Override
    public Power createPower() {
        return new RenePower();
    }
}

public class AbstractFactoryDemo {
    private static void demonstrateAbstractFactory(CharacterSetFactory factory) {
        GameCharacter character = factory.createCharacter();
        Power power = factory.createPower();
        System.out.println(character.describe());
        System.out.println(power.usePower());
    }

    public static void main(String[] args) {
        System.out.println("Abstract Factory Example:");
        demonstrateAbstractFactory(new KaelenSetFactory());
        demonstrateAbstractFactory(new LiorSetFactory());
        demonstrateAbstractFactory(new ReneSetFactory());
    }
}