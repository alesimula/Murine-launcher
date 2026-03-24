package android.widget;

class ExpandableListPosition {
    public static final int CHILD = 1;
    public static final int GROUP = 2;
    public int groupPos;
    public int childPos;
    int flatListPos;
    public int type;
    long getPackedPosition() { return 0L; }
    static android.widget.ExpandableListPosition obtainGroupPosition(int p0) { return null; }
    static android.widget.ExpandableListPosition obtainChildPosition(int p0, int p1) { return null; }
    static android.widget.ExpandableListPosition obtainPosition(long p0) { return null; }
    static android.widget.ExpandableListPosition obtain(int p0, int p1, int p2, int p3) { return null; }
    public void recycle() {}
}
