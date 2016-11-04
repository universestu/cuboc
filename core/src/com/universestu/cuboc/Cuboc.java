package com.universestu.cuboc;

import com.universestu.cuboc.screens.MainMenu;
import com.badlogic.gdx.Game;

public class Cuboc extends Game {
	@Override
	public void create () {
		setScreen(new MainMenu(this));
	}
}

