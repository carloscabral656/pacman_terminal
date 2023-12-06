package entities;

import java.util.ArrayList;

public class Map {
	
	protected Integer height;
	protected Integer width;
	protected ArrayList<Integer> obstacles;
	protected ArrayList<Integer> path;
	protected ArrayList<Integer> orbs;
	
	
	public Map() {
		this.height = 25;
		this.width  = 25;
	}
	
	
}
