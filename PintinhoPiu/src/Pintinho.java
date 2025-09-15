import java.util.List;

public class Pintinho extends Animal {

    public Pintinho() {
        super("pintinho", "piu");
    }

    @Override
    public void cantar(List<Animal> anteriores) {
        System.out.println("Lá em casa tinha um " + getNome());
        System.out.println("Lá em casa tinha um " + getNome());
        for (int i = 0; i < 6; i++) {
            System.out.println("E o " + getNome() + " " + getSom());
        }
    }

    public void cantarRepetindo() {
        for (int i = 0; i < 4; i++) {
            System.out.println("E o " + getNome() + " " + getSom());
        }
    }
}
