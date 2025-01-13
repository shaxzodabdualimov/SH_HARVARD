import java.io.*;

public class Client {
    
    public Client() throws IOException {
        File file=new File("Shimara.txt");
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        for(String line=bufferedReader.readLine(); line!=null; line=bufferedReader.readLine()){
            System.out.println(line);
        }

    }
}


