import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("1: Tạo sp");
            System.out.println("2: Sửa sp");
            System.out.println("3: Xóa sp");
            System.out.println("4: Hiển thị sp");
            System.out.println("5: Tìm sp");
            System.out.println("6: Sắp xếp theo giá tăng dần");
            System.out.println("7: Sắp xếp theo giá giảm dần");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    Product pAdd = new Product();
                    System.out.println("Nhập ID sp");
                    pAdd.setId(Integer.parseInt(input.nextLine()));
                    System.out.println("Nhập tên sp");
                    pAdd.setName(input.nextLine());
                    System.out.println("Nhập giá sp");
                    pAdd.setPrice(Double.parseDouble(input.nextLine()));
                    productManager.create(pAdd);
                    productManager.display();
                    break;
                case 2:
                    System.out.println("Nhập ID sp cần sửa");
                    productManager.edit(Integer.parseInt(input.nextLine()));
                    productManager.display();
                    break;
                case 3:
                    System.out.println("Nhập ID sp muốn xóa");
                    productManager.delete(Integer.parseInt(input.nextLine()));
                    productManager.display();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    System.out.println("Nhập tên sp cần tìm");
                    productManager.search(input.nextLine());
                    break;
                case 6:
                    productManager.sapXepTangDan();
                    break;
                case 7:
                    productManager.sapXepGiamDan();
                    break;
            }
        }while (true);
    }
}
