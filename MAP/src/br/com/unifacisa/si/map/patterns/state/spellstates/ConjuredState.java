package br.com.unifacisa.si.map.patterns.state.spellstates;

import br.com.unifacisa.si.map.patterns.state.spellcontext.Spell;

public class ConjuredState implements SpellState {

	@Override
	public void next(Spell spell) {
		spell.setState(new CastedState());
	}

	@Override
	public void prev(Spell spell) {
		spell.setState(new MemorizedState());
	}

	@Override
	public void printState(Spell spell) {
		System.out.println("Feitiço " + spell.getName() + " conjurado!");
	}
}
