package NivelFacil.tiposDeDados;

public class Array2D {
    public static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konoha"; //incrementou mais 1, valor inicial = 0
        ninjasEAldeias[0][1] = "Naruto Uzumaki"; //incrementou mais 1 valor = 1
        ninjasEAldeias[0][2] = "Sasuke Uchiha"; // incrementou mais 1 valor = 2

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza Momochi";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.printf("Aldeia: %s - Ninja: %d - %s \n", ninjasEAldeias[i][0], i + 1, ninjasEAldeias[i][1]);
        }



    }
}
