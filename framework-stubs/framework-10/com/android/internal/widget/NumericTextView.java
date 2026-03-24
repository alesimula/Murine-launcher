package com.android.internal.widget;

public class NumericTextView extends android.widget.TextView {
    private static final int RADIX = 10;
    private static final double LOG_RADIX = Double.valueOf(0.0);
    private int mMinValue;
    private int mMaxValue;
    private int mMaxCount;
    private boolean mShowLeadingZeroes;
    private int mValue;
    private int mCount;
    private int mPreviousValue;
    private com.android.internal.widget.NumericTextView.OnValueChangedListener mListener;
    @android.annotation.UnsupportedAppUsage
    public NumericTextView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public final void setValue(int p0) {}
    public final int getValue() { return 0; }
    public final void setRange(int p0, int p1) {}
    public final int getRangeMinimum() { return 0; }
    public final int getRangeMaximum() { return 0; }
    public final void setShowLeadingZeroes(boolean p0) {}
    public final boolean getShowLeadingZeroes() { return false; }
    private void updateDisplayedValue() {}
    private void updateMinimumWidth() {}
    public final void setOnDigitEnteredListener(com.android.internal.widget.NumericTextView.OnValueChangedListener p0) {}
    public final com.android.internal.widget.NumericTextView.OnValueChangedListener getOnDigitEnteredListener() { return null; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    private boolean handleKeyUp(int p0) { return false; }
    private static boolean isKeyCodeNumeric(int p0) { return false; }
    private static int numericKeyCodeToInt(int p0) { return 0; }

    public static interface OnValueChangedListener {
        public void onValueChanged(com.android.internal.widget.NumericTextView p0, int p1, boolean p2, boolean p3);
    }
}
