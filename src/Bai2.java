import java.io.*;
import java.nio.file.Files;

import static java.lang.System.in;

public class Bai2
{
        //[Bài tập] Copy file nhị phân
    //Mục đích
    //Luyện tập đọc/ghi file nhị phân với các lớp được dẫn xuất từ InputStream/OutputStream
        public static void main(String[] args) {
            //Viết một chương trình cho phép người dùng sao chép các tập tin.
            // Người sử dụng cần phải cung cấp một tập tin nguồn (source file) và một tập tin đích (target file).
            String strSourceFile = "/Users/hoanganh/QAhocJAVA/IO-File/src/source.txt";
            String strTargetFile = "/Users/hoanganh/QAhocJAVA/IO-File/src/target.txt";

            try {
                // Tạo một luồng đầu vào bằng cách đọc một file
                FileInputStream fin = new FileInputStream(strSourceFile);
                // Tạo một luồng đầu ra bằng cách đọc một file
                FileOutputStream fout = new FileOutputStream(strTargetFile);
                // Mảng để mỗi lần đọc các byte từ luồng thì tạm thời để lên đó
                // Ta dùng mảng 1024 byte

                byte[] b = new byte[1024];
                int noOfBytes = 0;
                // Đọc các byte trong luồng và gán lên các phần tử của mảng.
                // Giá trị i là số đọc được của 1 lần. (i sẽ <= 10).
                // Khi không còn phần tử trong luồng i sẽ = -1
                while ((noOfBytes = fin.read(b)) != -1) {
                    fout.write(b, 0, noOfBytes);
                }
                System.out.println("Da sao chep file!");
                //Dong luong
                fin.close();
                fout.close();
            } catch (FileNotFoundException fnf) {
                System.out.println("Khong tim thay file :" + fnf);
            } catch (IOException ioe) {
                System.out.println(" Loii :" + ioe);
            }
        }
}



