package NivelFacil.tiposDeDados;

public class Array {
    public static void main(String[] args) {

        /*Arrays são tipo Refêrencia!*/

        //String Inicializa como Null
        String[] ninjas = new String[4];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Rock Lee";

        //Redeclarar
        ninjas = new String[7];

        ninjas[0] = "Hashirama Senju";
        ninjas[1] = "Tobirama Senju";
        ninjas[2] = "Hiruzen Sarutobi";
        ninjas[3] =  "Minato namikaze";
        ninjas[4] = "Tsunade";
        ninjas[5] = "Kakashi Hatake";
        ninjas[6] = "Naruto Uzumaki";

        for (int i = 0; i < ninjas.length; i++) {
            System.out.printf("O Hokage número: [%d] se chama: %s\n", i + 1, ninjas[i]);
        }

        int[] idades = new int[4];
        idades[0] = 16;
        idades[1] = 16;
        idades[2] = 15;
        idades[3] = 17;

        System.out.printf("Ninja 1: %s tem %d anos\nNinja 2: %s tem %d anos\nNinja 3: %s tem %d anos\nNinja 4: %s tem %d anos\n", ninjas[0], idades[0], ninjas[1], idades[1] , ninjas[2], idades[2], ninjas[3], idades[3]);

        //int inicializa como 0
        int[] inteiro = new int[1];
        System.out.println(inteiro[0]);

        //Boolean Inicializam como false
        boolean[] trueOrFalse = new boolean[1];
        System.out.println(trueOrFalse[0]);

        //double inicializa como 0.0
        double[] floating = new double[1];
        System.out.println(floating[0]);



    }
}
