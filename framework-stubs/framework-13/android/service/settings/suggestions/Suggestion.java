package android.service.settings.suggestions;

@android.annotation.SystemApi
public final class Suggestion implements android.os.Parcelable {
    public static final int FLAG_HAS_BUTTON = 1;
    public static final int FLAG_ICON_TINTABLE = 2;
    public static final android.os.Parcelable.Creator<android.service.settings.suggestions.Suggestion> CREATOR = null;
    public java.lang.String getId() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getSummary() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public int getFlags() { return 0; }
    public android.app.PendingIntent getPendingIntent() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        public Builder(java.lang.String p0) {}
        public android.service.settings.suggestions.Suggestion.Builder setTitle(java.lang.CharSequence p0) { return null; }
        public android.service.settings.suggestions.Suggestion.Builder setSummary(java.lang.CharSequence p0) { return null; }
        public android.service.settings.suggestions.Suggestion.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.service.settings.suggestions.Suggestion.Builder setFlags(int p0) { return null; }
        public android.service.settings.suggestions.Suggestion.Builder setPendingIntent(android.app.PendingIntent p0) { return null; }
        public android.service.settings.suggestions.Suggestion build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }
}
