import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai3
{
    //[Bài tập] tìm và hiển thị các từ có độ dài lớn nhất
    //Mục tiêu: luyện tập đọc ghi file.
    //Đề bài: Viết chương trình đọc nội dung từ file text và tìm và hiển thị các từ có độ dài lớn nhất trong file đó.





    public static void main(String[] args)
    {
        try
        {   //B1: tạo 1 list string để lưu các từ tìm được.
            List<String> maxLeght = new ArrayList<>();
            // Noi filereader voi 1 file text
            File file = new File("data.txt");
            FileReader file2 = new FileReader(file);

            // Noi BufferReader voi fileReader
            BufferedReader br = new BufferedReader(file2);

            String line = null;
            // Doc tung dong cho den khi khong con gi de doc nua
            while ((line=br.readLine())!=null){
                String words[] = line.split(" ");
                for (int i = 0; i < words.length; i++)
                {
                    maxLeght.add(words[i]);
                }
            }
            //B4: duyệt mảng tìm length lớn nhất, nếu leng của phần tử = leng lớn
            // nhất thì add vào list, nếu lớn hơn length lớn nhất thì đổi list list mới và gán lại.
            String max = "";
            for (String s : maxLeght)
            { if (s.length()>max.length()){
                max= s;
            }
            }
            for (String string : maxLeght)
            { if (max.length() == string.length())
            {
                System.out.println("Cac tu co do dai lon nhat la :" + string);
                System.out.println(string);
            }
            //B5: tạo vòng lặp in ra các từ có độ dài lớn nhất, và độ dài của chúng.

            }
            // In ra ket qua
            br.close();
        } catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}
