package br.com.unifacisa.si.map.patterns.build;

public class FiatBuilder extends CarroBuilder {

	@Override
	public void buildPreco() {
		carro.preco = 40000.00;
	}

	@Override
	public void buildDscMotor() {
		carro.dscMotor = "Fire Flex 1.0";
	}

	@Override
	public void buildAnoDeFabricacao() {
		carro.anoDeFabricacao = 2019;
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Argo";
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Fiat";
	}

}
