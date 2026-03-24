package android.transition;

public class TransitionUtils {
    private static int MAX_IMAGE_SIZE;
    public TransitionUtils() {}
    static android.animation.Animator mergeAnimators(android.animation.Animator p0, android.animation.Animator p1) { return null; }
    public static android.transition.Transition mergeTransitions(android.transition.Transition... p0) { return null; }
    public static android.view.View copyViewImage(android.view.ViewGroup p0, android.view.View p1, android.view.View p2) { return null; }
    public static android.graphics.Bitmap createDrawableBitmap(android.graphics.drawable.Drawable p0, android.view.View p1) { return null; }
    public static android.graphics.Bitmap createViewBitmap(android.view.View p0, android.graphics.Matrix p1, android.graphics.RectF p2, android.view.ViewGroup p3) { return null; }

    public static class MatrixEvaluator implements android.animation.TypeEvaluator<android.graphics.Matrix> {
        float[] mTempStartValues;
        float[] mTempEndValues;
        android.graphics.Matrix mTempMatrix;
        public MatrixEvaluator() {}
        public android.graphics.Matrix evaluate(float p0, android.graphics.Matrix p1, android.graphics.Matrix p2) { return null; }
    }
}
