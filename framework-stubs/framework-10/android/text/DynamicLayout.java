package android.text;

public class DynamicLayout extends android.text.Layout {
    private static final int PRIORITY = 128;
    private static final int BLOCK_MINIMUM_CHARACTER_LENGTH = 400;
    private java.lang.CharSequence mBase;
    private java.lang.CharSequence mDisplay;
    private android.text.DynamicLayout.ChangeWatcher mWatcher;
    private boolean mIncludePad;
    private boolean mFallbackLineSpacing;
    private boolean mEllipsize;
    private int mEllipsizedWidth;
    private android.text.TextUtils.TruncateAt mEllipsizeAt;
    private int mBreakStrategy;
    private int mHyphenationFrequency;
    private int mJustificationMode;
    private android.text.PackedIntVector mInts;
    private android.text.PackedObjectVector<android.text.Layout.Directions> mObjects;
    public static final int INVALID_BLOCK_INDEX = -1;
    private int[] mBlockEndLines;
    private int[] mBlockIndices;
    private android.util.ArraySet<java.lang.Integer> mBlocksAlwaysNeedToBeRedrawn;
    private int mNumberOfBlocks;
    private int mIndexFirstChangedBlock;
    private int mTopPadding;
    private int mBottomPadding;
    private android.graphics.Rect mTempRect;
    @android.annotation.UnsupportedAppUsage
    private static android.text.StaticLayout sStaticLayout;
    private static android.text.StaticLayout.Builder sBuilder;
    private static final java.lang.Object[] sLock = null;
    private static final int START = 0;
    private static final int DIR = 0;
    private static final int TAB = 0;
    private static final int TOP = 1;
    private static final int DESCENT = 2;
    private static final int EXTRA = 3;
    private static final int HYPHEN = 4;
    private static final int MAY_PROTRUDE_FROM_TOP_OR_BOTTOM = 4;
    private static final int COLUMNS_NORMAL = 5;
    private static final int ELLIPSIS_START = 5;
    private static final int ELLIPSIS_COUNT = 6;
    private static final int COLUMNS_ELLIPSIZE = 7;
    private static final int START_MASK = 536870911;
    private static final int DIR_SHIFT = 30;
    private static final int TAB_MASK = 536870912;
    private static final int HYPHEN_MASK = 255;
    private static final int MAY_PROTRUDE_FROM_TOP_OR_BOTTOM_MASK = 256;
    private static final int ELLIPSIS_UNDEFINED = -2147483648;
    @java.lang.Deprecated
    public DynamicLayout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, boolean p6) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public DynamicLayout(java.lang.CharSequence p0, java.lang.CharSequence p1, android.text.TextPaint p2, int p3, android.text.Layout.Alignment p4, float p5, float p6, boolean p7) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public DynamicLayout(java.lang.CharSequence p0, java.lang.CharSequence p1, android.text.TextPaint p2, int p3, android.text.Layout.Alignment p4, float p5, float p6, boolean p7, android.text.TextUtils.TruncateAt p8, int p9) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public DynamicLayout(java.lang.CharSequence p0, java.lang.CharSequence p1, android.text.TextPaint p2, int p3, android.text.Layout.Alignment p4, android.text.TextDirectionHeuristic p5, float p6, float p7, boolean p8, int p9, int p10, int p11, android.text.TextUtils.TruncateAt p12, int p13) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    private DynamicLayout(android.text.DynamicLayout.Builder p0) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    private static java.lang.CharSequence createEllipsizer(android.text.TextUtils.TruncateAt p0, java.lang.CharSequence p1) { return null; }
    private void generate(android.text.DynamicLayout.Builder p0) {}
    public void reflow(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    private boolean contentMayProtrudeFromLineTopOrBottom(java.lang.CharSequence p0, int p1, int p2) { return false; }
    private void createBlocks() {}
    public android.util.ArraySet<java.lang.Integer> getBlocksAlwaysNeedToBeRedrawn() { return null; }
    private void updateAlwaysNeedsToBeRedrawn(int p0) {}
    private void addBlockAtOffset(int p0) {}
    public void updateBlocks(int p0, int p1, int p2) {}
    public void setBlocksDataForTest(int[] p0, int[] p1, int p2, int p3) {}
    @android.annotation.UnsupportedAppUsage
    public int[] getBlockEndLines() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int[] getBlockIndices() { return null; }
    public int getBlockIndex(int p0) { return 0; }
    public void setBlockIndex(int p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public int getNumberOfBlocks() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getIndexFirstChangedBlock() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setIndexFirstChangedBlock(int p0) {}
    public int getLineCount() { return 0; }
    public int getLineTop(int p0) { return 0; }
    public int getLineDescent(int p0) { return 0; }
    public int getLineExtra(int p0) { return 0; }
    public int getLineStart(int p0) { return 0; }
    public boolean getLineContainsTab(int p0) { return false; }
    public int getParagraphDirection(int p0) { return 0; }
    public final android.text.Layout.Directions getLineDirections(int p0) { return null; }
    public int getTopPadding() { return 0; }
    public int getBottomPadding() { return 0; }
    public int getStartHyphenEdit(int p0) { return 0; }
    public int getEndHyphenEdit(int p0) { return 0; }
    private boolean getContentMayProtrudeFromTopOrBottom(int p0) { return false; }
    public int getEllipsizedWidth() { return 0; }
    public int getEllipsisStart(int p0) { return 0; }
    public int getEllipsisCount(int p0) { return 0; }

    private static class ChangeWatcher implements android.text.TextWatcher, android.text.SpanWatcher {
        private java.lang.ref.WeakReference<android.text.DynamicLayout> mLayout;
        public ChangeWatcher(android.text.DynamicLayout p0) {}
        private void reflow(java.lang.CharSequence p0, int p1, int p2, int p3) {}
        public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
        public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
        public void afterTextChanged(android.text.Editable p0) {}
        public void onSpanAdded(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
        public void onSpanRemoved(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
        public void onSpanChanged(android.text.Spannable p0, java.lang.Object p1, int p2, int p3, int p4, int p5) {}
    }

    public static final class Builder {
        private java.lang.CharSequence mBase;
        private java.lang.CharSequence mDisplay;
        private android.text.TextPaint mPaint;
        private int mWidth;
        private android.text.Layout.Alignment mAlignment;
        private android.text.TextDirectionHeuristic mTextDir;
        private float mSpacingMult;
        private float mSpacingAdd;
        private boolean mIncludePad;
        private boolean mFallbackLineSpacing;
        private int mBreakStrategy;
        private int mHyphenationFrequency;
        private int mJustificationMode;
        private android.text.TextUtils.TruncateAt mEllipsize;
        private int mEllipsizedWidth;
        private final android.graphics.Paint.FontMetricsInt mFontMetricsInt = null;
        private static final android.util.Pools.SynchronizedPool<android.text.DynamicLayout.Builder> sPool = null;
        private Builder() {}
        public static android.text.DynamicLayout.Builder obtain(java.lang.CharSequence p0, android.text.TextPaint p1, int p2) { return null; }
        private static void recycle(android.text.DynamicLayout.Builder p0) {}
        public android.text.DynamicLayout.Builder setDisplayText(java.lang.CharSequence p0) { return null; }
        public android.text.DynamicLayout.Builder setAlignment(android.text.Layout.Alignment p0) { return null; }
        public android.text.DynamicLayout.Builder setTextDirection(android.text.TextDirectionHeuristic p0) { return null; }
        public android.text.DynamicLayout.Builder setLineSpacing(float p0, float p1) { return null; }
        public android.text.DynamicLayout.Builder setIncludePad(boolean p0) { return null; }
        public android.text.DynamicLayout.Builder setUseLineSpacingFromFallbacks(boolean p0) { return null; }
        public android.text.DynamicLayout.Builder setEllipsizedWidth(int p0) { return null; }
        public android.text.DynamicLayout.Builder setEllipsize(android.text.TextUtils.TruncateAt p0) { return null; }
        public android.text.DynamicLayout.Builder setBreakStrategy(int p0) { return null; }
        public android.text.DynamicLayout.Builder setHyphenationFrequency(int p0) { return null; }
        public android.text.DynamicLayout.Builder setJustificationMode(int p0) { return null; }
        public android.text.DynamicLayout build() { return null; }
    }
}
