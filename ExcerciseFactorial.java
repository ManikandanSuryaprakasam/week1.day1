package week1.day1;



public class ExcerciseFactorial {
	
	public static void main(String[] args) {
		
		//initialize Factorial variable
		int Factorial = 1;
		int input = 5;
		
		//Multiply factorial numbers
		for (int i =1;i<= input;i++) {
			 Factorial  = Factorial* i;
			 
			
		}
		System.out.println("Factorial for 5:"+Factorial);
		
	}

}
