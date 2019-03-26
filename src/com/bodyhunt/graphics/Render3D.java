package com.bodyhunt.graphics;

import com.bodyhunt.Game;

public class Render3D extends Render {

	public Render3D(int width, int height) {
		super(width, height);

	}
	
	public void floor(Game game) {
		
		double floorPos = 8;
		double ceilingPos = 8;
		double forward = game.controls.z;
		double right = game.controls.x;
		
		double rotation = game.controls.rotation;
		double cosine = Math.cos(rotation);
		double sine = Math.sin(rotation);
		
		for (int y = 0; y < height; y++) {
			double ceiling = (y + -height / 2.0) / height;
			
			double z = floorPos / ceiling; //Floor height
			
			if (ceiling < 0) {
				z = ceilingPos / -ceiling; //Ceiling height (1000 = sky)
			}
						
			for (int x = 0; x < width; x++) {
				double depth = (x - width / 2.0) / height;
				depth *= z;
				double xx = depth * cosine + z * sine;
				double yy = z * cosine - depth * sine;
				int xPix = (int) (xx + right);
				int yPix = (int) (yy + forward);
				pixels[x + y * width] = ((xPix & 15) * 16) | ((yPix & 15) * 16) << 8;
			}
		}
	}
	
}
