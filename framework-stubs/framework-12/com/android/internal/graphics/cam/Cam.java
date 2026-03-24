package com.android.internal.graphics.cam;

public class Cam {
    private static final float DL_MAX = 0.20000000298023224f;
    private static final float DE_MAX = 1.0f;
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4000000059604645f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.009999999776482582f;
    private final float mHue = 0.0f;
    private final float mChroma = 0.0f;
    private final float mJ = 0.0f;
    private final float mQ = 0.0f;
    private final float mM = 0.0f;
    private final float mS = 0.0f;
    private final float mJstar = 0.0f;
    private final float mAstar = 0.0f;
    private final float mBstar = 0.0f;
    public float getHue() { return 0.0f; }
    public float getChroma() { return 0.0f; }
    public float getJ() { return 0.0f; }
    public float getQ() { return 0.0f; }
    public float getM() { return 0.0f; }
    public float getS() { return 0.0f; }
    public float getJstar() { return 0.0f; }
    public float getAstar() { return 0.0f; }
    public float getBstar() { return 0.0f; }
    Cam(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8) {}
    public static int getInt(float p0, float p1, float p2) { return 0; }
    public static com.android.internal.graphics.cam.Cam fromInt(int p0) { return null; }
    public static com.android.internal.graphics.cam.Cam fromIntInFrame(int p0, com.android.internal.graphics.cam.Frame p1) { return null; }
    private static com.android.internal.graphics.cam.Cam fromJch(float p0, float p1, float p2) { return null; }
    private static com.android.internal.graphics.cam.Cam fromJchInFrame(float p0, float p1, float p2, com.android.internal.graphics.cam.Frame p3) { return null; }
    public float distance(com.android.internal.graphics.cam.Cam p0) { return 0.0f; }
    public int viewedInSrgb() { return 0; }
    public int viewed(com.android.internal.graphics.cam.Frame p0) { return 0; }
    public static int getInt(float p0, float p1, float p2, com.android.internal.graphics.cam.Frame p3) { return 0; }
    private static com.android.internal.graphics.cam.Cam findCamByJ(float p0, float p1, float p2) { return null; }
}
