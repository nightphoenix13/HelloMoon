package com.bignerdranch.android.hellomoon;

import android.content.*;
import android.media.*;

public class AudioPlayer
{
	private MediaPlayer mPlayer;
	
	public void stop() // stop method start
	{
		if (mPlayer != null)
		{
			mPlayer.release();
			mPlayer = null;
		} // end if
	} // stop method end
	
	public void pause() // pause method start
	{
		if (mPlayer.isPlaying())
		{
			mPlayer.pause();
		}
		else
		{
			mPlayer.start();
		}
	} // pause method end
	
	public void play(Context c) // play method sat
	{
		stop();
		
		mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
		
		mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
		{	
			@Override
			public void onCompletion(MediaPlayer mp)
			{
				stop();
			} // onCompletion method end
		}); // end anonymous inner class
		
		mPlayer.start();
	} // play method end
	
	public boolean isPlaying()
	{
		if (mPlayer.isPlaying())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
