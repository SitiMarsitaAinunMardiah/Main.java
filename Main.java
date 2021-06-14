import java.util.Arrays;


public class Main {


	public static void main(String[] args) {
		
		int[] arrayAngka1= {2,3,5,1,4,1,8,6,8,9};
		int[] arrayAngka2= {0,4,1,2,1,5,9,1,4,2};
		
		// penjumlahan antara dua buah array
		
		int[] arrayHasil = tambahArray(arrayAngka1,arrayAngka2);
		printArray(arrayAngka1, "a'ray 1");
		printArray(arrayAngka2, "a'ray 2");
		printArray(arrayHasil, "hasil");
		

	}
	
	private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2){
		int[] arrayHasil = new int[arrayInt1.length];
		int[] arrayHasil1 = new int[arrayInt2.length];
 
			arrayHasil1[1] = arrayInt1[1] + arrayInt2[1];
			return arrayHasil1;
		}
		
			
	
	
	
	private static void printArray(int[] dataArray, String message){
		System.out.println(message + " - " + Arrays.toString(dataArray));
	}

}
