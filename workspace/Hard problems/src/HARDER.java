
public class HARDER {
	public static void main(String[]args){
		int firstNum = 0;
		int addDi = 0;
		int secondNum = 0;
		int thirdNum = 0;
		int smaller = 0;
		int total = 0;
		
		System.out.println(reverseFactorial(362880));
		
		
		/*


		for(;;){
			secondNum = divideIntToS(firstNum);
			thirdNum = addDigits(secondNum);

			smaller = checkSmaN(firstNum, thirdNum); 
			if(smaller <= 150){
				addDi = addDigits(smaller);
				total+=addDi;
				firstNum++;
			}
			System.out.println(total);
		}*/
	}


	public static long factorial(long x){

		if(x<=1){
			return 1;
		}else{	
			return x*factorial(x-1);

		}//doing it recrusivly for reasons
	}//end method

	public static int divideIntToS(int x){



		String temp0 = Integer.toString(x);

		char[] temp1 = new char[temp0.length()];

		for(int a = 0; a<temp1.length; a++){
			temp1[a] = temp0.charAt(a);
		}

		int[] y = new int[temp0.length()];

		for(int z = 0; z<y.length; z++){
			y[z] = Character.getNumericValue(temp1[z]);

		}
		//CHAR Array
		//char to int
		//return int
		//factorial all ints
		//redo the dividetostring
		//

		int total = 0;

		for(int b = 0; b<y.length; b++){
			total += factorial(y[b]);
		}

		return total;
	}

	public static int addDigits(int x){
		String temp0 = Integer.toString(x);

		char[] temp1 = new char[temp0.length()];

		for(int a = 0; a<temp1.length; a++){
			temp1[a] = temp0.charAt(a);
		}

		int[] y = new int[temp0.length()];

		for(int z = 0; z<y.length; z++){
			y[z] = Character.getNumericValue(temp1[z]);

		}
		x = 0;
		for(int a = 0; a<y.length; a++){
			x+=y[a];
		}


		return x;
	}

	public static int checkSmaN(int x, int z){
		int end = 0;
		int b = 0; 
		int c = 0;

		for(int a = 0; a<x; a++){
			b = divideIntToS(a);
			c = addDigits(b);

			if(c == z){
				end = a;
				break;
			}
		}
		return end;
	}//end method

	public static int test(int x){
		int[][] numbers = new int[10][2];
		int q = 0;
		int e = 0;


		for(int a = 0; a<numbers.length; a++){
			for(int b = 0; b<(x/2); b++){
				q = x-b;
				e = 0 + b;

				if((q+e) == x && q != x && e != 0){
					numbers[a][0] = q;
					numbers[a][1] = e;
				}
			}
		}
		int smallest = 0;
		for(int t = 0; t<numbers.length; t++){
			if(t == 0){
				smallest = numbers[t][0] + numbers[t][1];
			}else if(numbers[t][0] + numbers[t][1] < smallest){
				smallest = numbers[t][0] + numbers[t][1];
			}
		}

		x = smallest;


		return x;
	}

	public static long reverseFactorial(long x){

		if(x<=1){
			return 1;
		}else{	
			return x/reverseFactorial(x-1);

		}//doing it recursively for reasons
	}//end method

	public static int recons(int[] x){//works

		int y = 0;
		
		for(int z = 0; z< x.length; z++){
			y+=(x[z]) * Math.pow(10, z); //reconstructs the number from digits by multiplying each digit by 10^z (starting at z = 0, then 1 and so on)
		}//end for
		
		
		return y;//return y
	}//end method
}//end class
