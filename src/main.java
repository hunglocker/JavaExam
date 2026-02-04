import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class main {
    private static List<Integer> list = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {




         int choice;
         do {
             System.out.println("Vui lòng chọn chức năng dưới đây");
             System.out.println("Chức năng 1 : Nhập dữ liệu vào từ bàn phím và lưu trữ dữ liệu vào danh sách (List)");
             System.out.println("Chức năng 2:  Tính tổng giá trị trong danh sách");
             System.out.println("Chức năng 3: Tìm ra giá trị lớn nhất trong danh sách");
             System.out.println("Chức năng 4: Hiển thị các giá trị trong danh sách");
             System.out.println("Chức năng 5: Lưu trữ thông tin vào trong file json, xml");
             choice = input.nextInt();
             switch (choice) {
                 case 1: InputData();
                     break;
                 case 2: Sum();
                     break;
                 case 3:FindMax();
                 break;
                 case 4:ShowValues();
                 break;
             }
         } while(choice != 0);



    }

    public static void InputData() {
            System.out.println("Nhập dữ liệu vào mảng");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            list.add(num);

    }

    public static void Sum() {
         if(list.isEmpty()) {
             System.out.println("List trồng");
         }
         else {
             int sum = 0;
             for(int i : list) {
                 sum += i;
             }
             System.out.println("Tổng các số của chuỗi là " + sum);
         }
    }
    public static void FindMax() {
           int max = list.get(0);
           for(int i = 1 ; i < list.size(); i++) {
               max = list.get(i);
           }
           System.out.println("Giá trị lớn nhất " + max);
    }
    public static void ShowValues() {
          if(list.isEmpty()) {
              System.out.println("Danh sách đang trống");
          }
          else {
              System.out.println("TRong list gồm các giá trị " + list + ";");
          }
    }


//
//
//


}