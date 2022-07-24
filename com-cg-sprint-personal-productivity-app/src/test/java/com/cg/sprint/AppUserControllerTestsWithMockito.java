   package com.cg.sprint;
	import static org.junit.jupiter.api.Assertions.assertNotEquals;
	import static org.junit.jupiter.api.Assertions.assertNotNull;

		import org.junit.jupiter.api.Test;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.test.context.SpringBootTest;
		import org.springframework.boot.test.mock.mockito.MockBean;

		import com.cg.sprint.model.AppUser;
		import com.cg.sprint.repository.AppUserRepository;
	import com.cg.sprint.service.AppUserService;
		@SpringBootTest


		public class AppUserControllerTestsWithMockito {
			@Autowired
			AppUserRepository ar;

			@MockBean
			AppUserService as;

			 @Test
			public void testSave() {
				AppUser au = new AppUser();
				au.setUserId(9);
				au.setFirstName("sneha");
				au.setLastName("B");
				au.setPassword("Sneha@123");
				au.setUserName("Sneha");
			    au.setEmailId("sss@abs");
			    ar.save( au);
			    assertNotNull(ar.findById(9).get());
			}

		@Test
	     public void testUpdate() {
			AppUser au = ar.findById(9).get();
			au.setPassword("sneha@111");
			ar.save(au);
			assertNotEquals("sneha@123",ar.findById(9).get().getPassword());
		}
		}
		


