package android.graphics.drawable;

public class StateListDrawable extends android.graphics.drawable.DrawableContainer {
    private static final java.lang.String TAG = "StateListDrawable";
    private static final boolean DEBUG = false;
    private android.graphics.drawable.StateListDrawable.StateListState mStateListState;
    private boolean mMutated;
    public StateListDrawable() { super(); }
    public void addState(int[] p0, android.graphics.drawable.Drawable p1) {}
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    protected boolean onStateChange(int[] p0) { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    private void inflateChildElements(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    int[] extractStateSet(android.util.AttributeSet p0) { return null; }
    android.graphics.drawable.StateListDrawable.StateListState getStateListState() { return null; }
    public int getStateCount() { return 0; }
    public int[] getStateSet(int p0) { return null; }
    public android.graphics.drawable.Drawable getStateDrawable(int p0) { return null; }
    public int findStateDrawableIndex(int[] p0) { return 0; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    android.graphics.drawable.StateListDrawable.StateListState cloneConstantState() { return null; }
    public void clearMutated() {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    protected void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState p0) {}
    private StateListDrawable(android.graphics.drawable.StateListDrawable.StateListState p0, android.content.res.Resources p1) { super(); }
    StateListDrawable(android.graphics.drawable.StateListDrawable.StateListState p0) { super(); }

    static class StateListState extends android.graphics.drawable.DrawableContainer.DrawableContainerState {
        int[] mThemeAttrs;
        int[][] mStateSets;
        StateListState(android.graphics.drawable.StateListDrawable.StateListState p0, android.graphics.drawable.StateListDrawable p1, android.content.res.Resources p2) { super(null, null, null); }
        void mutate() {}
        int addStateSet(int[] p0, android.graphics.drawable.Drawable p1) { return 0; }
        int indexOfStateSet(int[] p0) { return 0; }
        boolean hasFocusStateSpecified() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public boolean canApplyTheme() { return false; }
        public void growArray(int p0, int p1) {}
    }
}
