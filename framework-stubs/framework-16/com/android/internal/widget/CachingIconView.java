package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class CachingIconView extends android.widget.ImageView {
    public CachingIconView(android.content.Context p0) { super((android.content.Context)null); }
    public CachingIconView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public CachingIconView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public CachingIconView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    @android.view.RemotableViewMethod(asyncImpl="setImageIconAsync")
    public void setImageIcon(android.graphics.drawable.Icon p0) {}
    @android.annotation.Nullable
    android.graphics.drawable.Drawable loadSizeRestrictedIcon(android.graphics.drawable.Icon p0) { return null; }
    public java.lang.Runnable setImageIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setImageResourceAsync")
    public void setImageResource(int p0) {}
    public java.lang.Runnable setImageResourceAsync(int p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setImageURIAsync")
    public void setImageURI(android.net.Uri p0) {}
    public java.lang.Runnable setImageURIAsync(android.net.Uri p0) { return null; }
    public void setImageDrawable(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod
    public void setImageBitmap(android.graphics.Bitmap p0) {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void setForceHidden(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setVisibility(int p0) {}
    public void setOnVisibilityChangedListener(java.util.function.Consumer<java.lang.Integer> p0) {}
    public void setOnForceHiddenChangedListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    public boolean isForceHidden() { return false; }
    @android.view.RemotableViewMethod
    public void setBackgroundColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setOriginalIconColor(int p0) {}
    public void setGrayedOut(boolean p0) {}
    public int getOriginalIconColor() { return 0; }
    public boolean willBeForceHidden() { return false; }
    public void setWillBeForceHidden(boolean p0) {}
    public int getMaxDrawableWidth() { return 0; }
    public int getMaxDrawableHeight() { return 0; }
}
