import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
         System.out.println("Vui lòng chọn chức năng dưới đây");
         System.out.println("Chức năng 1 : Nhập dữ liệu vào từ bàn phím và lưu trữ dữ liệu vào danh sách (List)");
         System.out.println("Chức năng 2:  Tính tổng giá trị trong danh sách");
         System.out.println("Chức năng 3: Tìm ra giá trị lớn nhất trong danh sách");
         System.out.println("Chức năng 4: Hiển thị các giá trị trong danh sách");
         System.out.println("Chức năng 5: Lưu trữ thông tin vào trong file json, xml");
         Scanner sc = new Scanner(System.in);
         int choice = sc.nextInt();

         switch (choice) {
             case 1: InputData();
             break;
             case 2:
                 System.out.print("Chưa làm");
                 break;

         }


    }

    public static void InputData() {
        List<Integer> list = new ArrayList<>();
        while(true) {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            list.add(num);
            System.out.println(list);
        }
    }

//    public static void inputner() {
//         while(true) {
//             Scanner sc = new Scanner(System.in);
//             int number = sc.nextInt();
//             list.add(number);
//         }
//
//
//
//    }


}