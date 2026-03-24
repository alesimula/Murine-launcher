package com.android.internal.transition;

public class EpicenterTranslateClipReveal extends android.transition.Visibility {
    public EpicenterTranslateClipReveal() { super(); }
    public EpicenterTranslateClipReveal(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    public android.animation.Animator onAppear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }
    public android.animation.Animator onDisappear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }

    private static class State {
        int lower;
        int upper;
        float trans;
        public State() {}
        public State(int p0, int p1, float p2) {}
    }

    private static class StateEvaluator implements android.animation.TypeEvaluator<com.android.internal.transition.EpicenterTranslateClipReveal.State> {
        public com.android.internal.transition.EpicenterTranslateClipReveal.State evaluate(float p0, com.android.internal.transition.EpicenterTranslateClipReveal.State p1, com.android.internal.transition.EpicenterTranslateClipReveal.State p2) { return null; }
    }

    private static class StateProperty extends android.util.Property<android.view.View, com.android.internal.transition.EpicenterTranslateClipReveal.State> {
        public static final char TARGET_X = 'x';
        public static final char TARGET_Y = 'y';
        public StateProperty(char p0) { super(null, null); }
        public com.android.internal.transition.EpicenterTranslateClipReveal.State get(android.view.View p0) { return null; }
        public void set(android.view.View p0, com.android.internal.transition.EpicenterTranslateClipReveal.State p1) {}
    }
}
