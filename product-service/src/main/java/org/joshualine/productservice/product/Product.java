package org.joshualine.productservice.product;

import java.time.LocalDateTime;

public record Product(
        Integer id,
        String name,
        String description,
        Integer price,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated
) {
}
