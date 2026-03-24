package com.android.internal.widget.remotecompose.core.operations.layout;

public class AnimatableValue implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    boolean mIsVariable;
    int mId;
    float mValue;
    boolean mAnimateValueChanges;
    boolean mAnimate;
    long mAnimateTargetTime;
    float mAnimateDuration;
    float mTargetRotationX;
    float mStartRotationX;
    long mLastUpdate;
    int mMotionEasingType;
    com.android.internal.widget.remotecompose.core.operations.utilities.easing.FloatAnimation mMotionEasing;
    public AnimatableValue(float p0, boolean p1) {}
    public AnimatableValue(float p0) {}
    public float getValue() { return 0.0f; }
    public float evaluate(com.android.internal.widget.remotecompose.core.PaintContext p0) { return 0.0f; }
    public java.lang.String toString() { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
