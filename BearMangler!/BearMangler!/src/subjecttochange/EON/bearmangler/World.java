package subjecttochange.EON.bearmangler;

import java.util.Random;

public class World 
{
	static final int WORLD_WIDTH = 10;
    static final int WORLD_HEIGHT = 13;
    static final int SCORE_INCREMENT = 10;
    static final float TICK_INITIAL = 0.5f;
    static final float TICK_DECREMENT = 0.05f;

    //public Snake snake;
    //public Stain stain;
    public boolean gameOver = false;;
    public int score = 0;

    boolean fields[][] = new boolean[WORLD_WIDTH][WORLD_HEIGHT];
    Random random = new Random();
    float tickTime = 0;
    float tick = TICK_INITIAL;

    public World() 
    {
    //    snake = new Snake();
    //    placeStain();
    }



    public void update(float deltaTime) 
	{
        if (gameOver)
            return;

        tickTime += deltaTime;

        while (tickTime > tick) 
        {
            tickTime -= tick;
            //snake.advance();
           // if (snake.checkBitten()) 
            {
                gameOver = true;
                return;
            }

          //  SnakePart head = snake.parts.get(0);
          //  if (head.x == stain.x && head.y == stain.y) 
          /*  {
                score += SCORE_INCREMENT;
               // snake.eat();
               // if (snake.parts.size() == WORLD_WIDTH * WORLD_HEIGHT) 
                {
                    gameOver = true;
                    return;
                }
              //  else 
                {
                    //placeStain();
                }

                if (score % 100 == 0 && tick - TICK_DECREMENT > 0) 
                {
                    tick -= TICK_DECREMENT;
                }
            }*/
        }
    }
}
