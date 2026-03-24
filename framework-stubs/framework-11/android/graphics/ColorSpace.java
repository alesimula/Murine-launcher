package android.graphics;

public abstract class ColorSpace {
    public static final float[] ILLUMINANT_A = null;
    public static final float[] ILLUMINANT_B = null;
    public static final float[] ILLUMINANT_C = null;
    public static final float[] ILLUMINANT_D50 = null;
    public static final float[] ILLUMINANT_D55 = null;
    public static final float[] ILLUMINANT_D60 = null;
    public static final float[] ILLUMINANT_D65 = null;
    public static final float[] ILLUMINANT_D75 = null;
    public static final float[] ILLUMINANT_E = null;
    public static final int MIN_ID = -1;
    public static final int MAX_ID = 63;
    private static final float[] SRGB_PRIMARIES = null;
    private static final float[] NTSC_1953_PRIMARIES = null;
    private static final float[] GRAY_PRIMARIES = null;
    private static final float[] ILLUMINANT_D50_XYZ = null;
    private static final android.graphics.ColorSpace.Rgb.TransferParameters SRGB_TRANSFER_PARAMETERS = null;
    private static final android.graphics.ColorSpace[] sNamedColorSpaces = null;
    private final java.lang.String mName = null;
    private final android.graphics.ColorSpace.Model mModel = null;
    private final int mId = 0;
    ColorSpace(java.lang.String p0, android.graphics.ColorSpace.Model p1, int p2) {}
    public java.lang.String getName() { return null; }
    public int getId() { return 0; }
    public android.graphics.ColorSpace.Model getModel() { return null; }
    public int getComponentCount() { return 0; }
    public abstract boolean isWideGamut();
    public boolean isSrgb() { return false; }
    public abstract float getMinValue(int p0);
    public abstract float getMaxValue(int p0);
    public float[] toXyz(float p0, float p1, float p2) { return null; }
    public abstract float[] toXyz(float[] p0);
    public float[] fromXyz(float p0, float p1, float p2) { return null; }
    public abstract float[] fromXyz(float[] p0);
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public static android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace p0, android.graphics.ColorSpace p1) { return null; }
    public static android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace p0, android.graphics.ColorSpace p1, android.graphics.ColorSpace.RenderIntent p2) { return null; }
    public static android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace p0) { return null; }
    public static android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace p0, android.graphics.ColorSpace.RenderIntent p1) { return null; }
    public static android.graphics.ColorSpace adapt(android.graphics.ColorSpace p0, float[] p1) { return null; }
    public static android.graphics.ColorSpace adapt(android.graphics.ColorSpace p0, float[] p1, android.graphics.ColorSpace.Adaptation p2) { return null; }
    private static float[] adaptToIlluminantD50(float[] p0, float[] p1) { return null; }
    static android.graphics.ColorSpace get(int p0) { return null; }
    public static android.graphics.ColorSpace get(android.graphics.ColorSpace.Named p0) { return null; }
    public static android.graphics.ColorSpace match(float[] p0, android.graphics.ColorSpace.Rgb.TransferParameters p1) { return null; }
    public static android.graphics.ColorSpace.Renderer createRenderer() { return null; }
    private static double rcpResponse(double p0, double p1, double p2, double p3, double p4, double p5) { return 0.0; }
    private static double response(double p0, double p1, double p2, double p3, double p4, double p5) { return 0.0; }
    private static double rcpResponse(double p0, double p1, double p2, double p3, double p4, double p5, double p6, double p7) { return 0.0; }
    private static double response(double p0, double p1, double p2, double p3, double p4, double p5, double p6, double p7) { return 0.0; }
    private static double absRcpResponse(double p0, double p1, double p2, double p3, double p4, double p5) { return 0.0; }
    private static double absResponse(double p0, double p1, double p2, double p3, double p4, double p5) { return 0.0; }
    private static boolean compare(android.graphics.ColorSpace.Rgb.TransferParameters p0, android.graphics.ColorSpace.Rgb.TransferParameters p1) { return false; }
    private static boolean compare(float[] p0, float[] p1) { return false; }
    private static float[] inverse3x3(float[] p0) { return null; }
    public static float[] mul3x3(float[] p0, float[] p1) { return null; }
    private static float[] mul3x3Float3(float[] p0, float[] p1) { return null; }
    private static float[] mul3x3Diag(float[] p0, float[] p1) { return null; }
    private static float[] xyYToXyz(float[] p0) { return null; }
    private static void xyYToUv(float[] p0) {}
    private static float[] chromaticAdaptation(float[] p0, float[] p1, float[] p2) { return null; }
    public static float[] cctToXyz(int p0) { return null; }
    public static float[] cctToIlluminantdXyz(int p0) { return null; }
    public static float[] chromaticAdaptation(android.graphics.ColorSpace.Adaptation p0, float[] p1, float[] p2) { return null; }
    long getNativeInstance() { return 0L; }

    public static enum Adaptation {
        BRADFORD,
        VON_KRIES,
        CIECAT02;
        final float[] mTransform = null;
        private Adaptation() {}
    }

    public static class Connector {
        private final android.graphics.ColorSpace mSource = null;
        private final android.graphics.ColorSpace mDestination = null;
        private final android.graphics.ColorSpace mTransformSource = null;
        private final android.graphics.ColorSpace mTransformDestination = null;
        private final android.graphics.ColorSpace.RenderIntent mIntent = null;
        private final float[] mTransform = null;
        Connector(android.graphics.ColorSpace p0, android.graphics.ColorSpace p1, android.graphics.ColorSpace.RenderIntent p2) {}
        private Connector(android.graphics.ColorSpace p0, android.graphics.ColorSpace p1, android.graphics.ColorSpace p2, android.graphics.ColorSpace p3, android.graphics.ColorSpace.RenderIntent p4, float[] p5) {}
        private static float[] computeTransform(android.graphics.ColorSpace p0, android.graphics.ColorSpace p1, android.graphics.ColorSpace.RenderIntent p2) { return null; }
        public android.graphics.ColorSpace getSource() { return null; }
        public android.graphics.ColorSpace getDestination() { return null; }
        public android.graphics.ColorSpace.RenderIntent getRenderIntent() { return null; }
        public float[] transform(float p0, float p1, float p2) { return null; }
        public float[] transform(float[] p0) { return null; }
        static android.graphics.ColorSpace.Connector identity(android.graphics.ColorSpace p0) { return null; }

        private static class Rgb extends android.graphics.ColorSpace.Connector {
            private final android.graphics.ColorSpace.Rgb mSource = null;
            private final android.graphics.ColorSpace.Rgb mDestination = null;
            private final float[] mTransform = null;
            Rgb(android.graphics.ColorSpace.Rgb p0, android.graphics.ColorSpace.Rgb p1, android.graphics.ColorSpace.RenderIntent p2) { super(null, null, null); }
            public float[] transform(float[] p0) { return null; }
            private static float[] computeTransform(android.graphics.ColorSpace.Rgb p0, android.graphics.ColorSpace.Rgb p1, android.graphics.ColorSpace.RenderIntent p2) { return null; }
        }
    }

    private static final class Lab extends android.graphics.ColorSpace {
        private static final float A = 0.008856452070176601f;
        private static final float B = 7.787036895751953f;
        private static final float C = 0.13793103396892548f;
        private static final float D = 0.2068965584039688f;
        private Lab(java.lang.String p0, int p1) { super(null, null, 0); }
        public boolean isWideGamut() { return false; }
        public float getMinValue(int p0) { return 0.0f; }
        public float getMaxValue(int p0) { return 0.0f; }
        public float[] toXyz(float[] p0) { return null; }
        public float[] fromXyz(float[] p0) { return null; }
        private static float clamp(float p0, float p1, float p2) { return 0.0f; }
    }

    public static enum Model {
        RGB,
        XYZ,
        LAB,
        CMYK;
        private final int mComponentCount = 0;
        private Model() {}
        public int getComponentCount() { return 0; }
    }

    public static enum Named {
        SRGB,
        LINEAR_SRGB,
        EXTENDED_SRGB,
        LINEAR_EXTENDED_SRGB,
        BT709,
        BT2020,
        DCI_P3,
        DISPLAY_P3,
        NTSC_1953,
        SMPTE_C,
        ADOBE_RGB,
        PRO_PHOTO_RGB,
        ACES,
        ACESCG,
        CIE_XYZ,
        CIE_LAB;
        private Named() {}
    }

    public static enum RenderIntent {
        PERCEPTUAL,
        RELATIVE,
        SATURATION,
        ABSOLUTE;
        private RenderIntent() {}
    }

    public static class Renderer {
        private static final int NATIVE_SIZE = 1440;
        private static final float UCS_SCALE = 1.5f;
        private static final int CHROMATICITY_RESOLUTION = 32;
        private static final double ONE_THIRD = 0.3333333333333333;
        private int mSize;
        private boolean mShowWhitePoint;
        private boolean mClip;
        private boolean mUcs;
        private final java.util.List<android.util.Pair<android.graphics.ColorSpace, java.lang.Integer>> mColorSpaces = null;
        private final java.util.List<android.graphics.ColorSpace.Renderer.Point> mPoints = null;
        private static final float[] SPECTRUM_LOCUS_X = null;
        private static final float[] SPECTRUM_LOCUS_Y = null;
        private Renderer() {}
        public android.graphics.ColorSpace.Renderer clip(boolean p0) { return null; }
        public android.graphics.ColorSpace.Renderer uniformChromaticityScale(boolean p0) { return null; }
        public android.graphics.ColorSpace.Renderer size(int p0) { return null; }
        public android.graphics.ColorSpace.Renderer showWhitePoint(boolean p0) { return null; }
        public android.graphics.ColorSpace.Renderer add(android.graphics.ColorSpace p0, int p1) { return null; }
        public android.graphics.ColorSpace.Renderer add(android.graphics.ColorSpace p0, float p1, float p2, float p3, int p4) { return null; }
        public android.graphics.Bitmap render() { return null; }
        private void drawPoints(android.graphics.Canvas p0, int p1, int p2, android.graphics.Paint p3) {}
        private void drawGamuts(android.graphics.Canvas p0, int p1, int p2, android.graphics.Paint p3, android.graphics.Path p4, float[] p5, float[] p6) {}
        private static void getPrimaries(android.graphics.ColorSpace.Rgb p0, float[] p1, boolean p2) {}
        private void drawLocus(android.graphics.Canvas p0, int p1, int p2, android.graphics.Paint p3, android.graphics.Path p4, float[] p5) {}
        private void drawBox(android.graphics.Canvas p0, int p1, int p2, android.graphics.Paint p3, android.graphics.Path p4) {}
        private void setTransform(android.graphics.Canvas p0, int p1, int p2, float[] p3) {}
        private void setUcsTransform(android.graphics.Canvas p0, int p1) {}
        private static void computeChromaticityMesh(float[] p0, int[] p1) {}
        private static int computeColor(float[] p0, float p1, float p2, float p3, android.graphics.ColorSpace p4) { return 0; }
        private static double sqr(double p0) { return 0.0; }

        private static class Point {
            final android.graphics.ColorSpace mColorSpace = null;
            final float[] mRgb = null;
            final int mColor = 0;
            Point(android.graphics.ColorSpace p0, float[] p1, int p2) {}
        }
    }

    public static class Rgb extends android.graphics.ColorSpace {
        private final float[] mWhitePoint = null;
        private final float[] mPrimaries = null;
        private final float[] mTransform = null;
        private final float[] mInverseTransform = null;
        private final java.util.function.DoubleUnaryOperator mOetf = null;
        private final java.util.function.DoubleUnaryOperator mEotf = null;
        private final java.util.function.DoubleUnaryOperator mClampedOetf = null;
        private final java.util.function.DoubleUnaryOperator mClampedEotf = null;
        private final float mMin = 0.0f;
        private final float mMax = 0.0f;
        private final boolean mIsWideGamut = false;
        private final boolean mIsSrgb = false;
        private final android.graphics.ColorSpace.Rgb.TransferParameters mTransferParameters = null;
        private final long mNativePtr = 0L;
        long getNativeInstance() { return 0L; }
        private static native long nativeGetNativeFinalizer();
        private static native long nativeCreate(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float[] p7);
        public Rgb(java.lang.String p0, float[] p1, java.util.function.DoubleUnaryOperator p2, java.util.function.DoubleUnaryOperator p3) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, float[] p2, java.util.function.DoubleUnaryOperator p3, java.util.function.DoubleUnaryOperator p4, float p5, float p6) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, android.graphics.ColorSpace.Rgb.TransferParameters p2) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, float[] p2, android.graphics.ColorSpace.Rgb.TransferParameters p3) { super(null, null, 0); }
        private Rgb(java.lang.String p0, float[] p1, float[] p2, float[] p3, android.graphics.ColorSpace.Rgb.TransferParameters p4, int p5) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, double p2) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, float[] p2, double p3) { super(null, null, 0); }
        private Rgb(java.lang.String p0, float[] p1, float[] p2, double p3, float p4, float p5, int p6) { super(null, null, 0); }
        private Rgb(java.lang.String p0, float[] p1, float[] p2, float[] p3, java.util.function.DoubleUnaryOperator p4, java.util.function.DoubleUnaryOperator p5, float p6, float p7, android.graphics.ColorSpace.Rgb.TransferParameters p8, int p9) { super(null, null, 0); }
        private Rgb(android.graphics.ColorSpace.Rgb p0, float[] p1, float[] p2) { super(null, null, 0); }
        public float[] getWhitePoint(float[] p0) { return null; }
        public float[] getWhitePoint() { return null; }
        public float[] getPrimaries(float[] p0) { return null; }
        public float[] getPrimaries() { return null; }
        public float[] getTransform(float[] p0) { return null; }
        public float[] getTransform() { return null; }
        public float[] getInverseTransform(float[] p0) { return null; }
        public float[] getInverseTransform() { return null; }
        public java.util.function.DoubleUnaryOperator getOetf() { return null; }
        public java.util.function.DoubleUnaryOperator getEotf() { return null; }
        public android.graphics.ColorSpace.Rgb.TransferParameters getTransferParameters() { return null; }
        public boolean isSrgb() { return false; }
        public boolean isWideGamut() { return false; }
        public float getMinValue(int p0) { return 0.0f; }
        public float getMaxValue(int p0) { return 0.0f; }
        public float[] toLinear(float p0, float p1, float p2) { return null; }
        public float[] toLinear(float[] p0) { return null; }
        public float[] fromLinear(float p0, float p1, float p2) { return null; }
        public float[] fromLinear(float[] p0) { return null; }
        public float[] toXyz(float[] p0) { return null; }
        public float[] fromXyz(float[] p0) { return null; }
        private double clamp(double p0) { return 0.0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        private static boolean isSrgb(float[] p0, float[] p1, java.util.function.DoubleUnaryOperator p2, java.util.function.DoubleUnaryOperator p3, float p4, float p5, int p6) { return false; }
        private static boolean isGray(float[] p0) { return false; }
        private static boolean compare(double p0, java.util.function.DoubleUnaryOperator p1, java.util.function.DoubleUnaryOperator p2) { return false; }
        private static boolean isWideGamut(float[] p0, float p1, float p2) { return false; }
        private static float area(float[] p0) { return 0.0f; }
        private static float cross(float p0, float p1, float p2, float p3) { return 0.0f; }
        private static boolean contains(float[] p0, float[] p1) { return false; }
        private static float[] computePrimaries(float[] p0) { return null; }
        private static float[] computeWhitePoint(float[] p0) { return null; }
        private static float[] xyPrimaries(float[] p0) { return null; }
        private static float[] xyWhitePoint(float[] p0) { return null; }
        private static float[] computeXYZMatrix(float[] p0, float[] p1) { return null; }

        private static class NoImagePreloadHolder {
            private NoImagePreloadHolder() {}
        }

        public static class TransferParameters {
            public final double a = 0.0;
            public final double b = 0.0;
            public final double c = 0.0;
            public final double d = 0.0;
            public final double e = 0.0;
            public final double f = 0.0;
            public final double g = 0.0;
            public TransferParameters(double p0, double p1, double p2, double p3, double p4) {}
            public TransferParameters(double p0, double p1, double p2, double p3, double p4, double p5, double p6) {}
            public boolean equals(java.lang.Object p0) { return false; }
            public int hashCode() { return 0; }
        }
    }

    private static final class Xyz extends android.graphics.ColorSpace {
        private Xyz(java.lang.String p0, int p1) { super(null, null, 0); }
        public boolean isWideGamut() { return false; }
        public float getMinValue(int p0) { return 0.0f; }
        public float getMaxValue(int p0) { return 0.0f; }
        public float[] toXyz(float[] p0) { return null; }
        public float[] fromXyz(float[] p0) { return null; }
        private static float clamp(float p0) { return 0.0f; }
    }
}
