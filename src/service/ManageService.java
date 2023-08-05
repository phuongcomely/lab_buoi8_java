package service;

import entities.ManageProduct;
import entities.Product;

import java.util.Arrays;
import java.util.Scanner;

public class ManageService {
    public static Product createProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm: ");
        String describe = scanner.nextLine();
        System.out.println("Nhập số lượng : ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Đơn vị tính: ");
        String unit = scanner.nextLine();
        return new Product(id, name, describe, quantity, price, unit);
    }
}
//}
