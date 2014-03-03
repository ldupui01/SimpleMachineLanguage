package sml;

/**
 * If the content of register S1 is not ZERO, then make the statement label L2 the next one to execute
 * 
 * @author Ludo
 */

import sml.Instruction;
import sml.Machine;

public class BnzInstruction extends Instruction{

	private int result;
	private int op1;
	private int op2;
	
	public BnzInstruction(String label, String op) {
		super(label, op);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Machine m) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return super.toString();
		// TODO Auto-generated constructor stub
	}

}
