package NivelFacil.tiposDeDados.desafio1;

/*
 *  Crie um programa que represente três ninjas da vila da Folha ( Konoha ) de "Naruto" e suas respectivas missões.
 *  Cada Ninja tem um nome, uma idade e uma missão atribuída a ele, com o nome da missão, nível de dificuldade e status de conclusão.
 * */


public class desafio01 {
    public static void main(String[] args) {

        String Ninja01 = "Naruto Uzumaki";
        int idadeNinja01 = 16;
        String nomeMissao = "Derrote 5 bandidos";
        char dificuldadeMissao = 'A';
        String StatusMissao = "em andamento";

        if (dificuldadeMissao == 'C' || dificuldadeMissao == 'D' || dificuldadeMissao == 'B' || dificuldadeMissao == 'A') {
            if (idadeNinja01 >= 15) {
                StatusMissao = "CONCLUIDA!";
                System.out.printf("\n\nNome Primeiro Ninja: %s\nIdade primeiro Ninja: %d\nMissão dada: %s\nDificuldade missão: %s\nStatus da missão: %s\n", Ninja01, idadeNinja01, nomeMissao, dificuldadeMissao, StatusMissao);
                System.out.printf("O Ninja: %s\nConcluiu sua missão!\n\n", Ninja01);

            }
            if (dificuldadeMissao == 'C' || dificuldadeMissao == 'D' && idadeNinja01 < 15) {
                StatusMissao = "CONCLUIDA!";
                System.out.printf("\n\nNome Primeiro Ninja: %s\nIdade primeiro Ninja: %d\nMissão dada: %s\nDificuldade missão: %s\nStatus da missão: %s\n", Ninja01, idadeNinja01, nomeMissao, dificuldadeMissao, StatusMissao);
            } else {
                StatusMissao = "NÃO CONCLUIDA!";
                System.out.printf("O ninja %s\nnão concluiu sua missão!\nstatus: %s\n\n", Ninja01, StatusMissao);
            }
        }

        String Ninja02 = "Sasuke Uchiha";
        int idadeNinja02 = 16;
        String nomeMissao02 = "Recupere o jarro da claudia";
        char dificuldadeMissao02 = 'A';
        String statusMissao02 = "em andamento";

        if (dificuldadeMissao02 == 'C' || dificuldadeMissao02 == 'D' || dificuldadeMissao02 == 'B' || dificuldadeMissao02 == 'A') {
            if (idadeNinja02 >= 15) {
                statusMissao02 = "Concluido";
                System.out.printf("Nome segundo Ninja: %s\nIdade segundo Ninja: %d\nMissão dada: %s\nDificuldade missao: %s\nStatus da missão: %s\n\n", Ninja02, idadeNinja02, nomeMissao02, dificuldadeMissao02, statusMissao02);

            } else if (dificuldadeMissao02 == 'C' || dificuldadeMissao02 == 'D' && idadeNinja02 < 15) {
                statusMissao02 = "CONCLUIDA!";
                System.out.printf("Nome terceiro Ninja: %s\nIdade terceiro Ninja: %d\nMissão dada: %s\nDificuldade missao: %s\nStatus da missão: %s\n\n", Ninja02, idadeNinja02, nomeMissao02, dificuldadeMissao02, statusMissao02);

            } else {
                statusMissao02 = "NÃO CONCLUIDA";
                System.out.printf("O ninja %s\nnão concluiu sua missão!\nstatus: %s\n\n", Ninja02, statusMissao02);
            }
        }

        String Ninja03 = "Rock lee";
        int idadeNinja03 = 4;
        String nomeMissao03 = "Derrote sasuke uchiha";
        char dificuldadeMissao03 = 'A';
        String statusMissao03 = "CONCLUIDA!";

        if (dificuldadeMissao03 == 'A' || dificuldadeMissao03 == 'B' || dificuldadeMissao03 == 'C' || dificuldadeMissao03 == 'D') {
            if (idadeNinja03 >= 15) {
                statusMissao03 = "CONCLUIDA!";
                System.out.printf("Nome terceiro Ninja: %s\nIdade terceiro Ninja: %d\nMissão dada: %s\nDificuldade missao: %s\nStatus da missão: %s\n\n", Ninja03, idadeNinja03, nomeMissao03, dificuldadeMissao03, statusMissao03);

            } else if (dificuldadeMissao03 == 'C' && idadeNinja03 < 15 || dificuldadeMissao03 == 'D' && idadeNinja03 < 15) {
                statusMissao03 = "CONCLUIDA!";
                System.out.printf("Nome terceiro Ninja: %s\nIdade terceiro Ninja: %d\nMissão dada: %s\nDificuldade missao: %s\nStatus da missão: %s\n\n", Ninja03, idadeNinja03, nomeMissao03, dificuldadeMissao03, statusMissao03);

            }
        } else {
            statusMissao03 = "NÃO CONCLUIDA";
            System.out.printf("O ninja %s\nnão concluiu sua missão!\nstatus: %s\n\n", Ninja03, statusMissao03);
        }
    }

}

