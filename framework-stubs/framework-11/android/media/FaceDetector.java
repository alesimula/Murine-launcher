package android.media;

public class FaceDetector {
    private static boolean sInitialized;
    private long mFD;
    private long mSDK;
    private long mDCR;
    private int mWidth;
    private int mHeight;
    private int mMaxFaces;
    private byte[] mBWBuffer;
    public FaceDetector(int p0, int p1, int p2) {}
    public int findFaces(android.graphics.Bitmap p0, android.media.FaceDetector.Face[] p1) { return 0; }
    protected void finalize() throws java.lang.Throwable {}
    private static native void nativeClassInit();
    private native int fft_initialize(int p0, int p1, int p2);
    private native int fft_detect(android.graphics.Bitmap p0);
    private native void fft_get_face(android.media.FaceDetector.Face p0, int p1);
    private native void fft_destroy();

    public class Face {
        public static final float CONFIDENCE_THRESHOLD = 0.4000000059604645f;
        public static final int EULER_X = 0;
        public static final int EULER_Y = 1;
        public static final int EULER_Z = 2;
        private float mConfidence;
        private float mMidPointX;
        private float mMidPointY;
        private float mEyesDist;
        private float mPoseEulerX;
        private float mPoseEulerY;
        private float mPoseEulerZ;
        public float confidence() { return 0.0f; }
        public void getMidPoint(android.graphics.PointF p0) {}
        public float eyesDistance() { return 0.0f; }
        public float pose(int p0) { return 0.0f; }
        private Face(android.media.FaceDetector p0) {}
    }
}
