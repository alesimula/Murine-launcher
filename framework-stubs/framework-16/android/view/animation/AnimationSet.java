package android.view.animation;

public class AnimationSet extends android.view.animation.Animation {
    public AnimationSet(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public AnimationSet(boolean p0) { super(); }
    protected android.view.animation.AnimationSet clone() throws java.lang.CloneNotSupportedException { return null; }
    public void setFillAfter(boolean p0) {}
    public void setFillBefore(boolean p0) {}
    public void setRepeatMode(int p0) {}
    public void setStartOffset(long p0) {}
    public boolean hasAlpha() { return false; }
    public void setDuration(long p0) {}
    public void addAnimation(android.view.animation.Animation p0) {}
    public void setStartTime(long p0) {}
    public long getStartTime() { return 0L; }
    public void restrictDuration(long p0) {}
    public long getDuration() { return 0L; }
    public long computeDurationHint() { return 0L; }
    public void initializeInvalidateRegion(int p0, int p1, int p2, int p3) {}
    public void getTransformationAt(float p0, android.view.animation.Transformation p1) {}
    public boolean getTransformation(long p0, android.view.animation.Transformation p1) { return false; }
    public void scaleCurrentDuration(float p0) {}
    public void initialize(int p0, int p1, int p2, int p3) {}
    public void reset() {}
    void restoreChildrenStartOffset() {}
    public java.util.List<android.view.animation.Animation> getAnimations() { return null; }
    public boolean willChangeTransformationMatrix() { return false; }
    public boolean willChangeBounds() { return false; }
    public int getExtensionEdges() { return 0; }
}
