package rpg;

public class Main {
    public static void main(String[] args) {
        // Criando personagens com diferentes raças e classes
        Personagem barbaro = new Barbaro("Thorg", Raca.ORC);
        Personagem bruxo = new Bruxo("Zyra", Raca.ELFO);
        Personagem clerigo = new Clerigo("Lumen", Raca.HUMANO);
        Personagem druida = new Druida("Fael", Raca.GNOMO);

        barbaro.exibirFicha();
        System.out.println();
        bruxo.exibirFicha();

        // Simulação de uma batalha
        Util.simularBatalha(barbaro, bruxo);

        // Subir de nível após a batalha
        barbaro.subirNivel();
        bruxo.subirNivel();
    }
}
