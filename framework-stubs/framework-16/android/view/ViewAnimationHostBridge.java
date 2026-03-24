package android.view;

public class ViewAnimationHostBridge extends android.animation.AnimatorListenerAdapter implements android.graphics.RenderNode.AnimationHost {
    public ViewAnimationHostBridge(android.view.View p0) { super(); }
    public void registerAnimatingRenderNode(android.graphics.RenderNode p0, android.animation.Animator p1) {}
    public void registerVectorDrawableAnimator(android.view.NativeVectorDrawableAnimator p0) {}
    public boolean isAttached() { return false; }
    public void onAnimationStart(android.animation.Animator p0) {}
    public void onAnimationEnd(android.animation.Animator p0) {}
}
