import java.io.*;

public class Bai1

{
    public static void main(String[] args) {
        try
        {
            // Noi filereader voi 1 file text
            File file = new File("data.txt");
            FileReader file2 = new FileReader(file);

            // Noi BufferReader voi fileReader
            BufferedReader br = new BufferedReader(file2);

            String line = null;
            int count = 0;
            // Doc tung dong cho den khi khong con gi de doc nua
            while ((line=br.readLine())!=null){
                String words[] = line.split(" ");
                count = count + words.length;
            }
            // In ra ket qua
            System.out.println("So ky tu la" + count);
            br.close();

        } catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}  