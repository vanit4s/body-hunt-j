package com.bodyhunt.graphics;

import java.util.Random;

public class Screen extends Render {
	
	private Render r;

	public Screen(int width, int height) {
		super(width, height);
		
		Random random = new Random();
		r = new Render(256, 256);
		
		for (int i = 0; i < (256 * 256); i++) {
			r.pixels[i] = random.nextInt();
		}
	}
	
	public void render() {
		for (int i = 0; i < width * height; i++) {
			pixels[i] = 0;
		}
		
		for (int i = 0; i < 200; i++) {
			int anim = (int) (Math.sin((System.currentTimeMillis() + i) % 2000.0/2000 * Math.PI * 2) * 200);
			int anim2 = (int) (Math.cos((System.currentTimeMillis() + i) % 2000.0/2000 * Math.PI * 2) * 200);
			
			draw(r, (width - 256) / 2 + anim, (height - 256) / 2 - anim2);
		}
	}

}
