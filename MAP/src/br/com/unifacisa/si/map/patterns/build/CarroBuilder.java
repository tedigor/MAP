package br.com.unifacisa.si.map.patterns.build;

public abstract class CarroBuilder {
	CarroProduct carro;

	public CarroBuilder() {
		this.carro = new CarroProduct();
	}

	public abstract void buildPreco();

	public abstract void buildDscMotor();

	public abstract void buildAnoDeFabricacao();

	public abstract void buildModelo();

	public abstract void buildMontadora();

	public CarroProduct getCarro() {
		return carro;
	}

}
