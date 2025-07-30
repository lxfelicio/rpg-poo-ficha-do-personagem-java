package rpg;

/**
 * 🧬 Subclasse Bruxo com ataques mágicos sombrios.
 */
public class Bruxo extends Personagem {

    public Bruxo(String nome, Raca raca) {
        super(nome, raca);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lança uma maldição sombria no inimigo!");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " envolve-se em sombras protetoras.");
    }
}
