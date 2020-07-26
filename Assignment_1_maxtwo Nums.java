package Day1;
import java.util.Arrays;
import java.util.Scanner;

public class MaxtwoNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
	     Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:\n");
	      int length = s.nextInt();
	      int [] myArray = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         myArray[i] = s.nextInt();
	      }

	      //Sorting array in descending order
	      for (int i = 0; i <length; i++) 
			{
				for (int j = i + 1; j <length; j++) 
				{
					if (myArray[i] <myArray[j]) 
					{
						temp = myArray[i];
						myArray[i] = myArray[j];
						myArray[j] = temp;
					}
				}
			}
			//Display two max number from the array
				System.out.println("First Max element:"+myArray[0]);	
				System.out.println("Second Max element:"+myArray[1]);	
			}
		}
	
	   


