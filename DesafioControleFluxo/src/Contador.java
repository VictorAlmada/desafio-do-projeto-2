import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//instanciando um objeto Scanner para trabalhar com inputs
		Scanner sc = new Scanner(System.in);
		
		//leitura dos dois parametros
		System.out.print("Digite o primeiro número: ");
		int parametroUm = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int parametroDois = sc.nextInt();
		
		//chamando método
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		sc.close();
	}
	static void contar(int par1, int par2) throws ParametrosInvalidosException {
		//verificando
		if (par1 > par2) {
			//se o primeiro for maior que o segundo finaliza aqui e lança a exceção
			throw new ParametrosInvalidosException();
		} else {
			//se o segundo for maior que o primeiro ele imprime todos nºs 
			// entre o primeiro e o segundo
			int contagem = par2 - par1;
			for (int i = 0; i <=contagem; i++) {
				System.out.println("Imprimindo nº " + (par1+i));
			}
		}
	}
		
}
