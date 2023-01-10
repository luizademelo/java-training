import java.io.*;
import java.util.Scanner;

public class Main {

    public static void copiaArquivo() throws IOException {

        File f = new File("C:\\Users\\DJ\\Projects\\Java\\training-dio\\teste.txt");
        String nomeArquivo = f.getName();
//        Reader r = new FileReader(nomeArquivo);
//        BufferedReader br = new BufferedReader(r);
        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String line = br.readLine();

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");
        File fcopy = new File(nomeArquivoCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        do{
            bw.write(line);
            bw.newLine();
            //bw.flush();
            line = br.readLine();
        } while(line != null && !(line.equalsIgnoreCase("fim")));
        bw.flush();

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros");
        pw.flush();

        adicionaInfoArquivo(fcopy.getName());

        br.close();
        bw.close();
        pw.close();

    }

    public static void adicionaInfoArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(!(line.equalsIgnoreCase("fim")));
        bw.flush();

        br.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        copiaArquivo();
    }

}
