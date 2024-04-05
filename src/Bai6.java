import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bai6
{
    //[Bài tập]: tìm từ được sử dụng nhiều nhất trong văn bản
    //Mục tiêu: luyện tập đọc ghi file
    //Đề bài: Viết chương trình đọc nội dung từ file text và hiển thị các từ được sử dụng nhiều nhất trong file đó.
    //Hướng dẫn làm bài:





    public static void main(String[] args) throws Exception {
        String line, word = "";
        int count = 0, maxCount = 0;
        // Tao ra 1 list de hung nhung tu xuat hien
        ArrayList<String> words = new ArrayList<>();
        //- Bước 1: Đọc nội dung từ tệp văn bản
        //sử dụng FileReader và BufferedReader để đọc dữ liệu từ tệp.
        File file = new File("data.txt");
        FileInputStream file2 = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(file2);
        BufferedReader br = new BufferedReader(input);
        // Cho tat ca ca tu vao list
        while((line = br.readLine()) != null) {
            String string[] = line.toLowerCase().split(" ");
            for (int i = 0; i < string.length ; i++)
            {
                words.add(string[i]);
            }
        }
        //- Bước 3: Xác định từ được sử dụng nhiều nhất
        //Duyệt qua mang để tìm từ có tần suất xuất hiện cao nhất.
        for(int i = 0; i < words.size(); i++){
            count = 1;
            for(int j = i+1; j < words.size(); j++){
                if(words.get(i).equals(words.get(j))){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                word = words.get(i);
            }
        }
        //- Bước 4: Hiển thị từ được sử dụng nhiều nhất
        //In ra từ được sử dụng nhiều nhất và tần suất xuất hiện của nó.
        System.out.println( "Tu xuat hien nhieu nhat la : "+word + "Xuat hien : " + maxCount);
    }
}
