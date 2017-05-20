package testQuestionUnit1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class marks {
	public static void main(String[] args){
		int[] students = new int[100];
		Scanner input = new Scanner(System.in);
		int search = 0;
		boolean isFound = false;
		
		readFromFile(students);
		sortBubA(students);
		System.out.println("what number would you like to search for?");
		search = input.nextInt();
		
		isFound = search(search, students);
		if (isFound == true){
			System.out.println( search + " is in the array");
		}else if(isFound == false){
			System.out.println( search + " is not in the array");
		}
		
		
		
		
		//for(int x = 0; x<100; x++){
		//int z = (int) (Math.random()*101);
		//System.out.println(z);
		//this is going to be my first 100 marks copy-pasted into the text doc on the first run. It will be commented out on the handed in version

		//}
	}
	public static int[] readFromFile(int[] x){


		BufferedReader br = null; 
		try {
			br = new BufferedReader(new FileReader("marks.txt")); 
			for(int y = 0; y<x.length; y++){//open for loop
				x[y] = br.read(); //sets to the array
			}//end loop
			


		} catch (IOException e) {
			e.printStackTrace();
		} finally { //close file
			if (br != null) try {
				br.close();
			} catch (IOException e2) {
				//print error
				System.out.println(e2);
			}
		}
		return x;
	}//end readFromFile

	public static int[] sortBubA(int[] z){
		int temp = 0; //temp variable
		for(int y = 0; y<z.length; y++){//first loop		
			for(int x = 1; x<z.length; x++){//second loop
				if(z[x] < z[x-1]){//check
					temp = z[ x ];//temp check
					z[x ] = z[ x-1 ]; //change
					z[ x-1 ] = temp;//has temporary variables 
				}//end if
			}//end for 1
		}//end for 0
		return z;//returns the array (now sorted)
	}//end sortBubA


	public static boolean search(int x, int[] y){
		boolean found = false;
		
		for(int z = 0; z<y.length; z++){
			if(x == y[z]){
				found = true;
			}else{
				continue;
			}//end if
		}//end loop
		
		return found;//returns found
	}//end search
}//end class
