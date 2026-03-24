package android.telephony;

public class IccOpenLogicalChannelResponse implements android.os.Parcelable {
    public static final int INVALID_CHANNEL = -1;
    public static final int STATUS_NO_ERROR = 1;
    public static final int STATUS_MISSING_RESOURCE = 2;
    public static final int STATUS_NO_SUCH_ELEMENT = 3;
    public static final int STATUS_UNKNOWN_ERROR = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.IccOpenLogicalChannelResponse> CREATOR = null;
    public IccOpenLogicalChannelResponse(int p0, int p1, byte[] p2) {}
    public int getChannel() { return 0; }
    public int getStatus() { return 0; }
    public byte[] getSelectResponse() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
