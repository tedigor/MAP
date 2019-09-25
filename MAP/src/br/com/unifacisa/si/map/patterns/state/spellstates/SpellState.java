package br.com.unifacisa.si.map.patterns.state.spellstates;

import br.com.unifacisa.si.map.patterns.state.spellcontext.Spell;

public abstract interface SpellState {
	
	 void next(Spell spell);
	 void prev(Spell spell);
	 void printState(Spell spell);
}
