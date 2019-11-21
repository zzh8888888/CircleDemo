package com.sangcomz.fishbun;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;

import com.sangcomz.fishbun.adapter.image.ImageAdapter;

import java.util.ArrayList;

public class Fishton {
    public ImageAdapter imageAdapter;
    public Uri[] pickerImages;

    //BaseParams
    public int maxCount;
    public int minCount;
    public boolean isExceptGif;
    public ArrayList<Uri> selectedImages = new ArrayList<>();

    //CustomizationParams
    public int photoSpanCount;
    public int albumPortraitSpanCount;
    public int albumLandscapeSpanCount;

    public boolean isAutomaticClose;
    public boolean isButton;

    public int colorActionBar;
    public int colorActionBarTitle;
    public int colorStatusBar;

    public boolean isStatusBarLight;
    public boolean isCamera;

    public int albumThumbnailSize;

    public String messageNothingSelected;
    public String messageLimitReached;
    public String titleAlbumAllView;
    public String titleActionBar;

    public Drawable drawableHomeAsUpIndicator;
    public Drawable drawableDoneButton;
    public Drawable drawableAllDoneButton;
    public boolean isUseAllDoneButton;

    public String strDoneMenu;
    public String strAllDoneMenu;
    public int colorTextMenu;

    public boolean isUseDetailView;

    public boolean isShowCount;
    public int colorSelectCircleStroke;

    public boolean isStartInAllView;

    private Fishton() {
        init();
    }

    public void refresh() {
        init();
    }

    private void init() {
        //Adapter
        imageAdapter = null;

        //BaseParams
        maxCount = 10;
        minCount = 1;
        isExceptGif = true;
        selectedImages = new ArrayList<>();

        //CustomizationParams
        photoSpanCount = 3;
        albumPortraitSpanCount = 1;
        albumLandscapeSpanCount = 2;

        isAutomaticClose = false;
        isButton = false;

        colorActionBar = Color.parseColor("#3F51B5");
        colorActionBarTitle = Color.parseColor("#ffffff");
        colorStatusBar = Color.parseColor("#303F9F");

        isStatusBarLight = false;
        isCamera = false;

        albumThumbnailSize = Integer.MAX_VALUE;

        drawableHomeAsUpIndicator = null;
        drawableDoneButton = null;
        drawableAllDoneButton = null;

        strDoneMenu = null;
        strAllDoneMenu = null;

        colorTextMenu = Integer.MAX_VALUE;

        isUseAllDoneButton = false;
        isUseDetailView = true;
        isShowCount = true;

        colorSelectCircleStroke = Color.parseColor("#c1ffffff");
        isStartInAllView = false;
    }

    void setDefaultMessage(Context context) {
        if (messageNothingSelected == null)
            messageNothingSelected = context.getResources().getString(R.string.msg_no_selected);

        if (messageLimitReached == null)
            messageLimitReached = context.getResources().getString(R.string.msg_full_image);

        if (titleAlbumAllView == null)
            titleAlbumAllView = context.getResources().getString(R.string.str_all_view);

        if (titleActionBar == null)
            titleActionBar = context.getResources().getString(R.string.album);
    }

    void setMenuTextColor() {
        if (drawableDoneButton != null
                || drawableAllDoneButton != null
                || strDoneMenu == null
                || colorTextMenu != Integer.MAX_VALUE)
            return;

        if (isStatusBarLight)
            colorTextMenu = Color.BLACK;
    }

    void setDefaultDimen(Context context) {
        if (albumThumbnailSize == Integer.MAX_VALUE)
            albumThumbnailSize = (int) context.getResources().getDimension(R.dimen.album_thum_size);
    }

    public static Fishton getInstance() {
        return FishtonHolder.INSTANCE;
    }

    private static class FishtonHolder {
        public static final Fishton INSTANCE = new Fishton();
    }

    public ImageAdapter getImageAdapter() {
        return imageAdapter;
    }

    public void setImageAdapter(ImageAdapter imageAdapter) {
        this.imageAdapter = imageAdapter;
    }

    public Uri[] getPickerImages() {
        return pickerImages;
    }

