import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int nc = scan.nextInt();
        for(int t = 1; t <= nc; t++)
        {
            int n = scan.nextInt();
            int k = scan.nextInt();
            boolean[] vivo = new boolean[n+1];
            for(int i = 1; i <= n; i++)vivo[i] = true;

            int pos;
            if(k <= n) pos = k;
            else pos = (k % n); 
            int vivos = n;
            while(vivos > 1)
            {
                vivo[pos] = false;
                vivos--;
                if(vivos == 1) break;
                int passos = 0;
                while(passos < k)
                {
                    pos++;
                    if(pos > n) pos = 1;
                    if(vivo[pos] == true) passos++;
                }
            }
            int ans =0;
            for(int i = 1; i <= n; i++)
            {
                if(vivo[i] == true)
                {
                    ans = i;
                    break;
                }
            }
            System.out.println("Case " + t + ": " + ans);
       }
    }

}
