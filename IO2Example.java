import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void lerTecladoEscreverDocumento() throws IOException {
		PrintWriter pw = new PrintWriter(System.out); 
		pw.println("Digite 3 recomendações de filmes"); 
		pw.flush(); 
		
		Scanner scan = new Scanner(System.in); 
		String line = scan.nextLine();
		
		File f = new File("teste.txt"); 
		BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName())); 
		do {
			bw.write(line); 
			bw.newLine(); 
			line = scan.nextLine(); 
		}while(!(line.equalsIgnoreCase("fim"))); 
		
		bw.flush();  
		pw.close(); 
		bw.close(); 
		scan.close(); 
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		lerTecladoEscreverDocumento();
	}

}
