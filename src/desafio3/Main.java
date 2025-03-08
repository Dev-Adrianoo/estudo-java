package desafio3;

public class Main {
    public static void main(String[] args) {

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.nivelDificuldade = "A";
        Sasuke.Missao = "Salvar o Naruto";
        Sasuke.Status = "Concluida!";
        Sasuke.MostrarInformacoes();

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.nivelDificuldade = "A";
        Naruto.Missao = "Ser Salvo pelo Sasuke";
        Naruto.Status = "Concluida!";
        Naruto.MostrarInformacoes();
    }
}
