package br.com.unifacisa.si.map.patterns.build;

public class ChevroletBuilder extends CarroBuilder {

	@Override
	public void buildPreco() {
		carro.preco = 42000.00;
	}

	@Override
	public void buildDscMotor() {
		carro.dscMotor = "v-flex 1.0";
	}

	@Override
	public void buildAnoDeFabricacao() {
		carro.anoDeFabricacao = 2017;
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Onix";
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Chevrolet";
	}

}