    public void setPickerImages(Uri[] pickerImages) {
        this.pickerImages = pickerImages;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public int getMinCount() {
        return minCount;
    }

    public void setMinCount(int minCount) {
        this.minCount = minCount;
    }

    public boolean isExceptGif() {
        return isExceptGif;
    }

    public void setExceptGif(boolean exceptGif) {
        isExceptGif = exceptGif;
    }

    public ArrayList<Uri> getSelectedImages() {
        return selectedImages;
    }

    public void setSelectedImages(ArrayList<Uri> selectedImages) {
        this.selectedImages = selectedImages;
    }

    public int getPhotoSpanCount() {
        return photoSpanCount;
    }

    public void setPhotoSpanCount(int photoSpanCount) {
        this.photoSpanCount = photoSpanCount;
    }

    public int getAlbumPortraitSpanCount() {
        return albumPortraitSpanCount;
    }

    public void setAlbumPortraitSpanCount(int albumPortraitSpanCount) {
        this.albumPortraitSpanCount = albumPortraitSpanCount;
    }

    public int getAlbumLandscapeSpanCount() {
        return albumLandscapeSpanCount;
    }

    public void setAlbumLandscapeSpanCount(int albumLandscapeSpanCount) {
        this.albumLandscapeSpanCount = albumLandscapeSpanCount;
    }

    public boolean isAutomaticClose() {
        return isAutomaticClose;
    }

    public void setAutomaticClose(boolean automaticClose) {
        isAutomaticClose = automaticClose;
    }

    public boolean isButton() {
        return isButton;
    }

    public void setButton(boolean button) {
        isButton = button;
    }

    public int getColorActionBar() {
        return colorActionBar;
    }

    public void setColorActionBar(int colorActionBar) {
        this.colorActionBar = colorActionBar;
    }

    public int getColorActionBarTitle() {
        return colorActionBarTitle;
    }

    public void setColorActionBarTitle(int colorActionBarTitle) {
        this.colorActionBarTitle = colorActionBarTitle;
    }

    public int getColorStatusBar() {
        return colorStatusBar;
    }

    public void setColorStatusBar(int colorStatusBar) {
        this.colorStatusBar = colorStatusBar;
    }

    public boolean isStatusBarLight() {
        return isStatusBarLight;
    }

    public void setStatusBarLight(boolean statusBarLight) {
        isStatusBarLight = statusBarLight;
    }

    public boolean isCamera() {
        return isCamera;
    }

    public void setCamera(boolean camera) {
        isCamera = camera;
    }

    public int getAlbumThumbnailSize() {
        return albumThumbnailSize;
    }

    public void setAlbumThumbnailSize(int albumThumbnailSize) {
        this.albumThumbnailSize = albumThumbnailSize;
    }

    public String getMessageNothingSelected() {
        return messageNothingSelected;
    }

    public void setMessageNothingSelected(String messageNothingSelected) {
        this.messageNothingSelected = messageNothingSelected;
    }

    public String getMessageLimitReached() {
        return messageLimitReached;
    }

    public void setMessageLimitReached(String messageLimitReached) {
        this.messageLimitReached = messageLimitReached;
    }

    public String getTitleAlbumAllView() {
        return titleAlbumAllView;
    }

    public void setTitleAlbumAllView(String titleAlbumAllView) {
        this.titleAlbumAllView = titleAlbumAllView;
    }

    public String getTitleActionBar() {
        return titleActionBar;
    }

    public void setTitleActionBar(String titleActionBar) {
        this.titleActionBar = titleActionBar;
    }

    public Drawable getDrawableHomeAsUpIndicator() {
        return drawableHomeAsUpIndicator;
    }

    public void setDrawableHomeAsUpIndicator(Drawable drawableHomeAsUpIndicator) {
        this.drawableHomeAsUpIndicator = drawableHomeAsUpIndicator;
    }

    public Drawable getDrawableDoneButton() {
        return drawableDoneButton;
    }

    public void setDrawableDoneButton(Drawable drawableDoneButton) {
        this.drawableDoneButton = drawableDoneButton;
    }

    public Drawable getDrawableAllDoneButton() {
        return drawableAllDoneButton;
    }

    public void setDrawableAllDoneButton(Drawable drawableAllDoneButton) {
        this.drawableAllDoneButton = drawableAllDoneButton;
    }

    public boolean isUseAllDoneButton() {
        return isUseAllDoneButton;
    }

    public void setUseAllDoneButton(boolean useAllDoneButton) {
        isUseAllDoneButton = useAllDoneButton;
    }

    public String getStrDoneMenu() {
        return strDoneMenu;
    }

    public void setStrDoneMenu(String strDoneMenu) {
        this.strDoneMenu = strDoneMenu;
    }

    public String getStrAllDoneMenu() {
        return strAllDoneMenu;
    }

    public void setStrAllDoneMenu(String strAllDoneMenu) {
        this.strAllDoneMenu = strAllDoneMenu;
    }

    public int getColorTextMenu() {
        return colorTextMenu;
    }

    public void setColorTextMenu(int colorTextMenu) {
        this.colorTextMenu = colorTextMenu;
    }

    public boolean isUseDetailView() {
        return isUseDetailView;
    }

    public void setUseDetailView(boolean useDetailView) {
        isUseDetailView = useDetailView;
    }

    public boolean isShowCount() {
        return isShowCount;
    }

    public void setShowCount(boolean showCount) {
        isShowCount = showCount;
    }

    public int getColorSelectCircleStroke() {
        return colorSelectCircleStroke;
    }

    public void setColorSelectCircleStroke(int colorSelectCircleStroke) {
        this.colorSelectCircleStroke = colorSelectCircleStroke;
    }

    public boolean isStartInAllView() {
        return isStartInAllView;
    }

    public void setStartInAllView(boolean startInAllView) {
        isStartInAllView = startInAllView;
    }
}
