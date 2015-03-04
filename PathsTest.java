import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.*;

public class PathsTest {
	PathsManager mgr = new PathsManager();
	
	@Test
	public void isDirectPathBetween_Bangalore_and_Singapore_should_be_true(){
		boolean isDirectPath = mgr.isDirectPathBetween("Bangalore", "Singapore");
		assertTrue(isDirectPath);
	}
	
	@Test
	public void isDirectPathBetween_Bangalore_and_Tokyo_should_give_false(){
		boolean isDirectPath = mgr.isDirectPathBetween("Bangalore", "Tokyo");
		assertFalse(isDirectPath);
	}

	@Test
	public void isDirectPathBetween_Bangalore_and_UnknownCity_should_give_false(){
		boolean isDirectPath = mgr.isDirectPathBetween("Bangalore", "UnknownCity");
		assertFalse(isDirectPath);
	}

	@Test
	public void isDirectPathBetween_UnknownCity1_and_UnknownCity2_should_give_false(){
		boolean isDirectPath = mgr.isDirectPathBetween("UnknownCity1", "UnknownCity2");
		assertFalse(isDirectPath);
	}

	// @Test
	// public void getAllSources_should_give_all_source_cities()throws Exception{
	// 	PathsManager mgr = new PathsManager("./paths.txt");
	// 	Set<String> sources = mgr.getAllSources();
	// 	Set<String> expected = new HashSet(Arrays.asList("Bangalore", "Singapore", "Seoul", "Beijing", "Tokyo"));
	// 	assertTrue(sources.equals(expected));		
	// }
	// @Test
	// public void isDestinationAvailable_of_Bangalore_should_give_true()throws Exception{
	// 	PathsManager mgr = new PathsManager("./paths.txt");
	// 	assertTrue(mgr.isDestinationAvailable("Bangalore"));
	// }
	// @Test
	// public void isDestinationAvailable_of_Chennai_should_give_false()throws Exception{
	// 	PathsManager mgr = new PathsManager("./paths.txt");
	// 	assertFalse(mgr.isDestinationAvailable("Chennai"));
	// }

	// @Test
	// public void findPathbetween_Bangalore_and_Singapore_should_give_direct_path_Bangalore_TO_Singapore()throws Exception {
	// 	PathsManager mgr = new PathsManager("./paths.txt");
	// 	String path = mgr.findPathBetween("Bangalore","Singapore", new ArrayList());
	// 	String expected = "Bangalore->Singapore";
	// 	assertTrue(path.equals(expected));
	// }

	// @Test
	// public void findPathbetween_Bangalore_and_Tokyo_should_give_indirect_path_Bangalore_TO_Singapore_TO_Seoul_TO_Beijing_TO_Tokyo()throws Exception {
	// 	PathsManager mgr = new PathsManager("./paths.txt");
	// 	String path = mgr.findPathBetween("Bangalore","Tokyo", new ArrayList());
	// 	String expected = "Bangalore->Singapore->Seoul->Beijing->Tokyo";
	// 	assertTrue(path.equals(expected));
	// }

	// @Test
	// public void findPathbetween_Tokyo_and_Bangalore_should_give_indirect_path_Tokyo_TO_Beijing_TO_Seoul_TO_Singapore_TO_Bangalore()throws Exception {
	// 	PathsManager mgr = new PathsManager("./paths.txt");
	// 	String path = mgr.findPathBetween("Tokyo","Bangalore", new ArrayList());
	// 	String expected = "Tokyo->Beijing->Seoul->Singapore->Bangalore";
	// 	assertTrue(path.equals(expected));
	// }

	// @Test
	// public void findPathbetween_Chennai_and_Tokyo_should_give_No_city_named_Chennai_in_database()throws Exception {
	// 	PathsManager mgr = new PathsManager("./paths.txt");
	// 	String path = mgr.findPathBetween("Chennai","Tokyo", new ArrayList());
	// 	String expected = "No city named \"Chennai\" in database";
	// 	assertTrue(path.equals(expected));
	// }

	// @Test
	// public void findPathbetween_Bangalore_and_Stockholm_should_give_No_city_named_Stockholm_in_database()throws Exception {
	// 	PathsManager mgr = new PathsManager("./paths.txt");
	// 	String path = mgr.findPathBetween("Bangalore","Stockholm", new ArrayList());
	// 	String expected = "No city named \"Stockholm\" in database";
	// 	assertTrue(path.equals(expected));
	// }
}