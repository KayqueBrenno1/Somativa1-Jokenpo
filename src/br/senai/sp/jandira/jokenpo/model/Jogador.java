package br.senai.sp.jandira.jokenpo.model;

import java.util.Scanner;

public class Jogador {
    int numeroDaJogada;
    String jogada;

    public void escolherJogada(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("*** Vamos jogar ***");
        System.out.println("-------------------------------");
        System.out.println("Escolha uma opção:");
        System.out.println("(1) Pedra");
        System.out.println("(2) Papel");
        System.out.println("(3) Tesoura");
        System.out.println("-------------------------------");
        System.out.print("Digite sua escolha: ");
        numeroDaJogada = leitor.nextInt();

        verificarJogada();
    }
    public void verificarJogada(){
        if (numeroDaJogada == 1){
            jogada = "Pedra";
        } else if (numeroDaJogada == 2){
            jogada = "Papel";
        } else if (numeroDaJogada == 3){
            jogada = "Tesoura";
        } else {
            jogada = "Jogada não disponível";
            escolherJogada();
        }
    }
}
