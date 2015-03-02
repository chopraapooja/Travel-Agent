import java.util.*;

class Paths {
	Map<String,String[]> paths = new HashMap<String,String[]>();
	
	Paths() {
		paths.put("Bangalore", new String[]{"Singapore", "Tokyo"});
		paths.put("Singapore", new String[]{"Bangalore"});
		paths.put("Tokyo", new String[]{"Bangalore"});
	}

	boolean doesPathExists(String from, String to) {
		if(paths.containsKey(from)) {
			for (String destination : paths.get(from)) {
				if(destination.equals(to)) return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Paths paths = new Paths();
		String from = args[0], to = args[1];
		boolean result = paths.doesPathExists(from, to);
		System.out.println(result);
	}
}