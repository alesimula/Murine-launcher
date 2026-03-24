package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class MessagingGroup extends android.widget.LinearLayout implements com.android.internal.widget.MessagingLinearLayout.MessagingChild {
    private static android.util.Pools.SimplePool<com.android.internal.widget.MessagingGroup> sInstancePool;
    public static final int IMAGE_DISPLAY_LOCATION_INLINE = 0;
    public static final int IMAGE_DISPLAY_LOCATION_AT_END = 1;
    public static final int IMAGE_DISPLAY_LOCATION_EXTERNAL = 2;
    private com.android.internal.widget.MessagingLinearLayout mMessageContainer;
    com.android.internal.widget.ImageFloatingTextView mSenderView;
    private android.widget.ImageView mAvatarView;
    private android.view.View mAvatarContainer;
    private java.lang.String mAvatarSymbol;
    private int mLayoutColor;
    private java.lang.CharSequence mAvatarName;
    private android.graphics.drawable.Icon mAvatarIcon;
    private int mTextColor;
    private int mSendingTextColor;
    private java.util.List<com.android.internal.widget.MessagingMessage> mMessages;
    private java.util.ArrayList<com.android.internal.widget.MessagingMessage> mAddedMessages;
    private boolean mFirstLayout;
    private boolean mIsHidingAnimated;
    private boolean mNeedsGeneratedAvatar;
    private android.app.Person mSender;
    private int mImageDisplayLocation;
    private android.view.ViewGroup mImageContainer;
    private com.android.internal.widget.MessagingImageMessage mIsolatedMessage;
    private boolean mClippingDisabled;
    private android.graphics.Point mDisplaySize;
    private android.widget.ProgressBar mSendingSpinner;
    private android.view.View mSendingSpinnerContainer;
    private boolean mShowingAvatar;
    private java.lang.CharSequence mSenderName;
    private boolean mSingleLine;
    private android.widget.LinearLayout mContentContainer;
    private int mRequestedMaxDisplayedLines;
    private int mSenderTextPaddingSingleLine;
    private boolean mIsFirstGroupInLayout;
    private boolean mCanHideSenderIfFirst;
    private boolean mIsInConversation;
    private android.view.ViewGroup mMessagingIconContainer;
    private int mConversationContentStart;
    private int mNonConversationMarginEnd;
    private int mNotificationTextMarginTop;
    public MessagingGroup(android.content.Context p0) { super((android.content.Context)null); }
    public MessagingGroup(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MessagingGroup(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MessagingGroup(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    public void updateClipRect() {}
    private int getDistanceFromParent(android.view.View p0, android.view.ViewGroup p1) { return 0; }
    public void setSender(android.app.Person p0, java.lang.CharSequence p1) {}
    public void setShowingAvatar(boolean p0) {}
    public void setSending(boolean p0) {}
    private int calculateSendingTextColor() { return 0; }
    public void setAvatar(android.graphics.drawable.Icon p0) {}
    static com.android.internal.widget.MessagingGroup createGroup(com.android.internal.widget.MessagingLinearLayout p0) { return null; }
    public void removeMessage(com.android.internal.widget.MessagingMessage p0) {}
    public void recycle() {}
    public void removeGroupAnimated(java.lang.Runnable p0) {}
    public void performRemoveAnimation(android.view.View p0, java.lang.Runnable p1) {}
    private void performRemoveAnimation(android.view.View p0, int p1, java.lang.Runnable p2) {}
    public java.lang.CharSequence getSenderName() { return null; }
    public static void dropCache() {}
    public int getMeasuredType() { return 0; }
    public int getConsumedLines() { return 0; }
    public void setMaxDisplayedLines(int p0) {}
    private void updateMaxDisplayedLines() {}
    public void hideAnimated() {}
    public boolean isHidingAnimated() { return false; }
    public void setIsFirstInLayout(boolean p0) {}
    public void setCanHideSenderIfFirst(boolean p0) {}
    private void updateSenderVisibility() {}
    public boolean hasDifferentHeightWhenFirst() { return false; }
    private void setIsHidingAnimated(boolean p0) {}
    public boolean hasOverlappingRendering() { return false; }
    public android.graphics.drawable.Icon getAvatarSymbolIfMatching(java.lang.CharSequence p0, java.lang.String p1, int p2) { return null; }
    public void setCreatedAvatar(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, java.lang.String p2, int p3) {}
    public void setTextColors(int p0, int p1) {}
    public void setLayoutColor(int p0) {}
    private void updateMessageColor() {}
    public void setMessages(java.util.List<com.android.internal.widget.MessagingMessage> p0) {}
    private void updateImageContainerVisibility() {}
    private boolean removeFromParentIfDifferent(com.android.internal.widget.MessagingMessage p0, android.view.ViewGroup p1) { return false; }
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
