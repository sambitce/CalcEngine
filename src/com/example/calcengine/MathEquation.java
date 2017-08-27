package com.example.calcengine;

public class MathEquation {

	public double leftVal ;
	public double rightVal;
	public char opCode;
	public double result ;
	
	public void execute (){
		
		switch(opCode){
		
		case 'a' :
			result=leftVal+rightVal;
			break;
		case 's' :
			result=leftVal-rightVal;
			break;
		case 'm' :
			result=leftVal*rightVal;
			break;
		case 'd' :
			result = rightVal !=0 ? leftVal/rightVal :0 ;
			break;
		default: 
			System.out.println("Invalid opCOde");
			result=0;
		}
	}
}
