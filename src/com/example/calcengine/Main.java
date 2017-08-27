package com.example.calcengine;

public class Main {

	
	public static void main (String args[])
	{
		MathEquation[] equations = new MathEquation[4];
		equations[0] = create(20,50,'a');
		equations[1] = create(20,60,'s');
		equations[2] = create(30,70,'m');
		equations[3] = create(40,80,'d');
		
		for (MathEquation equation :equations){
			
			equation.execute();
			System.out.println("Result is" + equation.getResult());
		}
		
}
	
	public static MathEquation create (double leftVal , double rightVal, char opCode ){
		
		MathEquation equation = new MathEquation () ;
		equation.setLeftVal(leftVal);
		equation.setRightVal(rightVal);
		equation.setOpCode(opCode);
		
		return equation;
	}
	
}
