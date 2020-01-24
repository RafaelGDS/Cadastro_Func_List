package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import outros.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("Quantos funcion�rios deseja cadastrar? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("FUNCION�RIO #" + i);
			System.out.print("C�digo: ");
			int codigo = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome  = sc.nextLine();
			System.out.print("Sal�rio: ");
			float salario = sc.nextFloat();
			lista.add(new Funcionario(codigo, nome, salario));
			System.out.println();
		}
		
		System.out.print("Qual funcion�rio deseja incrementar? ");
		int codigo = sc.nextInt();
		Funcionario func = lista.stream().filter(x -> x.getCodigo() == codigo).findFirst().orElse(null);
		
		if(func == null) {
			System.out.print("Funcion�rio n�o existe!");
		}
		else {
			System.out.print("Quanto deseja incrementar em (%)? ");
			float porcentagem = sc.nextFloat();
			func.incrementar(porcentagem);
		}
		
		if(func != null) {
			System.out.println();
			System.out.println("FUNCION�RIOS");
			for(Funcionario emp : lista) {
				System.out.println(emp);
			}
		}
		sc.close();

	}

}
