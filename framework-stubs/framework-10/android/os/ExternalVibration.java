package android.os;

public class ExternalVibration implements android.os.Parcelable {
    private static final java.lang.String TAG = "ExternalVibration";
    private int mUid;
    private java.lang.String mPkg;
    private android.media.AudioAttributes mAttrs;
    private android.os.IExternalVibrationController mController;
    private android.os.IBinder mToken;
    public static final android.os.Parcelable.Creator<android.os.ExternalVibration> CREATOR = null;
    public ExternalVibration(int p0, java.lang.String p1, android.media.AudioAttributes p2, android.os.IExternalVibrationController p3) {}
    private ExternalVibration(android.os.Parcel p0) {}
    private android.media.AudioAttributes readAudioAttributes(android.os.Parcel p0) { return null; }
    public int getUid() { return 0; }
    public java.lang.String getPackage() { return null; }
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public boolean mute() { return false; }
    public boolean unmute() { return false; }
    public void linkToDeath(android.os.IBinder.DeathRecipient p0) {}
    public void unlinkToDeath(android.os.IBinder.DeathRecipient p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static void writeAudioAttributes(android.media.AudioAttributes p0, android.os.Parcel p1, int p2) {}
    public int describeContents() { return 0; }
}
