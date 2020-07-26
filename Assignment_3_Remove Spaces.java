package Day1;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.print("Enter a string : ");
        Scanner scanner = new Scanner(System. in);
        String inputString = scanner. nextLine();
		String str = inputString;  
        //Removing spaces
        String remove_space = str.replaceAll("\\s", ""); // using built in method  
        System.out.println(remove_space); 
    }  
}  