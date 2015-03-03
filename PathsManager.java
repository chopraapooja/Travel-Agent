import java.io.*;
import java.util.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

class PathsManager {
	Map<String, ArrayList> directPaths = new HashMap<String, ArrayList>();
	JSONObject _directPaths;
	PathsManager() {
		directPaths.put("Bangalore", new ArrayList(Arrays.asList("Singapore")));
		directPaths.put("Singapore", new ArrayList(Arrays.asList("Seoul", "Bangalore")));
		directPaths.put("Seoul", new ArrayList(Arrays.asList("Beijing", "Singapore")));
		directPaths.put("Beijing", new ArrayList(Arrays.asList("Tokyo", "Seoul")));
		directPaths.put("Tokyo", new ArrayList(Arrays.asList("Beijing")));

	}
	
	PathsManager(String fileURL) throws Exception{
      	JSONParser parser=new JSONParser();
		_directPaths = (JSONObject) parser.parse(new FileReader(fileURL));
	}

	boolean isDirectPathBetween(String src, String dest) {
		JSONArray directDestinations = (JSONArray)_directPaths.get(src);
		return _directPaths.containsKey(src) && directDestinations.indexOf(dest) != -1; 
	}

	Set<String> getAllSources() {
		return directPaths.keySet();
	}

	Collection<ArrayList> getAllDestinations() {
		return directPaths.values();
	}

	String findPathBetween(String src, String dest, ArrayList<String> visited) {
		if(!isSourceAvailable(src)) {
			return "No city named \""+src+"\" in database";
		}
		if(!isDestinationAvailable(dest)) {
			return "No city named \""+dest+"\" in database";
		}
		if (isDirectPathBetween(src, dest)) {
			return src +"->"+ dest;	
		} 
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

	boolean isSourceAvailable(String src) {
		return directPaths.containsKey(src);
	}
}
class Spike {	
	public static void main(String[] args) {
		try {
			PathsManager mgr = new PathsManager("./paths.txt");
			boolean isDirectPath = mgr.isDirectPathBetween("Bangalore", "Singapore");
			System.out.println(isDirectPath);	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		// System.out.println(mgr.getAllSources());
		// System.out.println(mgr.getAllDestinations());
		// System.out.println(mgr.isDestinationAvailable("Singapore"));
		// System.out.println(mgr.findPathBetween("Bangalore","Tokyo", new ArrayList()));

	}
}