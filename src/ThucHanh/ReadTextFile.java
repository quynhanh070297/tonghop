package ThucHanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadTextFile
{
    public static void main(String[] args)
    {
        try
        {
            File inFile = new File("Hello.txt");
            // Noi file Reader voi mot file text
            FileReader fileReader = new FileReader(inFile);
            // Noi BufferReader voi fileReader
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            // Doc tung dong cho den khi khong con dong lenh nua
            while ((line = reader.readLine())!= null ){
                System.out.println(line);
            }
            reader.close();

        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
