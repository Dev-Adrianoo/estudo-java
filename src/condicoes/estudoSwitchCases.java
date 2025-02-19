package NivelFacil.tiposDeDados.condicoes;

import java.util.Scanner;

public class estudoSwitchCases {
    /*
     *   SwitchCases: Que serve para gerar casos especificos!
     *   Objetivo: Pedir pro usuario escolher entre os ninjas!
     * */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose a character below");
        System.out.println("1 - Naruto Uzumaki\n2 - Sasuke Uchiha\n3 - Sakura Haruno");
        System.out.print("Choose: ");
        int chosePerson = input.nextInt();

        switch (chosePerson){
            case 1:
                System.out.println("You chose Naruto Uzumaki");
                break;
            case 2:
                System.out.println("You chose Sasuke Uchiha");
                break;
            case 3:
                System.out.println("You chose Sasuke Haruno");
                break;
            default:
                System.out.println("write one option above\nand try again");
        }

        input.close();
    }
}
