package com.weiauto.develop.tool;

import android.view.MotionEvent;

public final class MotionEventTool {
	private MotionEventTool() {
	}
	
	public static final String getActionLOGName(MotionEvent ev){
		String result = "	UNKNOWN		";
				
		switch (ev.getAction()) {
		case MotionEvent.ACTION_DOWN:
			result = "ACTION_DOWN";
			break;
		case MotionEvent.ACTION_CANCEL:
			result = "ACTION_CANCEL";
			break;
		case MotionEvent.ACTION_UP:
			result = "ACTION_UP";
			break;
		case MotionEvent.ACTION_MOVE:
			result = "ACTION_MOVE";
			break;

		default:
			break;
		}
		
		return result;
	}
}
