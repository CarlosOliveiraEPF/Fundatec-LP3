package ead.fundatec.org.br.lp3.exec;

import java.util.Scanner;

import ead.fundatec.org.br.lp3.DefineImpressaoA;
import ead.fundatec.org.br.lp3.DefineImpressaoB;
import ead.fundatec.org.br.lp3.DefinirImpressao;
public class ExecutaImpressao {

	public static void main(String[] args) {
		int i=0;
		Scanner ler = new Scanner(System.in);
		do{
			System.out.println("Defina a forma de impress�o (1-Impress�o A / 2-Impress�o B): ");
			i = ler.nextInt();
			if (i==1){
				DefineImpressaoA impA = new DefineImpressaoA();
				impA.formaImpressao(" AAA.");
			}else if (i==2){
				DefineImpressaoB impB = new DefineImpressaoB();
				impB.formaImpressao(" BBB.");
			}else {
				System.out.println("Op��o Inv�lida. Aplica��o ser� encerrada!");
			}
		}while ((i == 1) || (i == 2));		
	}
}