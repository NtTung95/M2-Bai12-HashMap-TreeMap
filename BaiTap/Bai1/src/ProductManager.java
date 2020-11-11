import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    Scanner input = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();
    public void create(Product p){
        products.add(p);
    }
    public void display(){
        for (Product p: products) {
            System.out.println(p);
        }
    }
    public void delete(int id){
        Product temp = new Product();
        for (Product p: products) {
            if(p.getId() == id)
                temp = p;
        }
        products.remove(temp);
    }
    public void edit(int id){
        for (Product p: products) {
            if(p.getId() == id){
                System.out.println("Nhập tên sp");
                p.setName(input.nextLine());
                System.out.println("Nhập giá sp");
                p.setPrice(Double.parseDouble(input.nextLine()));
            }
        }
    }
    public Product search(String name){
        Product temp = new Product();
        for (Product prod : products) {
            if(prod.getName().equals(name)){
                temp = prod;
            }
        }
        return temp;
    }
    public void sapXepTangDan(){
        Collections.sort(products);
        System.out.println("Sắpx xếp theo giá tăng dần");
        display();
    }
    public void sapXepGiamDan(){
        sapXepTangDan();
        Collections.reverse(products);
        System.out.println("Sắp xếp theo giá giảm dần");
        display();
    }
}
