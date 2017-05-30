package teacher.homework.lesson8;

public class Palindrom {

	
	public static void main(String[] args){
		/* пример вызова метода с параметрами
		int chislo = findDititByIndex(12345, 2, 5);
		System.out.println(chislo);
		System.exit(0);
		*/
				
		
		for (int i = 0; i<100; i++){
			int sluchaynoe5znachnoeChislo = (int) (Math.random()*100000);
			if (isPolindrom(sluchaynoe5znachnoeChislo)){
				System.out.println(sluchaynoe5znachnoeChislo + " da!!!!!!!!!"  );
			} else System.out.println(sluchaynoe5znachnoeChislo + " net."  );
			
			
		}
	}
	
	private static boolean isPolindrom(int number){
		int digits = digitsInNumber(number);
		if (digits ==1) {
			return true;
		}
		for (int i = 0; i<= digits/2+1;i++) {
			if (findDititByIndex(number, i, digits) 
					!= findDititByIndex(number, digits-i-1, digits)){
				return false;
			}
		}
		return true;
		
	}
	
	
	private static int digitsInNumber(int number){
		int counter = 0;
		if (number == 0) {
			return 1;
		}
		while (number !=0) {
			number = number/10;
			counter++;
		}
		return counter;
	}
	
	private static int findDititByIndex(int number , int index, int digitsNumber){
		number = number / (int) (Math.pow(10, index));
		
		return number % 10;
	}
	
	

	
	
	
}
