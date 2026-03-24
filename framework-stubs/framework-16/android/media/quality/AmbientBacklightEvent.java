package android.media.quality;

@android.annotation.FlaggedApi("android.media.tv.flags.media_quality_fw")
public final class AmbientBacklightEvent implements android.os.Parcelable {
    public static final int AMBIENT_BACKLIGHT_EVENT_ENABLED = 1;
    public static final int AMBIENT_BACKLIGHT_EVENT_DISABLED = 2;
    public static final int AMBIENT_BACKLIGHT_EVENT_METADATA_AVAILABLE = 3;
    public static final int AMBIENT_BACKLIGHT_EVENT_INTERRUPTED = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.quality.AmbientBacklightEvent> CREATOR = null;
    public AmbientBacklightEvent(int p0, android.media.quality.AmbientBacklightMetadata p1) {}
    public int getEventType() { return 0; }
    @android.annotation.Nullable
    public android.media.quality.AmbientBacklightMetadata getMetadata() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
