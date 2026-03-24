package android.nfc;

public final class TransceiveResult implements android.os.Parcelable {
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_FAILURE = 1;
    public static final int RESULT_TAGLOST = 2;
    public static final int RESULT_EXCEEDED_LENGTH = 3;
    final int mResult = 0;
    final byte[] mResponseData = null;
    public static final android.os.Parcelable.Creator<android.nfc.TransceiveResult> CREATOR = null;
    public TransceiveResult(int p0, byte[] p1) {}
    public byte[] getResponseOrThrow() throws java.io.IOException { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
