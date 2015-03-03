import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class PathsTest {
	@Test
	public void isDirectPathBetween_Bangalore_and_Singapore_should_give_true()throws Exception{
		PathsManager mgr = new PathsManager("./paths.txt");
		boolean isDirectPath = mgr.isDirectPathBetween("Bangalore", "Singapore");
		assertTrue(isDirectPath);
	}
	
	@Test
	public void isDirectPathBetween_Bangalore_and_Tokyo_should_give_false()throws Exception{
		PathsManager mgr = new PathsManager("./paths.txt");
		boolean isDirectPath = mgr.isDirectPathBetween("Bangalore", "Tokyo");
		assertFalse(isDirectPath);
	}

	@Test
	public void isDirectPathBetween_Bangalore_and_UnknownCity_should_give_false()throws Exception{
		PathsManager mgr = new PathsManager("./paths.txt");
		boolean isDirectPath = mgr.isDirectPathBetween("Bangalore", "UnknownCity");
		assertFalse(isDirectPath);
	}

	@Test
	public void isDirectPathBetween_UnknownCity1_and_UnknownCity2_should_give_false()throws Exception{
		PathsManager mgr = new PathsManager("./paths.txt");
		boolean isDirectPath = mgr.isDirectPathBetween("UnknownCity1", "UnknownCity2");
		assertFalse(isDirectPath);
	}

	@Test
	public void getAllSources_should_give_all_source_cities()throws Exception{
		PathsManager mgr = new PathsManager("./paths.txt");
		Set<String> sources = mgr.getAllSources();
		Set<String> expected = new HashSet(Arrays.asList("Bangalore", "Singapore", "Seoul", "Beijing", "Tokyo"));
		assertTrue(sources.equals(expected));		
	}
}