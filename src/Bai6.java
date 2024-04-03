import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bai6
{
    //[Bài tập]: tìm từ được sử dụng nhiều nhất trong văn bản
    //Mục tiêu: luyện tập đọc ghi file
    //Đề bài: Viết chương trình đọc nội dung từ file text và hiển thị các từ được sử dụng nhiều nhất trong file đó.
    //Hướng dẫn làm bài:
    //- Bước 1: Đọc nội dung từ tệp văn bản
    //Mở và đọc nội dung từ tệp văn bản. Bạn có thể sử dụng FileReader và BufferedReader để đọc dữ liệu từ tệp.
    //
    //- Bước 2: Tính toán tần suất xuất hiện của từng từ
    //Sử dụng một HashMap hoặc Map để lưu trữ từng từ và tần suất xuất hiện của chúng trong tệp văn bản. Với mỗi từ đọc được, tăng tần suất của từ đó trong Map.
    //
    //- Bước 3: Xác định từ được sử dụng nhiều nhất
    //Duyệt qua Map để tìm từ có tần suất xuất hiện cao nhất.
    //
    //- Bước 4: Hiển thị từ được sử dụng nhiều nhất
    //In ra từ được sử dụng nhiều nhất và tần suất xuất hiện của nó.
    public static void main(String[] args) throws Exception {
        String line, word = "";
        int count = 0, maxCount = 0;
        ArrayList<String> words = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while((line = br.readLine()) != null) {
            String string[] = line.toLowerCase().split("([,.\\s]+) ");
            for(String s : string){
                words.add(s);
            }
        }
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
        System.out.println(word);
    }
}
