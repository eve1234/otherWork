package otherWork.otherWork;

public class BinaryGap3 {
	
	public static void main(String[] args) {
		
		BinaryGap3 b3=new BinaryGap3();
		b3.solution(456);
		
	}
	
	
		public int solution(int n) { 
			// get rid of right-hand zeros
		    while (n != 0 && (n & 1) == 0) {
		        n >>>= 1;
		    }
		    System.out.println("n--->"+n);
		    
		    int max = 0;
		    int gap = 0;
		    while (n != 0) {
		        if ((n & 1) == 0) {
		            gap++;
		            max = Math.max(gap, max);
		        } else {
		            gap = 0;
		        }
		        n >>>= 1;
		    }
		    return max;
		   }

	}



