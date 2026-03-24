package android.view.input;

public class MouseToTouchProcessor extends android.view.InputEventCompatProcessor {
    public static boolean isCompatibilityNeeded(android.content.Context p0) { return false; }
    public MouseToTouchProcessor(android.content.Context p0, android.os.Handler p1) { super((android.content.Context)null); }
    public java.util.List<android.view.InputEvent> processInputEventForCompatibility(android.view.InputEvent p0) { return null; }
    @android.annotation.Nullable
    public android.view.InputEvent processInputEventBeforeFinish(android.view.InputEvent p0) { return null; }
}
