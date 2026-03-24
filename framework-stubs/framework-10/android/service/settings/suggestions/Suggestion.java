package android.service.settings.suggestions;

@android.annotation.SystemApi
public final class Suggestion implements android.os.Parcelable {
    public static final int FLAG_HAS_BUTTON = 1;
    public static final int FLAG_ICON_TINTABLE = 2;
    private final java.lang.String mId = null;
    private final java.lang.CharSequence mTitle = null;
    private final java.lang.CharSequence mSummary = null;
    private final android.graphics.drawable.Icon mIcon = null;
    private final int mFlags = 0;
    private final android.app.PendingIntent mPendingIntent = null;
    public static final android.os.Parcelable.Creator<android.service.settings.suggestions.Suggestion> CREATOR = null;
    public java.lang.String getId() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getSummary() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public int getFlags() { return 0; }
    public android.app.PendingIntent getPendingIntent() { return null; }
    private Suggestion(android.service.settings.suggestions.Suggestion.Builder p0) {}
    private Suggestion(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    public static class Builder {
        private final java.lang.String mId = null;
        private java.lang.CharSequence mTitle;
        private java.lang.CharSequence mSummary;
        private android.graphics.drawable.Icon mIcon;
        private int mFlags;
        private android.app.PendingIntent mPendingIntent;
        public Builder(java.lang.String p0) {}
        public android.service.settings.suggestions.Suggestion.Builder setTitle(java.lang.CharSequence p0) { return null; }
        public android.service.settings.suggestions.Suggestion.Builder setSummary(java.lang.CharSequence p0) { return null; }
        public android.service.settings.suggestions.Suggestion.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.service.settings.suggestions.Suggestion.Builder setFlags(int p0) { return null; }
        public android.service.settings.suggestions.Suggestion.Builder setPendingIntent(android.app.PendingIntent p0) { return null; }
        public android.service.settings.suggestions.Suggestion build() { return null; }
    }
}
