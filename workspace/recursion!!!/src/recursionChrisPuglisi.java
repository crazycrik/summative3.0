
public class recursionChrisPuglisi {
	public static void main(String[]args){
		/*String BigNumber = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		char[] Seperated = new char[1000];
		int[] theyAreFinallyNums = new int[1000];

		for(int x = 0; x<Seperated.length; x++){
			Seperated[x] = (char) BigNumber.codePointAt(x);
			//System.out.println(Seperated[x]);
		}

		for(int x = 0; x<theyAreFinallyNums.length; x++){
			theyAreFinallyNums[x] = Character.getNumericValue(Seperated[x]);
			//.out.println(theyAreFinallyNums[x]);
		}

		int startPoint = 0;
		int[] total = new int[987]; 
		int[] temp2 = new int[13];
		for(int b = 0; b<total.length; b++){
			if(startPoint >= (1000-13)){

				for(int a = 0; a<temp2.length; a++){
					temp2[a] =  total[a + startPoint];
				}
				for(int z = 1; z<temp2.length; z++){
					temp2[z] = temp2[z-1]*temp2[z];
				}
				total[b] = temp2[12];
				startPoint++;
				//System.out.println(total[b]);
			}
		}

		bubbleSortA(total);

		System.out.println(total[986]);

		 */


		int[] twoMil = new int[2000000];

		for(int x = 0; x<twoMil.length; x++){
			twoMil[x] = x+1;
		}

		for(int x = 0; x<twoMil.length; x++){
			twoMil[x] = isPrime(twoMil[x]);
		}
		long total = 0;
		for(int x = 0; x<twoMil.length; x++){
			total+=twoMil[x];
			//System.out.println(total);
		}
		System.out.print(total);



	}//end main
	

	public static int isPrime(int x){
		boolean prime = false;
		if(x != 2){
			if(x%2 == 0){
				return 0;
			}
		}
		if(x == 2 || x ==3 || x==5 || x==7){
			
			System.out.println(x);
			return x;
		}

		for(int y=3; y<=Math.sqrt(x); y+=2){
			if(x%y != 0){
				prime = true;
			}else if(x%y == 0){
				prime = false;
				break;
			}
		}



		if(prime == true){
			System.out.println(x);
			return x;
		}else{
			return 0;
		}
	}
	
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
}//end class
