package org.yakindu.scr.conditionalexpressions;

public class ConditionalExpressionsStatemachine implements IConditionalExpressionsStatemachine {

	protected class SCInterfaceImpl implements SCInterface {
	
		private boolean e;
		
		public void raiseE() {
			e = true;
		}
		
		private long condition;
		
		public long getCondition() {
			return condition;
		}
		
		public void setCondition(long value) {
			this.condition = value;
		}
		
		private boolean boolVar;
		
		public boolean getBoolVar() {
			return boolVar;
		}
		
		public void setBoolVar(boolean value) {
			this.boolVar = value;
		}
		
		private String stringVar;
		
		public String getStringVar() {
			return stringVar;
		}
		
		public void setStringVar(String value) {
			this.stringVar = value;
		}
		
		private String stringCondition;
		
		public String getStringCondition() {
			return stringCondition;
		}
		
		public void setStringCondition(String value) {
			this.stringCondition = value;
		}
		
		protected void clearEvents() {
			e = false;
		}
	}
	
	protected SCInterfaceImpl sCInterface;
	
	private boolean initialized = false;
	
	public enum State {
		main_region_A,
		main_region_B,
		$NullState$
	};
	
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	public ConditionalExpressionsStatemachine() {
		sCInterface = new SCInterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NullState$;
		}
		clearEvents();
		clearOutEvents();
		sCInterface.setCondition(sCInterface.boolVar ? 3 : 2);
		
		sCInterface.setBoolVar(true);
		
		sCInterface.setStringVar("");
		
		sCInterface.setStringCondition("");
	}
	
	public void enter() {
		if (!initialized) {
			throw new IllegalStateException(
					"The state machine needs to be initialized first by calling the init() function.");
		}
		enterSequence_main_region_default();
	}
	
	public void exit() {
		exitSequence_main_region();
	}
	
	/**
	 * @see IStatemachine#isActive()
	 */
	public boolean isActive() {
		return stateVector[0] != State.$NullState$;
	}
	
	/** 
	* Always returns 'false' since this state machine can never become final.
	*
	* @see IStatemachine#isFinal()
	*/
	public boolean isFinal() {
		return false;
	}
	/**
	* This method resets the incoming events (time events included).
	*/
	protected void clearEvents() {
		sCInterface.clearEvents();
	}
	
	/**
	* This method resets the outgoing events.
	*/
	protected void clearOutEvents() {
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case main_region_A:
			return stateVector[0] == State.main_region_A;
		case main_region_B:
			return stateVector[0] == State.main_region_B;
		default:
			return false;
		}
	}
	
	public SCInterface getSCInterface() {
		return sCInterface;
	}
	
	public void raiseE() {
		sCInterface.raiseE();
	}
	
	public long getCondition() {
		return sCInterface.getCondition();
	}
	
	public void setCondition(long value) {
		sCInterface.setCondition(value);
	}
	
	public boolean getBoolVar() {
		return sCInterface.getBoolVar();
	}
	
	public void setBoolVar(boolean value) {
		sCInterface.setBoolVar(value);
	}
	
	public String getStringVar() {
		return sCInterface.getStringVar();
	}
	
	public void setStringVar(String value) {
		sCInterface.setStringVar(value);
	}
	
	public String getStringCondition() {
		return sCInterface.getStringCondition();
	}
	
	public void setStringCondition(String value) {
		sCInterface.setStringCondition(value);
	}
	
	/* Entry action for state 'A'. */
	private void entryAction_main_region_A() {
		sCInterface.setCondition(sCInterface.boolVar ? 1 : 0);
	}
	
	/* Entry action for state 'B'. */
	private void entryAction_main_region_B() {
		sCInterface.setCondition(((sCInterface.condition==2) ? 1 : 2));
		
		sCInterface.setStringCondition(((sCInterface.condition==2) ? "True" : "False"));
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_main_region_A_default() {
		entryAction_main_region_A();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_A;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_main_region_B_default() {
		entryAction_main_region_B();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_B;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_main_region_A() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_main_region_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case main_region_A:
			exitSequence_main_region_A();
			break;
		case main_region_B:
			exitSequence_main_region_B();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		enterSequence_main_region_A_default();
	}
	
	private boolean react(boolean try_transition) {
		return false;
	}
	
	private boolean main_region_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react(try_transition)==false) {
				if ((sCInterface.e) && (1==(sCInterface.getBoolVar() ? 1 : 0))) {
					exitSequence_main_region_A();
					enterSequence_main_region_B_default();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
		}
		return did_transition;
	}
	
	private boolean main_region_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react(try_transition)==false) {
				did_transition = false;
			}
		}
		if (did_transition==false) {
		}
		return did_transition;
	}
	
	public void runCycle() {
		if (!initialized)
			throw new IllegalStateException(
					"The state machine needs to be initialized first by calling the init() function.");
		clearOutEvents();
		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
			switch (stateVector[nextStateIndex]) {
			case main_region_A:
				main_region_A_react(true);
				break;
			case main_region_B:
				main_region_B_react(true);
				break;
			default:
				// $NullState$
			}
		}
		clearEvents();
	}
}
