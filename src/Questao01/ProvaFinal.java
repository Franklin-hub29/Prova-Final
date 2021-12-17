package Questao01;

import java.util.Scanner;
import participante.CadPar;

public class ProvaFinal {
	
	public static void main(String[]args) {
		
	Scanner scanner = new Scanner(System.in);
	
	CadPar [] participante   = new CadPar[20];
	
	int opcao =0;
	int indArry =0;
	
	do {
		menu();
		opcao = entrada(scanner);
		
		if(opcao == 1) {
			cadastropart(scanner , participante,indArry);
			indArry++;
			
		}else if(opcao ==2 ) {
			lista(participante,indArry);
			
		}else if(opcao == 3) {
			removerPar(scanner,participante,indArry);
		}	
		}while(opcao !=4);
		
	}
	
	
	
		
		
	
	
	public static void menu() {
		
		
		System.out.println("01 Cadastrar Participante");
		System.out.println("02 Lista os Participantes");
		System.out.println("03 Remover um participante");
		System.out.println("04 Sair ");
		
		
		
		
	}
	
	public static void lista(CadPar[] participante , int indArry) {
		for(int i=0;i<indArry;i++) {
			CadPar par = participante[i];
			if(par != null) {
				System.out.println("Nome"+CadPar.nome);
				System.out.println("E-mail"+CadPar.email);
			}
		}
		
	}
	
	public static void cadastropart(Scanner scanner, CadPar[] participante,int indArry) {
		
		System.out.println("Cadastro de Participante ");
		
		CadPar novoPart = new CadPar();
		
		
		
		
		
		
		System.out.println("Por favor digite o nome do participante");
		
		novoPart.nome = scanner.nextLine();
			
		System.out.println("Favor informar o e-email do participante");
		novoPart.email = scanner.nextLine();
		
		     participante [indArry] = novoPart;
		
		
	
		
	}
	
	public static int entrada(Scanner scanner) {
        int aux = scanner.nextInt();
        scanner.nextLine();
        return aux;

}
	
	public static void removerPar(Scanner scanner,CadPar[] participante,int indArry) {
		
		System.out.println("Por favor informe o nome do participante a ser removido");
		
		String parEX = scanner.nextLine();
		
		for(int i =0;i<indArry;i++) {
			CadPar par = participante[i];
			if(new String(CadPar.nome).equals(parEX)) {
				participante[i] = null;
				System.out.println("Participante removidodo");
				break;
			}
			
		}
		
		
	}
	
}
