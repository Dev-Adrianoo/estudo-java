package condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de repetição: Repetir infinitamente ou até a condição ser batida!
        * WHILE / FOR
        * */

        //While
        //While ( condição ) {Tudo aqui vai acontecer};

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while(numeroDeClones <= numeroMaximoDeClones){
            System.out.printf("Clone [%d]\n",numeroDeClones);
            System.out.println("------------------------------------------------------");
            numeroDeClones++;
        }

        for(int i = 0; i < numeroMaximoDeClones; i++) {
            System.out.printf("RAAA CLONE [%d]\n", i);
        }
    }
}
