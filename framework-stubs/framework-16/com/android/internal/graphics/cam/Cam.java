package com.android.internal.graphics.cam;

public class Cam {
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
    @android.annotation.NonNull
    public static com.android.internal.graphics.cam.Cam fromInt(int p0) { return null; }
    @android.annotation.NonNull
    public static com.android.internal.graphics.cam.Cam fromIntInFrame(int p0, com.android.internal.graphics.cam.Frame p1) { return null; }
    public float distance(com.android.internal.graphics.cam.Cam p0) { return 0.0f; }
    public int viewedInSrgb() { return 0; }
    public int viewed(com.android.internal.graphics.cam.Frame p0) { return 0; }
    public static int getInt(float p0, float p1, float p2, com.android.internal.graphics.cam.Frame p3) { return 0; }
}
