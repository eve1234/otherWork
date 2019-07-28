package otherWork.otherWork;

public class StringConcat {

	public static void main(String[] args) {
		String str="something";
		str.concat("#");
		System.out.println(str);
		int length=str.lastIndexOf("#");
	
		
		System.out.println(length);
		
		try {
			while(length>=0) {
				str.charAt(++length);
			}
		}catch(Exception ex) {
			System.out.println(length); //if not try --len
		}
	
	
		String s1 ="10";
		String s2 ="20";
		int i = Integer.valueOf(s1);
		int j = Integer.valueOf(s2);
		System.out.println(i+j);
		
		
	}

}
