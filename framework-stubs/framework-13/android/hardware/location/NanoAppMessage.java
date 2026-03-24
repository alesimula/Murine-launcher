package android.hardware.location;

@android.annotation.SystemApi
public final class NanoAppMessage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppMessage> CREATOR = null;
    public static android.hardware.location.NanoAppMessage createMessageToNanoApp(long p0, int p1, byte[] p2) { return null; }
    public static android.hardware.location.NanoAppMessage createMessageFromNanoApp(long p0, int p1, byte[] p2, boolean p3) { return null; }
    public long getNanoAppId() { return 0L; }
    public int getMessageType() { return 0; }
    public byte[] getMessageBody() { return null; }
    public boolean isBroadcastMessage() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
}
