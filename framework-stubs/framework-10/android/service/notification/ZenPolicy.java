package android.service.notification;

public final class ZenPolicy implements android.os.Parcelable {
    private java.util.ArrayList<java.lang.Integer> mPriorityCategories;
    private java.util.ArrayList<java.lang.Integer> mVisualEffects;
    private int mPriorityMessages;
    private int mPriorityCalls;
    public static final int PRIORITY_CATEGORY_REMINDERS = 0;
    public static final int PRIORITY_CATEGORY_EVENTS = 1;
    public static final int PRIORITY_CATEGORY_MESSAGES = 2;
    public static final int PRIORITY_CATEGORY_CALLS = 3;
    public static final int PRIORITY_CATEGORY_REPEAT_CALLERS = 4;
    public static final int PRIORITY_CATEGORY_ALARMS = 5;
    public static final int PRIORITY_CATEGORY_MEDIA = 6;
    public static final int PRIORITY_CATEGORY_SYSTEM = 7;
    public static final int VISUAL_EFFECT_FULL_SCREEN_INTENT = 0;
    public static final int VISUAL_EFFECT_LIGHTS = 1;
    public static final int VISUAL_EFFECT_PEEK = 2;
    public static final int VISUAL_EFFECT_STATUS_BAR = 3;
    public static final int VISUAL_EFFECT_BADGE = 4;
    public static final int VISUAL_EFFECT_AMBIENT = 5;
    public static final int VISUAL_EFFECT_NOTIFICATION_LIST = 6;
    public static final int PEOPLE_TYPE_UNSET = 0;
    public static final int PEOPLE_TYPE_ANYONE = 1;
    public static final int PEOPLE_TYPE_CONTACTS = 2;
    public static final int PEOPLE_TYPE_STARRED = 3;
    public static final int PEOPLE_TYPE_NONE = 4;
    public static final int STATE_UNSET = 0;
    public static final int STATE_ALLOW = 1;
    public static final int STATE_DISALLOW = 2;
    public static final android.os.Parcelable.Creator<android.service.notification.ZenPolicy> CREATOR = null;
    public ZenPolicy() {}
    public int getPriorityMessageSenders() { return 0; }
    public int getPriorityCallSenders() { return 0; }
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
    public boolean shouldHideAllVisualEffects() { return false; }
    public boolean shouldShowAllVisualEffects() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    private java.lang.String priorityCategoriesToString() { return null; }
    private java.lang.String visualEffectsToString() { return null; }
    private java.lang.String indexToVisualEffect(int p0) { return null; }
    private java.lang.String indexToCategory(int p0) { return null; }
    private java.lang.String stateToString(int p0) { return null; }
    private java.lang.String peopleTypeToString(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private int getZenPolicyPriorityCategoryState(int p0) { return 0; }
    private int getZenPolicyVisualEffectState(int p0) { return 0; }
    public boolean isCategoryAllowed(int p0, boolean p1) { return false; }
    public boolean isVisualEffectAllowed(int p0, boolean p1) { return false; }
    public void apply(android.service.notification.ZenPolicy p0) {}
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    public android.service.notification.ZenPolicy copy() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VisualEffect {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PriorityCategory {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PeopleType {
    }

    public static final class Builder {
        private android.service.notification.ZenPolicy mZenPolicy;
        public Builder() {}
        public Builder(android.service.notification.ZenPolicy p0) {}
        public android.service.notification.ZenPolicy build() { return null; }
        public android.service.notification.ZenPolicy.Builder allowAllSounds() { return null; }
        public android.service.notification.ZenPolicy.Builder disallowAllSounds() { return null; }
        public android.service.notification.ZenPolicy.Builder showAllVisualEffects() { return null; }
        public android.service.notification.ZenPolicy.Builder hideAllVisualEffects() { return null; }
        public android.service.notification.ZenPolicy.Builder unsetPriorityCategory(int p0) { return null; }
        public android.service.notification.ZenPolicy.Builder unsetVisualEffect(int p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowReminders(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowEvents(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowMessages(int p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowCalls(int p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowRepeatCallers(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowAlarms(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowMedia(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowSystem(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowCategory(int p0, boolean p1) { return null; }
        public android.service.notification.ZenPolicy.Builder showFullScreenIntent(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showLights(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showPeeking(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showStatusBarIcons(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showBadges(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showInAmbientDisplay(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showInNotificationList(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showVisualEffect(int p0, boolean p1) { return null; }
    }
}
