package com.example.calcengine;

public class Main {

	
	public static void main (String args[])
	{
		double[] leftVals = {10, 20,30,40};
		double[] rightVals = {50,60,70,80};
		char[] opCodes = {'a','s','m','d'};
		double[] results = new double[opCodes.length];
		
		MathEquation[] equations = new MathEquation[4];
		equations[0] = create(10,50,'a');
		equations[1] = create(20,60,'s');
		equations[2] = create(30,70,'m');
		equations[3] = create(40,80,'d');
		
		
		
		/* for (int i=0; i<opCodes.length; i++){
			
			switch(opCodes[i]){
			
			case 'a' :
				results[i]=leftVals[i]+rightVals[i];
				break;
			case 's' :
				results[i]=leftVals[i]-rightVals[i];
				break;
			case 'm' :
				results[i]=leftVals[i]*rightVals[i];
				break;
			case 'd' :
				results[i] = rightVals[i] !=0 ? leftVals[i]/rightVals[i] :0 ;
				break;
			default: 
				System.out.println("Invalid opCOde");
				results[i]=0;
			}*/
				
		}
		
		
		
		/*for (double result :results){
			
			System.out.println("Result is" +result);
		}*/
		
/*double val1 =100;
double val2 = 50;
double result=0 ;

char opCode='d';
float[] floatArr = new float[3];

for (int i=0; i<=2;i++){
	floatArr[i]=i;
}

for (float f : floatArr){
	
	System.out.println("Arr["+ f +" ] " + f );
}*/

/*if (opCode=='a')
	result=val1+val2;
else if (opCode=='s')
	result=val1-val2;
else if (opCode=='m')
	result=val1*val2;
else if (opCode=='d')
	result= val2 >0 ? val1/val2 : 0 ;
else{
	System.out.println("Invalid opCode");
	result = 0 ;
}*/


}
	
	public static MathEquation create (double leftVal , double rightVal, char opCode ){
		
		MathEquation equation = new MathEquation () ;
		equation.leftVal=leftVal;
		equation.rightVal = rightVal;
		equation.opCode=opCode;
		
		return equation;
	}
	
}
