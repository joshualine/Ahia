//package org.joshualine.productservice.product;
//
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/v1/products")
//public class ProductController {
//
////    ProductRepository productRepository;
//    ProductSpringDataJpaRepository productSpringDataJpaRepository;
//
////    ProductController(ProductRepository productRepository){
////        this.productRepository = productRepository;
////    }
//
//    ProductController(ProductSpringDataJpaRepository productSpringDataJpaRepository) {
//        this.productSpringDataJpaRepository = productSpringDataJpaRepository;
//    }
//
//    @GetMapping("")
//    List<Product> GetAll(){
////        return productRepository.getAllProducts();
//        return productSpringDataJpaRepository.findAll();
//    }
////
////    @GetMapping("/{id}")
////    Product getById(@PathVariable Integer id){
////        Optional<Product> product = productRepository.getProductById(id);
////        if(product.isEmpty()) {
////            throw new ProductNotFoundException();
////        };
////        return product.get();
////    }
////
////    //POST
////    @ResponseStatus(HttpStatus.CREATED)
////    @PostMapping("")
////    void createProduct(@Valid @RequestBody Product product){
////        productRepository.createProduct(product);
////    }
////
////    //UPDATE
////    @ResponseStatus(HttpStatus.NO_CONTENT)
////    @PutMapping("/{id}")
////    void updateProduct(@Valid @RequestBody Product product, @PathVariable Integer id){
////        productRepository.updateProduct(product, id);
////    }
////
////    //DELETE
////    @DeleteMapping("/{id}")
////    void deleteProduct(@PathVariable Integer id){
////        productRepository.deleteProduct(id);
////    }
//}
