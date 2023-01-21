import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        for (int k = 0; k < n; k++) {
            String s = scan.next();
            StringBuilder sb = new StringBuilder(s);
            if (s.length() == 3) {
                if (s.charAt(0) == 'O' && s.charAt(1) == 'B')
                    sb.setCharAt(2, 'I');
                if (s.charAt(0) == 'U' && s.charAt(1) == 'R')
                    sb.setCharAt(2, 'I');
            }
            System.out.print(sb);
            if(k != n-1) System.out.print(" "); 
            else System.out.println(); 
        }

        scan.close();

    }

}
