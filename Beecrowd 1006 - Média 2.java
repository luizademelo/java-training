import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		double result = s.nextDouble() * 2; 
		result += s.nextDouble() * 3;  
		result += s.nextDouble() * 5;
		result /= 10; 
		System.out.format("MEDIA = %.1f", result); 
		System.out.println(); 
	}

}
