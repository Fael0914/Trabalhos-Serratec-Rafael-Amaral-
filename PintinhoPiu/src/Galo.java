import java.util.List;

public class Galo extends Animal{
    public Galo(){
        super("Galo", "cocoricó");
    }

    public void cantar(List<Animal> anteriores) {
        System.out.println("Lá em casa tinha um " + getNome());
        System.out.println("Lá em casa tinha um " + getNome());
        System.out.println("E o " + getNome() + " " + getSom());
        // canta os anteriores
        for (Animal a : anteriores) {
            if (a instanceof Pintinho) {
                ((Pintinho) a).cantarRepetindo();
            } else {
                System.out.println("E o " + a.getNome() + " " + a.getSom());
            }
        }
    }
}
