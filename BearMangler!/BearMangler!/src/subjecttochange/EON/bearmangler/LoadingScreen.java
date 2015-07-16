package subjecttochange.EON.bearmangler;
import com.subjecttochange.androidgames.framework.Game;
import com.subjecttochange.androidgames.framework.Graphics;
import com.subjecttochange.androidgames.framework.Graphics.PixmapFormat;
import com.subjecttochange.androidgames.framework.Screen;

public class LoadingScreen extends Screen
{

	public LoadingScreen(Game game) 
	{
		super(game);
	}

	@Override
	public void update(float deltaTime) 
	{
		Graphics g = game.getGraphics();
		Assets.bearmangler = g.newPixmap("Bearmangler.png",  PixmapFormat.RGB565);
		
		
		game.setScreen(new GameScreen(game));
		//game.setScreen(new MainMenuScreen(game));
		
	}

	@Override
	public void present(float deltaTime) 
	{
		
	}

	@Override
	public void pause() 
	{
		
	}

	@Override
	public void resume()
	{
		
	}

	@Override
	public void dispose() 
	{
		
	}
	
}
