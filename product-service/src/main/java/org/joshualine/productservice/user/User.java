package org.joshualine.productservice.user;


import jakarta.persistence.*;
import lombok.*;
import org.joshualine.productservice.order.Order;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(
            unique = true,
            nullable = false
    )
    private String username;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;

    @Column(
            nullable
                    = false
    )
    private String password;

    @Column(columnDefinition = "boolean default false")
    private Boolean isAdmin;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

}
