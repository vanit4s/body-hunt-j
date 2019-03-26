package com.bodyhunt.graphics;

public class Render3D extends Render {

	public Render3D(int width, int height) {
		super(width, height);

	}
	
	public void floor() {
		for (int y = 0; y < height; y++) {
			double yD = y - (height / 2); //yD = Y Depth
			double z = (100.0 / yD);
			
			
			for (int x = 0; x < width; x++) {
				double xD = x - (width / 2);
				xD *= z;
				int xx = (int) (xD) & 5;
				pixels[x + y * width] = xx * 128;
				System.out.println(xx);
			}
		}
	}
	
}
