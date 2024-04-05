import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai4
{
    //Bài tập sao chép file và đảo ngược phần tử
    //Mục tiêu: luyện tập đọc ghi file
    //Đề bài: Viết chương trình đọc nội dung từ file text và tạo một bản sao của file
    //Dó với tên mới và các từ được đảo ngược thứ tự.
    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader("/Users/hoanganh/QAhocJAVA/IO-File/src/source.txt");
        FileWriter fw = new FileWriter("/Users/hoanganh/QAhocJAVA/IO-File/src/target.txt");
        BufferedReader janus = new BufferedReader(fr);

        String data;
        StringBuilder builder = new StringBuilder();

        while ((data = janus.readLine()) != null){
            String[] words = data.split(" ");
            for(String a: words){
                builder.append(a);
             //   System.out.print(builder.reverse().toString());
            }
        }
        fw.write(String.valueOf(builder.reverse()));
        fw.flush();
    }
    }


