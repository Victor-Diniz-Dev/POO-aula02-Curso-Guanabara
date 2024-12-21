package com.mycompany.aula02;

public class Trabalhar {
    private int horario;
    private String local;
    private String vestimenta;
    private boolean sono;

    public void acordar(){
        if (sono == true){
            System.out.println("Muito sono. Voltando a dormir.");
        } else{
            System.out.println("Levantando da cama.");
        }
    }
    public void noiteMalDormida(){
        this.sono = true;
    }
    public void noiteBemDormida(){
        this.sono = false;
    }
    public void statusDoDia(){
        if (sono == false) {
            System.out.println("Fui ao Trabalho " + horario + " horas. Hoje trabalhei no seguinte local: " + local + ".");
            System.out.println("Trabalhei usando " + vestimenta + ".");
            System.out.println("O dia foi bem produtivo");
        } else {
            System.out.println("Me atrasei e passei o dia dormindo :(");
        }
    }

}
