package br.com.unifacisa.si.map.patterns.singleton;

public class Connection {

	private static Connection instance = null;

	private Connection() {
	}

	public static Connection getInstance() {
		if (instance == null) {
			instance = new Connection();
		}
		return instance;
	}
}
