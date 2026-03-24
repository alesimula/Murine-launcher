package android.text;

public class DynamicLayout extends android.text.Layout {
    public static final int INVALID_BLOCK_INDEX = -1;
    @java.lang.Deprecated
    public DynamicLayout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, boolean p6) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public DynamicLayout(java.lang.CharSequence p0, java.lang.CharSequence p1, android.text.TextPaint p2, int p3, android.text.Layout.Alignment p4, float p5, float p6, boolean p7) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public DynamicLayout(java.lang.CharSequence p0, java.lang.CharSequence p1, android.text.TextPaint p2, int p3, android.text.Layout.Alignment p4, float p5, float p6, boolean p7, android.text.TextUtils.TruncateAt p8, int p9) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public DynamicLayout(java.lang.CharSequence p0, java.lang.CharSequence p1, android.text.TextPaint p2, int p3, android.text.Layout.Alignment p4, android.text.TextDirectionHeuristic p5, float p6, float p7, boolean p8, int p9, int p10, int p11, android.text.TextUtils.TruncateAt p12, int p13) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    public void reflow(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public android.util.ArraySet<java.lang.Integer> getBlocksAlwaysNeedToBeRedrawn() { return null; }
    public void updateBlocks(int p0, int p1, int p2) {}
    public void setBlocksDataForTest(int[] p0, int[] p1, int p2, int p3) {}
    public int[] getBlockEndLines() { return null; }
    public int[] getBlockIndices() { return null; }
    public int getBlockIndex(int p0) { return 0; }
    public void setBlockIndex(int p0, int p1) {}
    public int getNumberOfBlocks() { return 0; }
    public int getIndexFirstChangedBlock() { return 0; }
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
    public int getEllipsizedWidth() { return 0; }
    public int getEllipsisStart(int p0) { return 0; }
    public int getEllipsisCount(int p0) { return 0; }

    public static final class Builder {
        public static android.text.DynamicLayout.Builder obtain(java.lang.CharSequence p0, android.text.TextPaint p1, int p2) { return null; }
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

    private static class ChangeWatcher implements android.text.TextWatcher, android.text.SpanWatcher {
        public ChangeWatcher(android.text.DynamicLayout p0) {}
        public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
        public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
        public void afterTextChanged(android.text.Editable p0) {}
        public void onSpanAdded(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
        public void onSpanRemoved(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
        public void onSpanChanged(android.text.Spannable p0, java.lang.Object p1, int p2, int p3, int p4, int p5) {}
    }
}
