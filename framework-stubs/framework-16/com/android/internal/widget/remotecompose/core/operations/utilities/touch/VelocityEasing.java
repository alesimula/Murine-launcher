package com.android.internal.widget.remotecompose.core.operations.utilities.touch;

public class VelocityEasing {
    public VelocityEasing() {}
    public float getDuration() { return 0.0f; }
    public float getV(float p0) { return 0.0f; }
    public float getPos(float p0) { return 0.0f; }
    public java.lang.String toString() { return null; }
    public void config(float p0, float p1, float p2, float p3, float p4, float p5, com.android.internal.widget.remotecompose.core.operations.utilities.touch.VelocityEasing.Easing p6) {}
    double getEasing(double p0) { return 0.0; }
    protected void configureEasingAdapter() {}

    static interface Easing {
        public double get(double p0);
        public double getDiff(double p0);
        public com.android.internal.widget.remotecompose.core.operations.utilities.touch.VelocityEasing.Easing clone();
    }

    class Stage {
        final int mStage = 0;
        Stage(com.android.internal.widget.remotecompose.core.operations.utilities.touch.VelocityEasing p0, int p1) {}
        void setUp(float p0, float p1, float p2, float p3, float p4, float p5) {}
        float getPos(float p0) { return 0.0f; }
        float getVel(float p0) { return 0.0f; }
    }
}
