package poo;

public class Gato extends Animal {

	public Gato(String nome, String raca, Integer comprimento, String cor, String ecossistema, Integer nPatas) {
		super.setNome(nome);
		super.setRaca(raca);
		super.setComprimento(comprimento);
		super.setCor(cor);
		super.setEcossistema(ecossistema);
		super.setnPatas(nPatas);
	}

	public Gato() {

	}

	public String mia() {
		String mia = "MIAAAAAAAAAAAAAAAAAAAAAAAAAU";
		return mia;
	}

}
