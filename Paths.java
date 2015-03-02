import java.util.*;

class Paths {
	Map<String,String[]> paths = new HashMap<String,String[]>();
	
	Paths() {
		paths.put("Bangalore", new String[]{"Singapore", "Tokyo"});
		paths.put("Singapore", new String[]{"Bangalore"});
		paths.put("Tokyo", new String[]{"Bangalore"});
	}

	boolean doCityExist(String city) {
		return paths.containsKey(city) ? true : false;
	}

	boolean doesPathExists(String from, String to) throws Exception {
		String unknownCity = doCityExist(from) ? (doCityExist(to) ? null : to) : from;
		if(unknownCity == null) {
			for (String destination : paths.get(from)) {
				if(destination.equals(to)) return true;
			}
			return false;
		}
		throw new Exception("No city named \""+unknownCity+"\" in database");
	}

	public static void main(String[] args) {
		Paths paths = new Paths();
		String from = args[0], to = args[1];
		try{
			boolean result = paths.doesPathExists(from, to);
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}