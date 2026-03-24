package android.app.search;

@android.annotation.SystemApi
public final class SearchAction implements android.os.Parcelable {
    private static final java.lang.String TAG = "SearchAction";
    private java.lang.String mId;
    private final android.graphics.drawable.Icon mIcon = null;
    private final java.lang.CharSequence mTitle = null;
    private final java.lang.CharSequence mSubtitle = null;
    private final java.lang.CharSequence mContentDescription = null;
    private final android.app.PendingIntent mPendingIntent = null;
    private final android.content.Intent mIntent = null;
    private final android.os.UserHandle mUserHandle = null;
    private android.os.Bundle mExtras;
    public static final android.os.Parcelable.Creator<android.app.search.SearchAction> CREATOR = null;
    SearchAction(android.os.Parcel p0) {}
    private SearchAction(java.lang.String p0, java.lang.CharSequence p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3, java.lang.CharSequence p4, android.app.PendingIntent p5, android.content.Intent p6, android.os.UserHandle p7, android.os.Bundle p8) {}
    public java.lang.String getId() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.app.PendingIntent getPendingIntent() { return null; }
    public android.content.Intent getIntent() { return null; }
    public android.os.UserHandle getUserHandle() { return null; }
    @android.annotation.SuppressLint("NullableCollection")
    public android.os.Bundle getExtras() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    public static final class Builder {
        private java.lang.String mId;
        private java.lang.CharSequence mTitle;
        private android.graphics.drawable.Icon mIcon;
        private java.lang.CharSequence mSubtitle;
        private java.lang.CharSequence mContentDescription;
        private android.app.PendingIntent mPendingIntent;
        private android.content.Intent mIntent;
        private android.os.UserHandle mUserHandle;
        private android.os.Bundle mExtras;
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public android.app.search.SearchAction.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.app.search.SearchAction.Builder setSubtitle(java.lang.CharSequence p0) { return null; }
        public android.app.search.SearchAction.Builder setContentDescription(java.lang.CharSequence p0) { return null; }
        public android.app.search.SearchAction.Builder setPendingIntent(android.app.PendingIntent p0) { return null; }
        public android.app.search.SearchAction.Builder setUserHandle(android.os.UserHandle p0) { return null; }
        public android.app.search.SearchAction.Builder setIntent(android.content.Intent p0) { return null; }
        public android.app.search.SearchAction.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.app.search.SearchAction build() { return null; }
    }
}
