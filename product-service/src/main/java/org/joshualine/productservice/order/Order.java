package org.joshualine.productservice.order;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.joshualine.productservice.orderItem.OrderItem;
import org.joshualine.productservice.sharedModel.OrderStatus;
import org.joshualine.productservice.user.User;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Integer id;

    private OrderStatus orderStatus;

    @CreationTimestamp
    private LocalDateTime orderDate;

    private double total;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;
}
