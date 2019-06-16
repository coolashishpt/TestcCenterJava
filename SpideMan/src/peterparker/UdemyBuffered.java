package peterparker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UdemyBuffered {

	public static void main(String[] args) throws Exception {
		
		System.out.println("What is your name?");
		InputStreamReader is =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String n = br.readLine();
		System.out.println("Hello "+n);

	}

}
