package com.example.javafx.Controller;

import com.example.javafx.Animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    List<Animal> animais = new ArrayList<>();

    public Principal() {
        this.animais.add(new Animal(1,12, "Pantera Negra"));
        this.animais.add(new Animal(2,3, "SIMBA"));
        this.animais.add(new Animal(3,2, "Zebra"));
        this.animais.add(new Animal(4,5, "Rhinoceroses"));
        this.animais.add(new Animal(5,6, "Monkey"));
        this.animais.add(new Animal(6,23, "Scar"));
        this.animais.add(new Animal(7,100, "Tartaruga Marinha"));
    }

    public List<Animal> getAnimais() {
        return animais;
    }




}
