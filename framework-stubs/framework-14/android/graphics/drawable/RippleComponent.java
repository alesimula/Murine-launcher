package android.graphics.drawable;

abstract class RippleComponent {
    protected final android.graphics.drawable.RippleDrawable mOwner = null;
    protected final android.graphics.Rect mBounds = null;
    protected float mTargetRadius;
    protected float mDensityScale;
    public RippleComponent(android.graphics.drawable.RippleDrawable p0, android.graphics.Rect p1) {}
    public void onBoundsChange() {}
    public final void setup(float p0, int p1) {}
    public void getBounds(android.graphics.Rect p0) {}
    protected final void invalidateSelf() {}
    protected final void onHotspotBoundsChanged() {}
    protected void onTargetRadiusChanged(float p0) {}
}
