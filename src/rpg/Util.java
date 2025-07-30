package rpg;

public class Util {

    public static void simularBatalha(Personagem p1, Personagem p2) {
        System.out.println("\n⚔️ Início da Batalha ⚔️");
        p1.atacar();
        p2.defender();
        p2.setVida(p2.getVida() - 20);
        p2.atacar();
        p1.defender();
        p1.setVida(p1.getVida() - 15);

        System.out.println("\n❤️ Status Final:");
        p1.exibirFicha();
        p2.exibirFicha();
    }
}
