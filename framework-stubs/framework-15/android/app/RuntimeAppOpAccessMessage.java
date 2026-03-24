package android.app;

@android.annotation.SystemApi
public final class RuntimeAppOpAccessMessage implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.RuntimeAppOpAccessMessage> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getOp() { return null; }
    public RuntimeAppOpAccessMessage(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5) {}
    public int getUid() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getAttributionTag() { return null; }
    @android.annotation.NonNull
    public java.lang.String getMessage() { return null; }
    public int getSamplingStrategy() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    RuntimeAppOpAccessMessage(android.os.Parcel p0) {}
}
