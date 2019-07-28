package otherWork.otherWork;

public class IntToBinary {

	public static void main(String[] args) {
		int myNum =467;
	
		String bin=Integer.toBinaryString(myNum);
		System.out.println(bin);
		int lastP = bin.length();
		System.out.println(lastP);
		
		while (bin.charAt(lastP) == '1') {
			lastP--;
			
		}
		System.out.println(lastP);
		
	}

}
