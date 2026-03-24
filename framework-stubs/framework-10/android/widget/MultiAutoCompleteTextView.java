package android.widget;

public class MultiAutoCompleteTextView extends android.widget.AutoCompleteTextView {
    private android.widget.MultiAutoCompleteTextView.Tokenizer mTokenizer;
    public MultiAutoCompleteTextView(android.content.Context p0) { super((android.content.Context)null); }
    public MultiAutoCompleteTextView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MultiAutoCompleteTextView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MultiAutoCompleteTextView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    void finishInit() {}
    public void setTokenizer(android.widget.MultiAutoCompleteTextView.Tokenizer p0) {}
    protected void performFiltering(java.lang.CharSequence p0, int p1) {}
    public boolean enoughToFilter() { return false; }
    public void performValidation() {}
    protected void performFiltering(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    protected void replaceText(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }

    public static interface Tokenizer {
        public int findTokenStart(java.lang.CharSequence p0, int p1);
        public int findTokenEnd(java.lang.CharSequence p0, int p1);
        public java.lang.CharSequence terminateToken(java.lang.CharSequence p0);
    }

    public static class CommaTokenizer implements android.widget.MultiAutoCompleteTextView.Tokenizer {
        public CommaTokenizer() {}
        public int findTokenStart(java.lang.CharSequence p0, int p1) { return 0; }
        public int findTokenEnd(java.lang.CharSequence p0, int p1) { return 0; }
        public java.lang.CharSequence terminateToken(java.lang.CharSequence p0) { return null; }
    }
}
