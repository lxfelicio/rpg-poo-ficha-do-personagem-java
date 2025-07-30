package rpg;

/**
 * 🌿 Subclasse Druida com conexão à natureza.
 */
public class Druida extends Personagem {

    public Druida(String nome, Raca raca) {
        super(nome, raca);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " invoca cipós mágicos para atacar!");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " transforma-se em animal para escapar do ataque.");
    }
}
