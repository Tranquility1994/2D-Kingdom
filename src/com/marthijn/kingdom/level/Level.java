package com.marthijn.kingdom.level;

import com.marthijn.kingdom.graphics.Screen;
import com.marthijn.kingdom.level.tile.Tile;

public class Level {

	protected int width, height;
	protected int[] tiles;

	public Level(int width, int height) {
		this.width = width;
		this.height = height;
		tiles = new int[width * height];
		generateLevel();
	}

	public Level(String path) {
		loadLevel(path);
	}

	protected void generateLevel() {

	}

	private void loadLevel(String path) {

	}

	public void update() {

	}

	// private void time() {
	//
	// }

	public void render(int xScroll, int yScroll, Screen screen) {
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.getWidth()) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.getHeight() >> 4);
	}

	public Tile getTile(int x, int y) {
		if (tiles[x + y * width] == 0)
			return Tile.grassTile;
		return Tile.voidTile;
	}

}
