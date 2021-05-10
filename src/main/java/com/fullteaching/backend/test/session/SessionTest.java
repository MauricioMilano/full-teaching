package com.fullteaching.backend.test.session;

import com.fullteaching.backend.session.Session;
import org.junit.jupiter.api.*;
@DisplayName("Classe para teste da Session")
public class SessionTest {
    @Test
    public void DeveTestarSetEGets() {
        Session session = new Session();
        String titulo = "novo Titulo";
        session.setTitle(titulo) ;
        Assertions.assertNotNull(session, "Erro ao criar Session");
        Assertions.assertTrue(titulo.equals(session.getTitle())," Titulo diferente do esperado ");
        session.setDescription("descrição");
        Assertions.assertNotNull(session, "Erro ao criar Session");
        Assertions.assertTrue("descrição".equals(session.getDescription()),"Descricao diferente do esperado");
        Long date = System.currentTimeMillis();
        session.setDate(date);
        Assertions.assertNotNull(session, "erro ao criar Session");
        Assertions.assertTrue(date == session.getDate(), "Data diferente do esperado");
    }
    @Test
    public void validandoIgualdadeDasSessions() {
        Session session1 = new Session();
        session1.setId(1);
        Session session2 = new Session();
        session2.setId(1);
        Session session3 = new Session();
        session3.setId(2);
        Assertions.assertNotNull(session1, "Erro ao criar Session");
        Assertions.assertNotNull(session2, "Erro ao criar Session");
        Assertions.assertNotNull(session3, "Erro ao criar Session");
        Assertions.assertTrue(session1.equals(session2), "Session 1 não é igual a Session 2, Deveria ser igual. ");
        Assertions.assertTrue(session1.equals(session1), "Session 1 não é igual a Session 1, Deveria ser igual. ");
        Assertions.assertTrue(!session1.equals(session3), "Session 1 é igual a Session 3, Deveria ser diferente. ");

    }

}
