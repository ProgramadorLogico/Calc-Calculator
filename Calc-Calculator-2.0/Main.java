// Importa recursos essenciais
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

// Classe principal
public class Main {
	// Corpo principal
	public static void main(String[] args) {
		// Declaração de variáveis e listas
		ArrayList<String> informacoesDoProjeto = new ArrayList<> (Arrays.asList("Nome do projeto - Calc Calculator", "Dara de criação - 6/09/2026", "Criador - Programador Lógico"));
		Scanner scanner = new Scanner(System.in);
		// Loop principal
		while (true) {
			// Apresentação
			espacadorDeTexto();
			System.out.println("Bem-vindo ao Calc Calculator!");
			espacadorDeTexto();
			System.out.println("1 - Fazer um cálculo");
			System.out.println("2 - Registro de cálculos");
			System.out.println("3 - Sobre o projeto");
			System.out.println("4 - Sair");
			espacadorDeTexto();
			// Pegando a escolha do usuário
			System.out.println("Selecione uma das opções acima e aperte enter:");
			String comandoEscolhidoPeloUsuario = scanner.nextLine().trim().toLowerCase();
			// Verificando a escolha
			switch (comandoEscolhidoPeloUsuario) {
				// Caso de cálculo
				case "1":
					print("Digite o primeiro número:");
					String primeiroNumeroEntrada = scanner.nextLine();
					print("Digite o segundo número:");
					String segundoNumeroEntrada = scanner.nextLine();
					print("Digite a operação (+, -, *, /):");
					String operacaoEntrada = scanner.nextLine();
					break;
				// Caso de registro de cálculos
				// Caso de sobre o projeto
				// Caso de sair
			}
		}
	}
	// Função de limpar o terminal
	public static void limparTerminal() {
		System.out.print("\033[H\033[2J");
	}
	// Função de separar texto
	public static void espacadorDeTexto() {
		System.out.println("======================================================");
	}
	// Função de printar algo (apenas texto)
	public static void print(String texto) {
		System.out.println(texto);
	}
}
