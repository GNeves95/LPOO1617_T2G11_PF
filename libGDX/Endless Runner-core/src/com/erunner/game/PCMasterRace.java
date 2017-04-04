package com.erunner.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PCMasterRace extends Game {
	/**
	 * Manages the game assets
	 */
	private AssetManager assetManager;

	/**
	 * The sprite batch used for drawing to the screen
	 */
	private SpriteBatch batch;

	Texture img;

	@Override
	public void create () {
		assetManager = new AssetManager();
		batch = new SpriteBatch();
		//img = new Texture("badlogic.jpg");
		setScreen(new GameScreen(this));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.9f, 0.9f, 1, 0.1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	
	public AssetManager getAssetManager(){
		return assetManager;
	}
	
	public SpriteBatch getBatch(){
		return batch;
	}
}
