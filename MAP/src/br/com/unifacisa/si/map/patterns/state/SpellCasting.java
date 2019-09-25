package br.com.unifacisa.si.map.patterns.state;

import br.com.unifacisa.si.map.patterns.state.spellcontext.Spell;

public class SpellCasting {
	
	public static void main(String[] args) {
		Spell spell = new Spell("Bola de fogo");
		spell.printState();
		spell.nextState();
		spell.printState();
		spell.nextState();
		spell.printState();
//		spell.nextState();
		spell.printState();
	}
}
