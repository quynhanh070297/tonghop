package ThucHanh;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class InputStreamExample2 {

    public static void main(String[] args){

        try
        {
            File file = new File("/Users/hoanganh/QAhocJAVA/IO-File/src/ThucHanh/test.txt");
            // Tạo một luồng đầu vào bằng cách đọc một file
            InputStream in = new FileInputStream(file);

            // Mảng để mỗi lần đọc các byte từ luồng thì tạm thời để lên đó
            // Ta dùng mảng 10 byte

            byte[] bytes = new byte[10];
            int i = -1;

            // Đọc các byte trong luồng và gán lên các phần tử của mảng.
            // Giá trị i là số đọc được của 1 lần. (i sẽ <= 10).
            // Khi không còn phần tử trong luồng i sẽ = -1
            while ((i = in.read(bytes)) != -1) {
                // Tạo String từ các byte đọc được
                String s = new String(bytes, 0, i);
                System.out.println(s);
            }
            in.close();

        } catch (Exception e){
            e.getStackTrace();
        }

    }

}
