package org.smosquera.poo;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Eduardo", "Mosquera", "14745", "34987", 15.000d, 7);
        gerente.increaseRemuneration(77000);
        gerente.setBudget(770.000);
        System.out.println(gerente);
    }
}
