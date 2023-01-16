import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int t = 1;
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            scan.nextLine();
            String[] line = scan.nextLine().split(" ");
            int f = 0, m = 0;
            int iguais = 0;
            for (int i = 0; i < line.length; i++) {
                if (i % 2 == 0) {
                    if (Integer.parseInt(line[i]) == n) {
                        iguais++;
                        if (line[i+1].equals("F"))
                            f++;
                        else
                            m++;
                    }
                } 
            }

            System.out.println("Caso " + t + ":");
            System.out.println("Pares Iguais: " + iguais);
            System.out.println("F: " + f);
            System.out.println("M: " + m);
            if(scan.hasNextInt())
                System.out.println();
            t++;
        }
        scan.close();

    }

}
