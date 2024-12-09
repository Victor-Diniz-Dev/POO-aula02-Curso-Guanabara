package com.mycompany.aula02;

public class Teclado {
    private String cor;
    private int tamanho;
    private String modelo;
    private boolean fio;

    public void digitar() {
        if (fio == false){
            System.out.println("Não é possivel digitar. O teclado não está ligado.");
        } else {
            System.out.println("O teclado está digitando.");

        }
    }
    public void mudarCor() {
        if (fio == false){
            System.out.println("Não é possivel alterar cor. O teclado não está ligado.");
        } else {
            System.out.println("Cor alterada com sucesso");

        }
    }
    public void colocarFio(){
        this.fio = true;
    }
    public void tirarFio(){
        this.fio = false;
    }

}
