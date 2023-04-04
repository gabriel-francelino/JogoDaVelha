package com.jogodavelha;

public class JogoDaVelhaTeste 
{
    public static void main( String[] args )
    {
        executarJV();
    }

    public static void executarJV(){
        JogoDaVelha jogo = new JogoDaVelha();
        while(jogo.getExecucao()){
            try {
                jogo.desenharJogo();
                jogo.jogar();
                jogo.verificarVencedor();                
            } catch (Exception e) {
                System.out.println("Erro");
            }
            if (!jogo.getVencedor().equals("")) {
                jogo.desenharJogo();
                System.out.printf("Jogador %s venceu!\n", jogo.getVencedor());
                jogo.setExecucao(false);
            }
        }
        System.out.println("Fim de jogo!");
    }
}
