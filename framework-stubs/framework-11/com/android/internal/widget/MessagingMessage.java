package com.android.internal.widget;

public interface MessagingMessage extends com.android.internal.widget.MessagingLinearLayout.MessagingChild {
    public static final java.lang.String IMAGE_MIME_TYPE_PREFIX = "image/";
    public static com.android.internal.widget.MessagingMessage createMessage(com.android.internal.widget.IMessagingLayout p0, android.app.Notification.MessagingStyle.Message p1, com.android.internal.widget.ImageResolver p2) { return null; }
    public static void dropCache() {}
    public static boolean hasImage(android.app.Notification.MessagingStyle.Message p0) { return false; }
    default public boolean setMessage(android.app.Notification.MessagingStyle.Message p0) { return false; }
    default public android.app.Notification.MessagingStyle.Message getMessage() { return null; }
    default public boolean sameAs(android.app.Notification.MessagingStyle.Message p0) { return false; }
    default public boolean sameAs(com.android.internal.widget.MessagingMessage p0) { return false; }
    default public void removeMessage() {}
    default public void setMessagingGroup(com.android.internal.widget.MessagingGroup p0) {}
    default public void setIsHistoric(boolean p0) {}
    default public com.android.internal.widget.MessagingGroup getGroup() { return null; }
    default public void setIsHidingAnimated(boolean p0) {}
    default public boolean isHidingAnimated() { return false; }
    default public void hideAnimated() {}
    default public boolean hasOverlappingRendering() { return false; }
    default public void recycle() {}
    default public android.view.View getView() { return null; }
    default public void setColor(int p0) {}
    public com.android.internal.widget.MessagingMessageState getState();
    public void setVisibility(int p0);
    public int getVisibility();
}
