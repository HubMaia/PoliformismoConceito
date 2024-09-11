package com.mycompany.jogoxadrez;

import Xadrez.Bispo;
import Xadrez.Cavalo;
import Xadrez.Peao;

public class JogoXadrez {

    public static void main(String[] args) {
        Bispo bispo1 = new Bispo();
        Cavalo cavalo1 = new Cavalo();
        Peao peao1 = new Peao();
        
        bispo1.mover();
        cavalo1.mover();
        peao1.mover();
    }
}
