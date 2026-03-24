package android.widget;

public class SimpleExpandableListAdapter extends android.widget.BaseExpandableListAdapter {
    private java.util.List<? extends java.util.Map<java.lang.String, ?>> mGroupData;
    private int mExpandedGroupLayout;
    private int mCollapsedGroupLayout;
    private java.lang.String[] mGroupFrom;
    private int[] mGroupTo;
    private java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ?>>> mChildData;
    private int mChildLayout;
    private int mLastChildLayout;
    private java.lang.String[] mChildFrom;
    private int[] mChildTo;
    private android.view.LayoutInflater mInflater;
    public SimpleExpandableListAdapter(android.content.Context p0, java.util.List<? extends java.util.Map<java.lang.String, ?>> p1, int p2, java.lang.String[] p3, int[] p4, java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ?>>> p5, int p6, java.lang.String[] p7, int[] p8) { super(); }
    public SimpleExpandableListAdapter(android.content.Context p0, java.util.List<? extends java.util.Map<java.lang.String, ?>> p1, int p2, int p3, java.lang.String[] p4, int[] p5, java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ?>>> p6, int p7, java.lang.String[] p8, int[] p9) { super(); }
    public SimpleExpandableListAdapter(android.content.Context p0, java.util.List<? extends java.util.Map<java.lang.String, ?>> p1, int p2, int p3, java.lang.String[] p4, int[] p5, java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ?>>> p6, int p7, int p8, java.lang.String[] p9, int[] p10) { super(); }
    public java.lang.Object getChild(int p0, int p1) { return null; }
    public long getChildId(int p0, int p1) { return 0L; }
    public android.view.View getChildView(int p0, int p1, boolean p2, android.view.View p3, android.view.ViewGroup p4) { return null; }
    public android.view.View newChildView(boolean p0, android.view.ViewGroup p1) { return null; }
    private void bindView(android.view.View p0, java.util.Map<java.lang.String, ?> p1, java.lang.String[] p2, int[] p3) {}
    public int getChildrenCount(int p0) { return 0; }
    public java.lang.Object getGroup(int p0) { return null; }
    public int getGroupCount() { return 0; }
    public long getGroupId(int p0) { return 0L; }
    public android.view.View getGroupView(int p0, boolean p1, android.view.View p2, android.view.ViewGroup p3) { return null; }
    public android.view.View newGroupView(boolean p0, android.view.ViewGroup p1) { return null; }
    public boolean isChildSelectable(int p0, int p1) { return false; }
    public boolean hasStableIds() { return false; }
}
