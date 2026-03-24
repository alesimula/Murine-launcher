package android.hardware.location;

@android.annotation.SystemApi
public final class NanoAppMessage implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppMessage> CREATOR = null;
    public static android.hardware.location.NanoAppMessage createMessageToNanoApp(long p0, int p1, byte[] p2) { return null; }
    public static android.hardware.location.NanoAppMessage createMessageFromNanoApp(long p0, int p1, byte[] p2, boolean p3) { return null; }
    @android.annotation.NonNull
    public static android.hardware.location.NanoAppMessage createMessageFromNanoApp(long p0, int p1, byte[] p2, boolean p3, boolean p4, int p5) { return null; }
    public long getNanoAppId() { return 0L; }
    public int getMessageType() { return 0; }
    public byte[] getMessageBody() { return null; }
    public boolean isBroadcastMessage() { return false; }
    public boolean isReliable() { return false; }
    public int getMessageSequenceNumber() { return 0; }
    public void setIsReliable(boolean p0) {}
    public void setMessageSequenceNumber(int p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
