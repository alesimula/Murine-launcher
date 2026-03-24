package android.hardware.camera2.params;

public final class RecommendedStreamConfigurationMap {
    public static final int MAX_USECASE_COUNT = 32;
    public static final int USECASE_PREVIEW = 0;
    public static final int USECASE_RECORD = 1;
    public static final int USECASE_VIDEO_SNAPSHOT = 2;
    public static final int USECASE_SNAPSHOT = 3;
    public static final int USECASE_ZSL = 4;
    public static final int USECASE_RAW = 5;
    public static final int USECASE_LOW_LATENCY_SNAPSHOT = 6;
    public static final int USECASE_10BIT_OUTPUT = 8;
    public static final int USECASE_VENDOR_START = 24;
    public RecommendedStreamConfigurationMap(android.hardware.camera2.params.StreamConfigurationMap p0, int p1, boolean p2) {}
    public int getRecommendedUseCase() { return 0; }
    public java.util.Set<java.lang.Integer> getOutputFormats() { return null; }
    public java.util.Set<java.lang.Integer> getValidOutputFormatsForInput(int p0) { return null; }
    public java.util.Set<java.lang.Integer> getInputFormats() { return null; }
    public java.util.Set<android.util.Size> getInputSizes(int p0) { return null; }
    public boolean isOutputSupportedFor(int p0) { return false; }
    public java.util.Set<android.util.Size> getOutputSizes(int p0) { return null; }
    public java.util.Set<android.util.Size> getHighSpeedVideoSizes() { return null; }
    public java.util.Set<android.util.Range<java.lang.Integer>> getHighSpeedVideoFpsRangesFor(android.util.Size p0) { return null; }
    public java.util.Set<android.util.Range<java.lang.Integer>> getHighSpeedVideoFpsRanges() { return null; }
    public java.util.Set<android.util.Size> getHighSpeedVideoSizesFor(android.util.Range<java.lang.Integer> p0) { return null; }
    public java.util.Set<android.util.Size> getHighResolutionOutputSizes(int p0) { return null; }
    public long getOutputMinFrameDuration(int p0, android.util.Size p1) { return 0L; }
    public long getOutputStallDuration(int p0, android.util.Size p1) { return 0L; }
    public <T extends java.lang.Object> java.util.Set<android.util.Size> getOutputSizes(java.lang.Class<T> p0) { return null; }
    public <T extends java.lang.Object> long getOutputMinFrameDuration(java.lang.Class<T> p0, android.util.Size p1) { return 0L; }
    public <T extends java.lang.Object> long getOutputStallDuration(java.lang.Class<T> p0, android.util.Size p1) { return 0L; }
    public boolean isOutputSupportedFor(android.view.Surface p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecommendedUsecase {
    }
}
