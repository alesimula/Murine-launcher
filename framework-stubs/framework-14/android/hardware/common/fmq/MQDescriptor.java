package android.hardware.common.fmq;

public class MQDescriptor<T extends java.lang.Object, Flavor extends java.lang.Object> implements android.os.Parcelable {
    public android.hardware.common.fmq.GrantorDescriptor[] grantors;
    public android.hardware.common.NativeHandle handle;
    public int quantum;
    public int flags;
    public static final android.os.Parcelable.Creator<android.hardware.common.fmq.MQDescriptor> CREATOR = null;
    public MQDescriptor() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
