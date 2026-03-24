package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class MessagingLayout extends android.widget.FrameLayout implements com.android.internal.widget.ImageMessageConsumer, com.android.internal.widget.IMessagingLayout {
    public static final android.view.animation.Interpolator LINEAR_OUT_SLOW_IN = null;
    public static final android.view.animation.Interpolator FAST_OUT_LINEAR_IN = null;
    public static final android.view.animation.Interpolator FAST_OUT_SLOW_IN = null;
    public static final android.view.View.OnLayoutChangeListener MESSAGING_PROPERTY_ANIMATOR = null;
    public MessagingLayout(android.content.Context p0) { super((android.content.Context)null); }
    public MessagingLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MessagingLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MessagingLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    @android.view.RemotableViewMethod(asyncImpl="setAvatarReplacementAsync")
    public void setAvatarReplacement(android.graphics.drawable.Icon p0) {}
    public java.lang.Runnable setAvatarReplacementAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setNameReplacementAsync")
    public void setNameReplacement(java.lang.CharSequence p0) {}
    public java.lang.Runnable setNameReplacementAsync(java.lang.CharSequence p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setIsCollapsedAsync")
    public void setIsCollapsed(boolean p0) {}
    public java.lang.Runnable setIsCollapsedAsync(boolean p0) { return null; }
    @android.view.RemotableViewMethod
    public void setLargeIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setConversationTitleAsync")
    public void setConversationTitle(java.lang.CharSequence p0) {}
    public java.lang.Runnable setConversationTitleAsync(java.lang.CharSequence p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setDataAsync")
    public void setData(android.os.Bundle p0) {}
    @android.annotation.NonNull
    public java.lang.Runnable setDataAsync(android.os.Bundle p0) { return null; }
    public void setPrecomputedTextEnabled(boolean p0) {}
    public void setImageResolver(com.android.internal.widget.ImageResolver p0) {}
    public android.graphics.drawable.Icon createAvatarSymbol(java.lang.CharSequence p0, java.lang.String p1, int p2) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setLayoutColorAsync")
    public void setLayoutColor(int p0) {}
    public java.lang.Runnable setLayoutColorAsync(int p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setIsOneToOneAsync")
    public void setIsOneToOne(boolean p0) {}
    public java.lang.Runnable setIsOneToOneAsync(boolean p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setSenderTextColorAsync")
    public void setSenderTextColor(int p0) {}
    public java.lang.Runnable setSenderTextColorAsync(int p0) { return null; }
    @android.view.RemotableViewMethod
    public void setNotificationBackgroundColor(int p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setMessageTextColorAsync")
    public void setMessageTextColor(int p0) {}
    public java.lang.Runnable setMessageTextColorAsync(int p0) { return null; }
    public void setUser(android.app.Person p0) {}
    public void showHistoricMessages(boolean p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public com.android.internal.widget.MessagingLinearLayout getMessagingLinearLayout() { return null; }
    @android.annotation.Nullable
    public android.view.ViewGroup getImageMessageContainer() { return null; }
    public java.util.ArrayList<com.android.internal.widget.MessagingGroup> getMessagingGroups() { return null; }
    public void setMessagingClippingDisabled(boolean p0) {}
}
