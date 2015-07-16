package subjecttochange.EON.bearmangler;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.subjecttochange.androidgames.framework.*;
import com.subjecttochange.androidgames.framework.impl.*;
import com.subjecttochange.androidgames.framework.gl.*;
import com.subjecttochange.androidgames.framework.math.*;

public class MainActivity extends AndroidGame
{
	public Screen getStartScreen()
	{
		return new LoadingScreen(this);
	}
}
