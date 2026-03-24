package android.app.smartspace;

@android.annotation.SystemApi
public final class SmartspaceTarget implements android.os.Parcelable {
    private final java.lang.String mSmartspaceTargetId = null;
    private final android.app.smartspace.SmartspaceAction mHeaderAction = null;
    private final android.app.smartspace.SmartspaceAction mBaseAction = null;
    private final long mCreationTimeMillis = 0L;
    private final long mExpiryTimeMillis = 0L;
    private final float mScore = 0.0f;
    private final java.util.List<android.app.smartspace.SmartspaceAction> mActionChips = null;
    private final java.util.List<android.app.smartspace.SmartspaceAction> mIconGrid = null;
    private final int mFeatureType = 0;
    private final boolean mSensitive = false;
    private final boolean mShouldShowExpanded = false;
    private final java.lang.String mSourceNotificationKey = null;
    private final android.content.ComponentName mComponentName = null;
    private final android.os.UserHandle mUserHandle = null;
    private final java.lang.String mAssociatedSmartspaceTargetId = null;
    private final android.net.Uri mSliceUri = null;
    private final android.appwidget.AppWidgetProviderInfo mWidget = null;
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
    public static final android.os.Parcelable.Creator<android.app.smartspace.SmartspaceTarget> CREATOR = null;
    private SmartspaceTarget(android.os.Parcel p0) {}
    private SmartspaceTarget(java.lang.String p0, android.app.smartspace.SmartspaceAction p1, android.app.smartspace.SmartspaceAction p2, long p3, long p4, float p5, java.util.List<android.app.smartspace.SmartspaceAction> p6, java.util.List<android.app.smartspace.SmartspaceAction> p7, int p8, boolean p9, boolean p10, java.lang.String p11, android.content.ComponentName p12, android.os.UserHandle p13, java.lang.String p14, android.net.Uri p15, android.appwidget.AppWidgetProviderInfo p16) {}
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
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @android.annotation.SystemApi
    public static final class Builder {
        private final java.lang.String mSmartspaceTargetId = null;
        private android.app.smartspace.SmartspaceAction mHeaderAction;
        private android.app.smartspace.SmartspaceAction mBaseAction;
        private long mCreationTimeMillis;
        private long mExpiryTimeMillis;
        private float mScore;
        private java.util.List<android.app.smartspace.SmartspaceAction> mActionChips;
        private java.util.List<android.app.smartspace.SmartspaceAction> mIconGrid;
        private int mFeatureType;
        private boolean mSensitive;
        private boolean mShouldShowExpanded;
        private java.lang.String mSourceNotificationKey;
        private final android.content.ComponentName mComponentName = null;
        private final android.os.UserHandle mUserHandle = null;
        private java.lang.String mAssociatedSmartspaceTargetId;
        private android.net.Uri mSliceUri;
        private android.appwidget.AppWidgetProviderInfo mWidget;
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
        public android.app.smartspace.SmartspaceTarget build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FeatureType {
    }
}
