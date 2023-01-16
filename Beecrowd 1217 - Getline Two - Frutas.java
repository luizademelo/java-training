// Obs.: tem que usar o scan.nextLine() depois do scan.nextInt() e scan.nextDouble(), porque os dois leem apenas os tokens, aí o "\n" fica na fila do scanner. Usamos o
// scan.nextLine() pra tirar esse "\n" e ler a proxima linha
import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException{

        Scanner scan = new Scanner(System.in); 
        int t = scan.nextInt(); 
        scan.nextLine(); //
        double preco = 0, kilos = 0; 
        for(int i = 1; i <= t; i++)
        {
            preco += scan.nextDouble(); 
            scan.nextLine(); 
            String line = scan.nextLine(); 
            int size = line.split(" ").length; 
            kilos += size; 
            System.out.println("day " + i + ": " + size + " kg");
             
        }   
        kilos = kilos / t; 
        System.out.printf("%.2f kg by day%n", kilos); 
        preco = preco / t; 
        System.out.printf("R$ %.2f by day%n", preco);         
        scan.close();

    }

}
