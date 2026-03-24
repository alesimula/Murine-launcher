package android.text;

public interface Spannable extends android.text.Spanned {
    public void setSpan(java.lang.Object p0, int p1, int p2, int p3);
    public void removeSpan(java.lang.Object p0);
    default public void removeSpan(java.lang.Object p0, int p1) {}

    public static class Factory {
        private static android.text.Spannable.Factory sInstance;
        public Factory() {}
        public static android.text.Spannable.Factory getInstance() { return null; }
        public android.text.Spannable newSpannable(java.lang.CharSequence p0) { return null; }
    }
}
