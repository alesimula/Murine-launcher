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
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.search.SearchTarget> CREATOR = null;
    public int getResultType() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getLayoutType() { return null; }
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    @android.annotation.NonNull
    public java.lang.String getParentId() { return null; }
    public float getScore() { return 0.0f; }
    @java.lang.Deprecated
    public boolean shouldHide() { return false; }
    public boolean isHidden() { return false; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public android.os.UserHandle getUserHandle() { return null; }
    @android.annotation.Nullable
    public android.content.pm.ShortcutInfo getShortcutInfo() { return null; }
    @android.annotation.Nullable
    public android.appwidget.AppWidgetProviderInfo getAppWidgetProviderInfo() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getSliceUri() { return null; }
    @android.annotation.Nullable
    public android.app.search.SearchAction getSearchAction() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder(int p0, java.lang.String p1, java.lang.String p2) {}
        @android.annotation.NonNull
        public android.app.search.SearchTarget.Builder setParentId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchTarget.Builder setPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchTarget.Builder setUserHandle(android.os.UserHandle p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchTarget.Builder setShortcutInfo(android.content.pm.ShortcutInfo p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchTarget.Builder setAppWidgetProviderInfo(android.appwidget.AppWidgetProviderInfo p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchTarget.Builder setSliceUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchTarget.Builder setSearchAction(android.app.search.SearchAction p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchTarget.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchTarget.Builder setScore(float p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchTarget.Builder setHidden(boolean p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.app.search.SearchTarget.Builder setShouldHide(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchTarget build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SearchLayoutType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SearchResultType {
    }
}
