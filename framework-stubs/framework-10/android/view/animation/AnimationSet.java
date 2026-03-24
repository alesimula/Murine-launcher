package android.view.animation;

public class AnimationSet extends android.view.animation.Animation {
    private static final int PROPERTY_FILL_AFTER_MASK = 1;
    private static final int PROPERTY_FILL_BEFORE_MASK = 2;
    private static final int PROPERTY_REPEAT_MODE_MASK = 4;
    private static final int PROPERTY_START_OFFSET_MASK = 8;
    private static final int PROPERTY_SHARE_INTERPOLATOR_MASK = 16;
    private static final int PROPERTY_DURATION_MASK = 32;
    private static final int PROPERTY_MORPH_MATRIX_MASK = 64;
    private static final int PROPERTY_CHANGE_BOUNDS_MASK = 128;
    private int mFlags;
    private boolean mDirty;
    private boolean mHasAlpha;
    private java.util.ArrayList<android.view.animation.Animation> mAnimations;
    private android.view.animation.Transformation mTempTransformation;
    private long mLastEnd;
    private long[] mStoredOffsets;
    public AnimationSet(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public AnimationSet(boolean p0) { super(); }
    protected android.view.animation.AnimationSet clone() throws java.lang.CloneNotSupportedException { return null; }
    private void setFlag(int p0, boolean p1) {}
    private void init() {}
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
    public boolean getTransformation(long p0, android.view.animation.Transformation p1) { return false; }
    public void scaleCurrentDuration(float p0) {}
    public void initialize(int p0, int p1, int p2, int p3) {}
    public void reset() {}
    void restoreChildrenStartOffset() {}
    public java.util.List<android.view.animation.Animation> getAnimations() { return null; }
    public boolean willChangeTransformationMatrix() { return false; }
    public boolean willChangeBounds() { return false; }
}
