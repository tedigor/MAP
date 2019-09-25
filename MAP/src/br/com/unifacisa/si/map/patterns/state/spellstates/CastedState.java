package br.com.unifacisa.si.map.patterns.state.spellstates;

import br.com.unifacisa.si.map.patterns.state.spellcontext.Spell;

public class CastedState implements SpellState {

	@Override
	public void next(Spell spell) {
		System.out.println("O feitiço" + spell.getName() + " já foi lançado, Bruxo! tente outro!");
	}

	@Override
	public void prev(Spell spell) {
		spell.setState(new ConjuredState());
	}

	@Override
	public void printState(Spell spell) {		
		System.out.println("O feitiço " + spell.getName() + " acaba de ser lançado!");
	}

}
