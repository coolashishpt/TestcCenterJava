package peterparker;

public class StringRotation 
{
		static boolean Rotations(String s1, String s2) 
		{ 
			
			return (s1.length() == s2.length()) && 
				((s1 + s1).contains(s2)); 
		} 

		
		public static void main(String[] args) 
		{ 
			String r1 = "DACD"; 
			String r2 = "ACDD"; 

			if (Rotations(r1, r2)) 
				System.out.println("Yes"); 
			else
				System.out.printf("No"); 
		} 
	} 
