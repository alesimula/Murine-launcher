package android.hardware.camera2.params;

public final class MultiResolutionStreamConfigurationMap {
    private final java.util.Map<java.lang.String, android.hardware.camera2.params.StreamConfiguration[]> mConfigurations = null;
    private final java.util.Map<java.lang.Integer, java.util.List<android.hardware.camera2.params.MultiResolutionStreamInfo>> mMultiResolutionOutputConfigs = null;
    private final java.util.Map<java.lang.Integer, java.util.List<android.hardware.camera2.params.MultiResolutionStreamInfo>> mMultiResolutionInputConfigs = null;
    public MultiResolutionStreamConfigurationMap(java.util.Map<java.lang.String, android.hardware.camera2.params.StreamConfiguration[]> p0) {}
    public int[] getOutputFormats() { return null; }
    public int[] getInputFormats() { return null; }
    private int[] getPublicImageFormats(boolean p0) { return null; }
    public java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> getOutputInfo(int p0) { return null; }
    public java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> getInputInfo(int p0) { return null; }
    private java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> getInfo(int p0, boolean p1) { return null; }
    private void appendConfigurationsString(java.lang.StringBuilder p0, boolean p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static class SizeComparator implements java.util.Comparator<android.hardware.camera2.params.MultiResolutionStreamInfo> {
        public SizeComparator() {}
        public int compare(android.hardware.camera2.params.MultiResolutionStreamInfo p0, android.hardware.camera2.params.MultiResolutionStreamInfo p1) { return 0; }
    }
}
