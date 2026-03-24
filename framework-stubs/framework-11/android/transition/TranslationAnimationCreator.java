package android.transition;

class TranslationAnimationCreator {
    TranslationAnimationCreator() {}
    static android.animation.Animator createAnimation(android.view.View p0, android.transition.TransitionValues p1, int p2, int p3, float p4, float p5, float p6, float p7, android.animation.TimeInterpolator p8, android.transition.Transition p9) { return null; }

    private static class TransitionPositionListener extends android.animation.AnimatorListenerAdapter implements android.transition.Transition.TransitionListener {
        private final android.view.View mViewInHierarchy = null;
        private final android.view.View mMovingView = null;
        private final int mStartX = 0;
        private final int mStartY = 0;
        private int[] mTransitionPosition;
        private float mPausedX;
        private float mPausedY;
        private final float mTerminalX = 0.0f;
        private final float mTerminalY = 0.0f;
        private TransitionPositionListener(android.view.View p0, android.view.View p1, int p2, int p3, float p4, float p5) { super(); }
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationPause(android.animation.Animator p0) {}
        public void onAnimationResume(android.animation.Animator p0) {}
        public void onTransitionStart(android.transition.Transition p0) {}
        public void onTransitionEnd(android.transition.Transition p0) {}
        public void onTransitionCancel(android.transition.Transition p0) {}
        public void onTransitionPause(android.transition.Transition p0) {}
        public void onTransitionResume(android.transition.Transition p0) {}
    }
}
