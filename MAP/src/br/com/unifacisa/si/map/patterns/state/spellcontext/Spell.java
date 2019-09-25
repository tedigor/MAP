package br.com.unifacisa.si.map.patterns.state.spellcontext;

import br.com.unifacisa.si.map.patterns.state.spellstates.MemorizedState;
import br.com.unifacisa.si.map.patterns.state.spellstates.SpellState;

public class Spell {
	
	private SpellState state = new MemorizedState();
	private String name;
	
	public Spell(String name) {
		this.name = name;
	}
	
	
	public SpellState getState() {
		return state;
	}


	public void setState(SpellState state) {
		this.state = state;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void previousState() {
		state.prev(this);
	}
	
	public void nextState() {
		state.next(this);
	}
	
	public void printState() {
		state.printState(this);
	}	
}
