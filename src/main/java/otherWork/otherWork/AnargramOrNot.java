package otherWork.otherWork;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnargramOrNot {

	public static void main(String[] args) {
		String s1="Something";
		String s2="gnihtemoS";
		
		char[] array1 =s1.toLowerCase().toCharArray();
		char[] array2 =s2.toLowerCase().toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		boolean status=Arrays.equals(array1, array2);
		
		if(status==true) {
			System.out.println("its anargram");
		}
		else {
			System.out.println("it is NOT anargram");
		}

	}

}
