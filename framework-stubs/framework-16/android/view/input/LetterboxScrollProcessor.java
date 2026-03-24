package android.view.input;

public class LetterboxScrollProcessor extends android.view.InputEventCompatProcessor {
    public LetterboxScrollProcessor(android.content.Context p0, android.os.Handler p1) { super((android.content.Context)null); }
    public static boolean isCompatibilityNeeded() { return false; }
    @android.annotation.Nullable
    public java.util.List<android.view.InputEvent> processInputEventForCompatibility(android.view.InputEvent p0) { return null; }
    @android.annotation.Nullable
    public android.view.InputEvent processInputEventBeforeFinish(android.view.InputEvent p0) { return null; }

    private static enum LetterboxScrollState {
        AWAITING_GESTURE_START,
        GESTURE_STARTED_IN_APP,
        GESTURE_STARTED_OUTSIDE_APP,
        SCROLLING_STARTED_OUTSIDE_APP;
    }

    private class ScrollListener extends android.view.GestureDetector.SimpleOnGestureListener {
        public boolean onScroll(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
    }
}
