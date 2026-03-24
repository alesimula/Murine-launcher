package android.view;

public final class WindowContentFrameStats extends android.view.FrameStats implements android.os.Parcelable {
    private long[] mFramesPostedTimeNano;
    private long[] mFramesReadyTimeNano;
    public static final android.os.Parcelable.Creator<android.view.WindowContentFrameStats> CREATOR = null;
    public WindowContentFrameStats() { super(); }
    @android.annotation.UnsupportedAppUsage
    public void init(long p0, long[] p1, long[] p2, long[] p3) {}
    private WindowContentFrameStats(android.os.Parcel p0) { super(); }
    public long getFramePostedTimeNano(int p0) { return 0L; }
    public long getFrameReadyTimeNano(int p0) { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
