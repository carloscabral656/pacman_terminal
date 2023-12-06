package structures;

import java.util.ArrayList;
import java.util.Map;

public final class MapStruct extends Struct {
	
	private Integer height;
	private Integer width;
	private Map<Map<Integer, Integer>, Struct> struct;
	private ArrayList<Integer> path;
	private ArrayList<Integer> obstacles;
	private ArrayList<Integer> orbs;
	
	private static final MapStruct INSTANCE = null;
	
	private MapStruct() {
		
	}
	
	public static MapStruct getInstance() {
		if(INSTANCE == null) {
			return new MapStruct(); 
		}
		return INSTANCE;
	}
}
