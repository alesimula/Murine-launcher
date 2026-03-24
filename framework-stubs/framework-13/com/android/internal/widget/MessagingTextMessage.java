package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public abstract class MessagingTextMessage extends com.android.internal.widget.ImageFloatingTextView implements com.android.internal.widget.MessagingMessage {
    public MessagingTextMessage(android.content.Context p0) { super((android.content.Context)null); }
    public MessagingTextMessage(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MessagingTextMessage(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MessagingTextMessage(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public com.android.internal.widget.MessagingMessageState getState() { return null; }
    public boolean setMessage(android.app.Notification.MessagingStyle.Message p0) { return false; }
    static com.android.internal.widget.MessagingMessage createMessage(com.android.internal.widget.IMessagingLayout p0, android.app.Notification.MessagingStyle.Message p1) { return null; }
    public void recycle() {}
    public static void dropCache() {}
    public int getMeasuredType() { return 0; }
    public void setMaxDisplayedLines(int p0) {}
    public int getConsumedLines() { return 0; }
    public int getLayoutHeight() { return 0; }
    public void setColor(int p0) {}
}
