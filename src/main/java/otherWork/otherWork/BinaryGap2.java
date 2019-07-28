package otherWork.otherWork;

public class BinaryGap2 {
	
	public static void main(String[] args) {
		int myNum =467;
		
	
		System.out.println(myNum);
		String bin=Integer.toBinaryString(myNum);
		System.out.println(bin);
		
		int n=myNum;
		while (n!=0 && (n & 1) ==0) {
			n >>>= 1;
		}
		System.out.println(n);
		
		int max= 0;
		int gap = 0;
		while (n !=0) {
			if ((n & 1)==0){
				gap++;
				max = Math.max(gap, max);
				
				
			} else {
				gap =0;
			}
		}n>>>= 1;
		//return max;
		System.out.println(max);
		
		
	}
	
	
	


}
