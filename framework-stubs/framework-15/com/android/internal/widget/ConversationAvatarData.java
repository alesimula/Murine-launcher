package com.android.internal.widget;

public interface ConversationAvatarData {

    public static final class GroupConversationAvatarData implements com.android.internal.widget.ConversationAvatarData {
        final android.graphics.drawable.Drawable mLastIcon = null;
        final android.graphics.drawable.Drawable mSecondLastIcon = null;
        GroupConversationAvatarData(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1) {}
    }

    public static final class OneToOneConversationAvatarData implements com.android.internal.widget.ConversationAvatarData {
        public final android.graphics.drawable.Drawable mDrawable = null;
        OneToOneConversationAvatarData(android.graphics.drawable.Drawable p0) {}
    }
}
