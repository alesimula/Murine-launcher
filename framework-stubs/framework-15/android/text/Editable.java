package android.text;

public interface Editable extends java.lang.CharSequence, android.text.GetChars, android.text.Spannable, java.lang.Appendable {
    public android.text.Editable replace(int p0, int p1, java.lang.CharSequence p2, int p3, int p4);
    public android.text.Editable replace(int p0, int p1, java.lang.CharSequence p2);
    public android.text.Editable insert(int p0, java.lang.CharSequence p1, int p2, int p3);
    public android.text.Editable insert(int p0, java.lang.CharSequence p1);
    public android.text.Editable delete(int p0, int p1);
    public android.text.Editable append(java.lang.CharSequence p0);
    public android.text.Editable append(java.lang.CharSequence p0, int p1, int p2);
    public android.text.Editable append(char p0);
    public void clear();
    public void clearSpans();
    public void setFilters(android.text.InputFilter[] p0);
    public android.text.InputFilter[] getFilters();

    public static class Factory {
        public Factory() {}
        public static android.text.Editable.Factory getInstance() { return null; }
        public android.text.Editable newEditable(java.lang.CharSequence p0) { return null; }
    }
}
