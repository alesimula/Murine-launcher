package android.hardware;

public class CameraStreamStats implements android.os.Parcelable {
    public static final int HISTOGRAM_TYPE_UNKNOWN = 0;
    public static final int HISTOGRAM_TYPE_CAPTURE_LATENCY = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.CameraStreamStats> CREATOR = null;
    public CameraStreamStats() {}
    public CameraStreamStats(int p0, int p1, int p2, float p3, int p4, long p5, long p6, long p7, int p8, int p9, int p10, long p11, long p12, int p13) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getFormat() { return 0; }
    public float getMaxPreviewFps() { return 0.0f; }
    public int getDataSpace() { return 0; }
    public long getUsage() { return 0L; }
    public long getRequestCount() { return 0L; }
    public long getErrorCount() { return 0L; }
    public int getStartLatencyMs() { return 0; }
    public int getMaxHalBuffers() { return 0; }
    public int getMaxAppBuffers() { return 0; }
    public int getHistogramType() { return 0; }
    public float[] getHistogramBins() { return null; }
    public long[] getHistogramCounts() { return null; }
    public long getDynamicRangeProfile() { return 0L; }
    public int getColorSpace() { return 0; }
    public long getStreamUseCase() { return 0L; }
}
