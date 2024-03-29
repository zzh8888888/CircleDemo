package com.sangcomz.fishbun.adapter.image.impl;

import android.net.Uri;
import android.widget.ImageView;

import com.sangcomz.fishbun.adapter.image.ImageAdapter;
import com.squareup.picasso.Picasso;

/**
 * Created by sangcomz on 23/07/2017.
 */

public class PicassoAdapter implements ImageAdapter {
    @Override
    public void loadImage(ImageView target, Uri loadUrl) {
        Picasso.with(target.getContext())
                .load(loadUrl)
                .fit()
                .centerCrop()
                .into(target);
    }

    @Override
    public void loadDetailImage(ImageView target, Uri loadUrl) {
        Picasso.with(target.getContext())
                .load(loadUrl)
                .fit()
                .centerInside()
                .into(target);
    }
}
