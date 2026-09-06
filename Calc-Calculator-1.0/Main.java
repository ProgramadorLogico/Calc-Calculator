import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    // Listas
    public static final ArrayList<String> comandosExistentes = new ArrayList<> (Arrays.asList("1 - Fazer uma operação", "2 - Informações do projeto", "3 - Fechar programa"));
    public static void main(String[] args) {
        // Variáveis
        Scanner scanner = new Scanner(System.in);
        String versaoDoProjeto = "1.0";
        String nomeDoProjeto = "Calc Calculator";
        String criadorDoProjeto = "Programador Lógico";
        // Apresentação ao usuário
	print(1, "================================================");
        print(1, "");
        print(1, "Bem-vindo ao Calc Calculator!");
        print(1, "Você está utilizando a versão" + versaoDoProjeto);
        print(1, "Caso queira a versão mais recente, acesse: https://github.com/ProgramadorLogico/Calc-Calculator e baixe a versão mais recente");
        // Lista todos os comandos
	listarComandos();
	// Loop principal
        while (true) {
            // Pegar entrada do usuário
            String comandoSelecionado = scanner.nextLine();
            // Verifica qual comando foi selecionado
            switch (comandoSelecionado) {
                case "1":
		    double primeiroNumeroValor;
		    double segundoNumeroValor;
		    String operacao;
                    double primeiroNumero = new scanner.nextDouble();
		    if (primeiroNumero.hasNextInt || primeiroNumero.hasNextDouble) {
			primeiroNumero = primeiroNumeroValor;
		    } else {
			print(2, "");
			print(3, "O valor digitado não é válido!");
		    }
		    listarComandos(); break;
                case "2":
                    // Exibi as informações do projeto
                    print(2, "");
                    System.out.println("Informações do projeto:");
                    print(1, "");
                    System.out.println("Nome do projeto: " + nomeDoProjeto);
                    System.out.println("Versão do projeto: " + versaoDoProjeto);
                    System.out.println("Criador do projeto: " + criadorDoProjeto);
		    listarComandos();
                    break;
                case "3":
                    // Fecha o programa
                    System.exit(0);
                    break;
                default:
                    // Retorna um aviso de comando inválido
                    print(2, "");
                    print(3, "O comando digitado não existe");
		    listarComandos();
                    break;
            }
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
    public static void listarComandos() {
	print(2, "");
	for (int i = 0; i < comandosExistentes.size(); i++) {
	    System.out.println(comandosExistentes.get(i));
	}
    }
}
