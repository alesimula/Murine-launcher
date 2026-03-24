package android.hardware.camera2.params;

public final class MandatoryStreamCombination {
    private static final java.lang.String TAG = "MandatoryStreamCombination";
    private final java.lang.String mDescription = null;
    private final boolean mIsReprocessable = false;
    private final java.util.ArrayList<android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation> mStreamsInformation = null;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLegacyCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLimitedCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sBurstCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sFullCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sRawCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLevel3Combinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLimitedPrivateReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLimitedYUVReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sFullPrivateReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sFullYUVReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sRAWPrivateReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sRAWYUVReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLevel3PrivateReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLevel3YUVReprocCombinations;
    public MandatoryStreamCombination(java.util.List<android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation> p0, java.lang.String p1, boolean p2) {}
    public java.lang.CharSequence getDescription() { return null; }
    public boolean isReprocessable() { return false; }
    public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation> getStreamsInformation() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    private static final class StreamTemplate {
        public int mFormat;
        public android.hardware.camera2.params.MandatoryStreamCombination.SizeThreshold mSizeThreshold;
        public boolean mIsInput;
        public StreamTemplate(int p0, android.hardware.camera2.params.MandatoryStreamCombination.SizeThreshold p1) {}
        public StreamTemplate(int p0, android.hardware.camera2.params.MandatoryStreamCombination.SizeThreshold p1, boolean p2) {}
    }

    private static final class StreamCombinationTemplate {
        public android.hardware.camera2.params.MandatoryStreamCombination.StreamTemplate[] mStreamTemplates;
        public java.lang.String mDescription;
        public android.hardware.camera2.params.MandatoryStreamCombination.ReprocessType mReprocessType;
        public StreamCombinationTemplate(android.hardware.camera2.params.MandatoryStreamCombination.StreamTemplate[] p0, java.lang.String p1) {}
        public StreamCombinationTemplate(android.hardware.camera2.params.MandatoryStreamCombination.StreamTemplate[] p0, java.lang.String p1, android.hardware.camera2.params.MandatoryStreamCombination.ReprocessType p2) {}
    }

    private static enum SizeThreshold {
        VGA,
        PREVIEW,
        RECORD,
        MAXIMUM;
        private SizeThreshold() {}
    }

    private static enum ReprocessType {
        NONE,
        PRIVATE,
        YUV;
        private ReprocessType() {}
    }

    public static final class MandatoryStreamInformation {
        private final int mFormat = 0;
        private final java.util.ArrayList<android.util.Size> mAvailableSizes = null;
        private final boolean mIsInput = false;
        public MandatoryStreamInformation(java.util.List<android.util.Size> p0, int p1) {}
        public MandatoryStreamInformation(java.util.List<android.util.Size> p0, int p1, boolean p2) {}
        public boolean isInput() { return false; }
        public java.util.List<android.util.Size> getAvailableSizes() { return null; }
        public int getFormat() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static final class Builder {
        private android.util.Size mDisplaySize;
        private java.util.List<java.lang.Integer> mCapabilities;
        private int mHwLevel;
        private int mCameraId;
        private android.hardware.camera2.params.StreamConfigurationMap mStreamConfigMap;
        private boolean mIsHiddenPhysicalCamera;
        private final android.util.Size kPreviewSizeBound = null;
        public Builder(int p0, int p1, android.util.Size p2, java.util.List<java.lang.Integer> p3, android.hardware.camera2.params.StreamConfigurationMap p4) {}
        public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatoryStreamCombinations() { return null; }
        private java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> generateAvailableCombinations(java.util.ArrayList<android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate> p0) { return null; }
        private java.util.HashMap<android.util.Pair<android.hardware.camera2.params.MandatoryStreamCombination.SizeThreshold, java.lang.Integer>, java.util.List<android.util.Size>> enumerateAvailableSizes() { return null; }
        private static java.util.List<android.util.Size> getSizesWithinBound(android.util.Size[] p0, android.util.Size p1) { return null; }
        public static android.util.Size getMaxSize(android.util.Size... p0) { return null; }
        private boolean isHardwareLevelAtLeast(int p0) { return false; }
        private boolean isExternalCamera() { return false; }
        private boolean isHardwareLevelAtLeastLegacy() { return false; }
        private boolean isHardwareLevelAtLeastLimited() { return false; }
        private boolean isHardwareLevelAtLeastFull() { return false; }
        private boolean isHardwareLevelAtLeastLevel3() { return false; }
        private boolean isCapabilitySupported(int p0) { return false; }
        private boolean isColorOutputSupported() { return false; }
        private boolean isPrivateReprocessingSupported() { return false; }
        private boolean isYUVReprocessingSupported() { return false; }
        private android.util.Size getMaxRecordingSize() { return null; }
        private android.util.Size getMaxCameraRecordingSize() { return null; }
        private android.util.Size getMaxPreviewSize(java.util.List<android.util.Size> p0) { return null; }
        private static int compareSizes(int p0, int p1, int p2, int p3) { return 0; }
        private static java.util.List<android.util.Size> getAscendingOrderSizes(java.util.List<android.util.Size> p0, boolean p1) { return null; }

        public static class SizeComparator implements java.util.Comparator<android.util.Size> {
            public SizeComparator() {}
            public int compare(android.util.Size p0, android.util.Size p1) { return 0; }
        }
    }
}
