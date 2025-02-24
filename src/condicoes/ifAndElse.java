package condicoes;

public class ifAndElse {
    public static void main(String[] args) {

        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 9;


        if (numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: chunnin");
        } else if (numeroDeMissoes >= 20){
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
