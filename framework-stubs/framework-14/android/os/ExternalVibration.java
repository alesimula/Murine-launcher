package android.os;

public class ExternalVibration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.ExternalVibration> CREATOR = null;
    public ExternalVibration(int p0, java.lang.String p1, android.media.AudioAttributes p2, android.os.IExternalVibrationController p3) {}
    public ExternalVibration(int p0, java.lang.String p1, android.media.AudioAttributes p2, android.os.IExternalVibrationController p3, android.os.IBinder p4) {}
    public int getUid() { return 0; }
    public java.lang.String getPackage() { return null; }
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public android.os.IBinder getToken() { return null; }
    public android.os.VibrationAttributes getVibrationAttributes() { return null; }
    public boolean mute() { return false; }
    public boolean unmute() { return false; }
    public void linkToDeath(android.os.IBinder.DeathRecipient p0) {}
    public void unlinkToDeath(android.os.IBinder.DeathRecipient p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
