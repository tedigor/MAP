package br.com.unifacisa.si.map.patterns.build;

public class client {
	public static void main(String[] args) {
		ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
		
		concessionaria.construirCarro();
		CarroProduct carro = concessionaria.getCarro();
		System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
				+ "\nAno: " + carro.anoDeFabricacao + "\nMotor: " 
				+ carro.dscMotor + "\nValor: " + carro.preco);
		
		System.out.println();
		
		concessionaria = new ConcessionariaDirector(new ChevroletBuilder());
		concessionaria.construirCarro();
		carro = concessionaria.getCarro();
		System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
				+ "\nAno: " + carro.anoDeFabricacao + "\nMotor: " 
				+ carro.dscMotor + "\nValor: " + carro.preco);
	}
}
