import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> informacoesDoProjeto = new ArrayList<> (Arrays.asList("Nome do projeto - Calc Calculator", "Dara de criação - 6/09/2026", "Criador - Programador Lógico"));
		Scanner scanner = new Scanner(System.in);
		boolean programaRodando = true;
		int primeiroNumero;
		int segundoNumero;
		String operacao;
		boolean entradaValida = false;
		while (programaRodando) {
			espacadorDeTexto();
			System.out.println("Bem-vindo ao Calc Calculator!");
			espacadorDeTexto();
			System.out.println("	1 - Fazer um cálculo");
			System.out.println("    2 - Registro de cálculos");
			System.out.println("    3 - Sobre o projeto");
			System.out.println("    4 - Sair");
			espacadorDeTexto();
			System.out.println("Selecione uma das opções acima e aperte enter:");
			String comandoEscolhidoPeloUsuario = scanner.nextLine().trim().toLowerCase();
			switch (comandoEscolhidoPeloUsuario) {
				case "1":
					limparTerminal();
					espacadorDeTexto();
					while (!entradaValida) {
						System.out.println("Digite o primeiro numero e aperte enter:");
						String receberPrimeiroNumero = scanner.nextLine().trim();
						try {
							int numero = Integer.parseInt(receberPrimeiroNumero);
							primeiroNumero = numero;
						} catch (NumberFormatException e) {
							espacadorDeTexto();
							print("Erro: Você digitou um texto!");
						}
					}
					while (!entradaValida) {
						espacadorDeTexto();
						print("Digite o segundo número e aperte enter:");
						String receberSegundoNumero = scanner.nextLine().trim();
						try {
							int numero2 = Integer.parseInt(receberSegundoNumero);
							segundoNumero = numero2;
						} catch (NumberFormatException e) {
							espacadorDeTexto();
							print("Erro: Você digitou um texto!");
						}
					}
					while (!entradaValida) {
						espacadorDeTexto();
						print("Digite a operacao desejada e aperte enter (+, -, *, /)");
						String receberOperacao = scanner.nextLine().trim();
						switch (receberOperacao) {
							case "+":
								espacadorDeTexto();
								System.out.println("Este é o resultado: " + (primeiroNumero + segundoNumero));
								break;
							case "-":
								espacadorDeTexto();
								System.out.println("Este é o resultado: " + (primeiroNumero - segundoNumero));
								break;
							case "*":
								espacadorDeTexto();
								System.out.println("Este é o resultado: " + (primeiroNumero * segundoNumero));
								break;
							case "/":
								espacadorDeTexto();
								System.out.println("Este é o resultado: " + (primeiroNumero / segundoNumero));
								break;
							default:
								espacadorDeTexto();
								print("Digite uma operacao válida!");
								break;
								
						}
					}
					break;
			}
		}
	}
	public static void limparTerminal() {
		System.out.print("\033[H\033[2J");
	}
	public static void espacadorDeTexto() {
		System.out.println("======================================================");
	}
	public static void print(String texto) {
		System.out.println(texto);
	}
}
