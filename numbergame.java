
import java.util.Scanner;
public class numbergame
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int chances=6;
		int finals=0;
		boolean playagain=true;
		System.out.println("Welcome!");
		System.out.println("Hey you have " +chances+" chances to win the game");
		while(playagain){
		    int rand=getrandN(1,100);
		    boolean guess=false;
		    for(int i=0;i<chances;i++){
		        System.out.println("Chance" + (i+1)+" Enter your guess: ");
		        int user=sc.nextInt();
		        if(user==rand){
		            guess=true;
		            finals+=1;
		            System.out.println("You won it.");
		            break;
		        }
		        else if(user>rand)
		        {
		            System.out.println("Too high");
		        }
		        else{
		            System.out.println("Too low");
		        }
		    }
		    if(guess==false){
		        System.out.println("Sorry . You lost the chances. The number is" +rand);
		    }
		    System.out.println("Do you want playagain(yes/no):");
		    String pA=sc.next();
		    playagain=pA.equalsIgnoreCase("y");
		    
		}
		System.out.println("That's it,Hope you enjoyed.");
		System.out.println("Here is your score"+finals);
	    }
	
		public static int getrandN(int min,int max){
		    return (int)(Math.random()*(max-min+1)+min);
		}
		
	}
