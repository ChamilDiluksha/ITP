package test1;
 import java.util.Scanner;
 
public class Answer {
	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		
		int array[] = new int[5];
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("Enter number " + (i+1) + ":");
			array[i] = my.nextInt();
		}
		
		System.out.print("\nYour input array : ");
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	
		System.out.print("\nYour Reversed array : ");
		
		for(int i = array.length; i > 0; i--)
		{
			System.out.print(array[i-1] + " ");
		}
		
	}
}
