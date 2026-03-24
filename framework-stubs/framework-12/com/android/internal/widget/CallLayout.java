package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class CallLayout extends android.widget.FrameLayout {
    private final com.android.internal.widget.PeopleHelper mPeopleHelper = null;
    private int mLayoutColor;
    private android.graphics.drawable.Icon mLargeIcon;
    private android.app.Person mUser;
    private com.android.internal.widget.CachingIconView mConversationIconView;
    private com.android.internal.widget.CachingIconView mIcon;
    private com.android.internal.widget.CachingIconView mConversationIconBadgeBg;
    private android.widget.TextView mConversationText;
    public CallLayout(android.content.Context p0) { super((android.content.Context)null); }
    public CallLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public CallLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public CallLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    private void updateCallLayout() {}
    @android.view.RemotableViewMethod
    public void setLayoutColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setNotificationBackgroundColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setLargeIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setData(android.os.Bundle p0) {}
    private void setUser(android.app.Person p0) {}
}
