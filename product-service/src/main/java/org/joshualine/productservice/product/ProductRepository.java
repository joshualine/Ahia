package org.joshualine.productservice.product;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    //GET
    List<Product> getAllProducts(){
        return products;
    }

    Optional<Product> getProductById(Integer id){
        return products.stream().filter(product -> product.id().equals(id)).findFirst();
    }

    //POST
    void createProduct(Product product){
        products.add(product);
    }

    //UPDATE
    void updateProduct(Product product, Integer id){
        Optional<Product> existingProduct = getProductById(id);

        if (existingProduct.isPresent()) {
        products.set(products.indexOf(existingProduct.get()), product);
        }
    }
    //DELETE
    void deleteProduct(Integer id){
        products.removeIf(product -> product.id().equals(id));
    }

    @PostConstruct
    void init(){
        products.add( new Product(
                1,
                "Iphone",
                "This is the first product",
                200,
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(30))
        );
        products.add( new Product(
                2,
                "Iphone2",
                "This is the second product",
                400,
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(90))
        );
    }
}
