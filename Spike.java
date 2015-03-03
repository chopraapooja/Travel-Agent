import java.util.*;

class PathsManager {
	Map<String, ArrayList> directPaths = new HashMap<String, ArrayList>();
	PathsManager() {
		directPaths.put("Bangalore", new ArrayList(Arrays.asList("Singapore")));
		directPaths.put("Singapore", new ArrayList(Arrays.asList("Seoul", "Bangalore")));
		directPaths.put("Seoul", new ArrayList(Arrays.asList("Beijing", "Singapore")));
		directPaths.put("Beijing", new ArrayList(Arrays.asList("Tokyo", "Seoul")));
		directPaths.put("Tokyo", new ArrayList(Arrays.asList("Beijing")));

	}
	boolean isDirectPathBetween(String src, String dest) {
		ArrayList directDestinations =  (ArrayList)directPaths.get(src);
		return directPaths.containsKey(src) && directDestinations.indexOf(dest) != -1; 
	}

	Set<String> getAllSources() {
		return directPaths.keySet();
	}

	Collection<ArrayList> getAllDestinations() {
		return directPaths.values();
	}

	String findPathBetween(String src, String dest, ArrayList<String> visited) {
		if (isDirectPathBetween(src, dest)) return src +"->"+ dest;
		visited.add(src);
		for (Object key : directPaths.get(src)) {
			if(visited.indexOf(key) == -1) {
				return src +"->"+ findPathBetween((String)key, dest, visited);  	
			}
		}
		return null;
	}

	boolean isDestinationAvailable(String destination) {
		Collection<ArrayList> destLists= getAllDestinations();
		for (ArrayList destList : destLists) {
			if (destList.contains(destination)) return true;
		}
		return false;
	}
}
class Spike {	
	public static void main(String[] args) {
		PathsManager mgr = new PathsManager();
		boolean isDirectPath = mgr.isDirectPathBetween("Bangalore", "Singapore");
		System.out.println(isDirectPath);	
		System.out.println(mgr.getAllSources());
		System.out.println(mgr.getAllDestinations());
		System.out.println(mgr.isDestinationAvailable("Singapore"));
		System.out.println(mgr.findPathBetween("Tokyo", "Bangalore", new ArrayList()));

	}
}