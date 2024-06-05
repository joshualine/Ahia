package org.joshualine.productservice.orderItem;


import jakarta.persistence.*;
import lombok.*;
import org.joshualine.productservice.order.Order;
import org.joshualine.productservice.product.Product;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue
    private Integer id;
    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
