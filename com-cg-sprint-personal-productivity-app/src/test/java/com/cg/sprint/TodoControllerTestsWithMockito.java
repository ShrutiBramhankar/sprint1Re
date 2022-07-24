	package com.cg.sprint;

	 import static org.assertj.core.api.Assertions.assertThat;
		
		import static org.junit.jupiter.api.Assertions.assertNotNull;
		import java.util.List;

		import org.junit.jupiter.api.Test;
		import org.springframework.beans.factory.annotation.Autowired;
			import org.springframework.boot.test.context.SpringBootTest;
			import org.springframework.boot.test.mock.mockito.MockBean;
			import com.cg.sprint.controller.TodoController;

		import com.cg.sprint.model.Todo;
		import com.cg.sprint.repository.TodoRepository;
		import com.cg.sprint.service.TodoService;

			
			@SpringBootTest
			public class TodoControllerTestsWithMockito {

				@Autowired
				TodoRepository tr;
				@Autowired
				TodoController tc;

				@MockBean
				TodoService ts;

				@Test
				public void testSaveRegistration() {
					Todo t = new Todo();
					t.setTaskId(3);
					t.setTaskName("gymming");
					t.setStartTime("7am");
					t.setEndTime("8pm");
					t.setDate("25");
				    t.setLocation("mumbai");
				    tc.saveRegistration(t);
				     assertNotNull(tc.deleteTaskById(4));
				     
				}
				@Test
				public void testReadAll() {
					List<Todo>list = tr.findAll();
					assertThat(list).size().isGreaterThan(0);
				}
			
//				@Test
//				public void testDelete() {
//				tr.deleteById(11);
//				assertThat(tr.existsById(11)).isFalse();
//				}
			}
				
				
				

		


