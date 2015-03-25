package com.weiauto.develop.image;

/*
 * Copyright 2014 Pedro Álvarez Fernández <pedroafa@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView.ScaleType;


public final class RoundedDrawableFactory {
	private ColorStateList mDefalutBorderColorStateList;
	private ScaleType mDefalutScaleType;
	private float mDefaultCornerRadius;
	private float mDefaultBorderWidth;
	private boolean mIsOval = false;
	private Resources mResources;
	public static final int DEFAULT_COLOR = Color.parseColor("#E3E3E3");
//	public static final int DEFAULT_COLOR = Color.parseColor("#FF0000");
	
	public RoundedDrawableFactory(Resources resources){
//		borderColor = resources.getColorStateList(id);
		mResources = resources;
//		mDefalutScaleType = ScaleType.CENTER;
		mDefalutScaleType = ScaleType.FIT_XY;
		DisplayMetrics metrics = mResources.getDisplayMetrics();
		mDefaultCornerRadius = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 3, metrics);
		mDefaultBorderWidth = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1, metrics);
		int[][] states = new int[1][];
		states[0] = new int[]{};
		int[] colors = {DEFAULT_COLOR};
		mDefalutBorderColorStateList = new ColorStateList(states, colors);
//		mDefalutBorderColorStateList = mResources.getColorStateList(R.drawable.defalut_border);
	}

	public RoundedDrawable getRoundedDrawable(Bitmap bitmap){
		return getRoundedDrawable(bitmap, mDefalutScaleType, mDefaultCornerRadius, mDefaultBorderWidth, mDefalutBorderColorStateList, mIsOval);
	}
	
	public RoundedDrawable getRoundedDrawable(Bitmap bitmap,ScaleType scaleType, float cornerRadius,float borderWidth,ColorStateList borderColor,boolean isOval){
		RoundedDrawable drawable = null;
		if(bitmap!=null){
			drawable = RoundedDrawable.fromBitmap(bitmap);
			drawable = drawable.setScaleType(scaleType)
			.setCornerRadius(cornerRadius)
			.setBorderWidth(borderWidth)
			.setBorderColor(borderColor)
			.setOval(isOval);
			
		}
		
		return drawable;
	}
}
