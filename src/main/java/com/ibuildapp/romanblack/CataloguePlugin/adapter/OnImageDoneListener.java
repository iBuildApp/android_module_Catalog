/****************************************************************************
 * *
 * Copyright (C) 2014-2015 iBuildApp, Inc. ( http://ibuildapp.com )         *
 * *
 * This file is part of iBuildApp.                                          *
 * *
 * This Source Code Form is subject to the terms of the iBuildApp License.  *
 * You can obtain one at http://ibuildapp.com/license/                      *
 * *
 ****************************************************************************/
package com.ibuildapp.romanblack.CataloguePlugin.adapter;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * callback for image download event
 */
public interface OnImageDoneListener {

    int REACTION_DEFAULT = 11003;
    int REACTION_JUST_DOWNLOAD = 11004;

    /**
     * callback when image downloadaed
     *
     * @param imageHolder         -
     * @param image               - image bitmap
     * @param downloadedImagePath - downloaded image path
     */
    public void onImageLoaded(int uid, ImageView imageHolder, String name, Bitmap image, String downloadedImagePath, int reactionType);
}
