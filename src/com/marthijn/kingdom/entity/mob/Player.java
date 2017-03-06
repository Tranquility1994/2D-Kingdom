package com.marthijn.kingdom.entity.mob;

import com.marthijn.kingdom.graphics.Screen;
import com.marthijn.kingdom.graphics.Sprite;
import com.marthijn.kingdom.input.Keyboard;

public class Player extends Mob {

	private Keyboard input;

	public Player(Keyboard input) {
		this.input = input;
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
		int xx = getX() - 16;
		int yy = getY() - 16;
		screen.renderPlayer(xx, yy, Sprite.player0);
		screen.renderPlayer(xx + 16, yy, Sprite.player1);
		screen.renderPlayer(xx, yy + 16, Sprite.player2);
		screen.renderPlayer(xx + 16, yy + 16, Sprite.player3);
	}

}
