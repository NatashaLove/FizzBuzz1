import java.util.Scanner;

public class FizzBuzz{
	
	public static void main(String[] args){
		
		int lower=0;
		int upper=0;
		Scanner inputDevice= new Scanner(System.in);
		
		System.out.println("Welcome to FizzBuzz, please type an integer:");
		
		upper=inputDevice.nextInt();
		
		// loop from lower to upper
		//Print the number
		//if number is divisible by 3 print Fizz instead of the number
		//if number is divisible by 5 print Buzz instead of the number
		//if number is divisible by 3 and 5 print FizzBuzz instead of the number
		
		
		for(int i=lower; i<=upper; i++){
			boolean printNum = true;
			if((i%3)==0){
				System.out.print("Fizz");
				printNum = false;
			}
			
			if((i%5)==0){
				System.out.print("Buzz");
				printNum = false;
			}
			
			if(printNum){
				System.out.print(i);
				
			}
			System.out.println();
			
		}
		
	}
}