//Chris Puglisi
//Feb 8th
//V1.0
//



import java.util.Scanner;

public class A1 {
	static int[] array1 = new int[10]; //declared 10x1 array
	static int[] array2 = new int[10]; //declared array 2
	static int sum = 0;
	static double averege = 0;
	static int numToSearch = 0;
	static int[] array3 = new int[10]; //change to any length for the timing of the sorting
	static int[] array4 = {10,8,9,7,5,6,1,2,3,4}; //debugging the methods with a constant array, not otherwise used. 
	static 	Scanner input = new Scanner(System.in);//scanner declared

	public static void main(String[]args){//open main
		int userChoice = 0; //its pretty dumb that I can't just input.nextInt() == x in my if statement, JAVA FIX

		for(;;){

			System.out.println("press 1 to initalize array1, press 2 to enter the array from keyboard, press 3 to print the arrays, \npress 4 to get the addition of array2, 5 to averege array2, 6 to search through the array, 7 to end\n 8 and 9 for bubbles, 10 and 11 for seleciton");
			userChoice = input.nextInt();
			if(userChoice == 1){ //calls user input
				InitializeArray (array3); //runs the InitializeArray method
			}else if(userChoice == 2){ // when 2, the program takes user input from the user 
				EnterFromKeyboard();
			}else if(userChoice == 3){ //when 3, the program prints the arrays
				printArrays();
			}else if(userChoice == 4){ 
				sumArray();
			}else if(userChoice == 5){ //when 5, 
				averegeArray();
			}else if(userChoice == 6){
				bubbleSortA(array1);
				printArrays();
			}else if(userChoice == 7){
				InitializeArray(array3);
				for(int x = 0; x<array3.length; x++){
					System.out.println(array3[x]);
				}

				long startTime = System.currentTimeMillis();

				bubbleSortA(array3);
				long stopTime = System.currentTimeMillis();
				long elapsedTime = stopTime - startTime;
				for(int x = 0; x<array3.length; x++){
					System.out.println(array3[x]);
				}
			}else if (userChoice == 8){

				InitializeArray(array3);
				long startTime = System.currentTimeMillis();

				for(int x = 0; x<array3.length; x++){
					System.out.println(array3[x]);
				}
				startTime = System.currentTimeMillis();

				bubbleSortD(array3);
				long stopTime = System.currentTimeMillis();
				long elapsedTime = stopTime - startTime;
				
				for(int x = 0; x<array3.length; x++){
					System.out.println(array3[x]);
				}
				System.out.println("it took " + elapsedTime + " Miliseconds");
			}else if(userChoice == 9){

			}else if(userChoice == 10){
				for(int x = 0; x<array3.length; x++){
					System.out.println(array3[x]);
				}
				long startTime = System.currentTimeMillis();
				System.out.println("Done, Sorting");
				selectionSortA(array3);

				for(int x = 0; x<array3.length; x++){
					System.out.println(array3[x]);
				}
				long stopTime = System.currentTimeMillis();
				long elapsedTime = stopTime - startTime;

				System.out.print("Sorting took " + elapsedTime + " milliseconds \n");

			}else if(userChoice == 11){
				for(int x = 0; x<array3.length; x++){
					System.out.println(array3[x]);
				}
				long startTime = System.currentTimeMillis();
				System.out.println("Done, Sorting");
				selectionSortD(array3);

				for(int x = 0; x<array3.length; x++){
					System.out.println(array3[x]);
				}
				long stopTime = System.currentTimeMillis();
				long elapsedTime = stopTime - startTime;

				System.out.print("Sorting took " + elapsedTime + " milliseconds \n");

			}else if(userChoice != 1){
				if(userChoice != 2){
					if(userChoice != 3){
						if(userChoice != 4){
							if(userChoice != 5){ 
								if (userChoice != 6){
									if(userChoice != 7){
										if(userChoice != 8){
											if(userChoice != 9){
												if(userChoice != 10){											
													if(userChoice != 11){
														System.out.println("press 1 to initalize array1, press 2 to enter the array from keyboard, press 3 to print the arrays, press 4 to get the addition of array2, 5 to averege array2, 6 to search through the array, and 7 to end");
														continue; //back to the top of the loop
													}//if user input is not between 1 and 5, it goes back to the top
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}//end if statement
		}//end loop

//seen above - The longest single if statement and for loop used in code. {{{{{{{{{{{{{}}}}}}}}}}}}}}}




	}//end main	
	public static int[] InitializeArray(int[] z){//open method
		for(int x = 0; x<z.length; x++){
			z[x] = (int) (Math.random()*10001);
		}

		return z; //returns array1
	}//end method


	public static int[] EnterFromKeyboard(){ //open method
		for(int x = 0; x<array2.length; x++){//open for loop
			System.out.println("Enter number " + (x+1) + " of the array"); //tells the user to input
			array2[x] = input.nextInt(); //takes input
		}//end for loop

		return array2; //returns array2
	}//end method

	public static void printArrays(){//open method
		System.out.println("array 2 - " + array2[0] +  " " +  array2[1] + " " + array2[2] + " " +  array2[3] +" " +  array2[4] + " " + array2[5] + " " +  array2[6] + " " + array2[7] + " " +  array2[8] + " " + array2[9]); //prints the array
		System.out.println("array 1 - " + array1[0] + " " +  array1[1] + " " + array1[2] + " " +  array1[3] +" " +  array1[4] + " " + array1[5] + " " +  array1[6] + " " + array1[7] + " " +  array1[8] + " " + array1[9]); //prints the array

	}//end method

	public static int sumArray(){//open method
		for(int y = 0; y<array2.length; y++){//for loop
			sum =sum + array2[y];//array calculations
		}//end for loop
		System.out.println("the sum of the array is " + sum);
		return sum; 
	}//end method

	public static double averegeArray(){ //open method
		sumArray();
		averege = sum/array2.length;
		System.out.println("the averege of the array is " + averege);
		return averege; //returns averege
	}//end method

	public static void searchArray(){
		System.out.println("enter the number you would like to search for");
		numToSearch = input.nextInt();
		for(int x = 0; x<array2.length; x++){
			if(numToSearch == array2[x]){
				System.out.println("found at array position " + (x+1));
			}else{
				System.out.println("Not found in position " + x);
				continue;
			}
		}
	}//end method
	public static int[] bubbleSortA(int[] z){ //ascending bubble sort
		int temp = 0;
		for(int y = 0; y<z.length; y++){		
			for(int x = 1; x<z.length; x++){
				if(z[x] < z[x-1]){//check
					temp = z[ x ];//temp check
					z[x ] = z[ x-1 ]; //change
					z[ x-1 ] = temp;//has temporary variables 
				}
			}//end for 1
		}//end for 0
		return z;
	}//end method

	public static int[] bubbleSortD(int[] z){
		int temp = 0;

		for(int y = 0; y<z.length; y++){		
			for(int x = 1; x<z.length; x++){
				if(z[x] > z[x-1]){//check
					temp = z[ x ];//temp check
					z[x ] = z[ x-1 ]; //change
					z[ x-1 ] = temp;//has temporary variables 
				}
			}//end for 1
		}//end for 0
		return z;
	}
	public static int[] selectionSortA(int[] z){

		for (int i = 0; i < z.length - 1; i++)
		{
			int arrayIndex = i;
			for (int j = i + 1; j < z.length; j++)
				if (z[j] < z[arrayIndex])
					arrayIndex = j;

			int smaNum = z[arrayIndex]; 
			z[arrayIndex] = z[i];
			z[i] = smaNum;
		}
		return z;


	}//end method
	public static int[] selectionSortD (int[] z){

		for (int i = 0; i < z.length - 1; i++)
		{
			int arrayIndex = i;
			for (int j = i + 1; j < z.length; j++)
				if (z[j] > z[arrayIndex])
					arrayIndex = j;

			int smaNum = z[arrayIndex]; 
			z[arrayIndex] = z[i];
			z[i] = smaNum;
		}
		return z;
	}// end method
}//end class