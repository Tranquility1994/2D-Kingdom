package com.marthijn.kingdom.entity.mob;

import com.marthijn.kingdom.entity.Entity;
import com.marthijn.kingdom.graphics.Sprite;

public abstract class Mob extends Entity {
	
	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;
	
	public void move() {
		
	}
	
	public void update() {
		
	}
	
	private boolean collision() {
		return false;
	}

}
