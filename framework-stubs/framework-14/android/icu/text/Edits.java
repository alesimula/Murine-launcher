package android.icu.text;

public final class Edits {
    public Edits() {}
    public void reset() {}
    public void addUnchanged(int p0) {}
    public void addReplace(int p0, int p1) {}
    public int lengthDelta() { return 0; }
    public boolean hasChanges() { return false; }
    public int numberOfChanges() { return 0; }
    public android.icu.text.Edits.Iterator getCoarseChangesIterator() { return null; }
    public android.icu.text.Edits.Iterator getCoarseIterator() { return null; }
    public android.icu.text.Edits.Iterator getFineChangesIterator() { return null; }
    public android.icu.text.Edits.Iterator getFineIterator() { return null; }
    public android.icu.text.Edits mergeAndAppend(android.icu.text.Edits p0, android.icu.text.Edits p1) { return null; }

    public static final class Iterator {
        Iterator() {}
        public boolean next() { return false; }
        public boolean findSourceIndex(int p0) { return false; }
        public boolean findDestinationIndex(int p0) { return false; }
        public int destinationIndexFromSourceIndex(int p0) { return 0; }
        public int sourceIndexFromDestinationIndex(int p0) { return 0; }
        public boolean hasChange() { return false; }
        public int oldLength() { return 0; }
        public int newLength() { return 0; }
        public int sourceIndex() { return 0; }
        public int replacementIndex() { return 0; }
        public int destinationIndex() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
