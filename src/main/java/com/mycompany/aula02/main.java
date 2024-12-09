package com.mycompany.aula02;

public class main {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Azul";
        p1.model = "BIC";
        p1.destampar();
        p1.confirmar();
        p1.status();
        p1.rabiscar(); 
       
        Pen p2 = new Pen();
        p2.color = "Black";
        p2.model = "BIC";
        p2.tampar();
        p2.confirmar();
        p2.status();
        p2.rabiscar();
    }
}