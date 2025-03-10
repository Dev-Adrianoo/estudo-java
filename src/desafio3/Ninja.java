package desafio3;

import java.util.Scanner;

public class Ninja {

    String nome;
    int idade;
    String nivelDificuldade;
    String Missao;
    String Status;

    public void MostrarInformacoes(){
        System.out.printf("Nome: %s\nIdade: %d\nDificuldade Missao: %s\nMissao: %s\nStatus Missao %s\n", nome, idade, nivelDificuldade, Missao, Status );
    }
}
