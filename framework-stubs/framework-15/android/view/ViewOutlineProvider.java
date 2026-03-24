package android.view;

public abstract class ViewOutlineProvider {
    public static final android.view.ViewOutlineProvider BACKGROUND = null;
    public static final android.view.ViewOutlineProvider BOUNDS = null;
    public static final android.view.ViewOutlineProvider PADDED_BOUNDS = null;
    public ViewOutlineProvider() {}
    public abstract void getOutline(android.view.View p0, android.graphics.Outline p1);
}
