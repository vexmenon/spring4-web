package repo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.web.model.UserRole;
import com.web.repository.UserRoleRepository;

import config.TestConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class RepositoryTest {
	
	@Autowired
	@Qualifier("userRoleRepo")
	UserRoleRepository userRoleRepo;
	
	
	@Test
	public void contextSet() {
		try {
			UserRole ur = userRoleRepo.findById(1);
			assertTrue(ur.getUserRoleCd().equals("ROLE_ADMIN"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
