package com.jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {
    private Campo[][] velha;
    private String simboloAtual;
    private Boolean execucao;
    private String vencedor;
    private Scanner scan;

    public JogoDaVelha() {
        this.velha = new Campo[3][3];
        for (int i = 0; i < velha.length; i++) {
            for (int j = 0; j < velha[i].length; j++) {
                velha[i][j] = new Campo(" ");
            }
            System.out.println();
        }
        this.simboloAtual = "X";
        this.execucao = true;
        this.vencedor = "";
        this.scan = new Scanner(System.in);
    }

    public Campo[][] getVelha() {
        return velha;
    }

    public void setVelha(Campo[][] velha) {
        this.velha = velha;
    }

    public String getSimboloAtual() {
        return simboloAtual;
    }

    public void setSimboloAtual(String simboloAtual) {
        this.simboloAtual = simboloAtual;
    }

    public Boolean getExecucao() {
        return execucao;
    }

    public void setExecucao(Boolean jogo) {
        this.execucao = jogo;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vitoria) {
        this.vencedor = vitoria;
    }

    public void desenharJogo(){
        // try {
        //     new ProcessBuilder("clear").inheritIO().start().waitFor();
        // } catch (Exception e) {
        //     System.out.println("Erro ao limpar a tela: " + e.getMessage());
        // }
        System.out.println("    0   1   2");
        System.out.printf("0   %s | %s | %s \n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.println("-----------------");
        System.out.printf("1   %s | %s | %s \n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
        System.out.println("-----------------");
        System.out.printf("2   %s | %s | %s \n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
        System.out.println("-----------------");
        // System.out.println("----------");
        // for (Campo[] campos : velha) {
        //     for (Campo campo : campos) {
        //         System.out.print("| " + campo.getSimbolo());
        //     }
        //     System.out.println("|\n----------");
        // }
    }

    public void verificarVencedor(){
        if (velha[0][0].getSimbolo().equals(simboloAtual) && velha[1][1].getSimbolo().equals(simboloAtual) && velha[2][2].getSimbolo().equals(simboloAtual)) {
            vencedor = simboloAtual;
        }
        else if (velha[0][2].getSimbolo().equals(simboloAtual) && velha[1][1].getSimbolo().equals(simboloAtual) && velha[2][1].getSimbolo().equals(simboloAtual)) {
            vencedor = simboloAtual;
        }
        else if (velha[0][0].getSimbolo().equals(simboloAtual) && velha[0][1].getSimbolo().equals(simboloAtual) && velha[0][2].getSimbolo().equals(simboloAtual)) {
            vencedor = simboloAtual;
        }
        else if (velha[1][0].getSimbolo().equals(simboloAtual) && velha[1][1].getSimbolo().equals(simboloAtual) && velha[1][2].getSimbolo().equals(simboloAtual)) {
            vencedor = simboloAtual;
        }
        else if (velha[2][0].getSimbolo().equals(simboloAtual) && velha[2][1].getSimbolo().equals(simboloAtual) && velha[2][2].getSimbolo().equals(simboloAtual)) {
            vencedor = simboloAtual;
        }
        else if (velha[0][0].getSimbolo().equals(simboloAtual) && velha[1][0].getSimbolo().equals(simboloAtual) && velha[2][0].getSimbolo().equals(simboloAtual)) {
            vencedor = simboloAtual;
        }
        else if (velha[0][1].getSimbolo().equals(simboloAtual) && velha[1][1].getSimbolo().equals(simboloAtual) && velha[2][1].getSimbolo().equals(simboloAtual)) {
            vencedor = simboloAtual;
        }
        else if (velha[0][2].getSimbolo().equals(simboloAtual) && velha[1][2].getSimbolo().equals(simboloAtual) && velha[2][2].getSimbolo().equals(simboloAtual)) {
            vencedor = simboloAtual;
        }
        mudarJogador();
    }

    public Boolean verificarJogada(int i, int j){
        if (velha[i][j].getSimbolo().equals(" ")) {
            return true;
        }else{
            return false;
        }
    }

    public void mudarJogador(){
        if (simboloAtual.equals("X")) {
            simboloAtual = "O";
        } else {
            simboloAtual = "X";
        }
    }

    public void jogar(){
        int i, j;
        

        System.out.println("Digite as coordenadas da jogada!");
        do {
            System.out.println("Linha: ");
            i = scan.nextInt();
            System.out.println("Coluna: ");
            j = scan.nextInt();

            if (i < 0 || i >3 || j < 0 || j >3) {
                System.out.println("Coordenada inválida!");
            }
            if (!verificarJogada(i, j)) {
                System.out.println("Essa posição já foi ocupada!");
            } 
        } while (i < 0 || i >3 || j < 0 || j >3 || !verificarJogada(i, j));

        velha[i][j].setSimbolo(simboloAtual);
    }
}
