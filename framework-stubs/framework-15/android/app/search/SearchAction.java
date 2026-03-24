package android.app.search;

@android.annotation.SystemApi
public final class SearchAction implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.search.SearchAction> CREATOR = null;
    SearchAction(android.os.Parcel p0) {}
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Icon getIcon() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getTitle() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getSubtitle() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getContentDescription() { return null; }
    @android.annotation.Nullable
    public android.app.PendingIntent getPendingIntent() { return null; }
    @android.annotation.Nullable
    public android.content.Intent getIntent() { return null; }
    @android.annotation.Nullable
    public android.os.UserHandle getUserHandle() { return null; }
    @android.annotation.SuppressLint("NullableCollection")
    @android.annotation.Nullable
    public android.os.Bundle getExtras() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.app.search.SearchAction.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchAction.Builder setSubtitle(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchAction.Builder setContentDescription(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchAction.Builder setPendingIntent(android.app.PendingIntent p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchAction.Builder setUserHandle(android.os.UserHandle p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchAction.Builder setIntent(android.content.Intent p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchAction.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchAction build() { return null; }
    }
}
