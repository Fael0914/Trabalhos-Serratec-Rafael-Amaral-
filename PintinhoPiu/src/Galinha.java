import java.util.List;

public class Galinha extends Animal {
    public Galinha() {
        super("Galinha", "có");
    }

    public void cantar(List<Animal> anteriores) {
        System.out.println("Lá em casa tinha uma " + getNome());
        System.out.println("Lá em casa tinha uma " + getNome());
        System.out.println("E a " + getNome() + " " + getSom());
        for (Animal a : anteriores) {
            if (a instanceof Pintinho) {
                ((Pintinho) a).cantarRepetindo();
            } else {
                System.out.println("E o " + a.getNome() + " " + a.getSom());
            }
        }
    }
}