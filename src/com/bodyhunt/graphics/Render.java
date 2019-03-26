package com.bodyhunt.graphics;

public class Render {
	
	public final int width;
	public final int height;
	public final int[] pixels;
	
	public Render(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}
	
	//xO, yO - offsets
	public void draw(Render render, int xO, int yO) {
		for (int y = 0 ;y < render.height; y++) {
			int yPix = y + yO;
			if (yPix < 0 || yPix >= 600) {
				continue;
			}
			
			for (int x = 0; x < render.width; x++) {
				int xPix = x + xO;
				if (xPix < 0 || xPix >= 800) {
					continue;
				}
				
				pixels[xPix + yPix * width] = render.pixels[x + y * render.width];
			}
		}
	}
}
