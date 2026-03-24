package android.media;

@android.annotation.SuppressLint("UnflaggedApi")
public final class VolumePolicy implements android.os.Parcelable {
    @android.annotation.SuppressLint("UnflaggedApi")
    @android.annotation.NonNull
    public static final android.media.VolumePolicy DEFAULT = null;
    @android.annotation.SuppressLint("UnflaggedApi")
    public static final int A11Y_MODE_MEDIA_A11Y_VOLUME = 0;
    @android.annotation.SuppressLint("UnflaggedApi")
    public static final int A11Y_MODE_INDEPENDENT_A11Y_VOLUME = 1;
    @android.annotation.SuppressLint("UnflaggedApi")
    public final boolean volumeDownToEnterSilent = false;
    @android.annotation.SuppressLint("UnflaggedApi")
    public final boolean volumeUpToExitSilent = false;
    @android.annotation.SuppressLint("UnflaggedApi")
    public final boolean doNotDisturbWhenSilent = false;
    @android.annotation.SuppressLint("UnflaggedApi")
    public final int vibrateToSilentDebounce = 0;
    @android.annotation.SuppressLint("UnflaggedApi")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.VolumePolicy> CREATOR = null;
    @android.annotation.SuppressLint("UnflaggedApi")
    public VolumePolicy(boolean p0, boolean p1, boolean p2, int p3) {}
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public int describeContents() { return 0; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
