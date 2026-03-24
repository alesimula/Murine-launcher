package android.app;

public final class AutomaticZenRule implements android.os.Parcelable {
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_OTHER = 0;
    public static final int TYPE_SCHEDULE_TIME = 1;
    public static final int TYPE_SCHEDULE_CALENDAR = 2;
    public static final int TYPE_BEDTIME = 3;
    public static final int TYPE_DRIVING = 4;
    public static final int TYPE_IMMERSIVE = 5;
    public static final int TYPE_THEATER = 6;
    public static final int TYPE_MANAGED = 7;
    public static final int FIELD_NAME = 1;
    public static final int FIELD_INTERRUPTION_FILTER = 2;
    public static final int FIELD_ICON = 4;
    public static final int MAX_STRING_LENGTH = 500;
    public static final int MAX_DESC_LENGTH = 150;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.AutomaticZenRule> CREATOR = null;
    @java.lang.Deprecated
    public AutomaticZenRule(java.lang.String p0, android.content.ComponentName p1, android.net.Uri p2, int p3, boolean p4) {}
    public AutomaticZenRule(java.lang.String p0, android.content.ComponentName p1, android.content.ComponentName p2, android.net.Uri p3, android.service.notification.ZenPolicy p4, int p5, boolean p6) {}
    public AutomaticZenRule(android.os.Parcel p0) {}
    public android.content.ComponentName getOwner() { return null; }
    @android.annotation.Nullable
    public android.content.ComponentName getConfigurationActivity() { return null; }
    public android.net.Uri getConditionId() { return null; }
    public int getInterruptionFilter() { return 0; }
    public java.lang.String getName() { return null; }
    public boolean isEnabled() { return false; }
    @android.annotation.Nullable
    public android.service.notification.ZenPolicy getZenPolicy() { return null; }
    @android.annotation.Nullable
    public android.service.notification.ZenDeviceEffects getDeviceEffects() { return null; }
    public long getCreationTime() { return 0L; }
    public void setConditionId(android.net.Uri p0) {}
    public void setInterruptionFilter(int p0) {}
    public void setName(java.lang.String p0) {}
    public void setEnabled(boolean p0) {}
    public void setZenPolicy(android.service.notification.ZenPolicy p0) {}
    public void setDeviceEffects(android.service.notification.ZenDeviceEffects p0) {}
    public void setOwner(android.content.ComponentName p0) {}
    public void setConfigurationActivity(android.content.ComponentName p0) {}
    public void setPackageName(java.lang.String p0) {}
    public java.lang.String getPackageName() { return null; }
    public int getType() { return 0; }
    public void setType(int p0) {}
    @android.annotation.Nullable
    public java.lang.String getTriggerDescription() { return null; }
    public void setTriggerDescription(java.lang.String p0) {}
    public int getIconResId() { return 0; }
    public void setIconResId(int p0) {}
    public boolean isManualInvocationAllowed() { return false; }
    public void setManualInvocationAllowed(boolean p0) {}
    public void validate() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public static java.lang.String fieldsToString(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class AzrWithId implements android.os.Parcelable {
        public final java.lang.String mId = null;
        public final android.app.AutomaticZenRule mRule = null;
        public static final android.os.Parcelable.Creator<android.app.AutomaticZenRule.AzrWithId> CREATOR = null;
        public AzrWithId(java.lang.String p0, android.app.AutomaticZenRule p1) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
    }

    public static final class Builder {
        public Builder(android.app.AutomaticZenRule p0) {}
        public Builder(java.lang.String p0, android.net.Uri p1) {}
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setOwner(android.content.ComponentName p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setConditionId(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setInterruptionFilter(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setConfigurationActivity(android.content.ComponentName p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setZenPolicy(android.service.notification.ZenPolicy p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setDeviceEffects(android.service.notification.ZenDeviceEffects p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setType(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setTriggerDescription(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setIconResId(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setManualInvocationAllowed(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setCreationTime(long p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule.Builder setPackage(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.AutomaticZenRule build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModifiableField {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
