package com.bodyhunt.graphics;

import java.util.Random;

import com.bodyhunt.Game;

public class Screen extends Render {
	
	//private Render r;
	private Render3D render;
	
	public Screen(int width, int height) {
		super(width, height);
		
		Random random = new Random();
		//r = new Render(256, 256);
		render = new Render3D(width, height);
		
		/*for (int i = 0; i < (256 * 256); i++) {
			r.pixels[i] = random.nextInt() * (random.nextInt(5) / 4);
		}*/
	}
	
	public void render(Game game) {
		for (int i = 0; i < width * height; i++) {
			pixels[i] = 0;
		}
		
		for (int i = 0; i < 50; i++) {
			/*int anim = (int) (Math.sin((game.time + i * 2) % 1000.0 / 100) * 100);
			int anim2 = (int) (Math.cos((game.time + i * 2) % 1000.0 / 100) * 100);
			
			draw(r, (width - 256) / 2 + anim, (height - 256) / 2 + anim2);*/
		}
		render.floor();
		draw(render, 0, 0);
	}

}
