package com.android.internal.widget.remotecompose.core.operations.layout.animation;

public class AnimationSpec extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation {
    public static final com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec DEFAULT = null;
    public static final com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec DISABLED = null;
    int mAnimationId;
    float mMotionDuration;
    int mMotionEasingType;
    float mVisibilityDuration;
    int mVisibilityEasingType;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION mEnterAnimation;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION mExitAnimation;
    public AnimationSpec(int p0, float p1, int p2, float p3, int p4, com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION p5, com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION p6) { super(); }
    public AnimationSpec() { super(); }
    public AnimationSpec(int p0) { super(); }
    public boolean isAnimationEnabled() { return false; }
    public int getAnimationId() { return 0; }
    public float getMotionDuration() { return 0.0f; }
    public int getMotionEasingType() { return 0; }
    public float getVisibilityDuration() { return 0.0f; }
    public int getVisibilityEasingType() { return 0; }
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION getEnterAnimation() { return null; }
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION getExitAnimation() { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static int animationToInt(com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION p0) { return 0; }
    @android.annotation.NonNull
    public static com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION intToAnimation(int p0) { return null; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, int p3, float p4, int p5, com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION p6, com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION p7) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}

    public static enum ANIMATION {
        FADE_IN,
        FADE_OUT,
        SLIDE_LEFT,
        SLIDE_RIGHT,
        SLIDE_TOP,
        SLIDE_BOTTOM,
        ROTATE,
        PARTICLE;
    }
}
