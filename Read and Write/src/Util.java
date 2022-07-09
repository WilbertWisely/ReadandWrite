import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Util {
   
    public static void Write (int x){
        try {
            FileWriter writer = new FileWriter("C:\\Users\\ASUS\\Downloads\\App.java\\Read and Write\\src\\Output.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.flush();
            bufferedWriter.write( Integer.toString(x) + "\n");
            bufferedWriter.write("Donee!");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Read() throws NumberFormatException, IOException{
        String data = "0";
        FileReader reader = null;
        try {
             reader = new FileReader("C:\\Users\\ASUS\\Downloads\\App.java\\Read and Write\\src\\Input.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
            
             while (data != null){
                data = bufferedReader.readLine();
                if (data != null) System.out.println (data);
                int dataint = Integer.parseInt(data);
                int hasil = dataint *dataint*dataint;
                Write(hasil);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
         finally {
            if ( reader!= null){
                try {
                    reader.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        
    }
}