package org.unc.lac.javapetriconcurrencymonitor.petrinets;

import org.unc.lac.javapetriconcurrencymonitor.petrinets.components.Arc;
import org.unc.lac.javapetriconcurrencymonitor.petrinets.components.Place;
import org.unc.lac.javapetriconcurrencymonitor.petrinets.components.Transition;

public class PlaceTransitionPetriNet extends PetriNet{

	/**
	 * extends the abstract class PetriNet
	 * @see PetriNet#PetriNet(Place[], Transition[], Arc[], Integer[], Integer[][], Integer[][], Integer[][], Boolean[][], Boolean[][], Integer[][])
	 */
	public PlaceTransitionPetriNet(Place[] _places, Transition[] _transitions, Arc[] _arcs, Integer[] _initialMarking,
			Integer[][] _preI, Integer[][] _posI, Integer[][] _I, Boolean[][] _inhibition, Boolean[][] _resetMatrix, Integer[][] _readerMatrix) {
		super(_places, _transitions, _arcs, _initialMarking, _preI, _posI, _I, _inhibition, _resetMatrix, _readerMatrix);
	}
	
	/**
	 * Computes all enabled transitions
	 * @return An array containing true for an enabled transition and false for a disabled one.
	 * @see PetriNet#computeEnabledTransitions()
	 */
	protected final boolean[] computeEnabledTransitions(){
		boolean[] _enabledTransitions = new boolean[transitions.length];
		for(Transition t : transitions){
			_enabledTransitions[t.getIndex()] = isEnabled(t);
		}
		return _enabledTransitions;
	}

}
