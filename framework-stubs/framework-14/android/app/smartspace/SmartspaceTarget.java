package android.app.smartspace;

@android.annotation.SystemApi
public final class SmartspaceTarget implements android.os.Parcelable {
    public static final int FEATURE_UNDEFINED = 0;
    public static final int FEATURE_WEATHER = 1;
    public static final int FEATURE_CALENDAR = 2;
    public static final int FEATURE_COMMUTE_TIME = 3;
    public static final int FEATURE_FLIGHT = 4;
    public static final int FEATURE_TIPS = 5;
    public static final int FEATURE_REMINDER = 6;
    public static final int FEATURE_ALARM = 7;
    public static final int FEATURE_ONBOARDING = 8;
    public static final int FEATURE_SPORTS = 9;
    public static final int FEATURE_WEATHER_ALERT = 10;
    public static final int FEATURE_CONSENT = 11;
    public static final int FEATURE_STOCK_PRICE_CHANGE = 12;
    public static final int FEATURE_SHOPPING_LIST = 13;
    public static final int FEATURE_LOYALTY_CARD = 14;
    public static final int FEATURE_MEDIA = 15;
    public static final int FEATURE_BEDTIME_ROUTINE = 16;
    public static final int FEATURE_FITNESS_TRACKING = 17;
    public static final int FEATURE_ETA_MONITORING = 18;
    public static final int FEATURE_MISSED_CALL = 19;
    public static final int FEATURE_PACKAGE_TRACKING = 20;
    public static final int FEATURE_TIMER = 21;
    public static final int FEATURE_STOPWATCH = 22;
    public static final int FEATURE_UPCOMING_ALARM = 23;
    public static final int FEATURE_GAS_STATION_PAYMENT = 24;
    public static final int FEATURE_PAIRED_DEVICE_STATE = 25;
    public static final int FEATURE_DRIVING_MODE = 26;
    public static final int FEATURE_SLEEP_SUMMARY = 27;
    public static final int FEATURE_FLASHLIGHT = 28;
    public static final int FEATURE_TIME_TO_LEAVE = 29;
    public static final int FEATURE_DOORBELL = 30;
    public static final int FEATURE_MEDIA_RESUME = 31;
    public static final int FEATURE_CROSS_DEVICE_TIMER = 32;
    public static final int FEATURE_SEVERE_WEATHER_ALERT = 33;
    public static final int FEATURE_HOLIDAY_ALARM = 34;
    public static final int FEATURE_SAFETY_CHECK = 35;
    public static final int FEATURE_MEDIA_HEADS_UP = 36;
    public static final int FEATURE_STEP_COUNTING = 37;
    public static final int FEATURE_EARTHQUAKE_ALERT = 38;
    public static final int FEATURE_STEP_DATE = 39;
    public static final int FEATURE_BLAZE_BUILD_PROGRESS = 40;
    public static final int FEATURE_EARTHQUAKE_OCCURRED = 41;
    public static final int UI_TEMPLATE_UNDEFINED = 0;
    public static final int UI_TEMPLATE_DEFAULT = 1;
    public static final int UI_TEMPLATE_SUB_IMAGE = 2;
    public static final int UI_TEMPLATE_SUB_LIST = 3;
    public static final int UI_TEMPLATE_CAROUSEL = 4;
    public static final int UI_TEMPLATE_HEAD_TO_HEAD = 5;
    public static final int UI_TEMPLATE_COMBINED_CARDS = 6;
    public static final int UI_TEMPLATE_SUB_CARD = 7;
    public static final android.os.Parcelable.Creator<android.app.smartspace.SmartspaceTarget> CREATOR = null;
    public java.lang.String getSmartspaceTargetId() { return null; }
    public android.app.smartspace.SmartspaceAction getHeaderAction() { return null; }
    public android.app.smartspace.SmartspaceAction getBaseAction() { return null; }
    public long getCreationTimeMillis() { return 0L; }
    public long getExpiryTimeMillis() { return 0L; }
    public float getScore() { return 0.0f; }
    public java.util.List<android.app.smartspace.SmartspaceAction> getActionChips() { return null; }
    public java.util.List<android.app.smartspace.SmartspaceAction> getIconGrid() { return null; }
    public int getFeatureType() { return 0; }
    public boolean isSensitive() { return false; }
    public boolean shouldShowExpanded() { return false; }
    public java.lang.String getSourceNotificationKey() { return null; }
    public android.content.ComponentName getComponentName() { return null; }
    public android.os.UserHandle getUserHandle() { return null; }
    public java.lang.String getAssociatedSmartspaceTargetId() { return null; }
    public android.net.Uri getSliceUri() { return null; }
    public android.appwidget.AppWidgetProviderInfo getWidget() { return null; }
    public android.app.smartspace.uitemplatedata.BaseTemplateData getTemplateData() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder(java.lang.String p0, android.content.ComponentName p1, android.os.UserHandle p2) {}
        public android.app.smartspace.SmartspaceTarget.Builder setHeaderAction(android.app.smartspace.SmartspaceAction p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setBaseAction(android.app.smartspace.SmartspaceAction p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setCreationTimeMillis(long p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setExpiryTimeMillis(long p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setScore(float p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setActionChips(java.util.List<android.app.smartspace.SmartspaceAction> p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setIconGrid(java.util.List<android.app.smartspace.SmartspaceAction> p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setFeatureType(int p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setSensitive(boolean p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setShouldShowExpanded(boolean p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setSourceNotificationKey(java.lang.String p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setAssociatedSmartspaceTargetId(java.lang.String p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setSliceUri(android.net.Uri p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setWidget(android.appwidget.AppWidgetProviderInfo p0) { return null; }
        public android.app.smartspace.SmartspaceTarget.Builder setTemplateData(android.app.smartspace.uitemplatedata.BaseTemplateData p0) { return null; }
        public android.app.smartspace.SmartspaceTarget build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FeatureType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UiTemplateType {
    }
}
