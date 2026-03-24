package android.view.accessibility;

public interface MagnificationAnimationCallback {
    public static final android.view.accessibility.MagnificationAnimationCallback STUB_ANIMATION_CALLBACK = null;
    public void onResult(boolean p0);
    default public void onResult(boolean p0, android.view.MagnificationSpec p1) {}
}
