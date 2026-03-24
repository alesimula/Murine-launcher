package com.android.internal.transition;

public class EpicenterTranslateClipReveal extends android.transition.Visibility {
    private static final java.lang.String PROPNAME_CLIP = "android:epicenterReveal:clip";
    private static final java.lang.String PROPNAME_BOUNDS = "android:epicenterReveal:bounds";
    private static final java.lang.String PROPNAME_TRANSLATE_X = "android:epicenterReveal:translateX";
    private static final java.lang.String PROPNAME_TRANSLATE_Y = "android:epicenterReveal:translateY";
    private static final java.lang.String PROPNAME_TRANSLATE_Z = "android:epicenterReveal:translateZ";
    private static final java.lang.String PROPNAME_Z = "android:epicenterReveal:z";
    private final android.animation.TimeInterpolator mInterpolatorX = null;
    private final android.animation.TimeInterpolator mInterpolatorY = null;
    private final android.animation.TimeInterpolator mInterpolatorZ = null;
    public EpicenterTranslateClipReveal() { super(); }
    public EpicenterTranslateClipReveal(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    private void captureValues(android.transition.TransitionValues p0) {}
    public android.animation.Animator onAppear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }
    public android.animation.Animator onDisappear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }
    private android.graphics.Rect getEpicenterOrCenter(android.graphics.Rect p0) { return null; }
    private android.graphics.Rect getBestRect(android.transition.TransitionValues p0) { return null; }
    private static android.animation.Animator createRectAnimator(android.view.View p0, com.android.internal.transition.EpicenterTranslateClipReveal.State p1, com.android.internal.transition.EpicenterTranslateClipReveal.State p2, float p3, com.android.internal.transition.EpicenterTranslateClipReveal.State p4, com.android.internal.transition.EpicenterTranslateClipReveal.State p5, float p6, android.transition.TransitionValues p7, android.animation.TimeInterpolator p8, android.animation.TimeInterpolator p9, android.animation.TimeInterpolator p10) { return null; }

    private static class State {
        int lower;
        int upper;
        float trans;
        public State() {}
        public State(int p0, int p1, float p2) {}
    }

    private static class StateEvaluator implements android.animation.TypeEvaluator<com.android.internal.transition.EpicenterTranslateClipReveal.State> {
        private final com.android.internal.transition.EpicenterTranslateClipReveal.State mTemp = null;
        private StateEvaluator() {}
        public com.android.internal.transition.EpicenterTranslateClipReveal.State evaluate(float p0, com.android.internal.transition.EpicenterTranslateClipReveal.State p1, com.android.internal.transition.EpicenterTranslateClipReveal.State p2) { return null; }
    }

    private static class StateProperty extends android.util.Property<android.view.View, com.android.internal.transition.EpicenterTranslateClipReveal.State> {
        public static final char TARGET_X = 'x';
        public static final char TARGET_Y = 'y';
        private final android.graphics.Rect mTempRect = null;
        private final com.android.internal.transition.EpicenterTranslateClipReveal.State mTempState = null;
        private final int mTargetDimension = 0;
        public StateProperty(char p0) { super(null, null); }
        public com.android.internal.transition.EpicenterTranslateClipReveal.State get(android.view.View p0) { return null; }
        public void set(android.view.View p0, com.android.internal.transition.EpicenterTranslateClipReveal.State p1) {}
    }
}
