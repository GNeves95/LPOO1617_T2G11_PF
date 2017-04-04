package com.erunner.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.erunner.game.PCMasterRace;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Valve 3";
		config.useGL30 = false;
		config.width = 800;
		config.height = 600;
		
		new LwjglApplication(new PCMasterRace(), config);
	}
}
