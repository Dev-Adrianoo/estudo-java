package desafio2;

import java.io.PrintStream;
import java.util.Scanner;

/*
* Você foi encarregado pelo Hokage para gerenciar o cadastro de ninjas na Vila da Folha. Sua missão é criar um sistema simples em Java para cadastrar novos ninjas e listar todos os ninjas cadastrados.
* Tópicos a serem utilizados:
* arrays: Para armazenar os nomes dos ninjas.
* Switch Cases: Para implementar um menu interativo.
* Loops: Para navegar pelas opções do menu e iterar sobre os ninjas cadastrados.
* Condicionais: Para controlar a execução das opções do menu e validar o número de ninjas cadastrados.
* */


public class desafio2 {
    public static void main(String[] args) {

        int NinjaMax = 100;
        int ContadorNinjas = 0;

        String[] NomeNinja = new String[NinjaMax];
        int[] idadeNinja = new int[NinjaMax];
        String[] aldeiaNinja = new String[NinjaMax];

        Scanner input = new Scanner(System.in);

         while(true){

            System.out.println("----Bem Vindo ao Sistema de Cadastro De Ninjas! -------");
            System.out.println("Escolha uma das opções Abaixo!\n1 - Cadastrar Ninja\n2 - Exibir a lista de todos os ninja\n3 - Sair\nEscolha:");
            String opcao = input.nextLine();

            switch(opcao){
                case "1":
                        if (ContadorNinjas < NinjaMax){
                            System.out.println("Digite Sua Aldeia: ");
                            aldeiaNinja[ContadorNinjas] = input.nextLine();

                            System.out.println("Digite o nome do Ninja: ");
                            NomeNinja[ContadorNinjas] = input.nextLine();

                            System.out.println("Digite a Idade do Ninja: ");
                            idadeNinja[ContadorNinjas] = input.nextInt();
                            input.nextLine();


                            ContadorNinjas++;
                            String CadastradosOrCadastrado = (ContadorNinjas > 1) ? "---- Ninjas Cadastrados! ----" : " ---- Ninja Cadastrado! ----";
                            System.out.println(CadastradosOrCadastrado);
                        } else {
                            System.out.println("Número maximo de ninjas cadastrados!");
                        }
                    break;
                case "2":
                    if (ContadorNinjas == 0){
                        System.out.println("Nenhum Ninja Cadastrado!");
                    } else {
                        for (int i = 0; i < ContadorNinjas; i++) {
                            System.out.printf("\n----Ninjas cadastrados----\nAldeia: %s\nNome: %s\nIdade: %d", aldeiaNinja[i], NomeNinja[i], idadeNinja[i]);
                        }
                    }
                    System.out.printf("\nTotal de ninjas: %d\n", ContadorNinjas);
                    break;
                case "3":
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Digite uma das opções listadas Abaixo!");
                    break;
            }
        }
    }
}
