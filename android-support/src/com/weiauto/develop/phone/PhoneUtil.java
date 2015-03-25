package com.weiauto.develop.phone;

import java.io.IOException;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;
import android.os.Vibrator;
import android.text.TextUtils;

public class PhoneUtil {
	private PhoneUtil(){
		
	}
	
	public static final long[] DEAFULT_VIBRATE_PATTERN = {0, 300, 200, 300};

    public static void openByDefaultBrowser(Context context,String url){
        if(TextUtils.isEmpty(url)){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
    }
	
	/**跳转至拨号界面*/
	public static final void makeCall(Context context,String phoneUri){
		if(!TextUtils.isEmpty(phoneUri) && context!=null){
			if(!phoneUri.contains("tel:")){
				phoneUri = "tel:"+phoneUri;
			}
			Intent phoneIntent = new Intent("android.intent.action.CALL", 
					Uri.parse(phoneUri));
			phoneIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//启动 
			context.startActivity(phoneIntent);    
		}
	}
	
	/**跳转至拨号界面*/
	public static final void startDial(Context context,String phoneUri){
		if(!TextUtils.isEmpty(phoneUri) && context!=null){
			if(!phoneUri.contains("tel:")){
				phoneUri = "tel:"+phoneUri;
			}
			
			Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse(phoneUri));
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			
			//启动 
			context.startActivity(intent);    
		}
	}
	

	
	public static final void playSystemNotificationSound(Context context){
//		try {
//		    Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
//		    Ringtone r = RingtoneManager.getRingtone(context, notification);
//		    r.play();
//		} catch (Exception e) {
//		    e.printStackTrace();
//		}
		
		
		Uri defaultRingtoneUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

		MediaPlayer mediaPlayer = new MediaPlayer();

		try {
		      mediaPlayer.setDataSource(context, defaultRingtoneUri);
		      mediaPlayer.setAudioStreamType(AudioManager.STREAM_NOTIFICATION);
		      mediaPlayer.prepare();
		      mediaPlayer.setOnCompletionListener(new OnCompletionListener() {

		         @Override
		         public void onCompletion(MediaPlayer mp)
		         {
		            mp.release();
		         }
		      });
		  mediaPlayer.start();
		} catch (IllegalArgumentException e) {
		 e.printStackTrace();
		} catch (SecurityException e) {
		 e.printStackTrace();
		} catch (IllegalStateException e) {
		 e.printStackTrace();
		} catch (IOException e) {
		 e.printStackTrace();
		}
	}
	
	@SuppressLint("NewApi")
	public static final void vibrateDefault(Context context){
		 Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
		 // Vibrate for 500 milliseconds
//		 v.vibrate(500);
		 
//		 long[] pattern = {0, 100, 1000};
//		 v.vibrate(pattern,0);
		 if(VERSION.SDK_INT >=VERSION_CODES.HONEYCOMB){
			 if(v.hasVibrator()){
//				 long[] pattern = {0, 100, 1000, 300, 200, 100, 500, 200, 100};
				 v.vibrate(DEAFULT_VIBRATE_PATTERN,-1);
			 }
		 }else{
//			 long[] pattern = {0, 100, 1000, 300, 200, 100, 500, 200, 100};
			 v.vibrate(DEAFULT_VIBRATE_PATTERN,-1);
		 }
		 
	}
}
