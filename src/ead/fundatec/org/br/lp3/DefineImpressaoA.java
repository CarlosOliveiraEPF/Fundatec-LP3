package ead.fundatec.org.br.lp3;

public class DefineImpressaoA extends DefinirImpressao{
	@Override
	public void formaImpressao(String texto) {
		System.out.println("Imprime "+texto);
	}
}