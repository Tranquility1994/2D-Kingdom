package com.marthijn.kingdom.level.tile;

import com.marthijn.kingdom.graphics.Screen;
import com.marthijn.kingdom.graphics.Sprite;

public class GrassTile extends Tile {

	public GrassTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x, y, this);
	}

}
