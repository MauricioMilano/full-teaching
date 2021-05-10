package com.fullteaching.backend.test.courseDetails;

import java.util.ArrayList;

import com.fullteaching.backend.course.Course;
import com.fullteaching.backend.coursedetails.CourseDetails;
import com.fullteaching.backend.filegroup.FileGroup;
import com.fullteaching.backend.forum.Forum;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

@DisplayName("Classe para teste do CourseDetails")
public class CourseDetailsTest {
	@Test
	public void DeveTestarGettersAndSetters() {
		CourseDetails cd = new CourseDetails();
		String info = "informaçao a ser validada";
		Assertions.assertNotNull(cd.getId(), "Erro ao criar CourseDetails");
		cd.setInfo(info);
		Assertions.assertEquals(cd.getInfo(), info, "Erro ao criar CourseDetails");
		Assertions.assertNotNull(cd.getFiles(), "Erro ao criar CourseDetails");
		cd.setForum(Mockito.mock(Forum.class));
		Assertions.assertNotNull(cd.getForum(), "Erro ao criar CourseDetails");
		cd.setCourse(Mockito.mock(Course.class));
		Assertions.assertNotNull(cd.getCourse(), "Erro ao criar CourseDetails");
		ArrayList<FileGroup> list = new ArrayList<FileGroup>();
		int tamanho = 5;
		for (int i = 0; i < tamanho; i++) {
			list.add(Mockito.mock(FileGroup.class));
		}
		cd.setFiles(list);
		Assertions.assertEquals(cd.getFiles().size(), tamanho);

	}

}
