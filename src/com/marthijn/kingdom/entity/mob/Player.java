package com.marthijn.kingdom.entity.mob;

import com.marthijn.kingdom.graphics.Screen;
import com.marthijn.kingdom.graphics.Sprite;
import com.marthijn.kingdom.input.Keyboard;

public class Player extends Mob {

	private Keyboard input;
	private Sprite sprite;

	public Player(Keyboard input) {
		this.input = input;
		sprite = Sprite.player_forward;
	}

	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
	}

	public void update() {
		int xa = 0, ya = 0;
		if (input.getUp()) ya--;
		if (input.getDown()) ya++;
		if (input.getLeft()) xa--;
		if (input.getRight()) xa++;
		
		if (xa != 0 || ya != 0) move(xa, ya);
	}

	public void render(Screen screen) {
		if (dir == 0) sprite = Sprite.player_forward;
		if (dir == 1) sprite = Sprite.player_right;
		if (dir == 2) sprite = Sprite.player_backward;
		if (dir == 3) sprite = Sprite.player_left;
		screen.renderPlayer(getX() - 16, getY() - 16, sprite);
	}

}
