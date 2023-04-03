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
        //limpartela();
        System.out.println("    0   1   2");
        System.out.printf("0   %s | %s | %s \n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.println("-----------------");
        System.out.printf("0   %s | %s | %s \n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
        System.out.println("-----------------");
        System.out.printf("0   %s | %s | %s \n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
        System.out.println("-----------------");
    }

    public String verificarVitoria(){
        return "";
    }
}
