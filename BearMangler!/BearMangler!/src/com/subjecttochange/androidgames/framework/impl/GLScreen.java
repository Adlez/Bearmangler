package com.subjecttochange.androidgames.framework.impl;

import com.subjecttochange.androidgames.framework.Game;
import com.subjecttochange.androidgames.framework.Screen;

public abstract class GLScreen extends Screen {
    protected final GLGraphics glGraphics;
    protected final GLGame glGame;
    
    public GLScreen(Game game) {
        super(game);
        glGame = (GLGame)game;
        glGraphics = glGame.getGLGraphics();
    }
}
