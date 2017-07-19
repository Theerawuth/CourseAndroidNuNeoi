package com.example.theerawuth_p.liveat500px.configuration;

import android.content.Context;

import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.DecodeFormat;

import java.lang.annotation.Annotation;

/**
 * Created by theerawuth_p on 7/19/17.
 */

public class GildeConfiguration implements com.bumptech.glide.module.GlideModule {
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        builder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888);

    }

    @Override
    public void registerComponents(Context context, Registry registry) {

    }
}
