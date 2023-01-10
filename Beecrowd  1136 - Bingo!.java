import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        int n,b;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        b = s.nextInt();
        while(n > 0)
        {
            int[] arr = new int[b];
            for(int i = 0; i < b; i++)
                arr[i] = s.nextInt();
            Set<Integer> bingo = new HashSet<Integer>();
            for(int i = 0; i < arr.length; i++)
            {
                for(int j = 0; j < arr.length; j++){
                    bingo.add(Math.abs(arr[i] - arr[j]));
                    //System.out.println(arr[i] - arr[j]);
                }

            }


            boolean ans = true;
            for(int i = 0; i <= n; i++)
            {
                if(!(bingo.contains(i)))
                {
                    ans = false;
                    break;
                }
            }

            if(ans) System.out.println("Y");
            else System.out.println("N");

            n = s.nextInt();
            b = s.nextInt();
        }
    }

}
