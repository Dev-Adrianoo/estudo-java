package tiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
    /*
    * Dados não primitivos: String, Array, Class, enum
    * */

    String name = "Naruto Uzumaki";
    String nameUpercase = name.toUpperCase();
    System.out.println(nameUpercase);

    String ninja2 = "Sasuke Uchiha";
    String ninja2Upercasse = ninja2.toUpperCase();
    String aldeia02 = "Aldeia da folha";
    String aldeiaDaFolha = aldeia02.toLowerCase();


    String aldeia = "Aldeia da folha";
    String aldeiaLowerCase = aldeia.toLowerCase();
    System.out.printf("Nome: %s\nAldeia: %s\n", nameUpercase, aldeiaLowerCase);
    System.out.printf("Nome: %s\nAldeia: %s\n",ninja2Upercasse, aldeiaDaFolha);


    }
}
