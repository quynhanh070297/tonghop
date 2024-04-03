import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai3
{
    //[Bài tập] tìm và hiển thị các từ có độ dài lớn nhất
    //Mục tiêu: luyện tập đọc ghi file.
    //Đề bài: Viết chương trình đọc nội dung từ file text và tìm và hiển thị các từ có độ dài lớn nhất trong file đó.


    //B2: convert thành mảng string với mỗi từ là 1 phần tử.
    //B3: tạo 1 list string để lưu các từ tìm được.
    //B4: duyệt mảng tìm length lớn nhất, nếu leng của phần tử = leng lớn nhất thì add vào list, nếu lớn hơn length lớn nhất thì đổi list list mới và gán lại.
    //B5: tạo vòng lặp in ra các từ có độ dài lớn nhất, và độ dài của chúng.
    public static void main(String[] args)
    {
        // Tao 2 list de hung
        List<String> stringList = new ArrayList<>();
        List<String> bestLenght = new ArrayList<>();
        String line;
        int count = 0;
        File file = new File("string.txt");
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
            stringList.addAll(Arrays.asList(words));
            count = count + words.length;
            System.out.println(line);
        }
        String maxLenght = stringList.get(0);
        for (int i = 0; i < stringList.size(); i++)
        { if (stringList.get(i).length()> maxLenght.length()){
            maxLenght = stringList.get(i);
        }
        // in cac tu co do dai bang maxlenght neu co
        }
        for (String s : stringList)
        {
            if (s.length()==maxLenght.length()){
                System.out.println("Tu co do dai lon nhat la"+ s);
            }
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
