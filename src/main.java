import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class main {
    private static List<Integer> list = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
         int choice = 0;
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

            }
        } while(choice != 0);


    }

    public static void InputData() {
        System.out.println("Nhập dữ liệu vào mảng");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        list.add(num);

    }


}