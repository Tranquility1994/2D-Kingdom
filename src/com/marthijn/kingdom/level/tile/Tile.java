package com.marthijn.kingdom.level.tile;

import com.marthijn.kingdom.graphics.Screen;
import com.marthijn.kingdom.graphics.Sprite;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	public static Tile grassTile = new GrassTile(Sprite.grass);
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen) {
		
	}
	
	public boolean solid() {
		return false;
	}

}
