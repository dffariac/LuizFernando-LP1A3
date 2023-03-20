public class Mamifero extends Animal implements Alimentavel{

    private int tempoGestacao;

    public Mamifero(String nome, int idade, String especie) {
        super(nome, idade, especie);
       
    }

    @Override
    public void emitirSom() {
        System.out.println("Sghhhhh!");
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }
    
    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }

    @Override
    public void alimentar() {
        this.setAlimentado(true);
        
    }

    @Override
    public void ApresentaçãoAnimal() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Especie: " + this.getEspecie());
        if (this.getAlimentado() == false) {
            System.out.println("Animal não alimentado");
        }
        else {
            System.out.println("Animal alimentado");
        }
    }

    @Override
    public String toString() {
        return this.getNome() + ":" + this.getEspecie();
    }
}
