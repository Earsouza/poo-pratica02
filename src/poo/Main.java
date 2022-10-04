package poo;

public class Main {

	public static void main(String[] args) {

		String mia;
		String late;

		Cachorro c1 = new Cachorro();

		c1.setNome("Dengo");
		c1.setRaca("Shitzu");
		c1.setComprimento(0.93f);
		c1.setnPatas(4);
		c1.setCor("Branco");
		c1.setEcossistema("Doméstico");
		late = c1.late();

		Gato g1 = new Gato();

		g1.setNome("Theo");
		g1.setRaca("N/A");
		g1.setComprimento(0.52f);
		g1.setnPatas(4);
		g1.setCor("Branco");
		g1.setEcossistema("Doméstico");
		mia = g1.mia();

		System.out.println("\n---CACHORRO---\n");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Raça: " + c1.getRaca());
		System.out.println("Comprimento: " + c1.getComprimento());
		System.out.println("Número de Patas: " + c1.getnPatas());
		System.out.println("Ecossistema: " + c1.getEcossistema());
		System.out.println("Som: " + late);

		System.out.println("\n---GATO---\n");
		System.out.println("Nome: " + g1.getNome());
		System.out.println("Raça: " + g1.getRaca());
		System.out.println("Comprimento: " + g1.getComprimento());
		System.out.println("Número de Patas: " + g1.getnPatas());
		System.out.println("Ecossistema: " + g1.getEcossistema());
		System.out.println("Som:  " + mia);

	}

}
