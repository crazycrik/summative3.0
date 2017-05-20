import java.util.Scanner;

public class arraysTwoD {
	public static String[][] studentInformation = new String[6][4];
	public static int x = 0;
	public static double averege = 0.0;
	static Scanner input = new Scanner(System.in); 
	static Scanner inputInt = new Scanner(System.in);
	public static void main(String[]args){
		entry();
		printArray();
	}
	public static String[][] entry(){
		
		for(int x = 0; x < studentInformation.length; x++ ){
			for(int y = 0; y< studentInformation[x].length; y++ ){
				if(y == 0){
					System.out.println("enter the first name of the student " + (x+1) + " on the list");
					studentInformation[x][y] = input.next();
				}else if(y == 1){
					System.out.println("enter the last name of " + (x+1) + " on the list");
					studentInformation[x][y] = input.next();
				}else if(y == 2){
					System.out.println("enter the student number for " + (x+1) + " on the list");
					studentInformation[x][y] = input.next();
				}else if(y == 3){
					System.out.println("enter the mark of " + (x+1) + " on the list");
					studentInformation[x][y] = input.next();
				}
			}
		}
		
		return studentInformation;
	}
	
	public static void printArray(){
		for(int x = 0; x < studentInformation.length; x++){
			for(int y = 0; y < studentInformation[0].length; y++){
				System.out.println(studentInformation[x][y]);
			}
		}
	}
	public static int findMax(){
		return x;
	}
	public static double averegeMark(){
		return averege; 
	}
}
