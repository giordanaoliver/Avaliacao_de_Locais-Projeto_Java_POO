import java.util.Scanner;

import classes.App;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        App app = new App();

        System.err.println("Cadastro de Usuarios:\n");
        while (true) {
            System.out.println("Insira um nome de usuario:");
            String nome = scanner.nextLine();
            System.out.println("Insira um email de usuario:");
            String email = scanner.nextLine();
            
            app.registrarUsuario(nome, email);
            
            System.out.println("Deseja parar o cadastro de Usuários? (s/n)");
            String fim = scanner.nextLine();
            if (fim.equalsIgnoreCase("s")) break;
        }

        System.out.println("Registro de Avaliacoes:\n");
        while (true) {
            System.out.println("Qual local deseja avaliar");
            String nomeDoLocal = scanner.nextLine();
            System.out.println("Quantas estrelas voce da pra este local?");
            int estrelas = scanner.nextInt();
            System.out.println("Insira um comentario sobre este local:");
            String comentario = scanner.nextLine();
            
            app.getLocal(nomeDoLocal).criarAvaliacao(estrelas, comentario);

            System.out.println("Deseja parar o registro de Avaliacoes? (s/n)");
            String fim = scanner.nextLine();
            if (fim.equalsIgnoreCase("s")) break;
        }

        scanner.close();
    }
}