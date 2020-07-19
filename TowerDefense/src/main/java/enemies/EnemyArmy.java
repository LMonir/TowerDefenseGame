package enemies;

import java.util.ArrayList;
import java.util.List;

public class EnemyArmy {
	List<Enemy> enemies;
	
	public EnemyArmy() {
		enemies = new ArrayList<>();
	}
	
	public void addEnemy(Enemy enemy) {
		enemies.add(enemy);
	}
	
	public void removeEnemy(Enemy enemy) {
		enemies.remove(enemy);
	}
	
	public int findEnemy(Enemy enemy) {
		for (int i = 0; i < enemies.size(); i++) {
			if (enemy.equals(enemies.get(i)))
				return i;
		}
		return -1;
	}
}
