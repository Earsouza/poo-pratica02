package poo;

public class Cachorro extends Animal {

	public Cachorro(String nome, String raca, Integer comprimento, String cor, String ecossistema, Integer nPatas) {
		super.setNome(nome);
		super.setRaca(raca);
		super.setComprimento(comprimento);
		super.setCor(cor);
		super.setEcossistema(ecossistema);
		super.setnPatas(nPatas);
	}

	public Cachorro() {

	}

	public String late() {

		String late = "AUUAUAUAUAU";
		return late;
	}

}
