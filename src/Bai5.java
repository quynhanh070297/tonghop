import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Bai5
{

//Cho một file csv lưu danh sách các quốc gia gồm các thuộc tính id, code, name.
// Trong đó CSV là một tập tin văn bản bình thường, nó lưu trữ dữ liệu theo từng cột,
// và chia nó bằng dấu phân cách (thường là dấu phẩy “,“).
//Hãy thực hiện đọc file và hiển thị danh sách các quốc gia.

    public static void main(String[] args) throws Exception
    {
        // Noi filereader voi 1 file text
        File file = new File("/Users/hoanganh/QAhocJAVA/IO-File/src/country.txt");
        FileReader file2 = new FileReader(file);

        // Noi BufferReader voi fileReader
        BufferedReader br = new BufferedReader(file2);

        String line = null;
        // Doc tung dong cho den khi khong con gi de doc nua
        while ((line = br.readLine()) != null)
        {
            String words[] = line.split(" ");
            for (int i = 0; i < words.length; i++)
            {
                System.out.println(words[i]);
            }
        }
        // In ra ket qua
        br.close();

    }
}



