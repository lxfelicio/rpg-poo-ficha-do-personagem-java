package rpg;

/**
 * 🧱 Subclasse Bárbaro que herda de Personagem.
 * Aplica Herança, Polimorfismo e Encapsulamento.
 */
public class Barbaro extends Personagem {

    public Barbaro(String nome, Raca raca) {
        super(nome, raca);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " desfere um golpe brutal com seu machado!");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " resiste ao dano com sua fúria bárbara!");
    }
}
