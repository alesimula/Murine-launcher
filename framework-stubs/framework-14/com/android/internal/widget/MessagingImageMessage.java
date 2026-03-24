package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public abstract class MessagingImageMessage extends android.widget.ImageView implements com.android.internal.widget.MessagingMessage {
    public MessagingImageMessage(android.content.Context p0) { super((android.content.Context)null); }
    public MessagingImageMessage(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MessagingImageMessage(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MessagingImageMessage(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public com.android.internal.widget.MessagingMessageState getState() { return null; }
    public boolean setMessage(android.app.Notification.MessagingStyle.Message p0) { return false; }
    static com.android.internal.widget.MessagingMessage createMessage(com.android.internal.widget.IMessagingLayout p0, android.app.Notification.MessagingStyle.Message p1, com.android.internal.widget.ImageResolver p2) { return null; }
    protected void onDraw(android.graphics.Canvas p0) {}
    public android.graphics.Path getRoundedRectPath() { return null; }
    public void recycle() {}
    public static void dropCache() {}
    public int getMeasuredType() { return 0; }
    public void setMaxDisplayedLines(int p0) {}
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public int getConsumedLines() { return 0; }
    public void setActualWidth(int p0) {}
    public int getActualWidth() { return 0; }
    public void setActualHeight(int p0) {}
    public int getActualHeight() { return 0; }
    public void setIsolated(boolean p0) {}
    public int getExtraSpacing() { return 0; }
}
