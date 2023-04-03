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
        jogo.desenharJogo();
        if (!jogo.getVencedor().equals("")) {
            System.out.printf("Jogador %s venceu!\n", jogo.getVencedor());
            jogo.setExecucao(false);
        }
        try {
            
        } catch (Exception e) {
            System.out.println("Erro");
        }
        System.out.println("Fim de jogo!");
    }
}
