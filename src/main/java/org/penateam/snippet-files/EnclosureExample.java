import org.penateam.Enclosure;
import org.penateam.Lion;
import org.penateam.Panda;


public class EnclosureExample {
    public static void main(String... args) throws Exception {
        var mixedEnclosure = new Enclosure<>();

        var lion = new Lion("Simba", 5);
        var panda = new Panda("Po", 3);

        mixedEnclosure.addAnimal(lion);
        mixedEnclosure.addAnimal(panda);

        if (!mixedEnclosure.isEmpty() && mixedEnclosure.safeForPetting()) {
            mixedEnclosure.feed();
        }
    }
}