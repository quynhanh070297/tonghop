import java.io.*;

public class Bai1

{
    public static void main(String[] args) {
        String line;
        int count = 0;
        File file = new File("data.txt");
        try
        {
            boolean value = file.createNewFile();
            if (value){
                System.out.println("File da duoc tao");
            }
            else {
                System.out.println("cook roi em");
            }
        }catch (Exception e){
            e.getStackTrace();
        }

        //Đọc file
        FileReader file2 = null;
        try
        {
            file2 = new FileReader("data.txt");
        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(file2);




        //Nhan từng dòng cho đến hết file
        while(true) {
            try
            {
                if ((line = br.readLine()) == null) break;
            } catch (IOException e)
            {
                throw new RuntimeException(e);
            }
            // Chia mỗi dòng thành các từ
            String words[] = line.split(" ");
            // Đếm từng từ
            count = count + words.length;
            System.out.println(line);
        }

        System.out.println(" Số từ hiện tại ở file là: " + count);
        try
        {
            br.close();
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}  