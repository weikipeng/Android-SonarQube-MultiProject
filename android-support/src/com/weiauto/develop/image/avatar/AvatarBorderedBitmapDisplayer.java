package com.weiauto.develop.image.avatar;

import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import com.nostra13.universalimageloader.core.imageaware.ImageViewAware;

public class AvatarBorderedBitmapDisplayer implements BitmapDisplayer {
	private AvatarBorder avatarBorder; 
	
	public AvatarBorderedBitmapDisplayer(int width, int color) {
		avatarBorder = new AvatarBorder(width,color);
	}

	@Override
	public void display(Bitmap bitmap, ImageAware imageAware, LoadedFrom loadedFrom) {
		if (!(imageAware instanceof ImageViewAware)) {
			throw new IllegalArgumentException("ImageAware should wrap ImageView. ImageViewAware is expected.");
		}
		imageAware.setImageDrawable(new BorderedRoundedAvatarDrawable(avatarBorder, bitmap));
	}
}
