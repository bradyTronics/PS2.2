package MainPackage;
import java.lang.Math;

public class MyInteger {
	int value;
	/** This is a work in progress and is on Github to show it is being worked on **/
	
	public MyInteger (int value){
		this.value = value;
	}
	
	public boolean isEven(){
		if (value % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isOdd(){
		if ( value % 2 != 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isPrime(){
		int sqrt = (int) Math.sqrt(value)+1;
		for( int i = 2; i< sqrt; i++){
			if( value % i==0){
				return false;
			}
		}
			return true;
	}
	
	public int getValue() {
		return value;
	}
	
	
	public static boolean isEven( int value){
		return isEven(value);
	}
	
	public static boolean isOdd(int value){
		return isOdd(value);
	}
	
	public static boolean isPrime(int value){
		return isPrime(value);
	}
	

	
	public static boolean isEven(MyInteger even){
		return isEven(even.getValue());
	}
	
	public static boolean isOdd(MyInteger odd){
		return isOdd(odd.getValue());
	}
	
	public static boolean isPrime(MyInteger prime){
		return isPrime(prime.getValue());
	}

	public boolean equals(int newvalue){
		return value == newvalue;
	}
	
	public boolean equals(MyInteger mew){
		return equals(mew.getValue());
	}

	public static int parseInt(char[] ar){
		return Integer.parseInt(new String(ar));
	}
	
	public static int parseInt(String ar){
		return Integer.parseInt(new String(ar));
	}
}
