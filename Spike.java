// import java.util.*;

// class Paths {
// 	Map<String,String[]> paths = new HashMap<String,String[]>();
	
// 	Paths() {
// 		paths.put("Bangalore", new String[]{"Singapore", "Tokyo"});
// 		paths.put("Singapore", new String[]{});
// 		paths.put("Tokyo", new String[]{"Bangalore"});
// 	}

// 	boolean doCityExist(String city) {
// 		return paths.containsKey(city) ? true : false;
// 	}

// 	boolean doesPathExists(String from, String to) throws Exception {
// 		String unknownCity = doCityExist(from) ? (doCityExist(to) ? null : to) : from;
// 		if(unknownCity == null) {
// 			for (String destination : paths.get(from)) {
// 				if(destination.equals(to)) return true;
// 			}
// 			return false;
// 		}
// 		throw new Exception("No city named \""+unknownCity+"\" in database");
// 	}

// 	public static void main(String[] args) {
// 		Paths paths = new Paths();
// 		String from = args[0], to = args[1];
// 		try{
// 			boolean result = paths.doesPathExists(from, to);
// 			System.out.println(result);
// 		}
// 		catch(Exception e) {
// 			System.out.println(e.getMessage());
// 		}
		
// 	}
// }
// -------------------------------------------------------------------------------
// @Test
// 	public void doesPathsExists_from_Bangalore_to_Singapore_should_give_true() throws Exception {
// 		Paths paths = new Paths();
// 		assertTrue(paths.doesPathExists("Bangalore", "Singapore"));
// 	}
// 	@Test
// 	public void doesPathsExists_from_Bangalore_to_Tokyo_should_give_true () throws Exception {
// 		Paths paths = new Paths();
// 		assertTrue(paths.doesPathExists("Bangalore", "Tokyo"));
// 	}
// 	@Test
// 	public void doesPathsExists_from_Tokyo_to_Bangalore_should_give_true () throws Exception {
// 		Paths paths = new Paths();
// 		assertTrue(paths.doesPathExists("Tokyo", "Bangalore"));
// 	}

// 	@Test
// 	public void doCityExist_should_give_false_when_city_doesnot_exist_in_database () {
// 		Paths paths = new Paths();
// 		assertFalse(paths.doCityExist("Chennai"));
// 	}

// 	@Test
// 	public void doCityExist_should_give_true_when_city_exists_in_database () {
// 		Paths paths = new Paths();
// 		assertTrue(paths.doCityExist("Bangalore"));
// 	}

// 	@Test(expected = java.lang.Exception.class)
// 	public void doesPathsExists_from_Chennai_to_Tokyo_should_throw_Chennai_City_donot_exist_exception () throws Exception{
// 		Paths paths = new Paths();
// 		paths.doesPathExists("Chennai", "Tokyo");	
// 	}
// 	@Test(expected = java.lang.Exception.class)
// 	public void doesPathsExists_from_Bangalore_to_Stockholm_should_throw_Stockholm_City_donot_exist_exception () throws Exception{
// 		Paths paths = new Paths();
// 		paths.doesPathExists("Bangalore", "Stockholm");
// 	}