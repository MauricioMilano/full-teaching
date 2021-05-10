package com.fullteaching.backend.test.course;
import com.fullteaching.backend.course.Course;
import com.fullteaching.backend.coursedetails.CourseDetails;
import com.fullteaching.backend.user.User;
import org.mockito.Mockito;
import org.junit.jupiter.api.*;
@DisplayName("Classe para teste do Curso")
public class CourseTest {
    private static String titulo_curso = "Curso de Qualidade e teste";
    private static String foto = "image.img";
    private static User professor;

    @BeforeAll
    public static void initialize() {
        professor = Mockito.mock(User.class);
    }

    @Test
    public void testandoNovoCurso() {
        Course c2 = new Course();
        Assertions.assertNotNull(c2);

        Course c = new Course(titulo_curso, foto, professor);
        Assertions.assertNotNull(c, "Erro ao criar curso");
        Assertions.assertTrue(c.getTeacher().equals(professor), "Erro ao validar professor do curso");
        Assertions.assertTrue(c.getImage().equals(foto), "Erro ao validar foto do curso");
        Assertions.assertTrue(c.getTitle().equals(titulo_curso), "Erro ao validar tiitulo do curso");
        Assertions.assertNotNull(c.getSessions(), "Erro ao criar curso");
        Assertions.assertNotNull(c.getAttenders(),"Erro ao criar curso");
        Assertions.assertNull(c.getCourseDetails(), "Erro ao criar curso");

        CourseDetails cd = Mockito.mock(CourseDetails.class);
        Course c3 = new Course(titulo_curso, foto, professor, cd);
        Assertions.assertNotNull(c3, "Erro ao criar curso");
        Assertions.assertTrue(c3.getTeacher().equals(professor), "Erro ao validar professor do curso");
        Assertions.assertTrue(c3.getImage().equals(foto), "Erro ao validar foto do curso");
        Assertions.assertTrue(c3.getTitle().equals(titulo_curso), "Erro ao validar titulo do curso");
        Assertions.assertNotNull(c3.getSessions(),"Erro ao criar curso");
        Assertions.assertNotNull(c3.getAttenders(),"Erro ao criar curso");
        Assertions.assertNotNull(c3.getCourseDetails(), "Erro ao criar curso");

        Assertions.assertTrue(c3.getCourseDetails().equals(cd), "Erro ao validar o CourseDetails");
    }


    @Test
    public void DeveTestarGettersAndSetters() {
        Course c = new Course();
        c.setTitle(titulo_curso);
        Assertions.assertTrue(c.getTitle().equals(titulo_curso), "Erro ao validar titulo de curso");
        c.setImage(foto);
        Assertions.assertTrue(c.getImage().equals(foto), "Erro ao validar imagem do curso");
        c.setTeacher(professor);
        Assertions.assertTrue(c.getTeacher().equals(professor),"Erro ao validar professor");
        c.setCourseDetails(Mockito.mock(CourseDetails.class));
        Assertions.assertNotNull(c.getCourseDetails(), "Erro ao validar Detalhes do curso");
    }


    @Test
    public void validandoIgualdadeDosCursos() {
        CourseDetails cd = Mockito.mock(CourseDetails.class);

        Course c1 = new Course(titulo_curso, foto, professor, cd);
        c1.setId((long) Math.floor((Math.random()*Long.MAX_VALUE )));
        Course c2 = new Course(titulo_curso, foto, professor);
        c1.setId((long) Math.floor((Math.random()*Long.MAX_VALUE)));

        Assertions.assertTrue(!c1.equals(c2), "Erro ao comparar cursos, curso igual");
    }
}
