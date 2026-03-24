package android.icu.text;

public class Edits {
    public Edits() {}
    public boolean hasChanges() { return false; }
    public android.icu.text.Edits.Iterator getFineIterator() { return null; }

    public static class Iterator {
        public Iterator() {}
        public boolean findSourceIndex(int p0) { return false; }
        public int sourceIndex() { return 0; }
        public int destinationIndex() { return 0; }
        public boolean hasChange() { return false; }
        public int newLength() { return 0; }
    }
}
