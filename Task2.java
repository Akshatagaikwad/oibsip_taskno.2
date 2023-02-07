import java.util.Scanner;
import java.util.Random;

class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
    	int k=5,i,trial=0,guess;
        int randomNumber = rand.nextInt(100);
	
	
	
	for(i=0;i<k;i++)
	{
		trial++;
        	System.out.println("Enter number between 1 to 100");
        	guess = sc.nextInt();
		
		
		if(randomNumber>guess)
		{
			System.out.println("number is greater than "+guess);
			
		}
		else if(randomNumber<guess)
		{
			System.out.println("number is less than "+guess);
			
		      
		}
		else
		{
			System.out.println("congratulations,guessed number is correct");
			System.out.println("you guessed number in "+trial+" trials");
			break;
		}
		
	}
	if(i==k)
	{
		System.out.println("you exhausted "+k+" trials");
	}
	
	
    }
}