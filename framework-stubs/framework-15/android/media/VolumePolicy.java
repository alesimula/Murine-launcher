package android.media;

public final class VolumePolicy implements android.os.Parcelable {
    public static final android.media.VolumePolicy DEFAULT = null;
    public static final int A11Y_MODE_MEDIA_A11Y_VOLUME = 0;
    public static final int A11Y_MODE_INDEPENDENT_A11Y_VOLUME = 1;
    public final boolean volumeDownToEnterSilent = false;
    public final boolean volumeUpToExitSilent = false;
    public final boolean doNotDisturbWhenSilent = false;
    public final int vibrateToSilentDebounce = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.VolumePolicy> CREATOR = null;
    public VolumePolicy(boolean p0, boolean p1, boolean p2, int p3) {}
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
