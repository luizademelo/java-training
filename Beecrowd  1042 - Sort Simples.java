import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] a = new int[3];
        for(int i = 0; i < 3; i++)
        {
            a[i] = scan.nextInt();
            arr.add(a[i]);
        }
        Collections.sort(arr);
        for(int i = 0; i < 3; i++)
            System.out.println(arr.get(i));
        System.out.println();
        for(int i =0 ; i < 3; i++)
            System.out.println(a[i]);
    }

}
