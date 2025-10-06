package br.senai.sp.jandira.jokenpo.model;

import java.util.Random;
import java.util.Scanner;

public class Jogador {
    int numeroDaJogada;
    int numeroDaJogadaDoComputador;
    String jogada;
    String jogadaComputador;
    String resultado;
    String decisao;
    Scanner leitor = new Scanner(System.in);
    Random random = new Random();

    public void escolherJogada(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("********* VAMOS JOGAR *********");
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

        receberJogadaDoComputador();
    }
    public void receberJogadaDoComputador(){
        numeroDaJogadaDoComputador = random.nextInt(3) + 1;
        verificarJogadaDoComputador();
    }
    public void verificarJogadaDoComputador(){
        if (numeroDaJogadaDoComputador == 1){
            jogadaComputador = "Pedra";
        }else if (numeroDaJogadaDoComputador == 2){
            jogadaComputador = "Papel";
        }else {
            jogadaComputador = "Tesoura";
        }


    }
