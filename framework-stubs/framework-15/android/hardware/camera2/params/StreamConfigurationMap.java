package android.hardware.camera2.params;

public final class StreamConfigurationMap {
    public static final int HAL_PIXEL_FORMAT_BLOB = 33;
    public static final int HAL_DATASPACE_ARBITRARY = 1;
    public static final int HAL_DATASPACE_V0_JFIF = 146931712;
    public static final int HAL_DATASPACE_DEPTH = 4096;
    public static final int HAL_DATASPACE_DYNAMIC_DEPTH = 4098;
    public static final int HAL_DATASPACE_HEIF = 4100;
    public static final int HAL_DATASPACE_JPEG_R = 4101;
    public static final int HAL_DATASPACE_JFIF = 146931712;
    public StreamConfigurationMap(android.hardware.camera2.params.StreamConfiguration[] p0, android.hardware.camera2.params.StreamConfigurationDuration[] p1, android.hardware.camera2.params.StreamConfigurationDuration[] p2, android.hardware.camera2.params.StreamConfiguration[] p3, android.hardware.camera2.params.StreamConfigurationDuration[] p4, android.hardware.camera2.params.StreamConfigurationDuration[] p5, android.hardware.camera2.params.StreamConfiguration[] p6, android.hardware.camera2.params.StreamConfigurationDuration[] p7, android.hardware.camera2.params.StreamConfigurationDuration[] p8, android.hardware.camera2.params.StreamConfiguration[] p9, android.hardware.camera2.params.StreamConfigurationDuration[] p10, android.hardware.camera2.params.StreamConfigurationDuration[] p11, android.hardware.camera2.params.StreamConfiguration[] p12, android.hardware.camera2.params.StreamConfigurationDuration[] p13, android.hardware.camera2.params.StreamConfigurationDuration[] p14, android.hardware.camera2.params.HighSpeedVideoConfiguration[] p15, android.hardware.camera2.params.ReprocessFormatsMap p16, boolean p17) {}
    public StreamConfigurationMap(android.hardware.camera2.params.StreamConfiguration[] p0, android.hardware.camera2.params.StreamConfigurationDuration[] p1, android.hardware.camera2.params.StreamConfigurationDuration[] p2, android.hardware.camera2.params.StreamConfiguration[] p3, android.hardware.camera2.params.StreamConfigurationDuration[] p4, android.hardware.camera2.params.StreamConfigurationDuration[] p5, android.hardware.camera2.params.StreamConfiguration[] p6, android.hardware.camera2.params.StreamConfigurationDuration[] p7, android.hardware.camera2.params.StreamConfigurationDuration[] p8, android.hardware.camera2.params.StreamConfiguration[] p9, android.hardware.camera2.params.StreamConfigurationDuration[] p10, android.hardware.camera2.params.StreamConfigurationDuration[] p11, android.hardware.camera2.params.StreamConfiguration[] p12, android.hardware.camera2.params.StreamConfigurationDuration[] p13, android.hardware.camera2.params.StreamConfigurationDuration[] p14, android.hardware.camera2.params.HighSpeedVideoConfiguration[] p15, android.hardware.camera2.params.ReprocessFormatsMap p16, boolean p17, boolean p18) {}
    public int[] getOutputFormats() { return null; }
    public int[] getValidOutputFormatsForInput(int p0) { return null; }
    public int[] getInputFormats() { return null; }
    public android.util.Size[] getInputSizes(int p0) { return null; }
    public boolean isOutputSupportedFor(int p0) { return false; }
    public static <T extends java.lang.Object> boolean isOutputSupportedFor(java.lang.Class<T> p0) { return false; }
    public boolean isOutputSupportedFor(android.view.Surface p0) { return false; }
    public boolean isOutputSupportedFor(android.util.Size p0, int p1) { return false; }
    public <T extends java.lang.Object> android.util.Size[] getOutputSizes(java.lang.Class<T> p0) { return null; }
    public android.util.Size[] getOutputSizes(int p0) { return null; }
    public android.util.Size[] getHighSpeedVideoSizes() { return null; }
    public android.util.Range<java.lang.Integer>[] getHighSpeedVideoFpsRangesFor(android.util.Size p0) { return null; }
    public android.util.Range<java.lang.Integer>[] getHighSpeedVideoFpsRanges() { return null; }
    public android.util.Size[] getHighSpeedVideoSizesFor(android.util.Range<java.lang.Integer> p0) { return null; }
    public android.util.Size[] getHighResolutionOutputSizes(int p0) { return null; }
    public long getOutputMinFrameDuration(int p0, android.util.Size p1) { return 0L; }
    public <T extends java.lang.Object> long getOutputMinFrameDuration(java.lang.Class<T> p0, android.util.Size p1) { return 0L; }
    public long getOutputStallDuration(int p0, android.util.Size p1) { return 0L; }
    public <T extends java.lang.Object> long getOutputStallDuration(java.lang.Class<T> p0, android.util.Size p1) { return 0L; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    static int checkArgumentFormatInternal(int p0) { return 0; }
    static int checkArgumentFormat(int p0) { return 0; }
    public static int imageFormatToPublic(int p0) { return 0; }
    public static int depthFormatToPublic(int p0) { return 0; }
    static int[] imageFormatToPublic(int[] p0) { return null; }
    static int imageFormatToInternal(int p0) { return 0; }
    static int imageFormatToDataspace(int p0) { return 0; }
    public static int[] imageFormatToInternal(int[] p0) { return null; }
    public java.lang.String toString() { return null; }
    public static int compareSizes(int p0, int p1, int p2, int p3) { return 0; }
    public static java.lang.String formatToString(int p0) { return null; }
}
