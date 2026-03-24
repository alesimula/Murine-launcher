package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class ConversationLayout extends android.widget.FrameLayout implements com.android.internal.widget.ImageMessageConsumer, com.android.internal.widget.IMessagingLayout {
    public static final android.view.animation.Interpolator LINEAR_OUT_SLOW_IN = null;
    public static final android.view.animation.Interpolator FAST_OUT_LINEAR_IN = null;
    public static final android.view.animation.Interpolator FAST_OUT_SLOW_IN = null;
    public static final android.view.animation.Interpolator OVERSHOOT = null;
    public static final android.view.View.OnLayoutChangeListener MESSAGING_PROPERTY_ANIMATOR = null;
    public static final int IMPORTANCE_ANIM_GROW_DURATION = 250;
    public static final int IMPORTANCE_ANIM_SHRINK_DURATION = 200;
    public static final int IMPORTANCE_ANIM_SHRINK_DELAY = 25;
    public ConversationLayout(android.content.Context p0) { super((android.content.Context)null); }
    public ConversationLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ConversationLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ConversationLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    @android.view.RemotableViewMethod
    public void setAvatarReplacement(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setNameReplacement(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public void setIsImportantConversation(boolean p0) {}
    public void setIsImportantConversation(boolean p0, boolean p1) {}
    public boolean isImportantConversation() { return false; }
    @android.view.RemotableViewMethod
    public void setIsCollapsed(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setData(android.os.Bundle p0) {}
    public void setImageResolver(com.android.internal.widget.ImageResolver p0) {}
    public void setUnreadCount(int p0) {}
    public void bindFacePile(android.widget.ImageView p0, android.widget.ImageView p1, android.widget.ImageView p2) {}
    public boolean shouldHideAppName() { return false; }
    @android.view.RemotableViewMethod
    public void setLargeIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setShortcutIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setConversationTitle(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getConversationTitle() { return null; }
    @android.view.RemotableViewMethod
    public void setLayoutColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setIsOneToOne(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setSenderTextColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setNotificationBackgroundColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setMessageTextColor(int p0) {}
    public void showHistoricMessages(boolean p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public com.android.internal.widget.MessagingLinearLayout getMessagingLinearLayout() { return null; }
    public android.view.ViewGroup getImageMessageContainer() { return null; }
    public java.util.ArrayList<com.android.internal.widget.MessagingGroup> getMessagingGroups() { return null; }
    public void updateExpandability(boolean p0, android.view.View.OnClickListener p1) {}
    public void setMessagingClippingDisabled(boolean p0) {}
    public java.lang.CharSequence getConversationSenderName() { return null; }
    public boolean isOneToOne() { return false; }
    public java.lang.CharSequence getConversationText() { return null; }
    public android.graphics.drawable.Icon getConversationIcon() { return null; }

    private static class TouchDelegateComposite extends android.view.TouchDelegate {
        TouchDelegateComposite() { super(null, null); }
        public void add(android.view.TouchDelegate p0) {}
        public void clear() {}
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    }
}
