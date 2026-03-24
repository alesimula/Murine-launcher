package android.text.style;

public interface TabStopSpan extends android.text.style.ParagraphStyle {
    public int getTabStop();

    public static class Standard implements android.text.style.TabStopSpan {
        private int mTabOffset;
        public Standard(int p0) {}
        public int getTabStop() { return 0; }
    }
}
