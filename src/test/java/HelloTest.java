import static org.junit.Assert.assertNotNull;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.mkyong.WelcomeController;

@RunWith(SpringRunner.class)
class HelloTest {
	
	@Autowired
	private WelcomeController welcomeController;

	@Test
	void test() {
		HashMap h = new HashMap<>();
		h.put("Hello", new Object());
		assertNotNull(welcomeController.welcome(h));
	}

}
