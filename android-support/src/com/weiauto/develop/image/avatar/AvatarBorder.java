package com.weiauto.develop.image.avatar;

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
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class AvatarBorder {

    private Resources mResources;
    
    private int mBorderColor;
    
    private int mBorderWidth;

    private int mSquareWidth;
    
//    public static final int DEFAULT_COLOR = Color.RED;
    public static final int DEFAULT_COLOR = Color.parseColor("#E3E3E3");

    public AvatarBorder(Resources resources) {
        mResources = resources;
        mBorderColor = DEFAULT_COLOR;
        DisplayMetrics metrics = mResources.getDisplayMetrics();
        mBorderWidth = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2, metrics);
        mSquareWidth = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1, metrics);
        
    }
    
    public AvatarBorder(int borderWidth,int color) {
    	mBorderWidth = borderWidth;
    	mBorderColor = color;
	}
    
    public AvatarBorder(Resources resources,int color) {
    	mResources = resources;
    	mBorderColor = color;
    }
    
    public void setColor(int color){
    	mBorderColor = color;
    }

    public int getColor() {
        return mBorderColor;
    }

    public float getRoundWidth() {
        return mBorderWidth;
    }

    public int getSquareWidth() {
        return mSquareWidth;
    }
}
