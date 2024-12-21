package com.mycompany.aula02;
public class Pen {
    private String color;
    private String model;
    private Boolean tampada;
    
    public void confirmar(){
        if (tampada == true){
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
    }
    
    public void status(){
        System.out.println("Uma caneta " + this.color);
        System.out.println("Esta tampada?" + this.tampada);
        System.out.println("Modelo: " + this.model);
    }
    public void rabiscar(){
       if (this.tampada == true) {
           System.out.println("Erro. Impossivel rabiscar");
       } else{
           System.out.println("Estou rabiscando");
       }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}