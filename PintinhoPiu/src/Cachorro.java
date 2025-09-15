import java.util.List;

public class Cachorro extends Animal {
    public Cachorro() {
        super("cachorro", "auau");
    }

    @Override
    public void cantar(List<Animal> anteriores) {
        System.out.println("Lá em casa tinha um " + getNome());
        System.out.println("Lá em casa tinha um " + getNome());
        System.out.println("E o " + getNome() + " " + getSom());
        for (Animal a : anteriores) {
            if (a instanceof Pintinho) {
                ((Pintinho) a).cantarRepetindo();
            } else {
                System.out.println("E o " + a.getNome() + " " + a.getSom());
            }
        }
    }
}
