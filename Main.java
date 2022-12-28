import java.util.Scanner;
  class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				System.out.print(" ");			
			}
			for (int k = 0; k < 2*i+1; k++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
		for (int i = n; i >= 0; i--) {
			for (int k = 0; k < n-i+1; k++) {
				System.out.print(" ");
				
			}
			for (int j = 1; j < 2*i-2; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}

}