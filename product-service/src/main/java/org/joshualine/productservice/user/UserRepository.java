package org.joshualine.productservice.user;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> users = new ArrayList<>();

    List<User> getAllUsers(){
        return users;
    }
}
