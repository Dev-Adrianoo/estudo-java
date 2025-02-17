package condicoes;

public class ternarios {
    public static void main(String[] args) {

        /* operador ternarios são uma maneira de reduzir o código! */
        /* variavel = (condição) ? valorverdadeiro: valorfalso; */

        short numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões": "esse ninja está com menos de 10 missões";
        System.out.println(nivel);
    }
}
