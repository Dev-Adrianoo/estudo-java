package tiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        Dados primitivos =>
        * Boolean / boolean
        * Character / char
        * integer / byte / short / int / long
        * Float / float / double
        * */

        int idade = 19;
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 999999L;


        System.out.printf("idade: %d\naltura: %.2f", idade, altura);
    }
}
