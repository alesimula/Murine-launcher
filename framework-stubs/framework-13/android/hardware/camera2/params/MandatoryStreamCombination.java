package android.hardware.camera2.params;

public final class MandatoryStreamCombination {
    public MandatoryStreamCombination(java.util.List<android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation> p0, java.lang.String p1, boolean p2) {}
    public java.lang.CharSequence getDescription() { return null; }
    public boolean isReprocessable() { return false; }
    public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation> getStreamsInformation() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(int p0, int p1, android.util.Size p2, java.util.List<java.lang.Integer> p3, android.hardware.camera2.params.StreamConfigurationMap p4, android.hardware.camera2.params.StreamConfigurationMap p5, boolean p6) {}
        public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatoryPreviewStabilizedStreamCombinations() { return null; }
        public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatory10BitStreamCombinations() { return null; }
        public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatoryStreamUseCaseCombinations() { return null; }
        public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatoryConcurrentStreamCombinations() { return null; }
        public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatoryMaximumResolutionStreamCombinations() { return null; }
        public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatoryStreamCombinations() { return null; }
        public static android.util.Size getMinSize(android.util.Size p0, android.util.Size p1) { return null; }
        public static android.util.Size getMaxSize(android.util.Size... p0) { return null; }

        public static abstract class SizeComparator implements java.util.Comparator<android.util.Size> {
            public SizeComparator() {}
            public int compare(android.util.Size p0, android.util.Size p1) { return 0; }
        }
    }

    public static final class MandatoryStreamInformation {
        public MandatoryStreamInformation(java.util.List<android.util.Size> p0, int p1, boolean p2) {}
        public MandatoryStreamInformation(java.util.List<android.util.Size> p0, int p1, boolean p2, boolean p3) {}
        public MandatoryStreamInformation(java.util.List<android.util.Size> p0, int p1, boolean p2, boolean p3, boolean p4) {}
        public MandatoryStreamInformation(java.util.List<android.util.Size> p0, int p1, boolean p2, boolean p3, boolean p4, boolean p5) {}
        public MandatoryStreamInformation(java.util.List<android.util.Size> p0, int p1, boolean p2, boolean p3, boolean p4, boolean p5, long p6) {}
        public boolean isInput() { return false; }
        public boolean isUltraHighResolution() { return false; }
        public boolean isMaximumSize() { return false; }
        public boolean is10BitCapable() { return false; }
        public java.util.List<android.util.Size> getAvailableSizes() { return null; }
        public int getFormat() { return 0; }
        public int get10BitFormat() { return 0; }
        public long getStreamUseCase() { return 0L; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static enum ReprocessType {
        NONE,
        PRIVATE,
        YUV,
        REMOSAIC;
    }

    private static enum SizeThreshold {
        VGA,
        PREVIEW,
        RECORD,
        MAXIMUM,
        s720p,
        s1440p,
        FULL_RES;
    }

    private static final class StreamCombinationTemplate {
        public android.hardware.camera2.params.MandatoryStreamCombination.StreamTemplate[] mStreamTemplates;
        public java.lang.String mDescription;
        public android.hardware.camera2.params.MandatoryStreamCombination.ReprocessType mReprocessType;
        public boolean mSubstituteYUV;
        public StreamCombinationTemplate(android.hardware.camera2.params.MandatoryStreamCombination.StreamTemplate[] p0, java.lang.String p1) {}
        public StreamCombinationTemplate(android.hardware.camera2.params.MandatoryStreamCombination.StreamTemplate[] p0, java.lang.String p1, android.hardware.camera2.params.MandatoryStreamCombination.ReprocessType p2) {}
        public StreamCombinationTemplate(android.hardware.camera2.params.MandatoryStreamCombination.StreamTemplate[] p0, java.lang.String p1, boolean p2) {}
        public StreamCombinationTemplate(android.hardware.camera2.params.MandatoryStreamCombination.StreamTemplate[] p0, java.lang.String p1, android.hardware.camera2.params.MandatoryStreamCombination.ReprocessType p2, boolean p3) {}
    }

    private static final class StreamTemplate {
        public int mFormat;
        public android.hardware.camera2.params.MandatoryStreamCombination.SizeThreshold mSizeThreshold;
        public long mStreamUseCase;
        public StreamTemplate(int p0, android.hardware.camera2.params.MandatoryStreamCombination.SizeThreshold p1) {}
        public StreamTemplate(int p0, android.hardware.camera2.params.MandatoryStreamCombination.SizeThreshold p1, long p2) {}
    }
}
