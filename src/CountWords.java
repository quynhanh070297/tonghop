import java.io.*;

    //[Bài tập] đếm số lượng từ trong file
    //Mục tiêu:  luyện tập đọc file.
    //Đề bài: Viết chương trình đọc nội dung từ file text và hiển thị số lượng từ trong file đó.
    public class CountWords {

        public static void main (String args[]) throws Exception {

            File file = new File("String.txt");
        try
        {
            boolean value = file.createNewFile();
            if (value){
                System.out.println("File da duoc tao");
            }else {
                System.out.println("Bi loi roi");
            }
        }catch (Exception e){
            e.getStackTrace();
        }
            FileReader fr = new FileReader (file);
            BufferedReader br = new BufferedReader (fr);
            StringBuilder line = new StringBuilder("");
            int c ;
            while ((c= br.read())!=-1)
            {
            line.append((char)c);
                
            };
            System.out.println(line.reverse());







        }
    }

