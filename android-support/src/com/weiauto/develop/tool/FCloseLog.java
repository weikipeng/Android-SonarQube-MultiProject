package com.weiauto.develop.tool;

import android.util.Log;

/**
 * @Author 彭俊维
 * @Email junwei.peng@downjoy.com
 * @Version 1.0 创建时间： 上午11:25:20 2012 类说明: ()
 */
public final class FCloseLog {

  public static final boolean FLAG = false;

  public static final String TAG = FOpenLog.class.getSimpleName();
  public static final String TAG_URL = "url";
  public static final String TAG_ERROR = "bang_error";

  /**
   * Simple logging helper to prevent producing duplicate code blocks.
   * Log-Message is only printed to LogCat if logging is enabled in MadUtils
   * and message is logable with specified tag and level.
   * 
   * @param tag use a given tag for logging or use default tag if nil. Default
   *            tag can be defined in MadUtil class.
   * @param level log level from {@link android.util.Log}
   * @param message
   * @see android.util.Log
   */
  public static void print(String message) {
      String logTag = TAG;
      if (!FLAG) {
          return;
      }

      if (message == null) {
          message = "";
      }

      String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
      String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
      int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();

      String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
      Log.println(Log.INFO, logTag, logMessage);
  }
  
  public static void i(String message) {
  	String logTag = TAG;
  	if (!FLAG) {
  		return;
  	}
  	
  	if (message == null) {
  		message = "";
  	}
  	
  	String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
  	String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
  	int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
  	
  	String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
  	Log.println(Log.INFO, logTag, logMessage);
  }
  
  public static void print(boolean isPrint,String tag,String message) {
      String logTag = tag;
      if (!FLAG) {
          return;
      }
      
      if(!isPrint){
          return;
      }
      
      if (message == null) {
          message = "";
      }
      
      String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
      String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
      int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
      
      String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
      Log.println(Log.INFO, logTag, logMessage);
  }

  public static void print(String tag, String message) {
      String logTag = tag;
      if (!FLAG) {
          return;
      }

      if (message == null) {
          message = "";
      }

      String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
      String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
      int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();

      String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
      Log.println(Log.INFO, logTag, logMessage);
  }
  
  public static void w(String message) {
  	String logTag = TAG;
  	if (!FLAG) {
  		return;
  	}
  	
  	if (message == null) {
  		message = "";
  	}
  	
  	String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
  	String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
  	int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
  	
  	String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
  	Log.println(Log.WARN, logTag, logMessage);
  }
  
  public static void e(String message) {
  	String logTag = TAG;
  	if (!FLAG) {
  		return;
  	}
  	
  	if (message == null) {
  		message = "";
  	}
  	
  	String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
  	String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
  	int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
  	
  	String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
  	Log.println(Log.WARN, logTag, logMessage);
  }
  
  public static void e(String tag, String message) {
  	String logTag = tag;
  	if (!FLAG) {
  		return;
  	}
  	
  	if (message == null) {
  		message = "";
  	}
  	
  	String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
  	String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
  	int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
  	
  	String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
  	Log.println(Log.WARN, logTag, logMessage);
  }
  
  public static void t(String tag, String message) {
  	String logTag = tag;
  	if (!FLAG) {
  		return;
  	}
  	
  	if (message == null) {
  		message = "";
  	}
  	
  	
  	String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
  	String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
  	int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
  	
  	String logMessage = "thread------> "+Thread.currentThread().getId()+"@"+Thread.currentThread().getName() + "(" + className + ":" + lineNumber + ") : " + message+"   ";
  	Log.println(Log.WARN, logTag, logMessage);
  }
  
  public static void d(String tag, String message) {
  	String logTag = tag;
  	if (!FLAG) {
  		return;
  	}
  	
  	if (message == null) {
  		message = "";
  	}
  	
  	String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
  	String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
  	int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
  	
  	String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
  	Log.println(Log.DEBUG, logTag, logMessage);
  }
  
  public static void d(String message) {
  	String logTag = TAG;
  	if (!FLAG) {
  		return;
  	}
  	
  	if (message == null) {
  		message = "";
  	}
  	
  	String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
  	String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
  	int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
  	
  	String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
  	Log.println(Log.DEBUG, logTag, logMessage);
  }
  
  public static void e(String tag, String message,Throwable thr) {
  	String logTag = tag;
  	if (!FLAG) {
  		return;
  	}
  	
  	if (message == null) {
  		message = "";
  	}
  	
  	String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
  	String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
  	int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
  	
  	String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
  	Log.w(logTag, logMessage, thr);
  }

  public static void i(String message, Throwable thr) {
  	String logTag = TAG;
  	if (!FLAG) {
  		return;
  	}
  	
  	if (message == null) {
  		message = "";
  	}
  	
  	String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
  	String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
  	int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
  	
  	String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
  	Log.i(logTag, logMessage, thr);
  }
  
	public static void e(String message, Throwable thr) {
		String logTag = "wiki";
  	if (!FLAG) {
  		return;
  	}
  	
  	if (message == null) {
  		message = "";
  	}
  	
  	String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
  	String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
  	int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
  	
  	String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
  	Log.w(logTag, logMessage, thr);
	}
	
	public static void d(String message, Throwable thr) {
		String logTag = "wiki";
		if (!FLAG) {
			return;
		}
		
		if (message == null) {
			message = "";
		}
		
		String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
		String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
		int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
		
		String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
		Log.d(logTag, logMessage, thr);
	}
	
	public static void w(String message, Throwable thr) {
		String logTag = TAG;
		if (!FLAG) {
			return;
		}
		
		if (message == null) {
			message = "";
		}
		
		String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
		String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
		int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
		
		String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
		Log.w(logTag, logMessage, thr);
	}
	
  public static void url(String message) {
  	String logTag = TAG_URL;
  	if (!FLAG) {
  		return;
  	}
  	
  	if (message == null) {
  		message = "";
  	}
  	
  	String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
  	String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
  	int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
  	
  	String logMessage = "(" + className + ":" + lineNumber + ") :" + message;
  	Log.println(Log.DEBUG, logTag, logMessage);
  }
  
  public static void printE(String tag, String message) {
  	String logTag = tag;
  	if (!FLAG) {
  		return;
  	}
  	
  	if (message == null) {
  		message = "";
  	}
  	
  	String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
  	String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
  	int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
  	
  	String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
  	Log.println(Log.ERROR, logTag, logMessage);
  }
  
  public static void printE(String message, Throwable thr) {
  	String logTag = TAG_ERROR;
  	if (!FLAG) {
  		return;
  	}
  	
  	if (message == null) {
  		message = "";
  	}
  	
  	String fullClassName = Thread.currentThread().getStackTrace()[3].getClassName();
  	String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
  	int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
  	
  	String logMessage = "(" + className + ":" + lineNumber + ") : " + message;
  	Log.e(logTag, logMessage, thr);
  }

}
