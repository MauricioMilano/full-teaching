package com.fullteaching.backend.test.user;

import com.fullteaching.backend.user.User;
import org.junit.jupiter.api.*;
import java.util.List;

@DisplayName("Classe para teste do usuario")
public class UserTest {
    User user = new User("estudante", "password", "nickname", "", "STUDENT");
    @Test
    public void DeveTestarACriacaoDoUsuario(){
        Assertions.assertEquals(user.getName(), "estudante","Erro na criação do usuario");
        String passwordHash = user.getPasswordHash();
        Assertions.assertEquals(passwordHash.length(), 60,"Erro na criação do usuario");
        Assertions.assertEquals(passwordHash.substring(0,7), "$2a$10$","Erro na criação do usuario");
        List<String> roles = user.getRoles();
        Assertions.assertFalse(roles.isEmpty(),"Erro na criação do usuario");
        Assertions.assertEquals(roles.get(0), "STUDENT","Erro na criação do usuario");
    }


}
