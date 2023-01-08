package crackingCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class training {

	public static void receberTecladoImprimirConsole() throws IOException
	{
//		InputStream is = System.in; 
//		InputStreamReader isr = new InputStreamReader(is); 
//		BufferedReader br = new BufferedReader(isr); 
		
		System.out.println("Recomende 3 filmes: "); 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String line = br.readLine(); 
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		do {
			bw.write(line);
			bw.newLine(); 
			line = br.readLine(); 
		}while(!(line.isEmpty())); 
		bw.flush();
		br.close(); 
		bw.close(); 
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		receberTecladoImprimirConsole();
	}

}
