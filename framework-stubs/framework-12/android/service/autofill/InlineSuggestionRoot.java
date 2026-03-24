package android.service.autofill;

@android.annotation.SuppressLint("ViewConstructor")
public class InlineSuggestionRoot extends android.widget.FrameLayout {
    private static final java.lang.String TAG = "InlineSuggestionRoot";
    private final android.service.autofill.IInlineSuggestionUiCallback mCallback = null;
    private final int mTouchSlop = 0;
    private float mDownX;
    private float mDownY;
    public InlineSuggestionRoot(android.content.Context p0, android.service.autofill.IInlineSuggestionUiCallback p1) { super((android.content.Context)null); }
    @android.annotation.SuppressLint("ClickableViewAccessibility")
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
}
