package com.example.javafx.Animal;

public class Animal {
    int id;
    int idade;
    String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal(Integer id, int idade, String nome) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }


    public String toStringAll() {
        return  "Nome: " + nome +
                "\nIdade: " + idade +
                "\nid: " + id;
    }


}
