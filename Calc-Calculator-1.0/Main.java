import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Variáveis
        Scanner scanner = new Scanner(System.in);
        String versaoDoProjeto = "1.0";
        String nomeDoProjeto = "Calc Calculator";
        String criadorDoProjeto = "Programador Lógico";
        String 
        // Listas
        ArrayList<String> comandosExistentes = new ArrayList<> (Arrays.asList("1 - Fazer uma operação", "2 - Informações do projeto", "3 - Fechar programa"));
        // Apresentação ao usuário
        print(1, "================================================");
        print(1, "");
        print(1, "Bem-vindo ao Calc Calculator!");
        print(1, "Você está utilizando a versão" + versaoDoProjeto);
        print(1, "Caso queira a versão mais recente, acesse: https://github.com/ProgramadorLogico/Calc-Calculator e baixe a versão mais recente");
        print(2, "");
        // Lista todos os comandos
        for (int i = 0; i < comandosExistentes.size(); i++) {
            System.out.println(comandosExistentes.get(i));
        }
        // Pegar entrada do usuário
        String comandoSelecionado = scanner.nextLine();
        switch (comandoSelecionado) {
            case "1":
                // Fazer depois
                print(2, "");
                print(1, "Em breve!");
                break;
            case "2":
                print(2, "");
                print(1, "");
        }
    }
    public static int subtracao(int A, int B) {
        return A - B;
    }  
    public static void print(int tipo, String texto) {
        if (tipo == 1) {
            System.out.println(texto);
        } else if (tipo == 2) {
            print(1, "");
            print(1, "================================================");
            print(1, "");
        } else if (tipo == 3) {
            System.err.println(texto);
        } else {
            print(3, "A variável tipo recebeu um valor inválido");
        }
    }
}