package com.mycompany.aula02;
public class Pen {
    String color;
    String model;
    Boolean tampada;
    
    void confirmar(){
        if (tampada == true){
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
    }
    
    void status(){
        System.out.println("Uma caneta " + this.color);
        System.out.println("Esta tampada?" + this.tampada);
        System.out.println("Modelo: " + this.model);
    }
    void rabiscar(){
       if (this.tampada == true) {
           System.out.println("Erro. Impossivel rabiscar");
       } else{
           System.out.println("Estou rabiscando");
       }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
