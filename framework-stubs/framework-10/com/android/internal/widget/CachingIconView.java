package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class CachingIconView extends android.widget.ImageView {
    private java.lang.String mLastPackage;
    private int mLastResId;
    private boolean mInternalSetDrawable;
    private boolean mForceHidden;
    private int mDesiredVisibility;
    @android.annotation.UnsupportedAppUsage
    public CachingIconView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    @android.view.RemotableViewMethod(asyncImpl="setImageIconAsync")
    public void setImageIcon(android.graphics.drawable.Icon p0) {}
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
    private synchronized boolean testAndSetCache(android.graphics.drawable.Icon p0) { return false; }
    private synchronized boolean testAndSetCache(int p0) { return false; }
    private java.lang.String normalizeIconPackage(android.graphics.drawable.Icon p0) { return null; }
    private synchronized void resetCache() {}
    public void setForceHidden(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setVisibility(int p0) {}
    private void updateVisibility() {}
}
