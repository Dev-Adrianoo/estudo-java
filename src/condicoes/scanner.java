package condicoes;

import java.util.Scanner;

public class scanner {
    /*
     * Scanner = é um jeito de trazer o usuario para dentro da aplicação.
     * Objetivo: o Usuario vai criar um ninja e vamos validar os dados.
     *
     * */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Write the name of Ninja: ");
        String nameNinja = input.nextLine();
        System.out.printf("The name of the ninja is: %s\n", nameNinja);


        System.out.print("Write age of Ninja: ");
        int ageNinja = input.nextInt();
        System.out.printf("Age of Ninja Is: %s age\n", ageNinja);


        if (ageNinja >= 18){
            System.out.println("This ninja is a adult!");
        } else {
            System.out.println("This ninja is a kid!");
        }

        input.close();
    }
}
