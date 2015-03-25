package com.weiauto.develop.image;

import android.content.res.Resources;
import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import com.nostra13.universalimageloader.core.imageaware.ImageViewAware;
import com.weiauto.develop.image.avatar.AvatarBorder;
import com.weiauto.develop.image.avatar.BorderedRoundedAvatarDrawable;

public class RoundedBorderedBitmapDisplayer implements BitmapDisplayer {
	private RoundedDrawableFactory factory; 
	
	public RoundedBorderedBitmapDisplayer(Resources resources) {
		factory = new RoundedDrawableFactory(resources);
	}

	@Override
	public void display(Bitmap bitmap, ImageAware imageAware, LoadedFrom loadedFrom) {
		if (!(imageAware instanceof ImageViewAware)) {
			throw new IllegalArgumentException("ImageAware should wrap ImageView. ImageViewAware is expected.");
		}
		imageAware.setImageDrawable(factory.getRoundedDrawable(bitmap));
	}
}
