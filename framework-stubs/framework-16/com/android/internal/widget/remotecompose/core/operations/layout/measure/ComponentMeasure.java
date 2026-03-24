package com.android.internal.widget.remotecompose.core.operations.layout.measure;

public class ComponentMeasure {
    int mId;
    float mX;
    float mY;
    float mW;
    float mH;
    int mVisibility;
    public void setX(float p0) {}
    public void setY(float p0) {}
    public void setW(float p0) {}
    public void setH(float p0) {}
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public float getW() { return 0.0f; }
    public float getH() { return 0.0f; }
    public int getVisibility() { return 0; }
    public void setVisibility(int p0) {}
    public ComponentMeasure(int p0, float p1, float p2, float p3, float p4, int p5) {}
    public ComponentMeasure(int p0, float p1, float p2, float p3, float p4) {}
    public ComponentMeasure(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) {}
    public void copyFrom(com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p0) {}
    public boolean same(com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p0) { return false; }
    public boolean isGone() { return false; }
    public boolean isVisible() { return false; }
    public boolean isInvisible() { return false; }
    public void clearVisibilityOverride() {}
    public void addVisibilityOverride(int p0) {}
}
