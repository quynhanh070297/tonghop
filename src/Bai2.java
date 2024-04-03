import java.io.*;
import java.nio.file.Files;

import static java.lang.System.in;

public class Bai2
{
        //[Bài tập] Copy file nhị phân
    //Mục đích
    //Luyện tập đọc/ghi file nhị phân với các lớp được dẫn xuất từ InputStream/OutputStream
    //Mô tả bài toán

    //Chương trình sao chép tệp nguồn vào tệp tin đích và hiển thị số byte trong tệp. Chương trình nên cảnh báo người dùng nếu tệp nguồn không tồn tại hoặc nếu tập tin đích đã tồn tại.
    //Để sao chép nội dung từ tệp tin nguồn đến tệp tin đích, bạn nên sử dụng luồng đầu vào để đọc byte từ tệp nguồn và luồng đầu ra để gửi byte đến tệp tin đích, bất kể nội dung của tệp.
    //Hướng dẫn nộp bài:
    //up bài tập lên github
    //paste link github vào phần nộp bài
        public static void main(String[] args) {
            //Viết một chương trình cho phép người dùng sao chép các tập tin.
            // Người sử dụng cần phải cung cấp một tập tin nguồn (source file) và một tập tin đích (target file).
            String strSourceFile = "source.txt";
            String strTargetFile = "target.txt";

            try {
                FileInputStream fin = new FileInputStream(strSourceFile);
                FileOutputStream fout = new FileOutputStream(strTargetFile);
                byte[] b = new byte[1024];
                int noOfBytes = 0;
                while ((noOfBytes = fin.read(b)) != -1) {
                    fout.write(b, 0, noOfBytes);
                }
                System.out.println("Da sao chep file!");
                fin.close();
                fout.close();
            } catch (FileNotFoundException fnf) {
                System.out.println("Specified file not found :" + fnf);
            } catch (IOException ioe) {
                System.out.println("Error while copying file :" + ioe);
            }
        }
}



