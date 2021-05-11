package com.fullteaching.backend.test.comment;

import com.fullteaching.backend.comment.Comment;

import org.junit.jupiter.api.*;

@DisplayName("Classe para teste do CourseDetails")
public class CommentTest {
	@Test
	public void DeveTestarGettersAndSetters(){
		Comment comment = new Comment();
		String mensagem = "Mensagem";
		comment.setMessage(mensagem);
	}
}
