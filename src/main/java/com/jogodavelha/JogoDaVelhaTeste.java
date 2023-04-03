package com.jogodavelha;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class JogoDaVelhaTeste 
{
    public static void main( String[] args )
    {
        JogoDaVelha jogo = new JogoDaVelha();
        // while(jogo.getExecucao()){

        // }
        if (!jogo.getVencedor().equals("")) {
            System.out.printf("Jogador %s venceu!\n", jogo.getVencedor());
            jogo.setExecucao(false);
        }
        try {
            jogo.desenharJogo();
            jogo.jogar();
            jogo.verificarVencedor();
            
        } catch (Exception e) {
            System.out.println("Erro");
        }

        System.out.println("Fim de jogo!");
        jogo.desenharJogo();
    }
}
