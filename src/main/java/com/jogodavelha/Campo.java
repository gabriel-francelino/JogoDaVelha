package com.jogodavelha;

public class Campo {
    private String simbolo;

    public Campo() {
        this.simbolo = " ";
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        if (this.simbolo.equals(" ")) {
            this.simbolo = simbolo;
        } else {
            System.out.println("Este campo já está ocupado!");
        }
        this.simbolo = simbolo;
    }

    
}
