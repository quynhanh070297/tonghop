package ThucHanh;

import java.io.FileWriter;
import java.io.IOException;

public class Ghichuoikytu
{
    public static void main(String[] args)
    {
        // Cac cau lenh I/O deu co the gay ngoai le nen phai co try catch
        try
        {
            //Mo file de ghi
            FileWriter writer = new FileWriter("Hello.text");
            //white() Ghi mot doi tuong String ra file
            writer.write("Hello");
            //Dong file khi xong viec
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
