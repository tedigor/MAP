package br.com.unifacisa.si.map.patterns.abstractfactory;

public class FabricaFord extends FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new FiestaSedan();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Fiesta();
	}

}
