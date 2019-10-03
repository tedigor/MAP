package br.com.unifacisa.si.map.patterns.adapter;

public class XPTOAdapter extends PoolObjetos {

	private XPTO xpto = new XPTO();

	@Override
	void AbrirConexao() {
		xpto.openConnection();
	}

	@Override
	Object ObterObjectPoll() {
		return xpto.getObjectPool();
	}

}
