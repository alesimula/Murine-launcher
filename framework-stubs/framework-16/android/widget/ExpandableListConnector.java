package android.widget;

class ExpandableListConnector extends android.widget.BaseAdapter implements android.widget.Filterable {
    public ExpandableListConnector(android.widget.ExpandableListAdapter p0) { super(); }
    public void setExpandableListAdapter(android.widget.ExpandableListAdapter p0) {}
    android.widget.ExpandableListConnector.PositionMetadata getUnflattenedPos(int p0) { return null; }
    android.widget.ExpandableListConnector.PositionMetadata getFlattenedPos(android.widget.ExpandableListPosition p0) { return null; }
    public boolean areAllItemsEnabled() { return false; }
    public boolean isEnabled(int p0) { return false; }
    public int getCount() { return 0; }
    public java.lang.Object getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public int getItemViewType(int p0) { return 0; }
    public int getViewTypeCount() { return 0; }
    public boolean hasStableIds() { return false; }
    boolean collapseGroup(int p0) { return false; }
    boolean collapseGroup(android.widget.ExpandableListConnector.PositionMetadata p0) { return false; }
    boolean expandGroup(int p0) { return false; }
    boolean expandGroup(android.widget.ExpandableListConnector.PositionMetadata p0) { return false; }
    public boolean isGroupExpanded(int p0) { return false; }
    public void setMaxExpGroupCount(int p0) {}
    android.widget.ExpandableListAdapter getAdapter() { return null; }
    public android.widget.Filter getFilter() { return null; }
    java.util.ArrayList<android.widget.ExpandableListConnector.GroupMetadata> getExpandedGroupMetadataList() { return null; }
    void setExpandedGroupMetadataList(java.util.ArrayList<android.widget.ExpandableListConnector.GroupMetadata> p0) {}
    public boolean isEmpty() { return false; }
    int findGroupPosition(long p0, int p1) { return 0; }

    static class GroupMetadata implements android.os.Parcelable, java.lang.Comparable<android.widget.ExpandableListConnector.GroupMetadata> {
        static final int REFRESH = -1;
        int flPos;
        int lastChildFlPos;
        int gPos;
        long gId;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.widget.ExpandableListConnector.GroupMetadata> CREATOR = null;
        static android.widget.ExpandableListConnector.GroupMetadata obtain(int p0, int p1, int p2, long p3) { return null; }
        public int compareTo(android.widget.ExpandableListConnector.GroupMetadata p0) { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    protected class MyDataSetObserver extends android.database.DataSetObserver {
        protected MyDataSetObserver(android.widget.ExpandableListConnector p0) { super(); }
        public void onChanged() {}
        public void onInvalidated() {}
    }

    public static class PositionMetadata {
        public android.widget.ExpandableListPosition position;
        public android.widget.ExpandableListConnector.GroupMetadata groupMetadata;
        public int groupInsertIndex;
        static android.widget.ExpandableListConnector.PositionMetadata obtain(int p0, int p1, int p2, int p3, android.widget.ExpandableListConnector.GroupMetadata p4, int p5) { return null; }
        public void recycle() {}
        public boolean isExpanded() { return false; }
    }
}
