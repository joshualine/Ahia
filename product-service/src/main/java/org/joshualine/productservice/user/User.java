package org.joshualine.productservice.user;

public record User(
        Integer userID,
        String username,
        String email,
        String password
) {
}
