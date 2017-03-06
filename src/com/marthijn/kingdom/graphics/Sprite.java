package com.marthijn.kingdom.graphics;

public class Sprite {

	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;

	public static Sprite grassSprite = new Sprite(16, 0, 0, SpriteSheet.tiles);
	public static Sprite voidSprite = new Sprite(16, 0x339BF5);

	// Player Sprites
	public static Sprite player0 = new Sprite(16,  0, 10, SpriteSheet.tiles);
	public static Sprite player1 = new Sprite(16,  1, 10, SpriteSheet.tiles);
	public static Sprite player2 = new Sprite(16,  0, 11, SpriteSheet.tiles);
	public static Sprite player3 = new Sprite(16,  1, 11, SpriteSheet.tiles);

	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
		load();
	}

	public Sprite(int size, int color) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		setColor(color);
	}

	private void setColor(int color) {
		for (int i = 0; i < SIZE * SIZE; i++) {
			pixels[i] = color;
		}
	}

	private void load() {
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.getPixels((x + this.x) + (y + this.y) * sheet.getSize());
			}
		}
	}

	public int getSize() {
		return this.SIZE;
	}

	public int getPixels(int index) {
		return this.pixels[index];
	}

}
