import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        Pintinho pintinho = new Pintinho();
        animais.add(pintinho);
        pintinho.cantar(new ArrayList<>());

        Galo galo = new Galo();
        animais.add(0, galo);
        galo.cantar(animais.subList(1, animais.size()));

        Galinha galinha = new Galinha();
        animais.add(0, galinha);
        galinha.cantar(animais.subList(1, animais.size()));

        Cachorro cachorro = new Cachorro();
        animais.add(0, cachorro);
        cachorro.cantar(animais.subList(1, animais.size()));

        Gato gato = new Gato();
        animais.add(0, gato);
        gato.cantar(animais.subList(1, animais.size()));
    }
}

