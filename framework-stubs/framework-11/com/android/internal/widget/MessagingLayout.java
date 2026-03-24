package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class MessagingLayout extends android.widget.FrameLayout implements com.android.internal.widget.ImageMessageConsumer, com.android.internal.widget.IMessagingLayout {
    private static final float COLOR_SHIFT_AMOUNT = 60.0f;
    private static final java.util.regex.Pattern IGNORABLE_CHAR_PATTERN = null;
    private static final java.util.regex.Pattern SPECIAL_CHAR_PATTERN = null;
    private static final java.util.function.Consumer<com.android.internal.widget.MessagingMessage> REMOVE_MESSAGE = null;
    public static final android.view.animation.Interpolator LINEAR_OUT_SLOW_IN = null;
    public static final android.view.animation.Interpolator FAST_OUT_LINEAR_IN = null;
    public static final android.view.animation.Interpolator FAST_OUT_SLOW_IN = null;
    public static final android.view.View.OnLayoutChangeListener MESSAGING_PROPERTY_ANIMATOR = null;
    private java.util.List<com.android.internal.widget.MessagingMessage> mMessages;
    private java.util.List<com.android.internal.widget.MessagingMessage> mHistoricMessages;
    private com.android.internal.widget.MessagingLinearLayout mMessagingLinearLayout;
    private boolean mShowHistoricMessages;
    private java.util.ArrayList<com.android.internal.widget.MessagingGroup> mGroups;
    private android.widget.TextView mTitleView;
    private int mLayoutColor;
    private int mSenderTextColor;
    private int mMessageTextColor;
    private int mAvatarSize;
    private android.graphics.Paint mPaint;
    private android.graphics.Paint mTextPaint;
    private java.lang.CharSequence mConversationTitle;
    private android.graphics.drawable.Icon mAvatarReplacement;
    private boolean mIsOneToOne;
    private java.util.ArrayList<com.android.internal.widget.MessagingGroup> mAddedGroups;
    private android.app.Person mUser;
    private java.lang.CharSequence mNameReplacement;
    private boolean mDisplayImagesAtEnd;
    private com.android.internal.widget.ImageResolver mImageResolver;
    public MessagingLayout(android.content.Context p0) { super((android.content.Context)null); }
    public MessagingLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MessagingLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MessagingLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    @android.view.RemotableViewMethod
    public void setAvatarReplacement(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setNameReplacement(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public void setIsCollapsed(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setLargeIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setConversationTitle(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public void setData(android.os.Bundle p0) {}
    public void setImageResolver(com.android.internal.widget.ImageResolver p0) {}
    private void addRemoteInputHistoryToMessages(java.util.List<android.app.Notification.MessagingStyle.Message> p0, android.app.RemoteInputHistoryItem[] p1) {}
    private void bind(java.util.List<android.app.Notification.MessagingStyle.Message> p0, java.util.List<android.app.Notification.MessagingStyle.Message> p1, boolean p2) {}
    private void removeGroups(java.util.ArrayList<com.android.internal.widget.MessagingGroup> p0) {}
    private void updateTitleAndNamesDisplay() {}
    public android.graphics.drawable.Icon createAvatarSymbol(java.lang.CharSequence p0, java.lang.String p1, int p2) { return null; }
    private int findColor(java.lang.CharSequence p0, int p1) { return 0; }
    private java.lang.String findNameSplit(java.lang.String p0) { return null; }
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
    public void setUser(android.app.Person p0) {}
    private void addMessagesToGroups(java.util.List<com.android.internal.widget.MessagingMessage> p0, java.util.List<com.android.internal.widget.MessagingMessage> p1, boolean p2) {}
    private void createGroupViews(java.util.List<java.util.List<com.android.internal.widget.MessagingMessage>> p0, java.util.List<android.app.Person> p1, boolean p2) {}
    private void findGroups(java.util.List<com.android.internal.widget.MessagingMessage> p0, java.util.List<com.android.internal.widget.MessagingMessage> p1, java.util.List<java.util.List<com.android.internal.widget.MessagingMessage>> p2, java.util.List<android.app.Person> p3) {}
    private java.util.List<com.android.internal.widget.MessagingMessage> createMessages(java.util.List<android.app.Notification.MessagingStyle.Message> p0, boolean p1) { return null; }
    private com.android.internal.widget.MessagingMessage findAndRemoveMatchingMessage(android.app.Notification.MessagingStyle.Message p0) { return null; }
    public void showHistoricMessages(boolean p0) {}
    private void updateHistoricMessageVisibility() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public com.android.internal.widget.MessagingLinearLayout getMessagingLinearLayout() { return null; }
    public java.util.ArrayList<com.android.internal.widget.MessagingGroup> getMessagingGroups() { return null; }
    public void setMessagingClippingDisabled(boolean p0) {}
}
