
public abstract class Animal {

private String nome;
private int idade;
private String especie;
private boolean alimentado;

public Animal(String nome, int idade, String especie) {
    this.nome = nome;
    this.idade = idade;
    this.especie = especie;
}


public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}


public int getIdade() {
    return idade;
}


public void setIdade(int idade) {
    this.idade = idade;
}


public String getEspecie() {
    return especie;
}


public void setEspecie(String especie) {
    this.especie = especie;
}


public boolean getAlimentado() {
    return alimentado;
}


public void setAlimentado(boolean alimentado) {
    this.alimentado = alimentado;
}

public abstract void emitirSom ();
public abstract void ApresentaçãoAnimal();
public abstract String toString();

}

