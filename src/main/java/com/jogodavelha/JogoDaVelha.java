package com.jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {
    private String[][] velha; 
    private String simboloAtual;
    private Boolean execucao;
    private String vencedor;
    private Scanner scan;
    private int contador;

    public JogoDaVelha() {
        this.velha = new String[3][3];
        for (int i = 0; i < velha.length; i++) {
            for (int j = 0; j < velha[i].length; j++) {
                velha[i][j] = " ";
            }
            System.out.println();
        }
        this.simboloAtual = "X";
        this.execucao = true;
        this.vencedor = "";
        this.scan = new Scanner(System.in);
    }

    public String[][] getVelha() {
        return velha;
    }

    public void setVelha(String[][] velha) {
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
        System.out.println("  | /\\ / _ /\\    |-\\  /\\");
        System.out.println("|_| \\/ \\_/ \\/    |_/ /  \\\n");
        System.out.println("   \\  / |_ |  |_| /\\");
        System.out.println("    \\/  |_ |_ | |/  \\");
        System.out.println("---------------");
        System.out.println("  | 0 | 1 | 2 |");
        System.out.println("---------------");
        System.out.printf("0 | %s | %s | %s |\n", velha[0][0], velha[0][1], velha[0][2]);
        System.out.println("---------------");
        System.out.printf("1 | %s | %s | %s |\n", velha[1][0], velha[1][1], velha[1][2]);
        System.out.println("---------------");
        System.out.printf("2 | %s | %s | %s |\n", velha[2][0], velha[2][1], velha[2][2]);
        System.out.println("---------------");
    }

    public void verificarVencedor(){
        for (int i = 0; i < 3; i++) {
            if (velha[i][0] == simboloAtual && velha[i][1] == simboloAtual && velha[i][2] == simboloAtual) {
                vencedor = simboloAtual;
            }
            else if (velha[0][i] == simboloAtual && velha[1][i] == simboloAtual && velha[2][i] == simboloAtual) {
                vencedor = simboloAtual;
            }
            else if (velha[0][0] == simboloAtual && velha[1][1] == simboloAtual && velha[2][2] == simboloAtual) {
                vencedor = simboloAtual;
            }
            else if (velha[0][2] == simboloAtual && velha[1][1] == simboloAtual && velha[2][0] == simboloAtual) {
                vencedor = simboloAtual;
            }
            else if(contador == 9){
                vencedor = "E";
            }
        }
        mudarJogador();
    }

    public void resultado(){
        if (vencedor.equals("E")) {
            System.out.println("O jogo empatou!");
        } else {
            System.out.printf("Jogador %s venceu!\n", vencedor);
        }
    }

    public Boolean verificarJogada(int i, int j){
        if (velha[i][j].equals(" ")) {
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
        
        System.out.println("Vez do jogador " + simboloAtual + ". Digite as coordenadas da jogada!");
        do {
            System.out.println("Linha: ");
            i = scan.nextInt();
            System.out.println("Coluna: ");
            j = scan.nextInt();

            if (i < 0 || i > 3 || j < 0 || j >3) {
                System.out.println("Coordenada inválida!");
            }
            if (!verificarJogada(i, j)) {
                System.out.println("Essa posição já foi ocupada!");
            } 
        } while (i < 0 || i > 3 || j < 0 || j >3 || !verificarJogada(i, j));
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar a tela: " + e.getMessage());
        }

        velha[i][j] = simboloAtual;
        contador++;
    }
}
