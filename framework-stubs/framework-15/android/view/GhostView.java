package android.view;

public class GhostView extends android.view.View {
    GhostView() { super((android.content.Context)null); }
    protected void onDraw(android.graphics.Canvas p0) {}
    public void setMatrix(android.graphics.Matrix p0) {}
    public void setVisibility(int p0) {}
    protected void onDetachedFromWindow() {}
    public static void calculateMatrix(android.view.View p0, android.view.ViewGroup p1, android.graphics.Matrix p2) {}
    public static android.view.GhostView addGhost(android.view.View p0, android.view.ViewGroup p1, android.graphics.Matrix p2) { return null; }
    public static android.view.GhostView addGhost(android.view.View p0, android.view.ViewGroup p1) { return null; }
    public static void removeGhost(android.view.View p0) {}
    public static android.view.GhostView getGhost(android.view.View p0) { return null; }
}
