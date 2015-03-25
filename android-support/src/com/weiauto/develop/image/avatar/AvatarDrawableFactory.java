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
import android.graphics.Bitmap;



public class AvatarDrawableFactory {

    private final AvatarBorder mAvatarBorder;

    public AvatarDrawableFactory(Resources resources) {
        mAvatarBorder = new AvatarBorder(resources);
    }

    public RoundedAvatarDrawable getRoundedAvatarDrawable(Bitmap bitmap) {
        return new RoundedAvatarDrawable(bitmap);
    }

    public BorderedRoundedAvatarDrawable getBorderedRoundedAvatarDrawable(Bitmap bitmap) {
        return getBorderedRoundedAvatarDrawable(mAvatarBorder, bitmap);
    }
    
    public BorderedRoundedAvatarDrawable getBorderedRoundedAvatarDrawable(AvatarBorder avatarBorder,Bitmap bitmap) {
    	return new BorderedRoundedAvatarDrawable(avatarBorder, bitmap);
    }
    
    public void setBorderColor(int color){
    	mAvatarBorder.setColor(color);
    }
}
