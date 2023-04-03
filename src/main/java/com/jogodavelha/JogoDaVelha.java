package com.jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {
    private Campo[][] velha;
    private String simboloAtual;
    private Boolean jogo;
    private String vitoria;
    private Scanner scan;

    public JogoDaVelha() {
        this.velha = new Campo[3][3];
        this.simboloAtual = "X";
        this.jogo = true;
        this.vitoria = "";
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

    public Boolean getJogo() {
        return jogo;
    }

    public void setJogo(Boolean jogo) {
        this.jogo = jogo;
    }

    public String getVitoria() {
        return vitoria;
    }

    public void setVitoria(String vitoria) {
        this.vitoria = vitoria;
    }

    
}
