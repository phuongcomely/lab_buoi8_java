package entities;

import service.ManageService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageProduct manageProduct = new ManageProduct();
        while (true) {
            System.out.println("Enter 0: Thêm sản phẩm");
            System.out.println("Enter 1: Xem danh sách sản phẩm ");
            System.out.println("Enter 2: Tìm sản phẩm theo tên");
            System.out.println("Enter 3: Tìm sản phẩm theo id. ");
            System.out.println("Enter 4: Tìm sản phẩm có số lượng dưới 5.");
            System.out.println("Enter 5: Tim sản phẩm theo mức giá.");
            String choose = scanner.nextLine();
            switch (choose) {
                case "0":
                    Product product = ManageService.createProduct();
                    manageProduct.addProduct(product);
                    break;
                case "1":
                    manageProduct.Input();
                    break;
                case "2":
                    System.out.println("Nhập tên sản phẩm cần tìm:");
                    String name = scanner.nextLine();
                    manageProduct.searchProductByName(name).forEach(product1 -> System.out.println(product1.toString()));
                    break;
                case "3":
                    System.out.println("Nhập id cần tìm: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    manageProduct.searchProductById(id).forEach(p -> System.out.println(p.toString()));
                    break;
                case "4":
                    manageProduct.searchProductByQua();
                    break;
                case "5":
                    System.out.println("Nhập mức giá cần tìm: ");
                    double price = Double.parseDouble(scanner.nextLine());
                   manageProduct.searchProductPrice(price).forEach(p -> System.out.println(p.toString()));

                    break;
                default:
                    System.out.println("lỗi!");
                    continue;
            }

        }
    }
}
