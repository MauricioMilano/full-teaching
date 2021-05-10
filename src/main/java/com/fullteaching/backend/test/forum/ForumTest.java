package com.fullteaching.backend.test.forum;

import java.util.ArrayList;

import com.fullteaching.backend.entry.Entry;
import com.fullteaching.backend.forum.Forum;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

@DisplayName("Classe para teste do Forum")
public class ForumTest {
	@Test
	public void DeveTestarGettersAndSetters(){
		Forum forum = new Forum(false);
		int id = 10;
		forum.setId(id);
		Assertions.assertEquals(forum.getId(),id);
		Assertions.assertFalse(forum.isActivated());
		forum.setActivated(true);
		Assertions.assertTrue(forum.isActivated());
		ArrayList<Entry> list = new ArrayList<Entry>();
		int tamanho = 5;
		for (int i = 0; i < tamanho; i++) {
			list.add(Mockito.mock(Entry.class));
		}
		forum.setEntries(list);
		Assertions.assertNotNull(forum.getEntries());
	}
}
