package br.com.unifacisa.si.map.patterns.state.spellstates;

import br.com.unifacisa.si.map.patterns.state.spellcontext.Spell;

public class MemorizedState implements SpellState {

	@Override
	public void next(Spell spell) {
		spell.setState(new ConjuredState());
	}

	@Override
	public void prev(Spell spell) {
		System.out.println("O Feiti�o " + spell.getName() + " j� est� memorizado, Bruxo! Conjure-o!");
		
	}

	@Override
	public void printState(Spell spell) {
		System.out.println("Feiti�o " + spell.getName() + " memorizado!");
		
	}

}
