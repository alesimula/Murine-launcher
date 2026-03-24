package android.tracing;

public class TraceReportParams implements android.os.Parcelable {
    public java.lang.String reporterPackageName;
    public java.lang.String reporterClassName;
    public android.os.ParcelFileDescriptor fd;
    public long uuidLsb;
    public long uuidMsb;
    public boolean usePipeForTesting;
    public static final android.os.Parcelable.Creator<android.tracing.TraceReportParams> CREATOR = null;
    public TraceReportParams() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
