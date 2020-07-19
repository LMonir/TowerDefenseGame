package map;

import java.util.ArrayList;
import java.util.List;

public class Path {
	private List<PathTile> weg;
	
	public Path() {
		weg = new ArrayList<>();
	}

	public static Path generateRandomPath() {
		return new Path();
	}
}
