package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageProduct {
    private List<Product> products;
    public ManageProduct(){
        this.products = new ArrayList<>();
    }



    public void addProduct(Product product){
        this.products.add(product);
    }
    public void Input(){
         this.products.forEach(product -> System.out.println(product.toString()));
    }
    public List<Product> searchProductByName(String name){
        return  this.products.stream().filter(product -> product.getName().contains(name)).collect(Collectors.toList());

    }
    public List<Product> searchProductById(int id) {
        return this.products.stream().filter(product -> product.getId()==id).collect(Collectors.toList());

    }
    public long countProductId(){
        return this.products.stream().map(product -> product.getId()).count();
    }
    public List<Product> searchProductByQua(){
        return this.products.stream().filter(product -> product.getQuantity()<5).collect(Collectors.toList());
    }

    public List<Product> searchProductPrice(double price) {
        if(price <50000){
           return this.products.stream().filter(product -> product.getPrice()<50000).collect(Collectors.toList());
        }else if(price >=50000 || price <100000){
            return  this.products.stream().filter(product -> product.getPrice() >=50000 || product.getPrice()<100000).collect(Collectors.toList());
        }
        else {
            return this.products.stream().filter(product -> product.getPrice()>100000).collect(Collectors.toList());
        }
    }

}
