import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        
        int h = scan.nextInt(); 
        while(h != 0)
        {
            int max = h; 
            while( h > 1)
            {
                if(h%2 == 0)
                    h /= 2;
                else
                    h = 3 * h + 1; 
                if(h > max)
                    max = h; 
            }    
            System.out.println(max); 

            scan.nextLine(); 
            h = scan.nextInt(); 
        }

        scan.close();

    }

}
