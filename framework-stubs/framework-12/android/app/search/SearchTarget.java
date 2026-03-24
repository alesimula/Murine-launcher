package android.app.search;

@android.annotation.SystemApi
public final class SearchTarget implements android.os.Parcelable {
    public static final int RESULT_TYPE_APPLICATION = 1;
    public static final int RESULT_TYPE_SHORTCUT = 2;
    public static final int RESULT_TYPE_SLICE = 4;
    public static final int RESULT_TYPE_WIDGETS = 8;
    public static final java.lang.String LAYOUT_TYPE_ICON = "icon";
    public static final java.lang.String LAYOUT_TYPE_ICON_ROW = "icon_row";
    public static final java.lang.String LAYOUT_TYPE_SHORT_ICON_ROW = "short_icon_row";
    private final int mResultType = 0;
    private final java.lang.String mLayoutType = null;
    private final java.lang.String mId = null;
    private java.lang.String mParentId;
    private final float mScore = 0.0f;
    private final boolean mHidden = false;
    private final java.lang.String mPackageName = null;
    private final android.os.UserHandle mUserHandle = null;
    private final android.app.search.SearchAction mSearchAction = null;
    private final android.content.pm.ShortcutInfo mShortcutInfo = null;
    private final android.appwidget.AppWidgetProviderInfo mAppWidgetProviderInfo = null;
    private final android.net.Uri mSliceUri = null;
    private final android.os.Bundle mExtras = null;
    public static final android.os.Parcelable.Creator<android.app.search.SearchTarget> CREATOR = null;
    private SearchTarget(android.os.Parcel p0) {}
    private SearchTarget(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, float p4, boolean p5, java.lang.String p6, android.os.UserHandle p7, android.app.search.SearchAction p8, android.content.pm.ShortcutInfo p9, android.net.Uri p10, android.appwidget.AppWidgetProviderInfo p11, android.os.Bundle p12) {}
    public int getResultType() { return 0; }
    public java.lang.String getLayoutType() { return null; }
    public java.lang.String getId() { return null; }
    public java.lang.String getParentId() { return null; }
    public float getScore() { return 0.0f; }
    @java.lang.Deprecated
    public boolean shouldHide() { return false; }
    public boolean isHidden() { return false; }
    public java.lang.String getPackageName() { return null; }
    public android.os.UserHandle getUserHandle() { return null; }
    public android.content.pm.ShortcutInfo getShortcutInfo() { return null; }
    public android.appwidget.AppWidgetProviderInfo getAppWidgetProviderInfo() { return null; }
    public android.net.Uri getSliceUri() { return null; }
    public android.app.search.SearchAction getSearchAction() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private int mResultType;
        private java.lang.String mLayoutType;
        private java.lang.String mId;
        private java.lang.String mParentId;
        private float mScore;
        private boolean mHidden;
        private java.lang.String mPackageName;
        private android.os.UserHandle mUserHandle;
        private android.app.search.SearchAction mSearchAction;
        private android.content.pm.ShortcutInfo mShortcutInfo;
        private android.net.Uri mSliceUri;
        private android.appwidget.AppWidgetProviderInfo mAppWidgetProviderInfo;
        private android.os.Bundle mExtras;
        public Builder(int p0, java.lang.String p1, java.lang.String p2) {}
        public android.app.search.SearchTarget.Builder setParentId(java.lang.String p0) { return null; }
        public android.app.search.SearchTarget.Builder setPackageName(java.lang.String p0) { return null; }
        public android.app.search.SearchTarget.Builder setUserHandle(android.os.UserHandle p0) { return null; }
        public android.app.search.SearchTarget.Builder setShortcutInfo(android.content.pm.ShortcutInfo p0) { return null; }
        public android.app.search.SearchTarget.Builder setAppWidgetProviderInfo(android.appwidget.AppWidgetProviderInfo p0) { return null; }
        public android.app.search.SearchTarget.Builder setSliceUri(android.net.Uri p0) { return null; }
        public android.app.search.SearchTarget.Builder setSearchAction(android.app.search.SearchAction p0) { return null; }
        public android.app.search.SearchTarget.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.app.search.SearchTarget.Builder setScore(float p0) { return null; }
        public android.app.search.SearchTarget.Builder setHidden(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.app.search.SearchTarget.Builder setShouldHide(boolean p0) { return null; }
        public android.app.search.SearchTarget build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SearchLayoutType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SearchResultType {
    }
}
