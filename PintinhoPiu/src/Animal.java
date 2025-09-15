import java.util.List;

abstract class Animal {
    private String nome;
    private String som;

    public Animal(String nome, String som) {
        this.nome = nome;
        this.som = som;
    }

    public String getNome() {
        return nome;
    }

    public String getSom() {
        return som;
    }
    public abstract void cantar(List<Animal> anteriores);

}

