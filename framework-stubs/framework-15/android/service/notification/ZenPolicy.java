package android.service.notification;

public final class ZenPolicy implements android.os.Parcelable {
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_MESSAGES = 1;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_CALLS = 2;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_CONVERSATIONS = 4;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_ALLOW_CHANNELS = 8;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_PRIORITY_CATEGORY_REMINDERS = 16;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_PRIORITY_CATEGORY_EVENTS = 32;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_PRIORITY_CATEGORY_REPEAT_CALLERS = 64;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_PRIORITY_CATEGORY_ALARMS = 128;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_PRIORITY_CATEGORY_MEDIA = 256;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_PRIORITY_CATEGORY_SYSTEM = 512;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_VISUAL_EFFECT_FULL_SCREEN_INTENT = 1024;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_VISUAL_EFFECT_LIGHTS = 2048;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_VISUAL_EFFECT_PEEK = 4096;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_VISUAL_EFFECT_STATUS_BAR = 8192;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_VISUAL_EFFECT_BADGE = 16384;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_VISUAL_EFFECT_AMBIENT = 32768;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int FIELD_VISUAL_EFFECT_NOTIFICATION_LIST = 65536;
    public static final int PRIORITY_CATEGORY_REMINDERS = 0;
    public static final int PRIORITY_CATEGORY_EVENTS = 1;
    public static final int PRIORITY_CATEGORY_MESSAGES = 2;
    public static final int PRIORITY_CATEGORY_CALLS = 3;
    public static final int PRIORITY_CATEGORY_REPEAT_CALLERS = 4;
    public static final int PRIORITY_CATEGORY_ALARMS = 5;
    public static final int PRIORITY_CATEGORY_MEDIA = 6;
    public static final int PRIORITY_CATEGORY_SYSTEM = 7;
    public static final int PRIORITY_CATEGORY_CONVERSATIONS = 8;
    public static final int NUM_PRIORITY_CATEGORIES = 9;
    public static final int VISUAL_EFFECT_FULL_SCREEN_INTENT = 0;
    public static final int VISUAL_EFFECT_LIGHTS = 1;
    public static final int VISUAL_EFFECT_PEEK = 2;
    public static final int VISUAL_EFFECT_STATUS_BAR = 3;
    public static final int VISUAL_EFFECT_BADGE = 4;
    public static final int VISUAL_EFFECT_AMBIENT = 5;
    public static final int VISUAL_EFFECT_NOTIFICATION_LIST = 6;
    public static final int NUM_VISUAL_EFFECTS = 7;
    public static final int PEOPLE_TYPE_UNSET = 0;
    public static final int PEOPLE_TYPE_ANYONE = 1;
    public static final int PEOPLE_TYPE_CONTACTS = 2;
    public static final int PEOPLE_TYPE_STARRED = 3;
    public static final int PEOPLE_TYPE_NONE = 4;
    public static final int CONVERSATION_SENDERS_UNSET = 0;
    public static final int CONVERSATION_SENDERS_ANYONE = 1;
    public static final int CONVERSATION_SENDERS_IMPORTANT = 2;
    public static final int CONVERSATION_SENDERS_NONE = 3;
    public static final int STATE_UNSET = 0;
    public static final int STATE_ALLOW = 1;
    public static final int STATE_DISALLOW = 2;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int CHANNEL_POLICY_UNSET = 0;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int CHANNEL_POLICY_PRIORITY = 1;
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static final int CHANNEL_POLICY_NONE = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.notification.ZenPolicy> CREATOR = null;
    public ZenPolicy() {}
    @android.annotation.FlaggedApi("android.app.modes_api")
    public ZenPolicy(java.util.List<java.lang.Integer> p0, java.util.List<java.lang.Integer> p1, int p2, int p3, int p4, int p5) {}
    public int getPriorityConversationSenders() { return 0; }
    public int getPriorityMessageSenders() { return 0; }
    public int getPriorityCallSenders() { return 0; }
    public int getPriorityCategoryConversations() { return 0; }
    public int getPriorityCategoryReminders() { return 0; }
    public int getPriorityCategoryEvents() { return 0; }
    public int getPriorityCategoryMessages() { return 0; }
    public int getPriorityCategoryCalls() { return 0; }
    public int getPriorityCategoryRepeatCallers() { return 0; }
    public int getPriorityCategoryAlarms() { return 0; }
    public int getPriorityCategoryMedia() { return 0; }
    public int getPriorityCategorySystem() { return 0; }
    public int getVisualEffectFullScreenIntent() { return 0; }
    public int getVisualEffectLights() { return 0; }
    public int getVisualEffectPeek() { return 0; }
    public int getVisualEffectStatusBar() { return 0; }
    public int getVisualEffectBadge() { return 0; }
    public int getVisualEffectAmbient() { return 0; }
    public int getVisualEffectNotificationList() { return 0; }
    public int getAllowedChannels() { return 0; }
    @android.annotation.FlaggedApi("android.app.modes_api")
    public int getPriorityChannelsAllowed() { return 0; }
    public boolean shouldHideAllVisualEffects() { return false; }
    public boolean shouldShowAllVisualEffects() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public static java.lang.String fieldsToString(int p0) { return null; }
    public static java.lang.String conversationTypeToString(int p0) { return null; }
    @android.annotation.FlaggedApi("android.app.modes_api")
    public static java.lang.String channelTypeToString(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public static boolean stateToBoolean(int p0, boolean p1) { return false; }
    public boolean isCategoryAllowed(int p0, boolean p1) { return false; }
    public boolean isVisualEffectAllowed(int p0, boolean p1) { return false; }
    public void apply(android.service.notification.ZenPolicy p0) {}
    @android.annotation.FlaggedApi("android.app.modes_api")
    @android.annotation.NonNull
    public android.service.notification.ZenPolicy overwrittenWith(android.service.notification.ZenPolicy p0) { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public byte[] toProto() { return null; }
    @android.annotation.NonNull
    public android.service.notification.ZenPolicy copy() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.SuppressLint("UnflaggedApi")
        public Builder(android.service.notification.ZenPolicy p0) {}
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy build() { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder allowAllSounds() { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder disallowAllSounds() { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder showAllVisualEffects() { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder hideAllVisualEffects() { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder unsetPriorityCategory(int p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder unsetVisualEffect(int p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder allowReminders(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder allowEvents(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder allowConversations(int p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder allowMessages(int p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder allowCalls(int p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder allowRepeatCallers(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder allowAlarms(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder allowMedia(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder allowSystem(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder allowCategory(int p0, boolean p1) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder showFullScreenIntent(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder showLights(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder showPeeking(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder showStatusBarIcons(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder showBadges(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder showInAmbientDisplay(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder showInNotificationList(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder showVisualEffect(int p0, boolean p1) { return null; }
        @android.annotation.SuppressLint("BuilderSetStyle")
        @android.annotation.FlaggedApi("android.app.modes_api")
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder allowPriorityChannels(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenPolicy.Builder allowChannels(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ChannelType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConversationSenders {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModifiableField {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PeopleType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PriorityCategory {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VisualEffect {
    }
}
