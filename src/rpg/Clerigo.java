package rpg;

/**
 * ✝️ Subclasse Clérigo com habilidades de cura e proteção.
 */
public class Clerigo extends Personagem {

    public Clerigo(String nome, Raca raca) {
        super(nome, raca);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " invoca luz sagrada contra o inimigo!");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " conjura um escudo divino!");
    }
}
