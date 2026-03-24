package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class BigPictureNotificationImageView extends android.widget.ImageView {
    private static final java.lang.String TAG = null;
    public BigPictureNotificationImageView(android.content.Context p0) { super((android.content.Context)null); }
    public BigPictureNotificationImageView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public BigPictureNotificationImageView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public BigPictureNotificationImageView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    @android.view.RemotableViewMethod(asyncImpl="setImageURIAsync")
    public void setImageURI(android.net.Uri p0) {}
    public java.lang.Runnable setImageURIAsync(android.net.Uri p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setImageIconAsync")
    public void setImageIcon(android.graphics.drawable.Icon p0) {}
    public java.lang.Runnable setImageIconAsync(android.graphics.drawable.Icon p0) { return null; }
    private android.graphics.drawable.Drawable loadImage(android.net.Uri p0) { return null; }
    private android.graphics.drawable.Drawable loadImage(android.graphics.drawable.Icon p0) { return null; }
}
