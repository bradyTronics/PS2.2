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
		
	public boolean isEven(int value){
		if(value %2 == 0){
			return true;
		}
		return false;
	
	}
	
    public boolean isOdd(int value) {
    	if(value %2 != 0){
    		return true;
    	}
    	return false;
    }
    
    public boolean isPrime(int value){
    	int sqrt = (int) Math.sqrt(value)+1;
		for( int i =2; i < sqrt; i++){
			if( value % i ==0){
				return false;
			}
		}
		return true;
    }
    
    
	
	
	public int getValue() {
		return value;
	}
	
	/**
	public static boolean isEven( int value){
		return isEven(value);
	}
	
	public static boolean isOdd(int value){
		return isOdd(value);
	}
	
	public static boolean isPrime(int value){
		return isPrime(value);
	}
	**/

	
	public static boolean isEven(MyInteger even){
		return even.isEven(even.getValue());
	}
	
	public static boolean isOdd(MyInteger odd){
		return odd.isOdd(odd.getValue());
	}
	
	public static boolean isPrime(MyInteger prime){
		return prime.isPrime(prime.getValue());
	}

	public boolean equals(int newvalue){
		return value == newvalue;
	}
	
	public boolean equals(MyInteger mew){
		return equals(mew.getValue());
	}

	
}
