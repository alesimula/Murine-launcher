package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class MessagingGroup extends android.widget.LinearLayout implements com.android.internal.widget.MessagingLinearLayout.MessagingChild {
    public static final int IMAGE_DISPLAY_LOCATION_INLINE = 0;
    public static final int IMAGE_DISPLAY_LOCATION_AT_END = 1;
    public static final int IMAGE_DISPLAY_LOCATION_EXTERNAL = 2;
    com.android.internal.widget.ImageFloatingTextView mSenderView;
    public MessagingGroup(android.content.Context p0) { super((android.content.Context)null); }
    public MessagingGroup(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MessagingGroup(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MessagingGroup(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    public void updateClipRect() {}
    public void setSender(android.app.Person p0, java.lang.CharSequence p1) {}
    public void setShowingAvatar(boolean p0) {}
    public void setSending(boolean p0) {}
    public void setAvatar(android.graphics.drawable.Icon p0) {}
    static com.android.internal.widget.MessagingGroup createGroup(com.android.internal.widget.MessagingLinearLayout p0) { return null; }
    public void removeMessage(com.android.internal.widget.MessagingMessage p0, java.util.ArrayList<com.android.internal.widget.MessagingLinearLayout.MessagingChild> p1) {}
    public void recycle() {}
    public void removeGroupAnimated(java.lang.Runnable p0) {}
    public void performRemoveAnimation(android.view.View p0, java.lang.Runnable p1) {}
    public java.lang.CharSequence getSenderName() { return null; }
    public static void dropCache() {}
    public int getMeasuredType() { return 0; }
    public int getConsumedLines() { return 0; }
    public void setMaxDisplayedLines(int p0) {}
    public void hideAnimated() {}
    public boolean isHidingAnimated() { return false; }
    public void setIsFirstInLayout(boolean p0) {}
    public void setCanHideSenderIfFirst(boolean p0) {}
    public boolean hasDifferentHeightWhenFirst() { return false; }
    public boolean hasOverlappingRendering() { return false; }
    public android.graphics.drawable.Icon getAvatarSymbolIfMatching(java.lang.CharSequence p0, java.lang.String p1, int p2) { return null; }
    public void setCreatedAvatar(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, java.lang.String p2, int p3) {}
    public void setTextColors(int p0, int p1) {}
    public void setLayoutColor(int p0) {}
    public void setMessages(java.util.List<com.android.internal.widget.MessagingMessage> p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public int calculateGroupCompatibility(com.android.internal.widget.MessagingGroup p0) { return 0; }
    public android.widget.TextView getSenderView() { return null; }
    public android.view.View getAvatar() { return null; }
    public android.graphics.drawable.Icon getAvatarIcon() { return null; }
    public com.android.internal.widget.MessagingLinearLayout getMessageContainer() { return null; }
    public com.android.internal.widget.MessagingImageMessage getIsolatedMessage() { return null; }
    public boolean needsGeneratedAvatar() { return false; }
    public android.app.Person getSender() { return null; }
    public void setClippingDisabled(boolean p0) {}
    public void setImageDisplayLocation(int p0) {}
    public java.util.List<com.android.internal.widget.MessagingMessage> getMessages() { return null; }
    public void setSingleLine(boolean p0) {}
    public boolean isSingleLine() { return false; }
    public void setIsInConversation(boolean p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ImageDisplayLocation {
    }
}
