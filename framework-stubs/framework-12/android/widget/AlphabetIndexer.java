package android.widget;

public class AlphabetIndexer extends android.database.DataSetObserver implements android.widget.SectionIndexer {
    protected android.database.Cursor mDataCursor;
    protected int mColumnIndex;
    protected java.lang.CharSequence mAlphabet;
    private int mAlphabetLength;
    private android.util.SparseIntArray mAlphaMap;
    private java.text.Collator mCollator;
    private java.lang.String[] mAlphabetArray;
    public AlphabetIndexer(android.database.Cursor p0, int p1, java.lang.CharSequence p2) { super(); }
    public java.lang.Object[] getSections() { return null; }
    public void setCursor(android.database.Cursor p0) {}
    protected int compare(java.lang.String p0, java.lang.String p1) { return 0; }
    public int getPositionForSection(int p0) { return 0; }
    public int getSectionForPosition(int p0) { return 0; }
    public void onChanged() {}
    public void onInvalidated() {}
}
