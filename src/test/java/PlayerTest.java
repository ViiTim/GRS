import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.viitim.grs.player.PlayerController;

public class PlayerTest {
	
	private PlayerController controller;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		controller = new PlayerController();
	}

	@Test
	public void test() {
	    Result result = JUnitCore.runClasses(PlayerController.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }
	}

}
