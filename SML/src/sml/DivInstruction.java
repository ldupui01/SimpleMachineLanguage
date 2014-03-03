package sml;

/**
 * This class divide the content of register S1 by the content of S2 and store result in register R
 * 
 * @author Ludo
 */

import sml.Instruction;
import sml.Machine;

public class DivInstruction extends Instruction{

	private int result;
	private int op1;
	private int op2;
	
	public DivInstruction(String label, String op) {
		super(label, op);
		// TODO Auto-generated constructor stub
	}
	
	public DivInstruction(String label, int result, int op1, int op2) {
		this(label, "add");
		this.result = result;
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public void execute(Machine m) throws IllegalArgumentException{
		int value1 = m.getRegisters().getRegister(op1);
		int value2 = m.getRegisters().getRegister(op2);
		if (value2 != 0){
			m.getRegisters().setRegister(result, value1 / value2);
		}else{
			throw new IllegalArgumentException("Argument 'divisor' is 0");
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + op1 + " / " + op2 + " = " + result;
	}
	
}
