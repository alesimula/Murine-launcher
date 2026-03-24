package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class ConversationLayout extends android.widget.FrameLayout implements com.android.internal.widget.ImageMessageConsumer, com.android.internal.widget.IMessagingLayout {
    private static final java.util.function.Consumer<com.android.internal.widget.MessagingMessage> REMOVE_MESSAGE = null;
    public static final android.view.animation.Interpolator LINEAR_OUT_SLOW_IN = null;
    public static final android.view.animation.Interpolator FAST_OUT_LINEAR_IN = null;
    public static final android.view.animation.Interpolator FAST_OUT_SLOW_IN = null;
    public static final android.view.animation.Interpolator OVERSHOOT = null;
    public static final android.view.View.OnLayoutChangeListener MESSAGING_PROPERTY_ANIMATOR = null;
    public static final int IMPORTANCE_ANIM_GROW_DURATION = 250;
    public static final int IMPORTANCE_ANIM_SHRINK_DURATION = 200;
    public static final int IMPORTANCE_ANIM_SHRINK_DELAY = 25;
    private final com.android.internal.widget.PeopleHelper mPeopleHelper = null;
    private java.util.List<com.android.internal.widget.MessagingMessage> mMessages;
    private java.util.List<com.android.internal.widget.MessagingMessage> mHistoricMessages;
    private com.android.internal.widget.MessagingLinearLayout mMessagingLinearLayout;
    private boolean mShowHistoricMessages;
    private java.util.ArrayList<com.android.internal.widget.MessagingGroup> mGroups;
    private int mLayoutColor;
    private int mSenderTextColor;
    private int mMessageTextColor;
    private android.graphics.drawable.Icon mAvatarReplacement;
    private boolean mIsOneToOne;
    private java.util.ArrayList<com.android.internal.widget.MessagingGroup> mAddedGroups;
    private android.app.Person mUser;
    private java.lang.CharSequence mNameReplacement;
    private boolean mIsCollapsed;
    private com.android.internal.widget.ImageResolver mImageResolver;
    private com.android.internal.widget.CachingIconView mConversationIconView;
    private android.view.View mConversationIconContainer;
    private int mConversationIconTopPaddingExpandedGroup;
    private int mConversationIconTopPadding;
    private int mExpandedGroupMessagePadding;
    private android.widget.TextView mConversationText;
    private android.view.View mConversationIconBadge;
    private com.android.internal.widget.CachingIconView mConversationIconBadgeBg;
    private android.graphics.drawable.Icon mLargeIcon;
    private android.view.View mExpandButtonContainer;
    private android.view.ViewGroup mExpandButtonAndContentContainer;
    private com.android.internal.widget.NotificationExpandButton mExpandButton;
    private com.android.internal.widget.MessagingLinearLayout mImageMessageContainer;
    private int mBadgeProtrusion;
    private int mConversationAvatarSize;
    private int mConversationAvatarSizeExpanded;
    private com.android.internal.widget.CachingIconView mIcon;
    private com.android.internal.widget.CachingIconView mImportanceRingView;
    private int mExpandedGroupBadgeProtrusion;
    private int mExpandedGroupBadgeProtrusionFacePile;
    private android.view.View mConversationFacePile;
    private int mNotificationBackgroundColor;
    private java.lang.CharSequence mFallbackChatName;
    private java.lang.CharSequence mFallbackGroupChatName;
    private java.lang.CharSequence mConversationTitle;
    private int mMessageSpacingStandard;
    private int mMessageSpacingGroup;
    private int mNotificationHeaderExpandedPadding;
    private android.view.View mConversationHeader;
    private android.view.View mContentContainer;
    private boolean mExpandable;
    private int mContentMarginEnd;
    private android.graphics.Rect mMessagingClipRect;
    private com.android.internal.widget.ObservableTextView mAppName;
    private com.android.internal.widget.NotificationActionListLayout mActions;
    private boolean mAppNameGone;
    private int mFacePileAvatarSize;
    private int mFacePileAvatarSizeExpandedGroup;
    private int mFacePileProtectionWidth;
    private int mFacePileProtectionWidthExpanded;
    private boolean mImportantConversation;
    private android.view.View mFeedbackIcon;
    private float mMinTouchSize;
    private android.graphics.drawable.Icon mConversationIcon;
    private android.graphics.drawable.Icon mShortcutIcon;
    private android.view.View mAppNameDivider;
    private com.android.internal.widget.ConversationLayout.TouchDelegateComposite mTouchDelegate;
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
    private void addRemoteInputHistoryToMessages(java.util.List<android.app.Notification.MessagingStyle.Message> p0, android.app.RemoteInputHistoryItem[] p1) {}
    private void bind(java.util.List<android.app.Notification.MessagingStyle.Message> p0, java.util.List<android.app.Notification.MessagingStyle.Message> p1, boolean p2) {}
    private void updateConversationLayout() {}
    private void updateActionListPadding() {}
    private void updateImageMessages() {}
    public void bindFacePile(android.widget.ImageView p0, android.widget.ImageView p1, android.widget.ImageView p2) {}
    private void bindFacePile() {}
    private void updateAppName() {}
    public boolean shouldHideAppName() { return false; }
    private void updateIconPositionAndSize() {}
    private void updatePaddingsBasedOnContentAvailability() {}
    @android.view.RemotableViewMethod
    public void setLargeIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setShortcutIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setConversationTitle(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getConversationTitle() { return null; }
    private void removeGroups(java.util.ArrayList<com.android.internal.widget.MessagingGroup> p0) {}
    private void updateTitleAndNamesDisplay() {}
    @android.view.RemotableViewMethod
    public void setLayoutColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setIsOneToOne(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setSenderTextColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setNotificationBackgroundColor(int p0) {}
    private void applyNotificationBackgroundColor(android.widget.ImageView p0) {}
    @android.view.RemotableViewMethod
    public void setMessageTextColor(int p0) {}
    private void setUser(android.app.Person p0) {}
    private void createGroupViews(java.util.List<java.util.List<com.android.internal.widget.MessagingMessage>> p0, java.util.List<android.app.Person> p1, boolean p2) {}
    private void findGroups(java.util.List<com.android.internal.widget.MessagingMessage> p0, java.util.List<com.android.internal.widget.MessagingMessage> p1, java.util.List<java.util.List<com.android.internal.widget.MessagingMessage>> p2, java.util.List<android.app.Person> p3) {}
    private java.lang.CharSequence getKey(android.app.Person p0) { return null; }
    private java.util.List<com.android.internal.widget.MessagingMessage> createMessages(java.util.List<android.app.Notification.MessagingStyle.Message> p0, boolean p1) { return null; }
    private com.android.internal.widget.MessagingMessage findAndRemoveMatchingMessage(android.app.Notification.MessagingStyle.Message p0) { return null; }
    public void showHistoricMessages(boolean p0) {}
    private void updateHistoricMessageVisibility() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    private void getRelativeTouchRect(android.graphics.Rect p0, android.view.View p1) {}
    public com.android.internal.widget.MessagingLinearLayout getMessagingLinearLayout() { return null; }
    public android.view.ViewGroup getImageMessageContainer() { return null; }
    public java.util.ArrayList<com.android.internal.widget.MessagingGroup> getMessagingGroups() { return null; }
    private void updateExpandButton() {}
    private void updateContentEndPaddings() {}
    private void onAppNameVisibilityChanged() {}
    private void updateAppNameDividerVisibility() {}
    public void updateExpandability(boolean p0, android.view.View.OnClickListener p1) {}
    public void setMessagingClippingDisabled(boolean p0) {}
    public java.lang.CharSequence getConversationSenderName() { return null; }
    public boolean isOneToOne() { return false; }
    public java.lang.CharSequence getConversationText() { return null; }
    public android.graphics.drawable.Icon getConversationIcon() { return null; }

    private static class TouchDelegateComposite extends android.view.TouchDelegate {
        private final java.util.ArrayList<android.view.TouchDelegate> mDelegates = null;
        private TouchDelegateComposite(android.view.View p0) { super(null, null); }
        public void add(android.view.TouchDelegate p0) {}
        public void clear() {}
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    }
}
