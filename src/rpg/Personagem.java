package rpg;

/**
 * ✨ Classe abstrata que representa um personagem genérico de RPG.
 * Aplica Abstração, Encapsulamento e serve como base para Herança.
 */
public abstract class Personagem {
    private String nome;
    private int nivel;
    private int vida;
    private Raca raca;

    public Personagem(String nome, Raca raca) {
        this.nome = nome;
        this.raca = raca;
        this.nivel = 1;
        this.vida = 100;
    }

    // Encapsulamento com getters e setters
    public String getNome() { return nome; }
    public int getNivel() { return nivel; }
    public int getVida() { return vida; }
    public Raca getRaca() { return raca; }

    public void setVida(int vida) {
        this.vida = Math.max(0, vida);
    }

    public void subirNivel() {
        nivel++;
        vida += 20;
        System.out.println(nome + " subiu para o nível " + nivel + "!");
    }

    // 🌀 Polimorfismo: métodos abstratos serão sobrescritos nas subclasses
    public abstract void atacar();
    public abstract void defender();

    public void exibirFicha() {
        System.out.println("🧙 Ficha do Personagem");
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
    }
}
