package main.java.clinic;

public class programming {
	public static void main(String[]args){
	String[]ar1 ={"NYC", "INY", "NJ"};
	String[]ar2 = {"NY", "WDC", "NJ"};
	for(int i = 0; i<ar1.length; i++){
		for(int j=0;j<ar2.length;j++){
			if(ar1[i].equals(ar2[j])){
				System.out.println(ar1[i]);
			}
		}
	}
}
}
