package android.app;

@android.annotation.SystemApi
public final class RuntimeAppOpAccessMessage implements android.os.Parcelable {
    private final int mUid = 0;
    private final int mOpCode = 0;
    private final java.lang.String mPackageName = null;
    private final java.lang.String mAttributionTag = null;
    private final java.lang.String mMessage = null;
    private final int mSamplingStrategy = 0;
    public static final android.os.Parcelable.Creator<android.app.RuntimeAppOpAccessMessage> CREATOR = null;
    public java.lang.String getOp() { return null; }
    public RuntimeAppOpAccessMessage(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5) {}
    public int getUid() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getAttributionTag() { return null; }
    public java.lang.String getMessage() { return null; }
    public int getSamplingStrategy() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    RuntimeAppOpAccessMessage(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
}
