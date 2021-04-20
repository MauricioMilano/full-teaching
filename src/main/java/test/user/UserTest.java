package user;
import com.fullteaching.backend.coursedetails.CourseDetails;
import com.fullteaching.backend.user.User;
import com.fullteaching.backend.course.Course;

import org.junit.jupiter.api.*;

import java.util.List;

@DisplayName("Classe para teste do usuario")
public class UserTest {
    User admin = new User("nome", "password", "nickname", "", "admin");
    User aluno = new User("nome", "password", "nickname", "", "aluno");
    User professor = new User("nome", "password", "nickname", "", "professor");
    @Test
    public void usuario_deve_ser_inserido_com_nome(){
        Assertions.assertEquals(admin.getName(), "nome");
    }
    @Test
    public void usuario_deve_criar_senha_criptografada(){
        String passwordHash = admin.getPasswordHash();
        Assertions.assertEquals(passwordHash.length(), 60);
        Assertions.assertEquals(passwordHash.substring(0,7), "$2a$10$");
    }
    @Test
    public void usuario_deve_ter_role_associada(){
        List<String> roles = admin.getRoles();
        Assertions.assertFalse(roles.isEmpty());
        Assertions.assertEquals(roles.get(0), "admin");
    }
    @Test
    public void usuario_deve_associar_um_curso(){
        Course curso = new Course("materia 1","", professor);
        CourseDetails detalhes = new CourseDetails(curso);
    }

}
