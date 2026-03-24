package android.app.cloudsearch;

@android.annotation.SystemApi
public final class SearchResult implements android.os.Parcelable {
    public static final java.lang.String EXTRAINFO_APP_DOMAIN_URL = "android.app.cloudsearch.APP_DOMAIN_URL";
    public static final java.lang.String EXTRAINFO_APP_ICON = "android.app.cloudsearch.APP_ICON";
    public static final java.lang.String EXTRAINFO_APP_DEVELOPER_NAME = "android.app.cloudsearch.APP_DEVELOPER_NAME";
    public static final java.lang.String EXTRAINFO_APP_SIZE_BYTES = "android.app.cloudsearch.APP_SIZE_BYTES";
    public static final java.lang.String EXTRAINFO_APP_STAR_RATING = "android.app.cloudsearch.APP_STAR_RATING";
    public static final java.lang.String EXTRAINFO_APP_IARC = "android.app.cloudsearch.APP_IARC";
    public static final java.lang.String EXTRAINFO_APP_REVIEW_COUNT = "android.app.cloudsearch.APP_REVIEW_COUNT";
    public static final java.lang.String EXTRAINFO_APP_CONTAINS_ADS_DISCLAIMER = "android.app.cloudsearch.APP_CONTAINS_ADS_DISCLAIMER";
    public static final java.lang.String EXTRAINFO_APP_CONTAINS_IAP_DISCLAIMER = "android.app.cloudsearch.APP_CONTAINS_IAP_DISCLAIMER";
    public static final java.lang.String EXTRAINFO_SHORT_DESCRIPTION = "android.app.cloudsearch.SHORT_DESCRIPTION";
    public static final java.lang.String EXTRAINFO_LONG_DESCRIPTION = "android.app.cloudsearch.LONG_DESCRIPTION";
    public static final java.lang.String EXTRAINFO_SCREENSHOTS = "android.app.cloudsearch.SCREENSHOTS";
    public static final java.lang.String EXTRAINFO_APP_BADGES = "android.app.cloudsearch.APP_BADGES";
    @android.annotation.SuppressLint("IntentName")
    public static final java.lang.String EXTRAINFO_ACTION_BUTTON_TEXT_PREREGISTERING = "android.app.cloudsearch.ACTION_BUTTON_TEXT";
    @android.annotation.SuppressLint("IntentName")
    public static final java.lang.String EXTRAINFO_ACTION_BUTTON_IMAGE_PREREGISTERING = "android.app.cloudsearch.ACTION_BUTTON_IMAGE";
    @android.annotation.SuppressLint("IntentName")
    public static final java.lang.String EXTRAINFO_ACTION_APP_CARD = "android.app.cloudsearch.ACTION_APP_CARD";
    @android.annotation.SuppressLint("IntentName")
    public static final java.lang.String EXTRAINFO_ACTION_INSTALL_BUTTON = "android.app.cloudsearch.ACTION_INSTALL_BUTTON";
    public static final java.lang.String EXTRAINFO_APP_PACKAGE_NAME = "android.app.cloudsearch.APP_PACKAGE_NAME";
    public static final java.lang.String EXTRAINFO_APP_INSTALL_COUNT = "android.app.cloudsearch.APP_INSTALL_COUNT";
    public static final java.lang.String EXTRAINFO_WEB_URL = "android.app.cloudsearch.WEB_URL";
    public static final java.lang.String EXTRAINFO_WEB_ICON = "android.app.cloudsearch.WEB_ICON";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.cloudsearch.SearchResult> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getTitle() { return null; }
    @android.annotation.NonNull
    public java.lang.String getSnippet() { return null; }
    public float getScore() { return 0.0f; }
    @android.annotation.NonNull
    public android.os.Bundle getExtraInfos() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @android.annotation.SystemApi
    public static final class Builder {
        @android.annotation.SystemApi
        public Builder(java.lang.String p0, android.os.Bundle p1) {}
        @android.annotation.NonNull
        public android.app.cloudsearch.SearchResult.Builder setTitle(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.cloudsearch.SearchResult.Builder setSnippet(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.cloudsearch.SearchResult.Builder setScore(float p0) { return null; }
        @android.annotation.NonNull
        public android.app.cloudsearch.SearchResult.Builder setExtraInfos(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.cloudsearch.SearchResult build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SearchResultExtraInfoKey {
    }
}
