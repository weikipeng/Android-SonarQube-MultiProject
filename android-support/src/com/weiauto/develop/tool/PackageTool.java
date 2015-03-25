package com.weiauto.develop.tool;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public class PackageTool {
	
	private PackageTool(){
		
	}
	/**获取当前软件的当前版本*/
	public static final int getVersionCode(Context context){
		PackageManager packageManager = context.getPackageManager();
		int versionCode = -1;
		try {
			PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
			versionCode = packageInfo.versionCode;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		
		return versionCode;
	}
}
