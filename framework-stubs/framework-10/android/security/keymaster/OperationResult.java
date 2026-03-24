package android.security.keymaster;

public class OperationResult implements android.os.Parcelable {
    public final int resultCode = 0;
    public final android.os.IBinder token = null;
    public final long operationHandle = 0L;
    public final int inputConsumed = 0;
    public final byte[] output = null;
    public final android.security.keymaster.KeymasterArguments outParams = null;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.security.keymaster.OperationResult> CREATOR = null;
    public OperationResult(int p0, android.os.IBinder p1, long p2, int p3, byte[] p4, android.security.keymaster.KeymasterArguments p5) {}
    public OperationResult(int p0) {}
    protected OperationResult(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
