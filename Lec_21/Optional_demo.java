package Lec_21;

import java.util.Optional;

public class Optional_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> s=getName();
		
		System.out.println(s.orElse("name not found"));
		
//		if(s==null) {
//			System.out.println("name not found");
//		}
//		else {
//			System.out.println(s.toUpperCase());			
//		}
		
		
	}
	
	
	public static Optional<String> getName() {
		String s="Ritik";   // if found in db
//		String s=null;      // if not found in db
	
		return Optional.ofNullable(s);
//		return Optional.of(s);
	}

}


//https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html