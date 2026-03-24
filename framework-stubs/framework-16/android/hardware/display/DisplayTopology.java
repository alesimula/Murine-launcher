package android.hardware.display;

@android.annotation.FlaggedApi("com.android.server.display.feature.flags.display_topology_api")
public final class DisplayTopology implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.display.DisplayTopology> CREATOR = null;
    public static float pxToDp(float p0, int p1) { return 0.0f; }
    public static float dpToPx(float p0, int p1) { return 0.0f; }
    public DisplayTopology() {}
    public DisplayTopology(android.hardware.display.DisplayTopology.TreeNode p0, int p1) {}
    public DisplayTopology(android.os.Parcel p0) {}
    @android.annotation.Nullable
    public android.hardware.display.DisplayTopology.TreeNode getRoot() { return null; }
    public int getPrimaryDisplayId() { return 0; }
    public boolean isEmpty() { return false; }
    public boolean hasMultipleDisplays() { return false; }
    public void addDisplay(int p0, int p1, int p2, int p3) {}
    public boolean updateDisplay(int p0, int p1, int p2, int p3) { return false; }
    public boolean removeDisplay(int p0) { return false; }
    public void rearrange(java.util.Map<java.lang.Integer, android.graphics.PointF> p0) {}
    public void normalize() {}
    public android.hardware.display.DisplayTopology copy() { return null; }
    public android.util.SparseArray<android.graphics.RectF> getAbsoluteBounds() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dump(android.util.IndentingPrintWriter p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    @android.annotation.Nullable
    public static android.hardware.display.DisplayTopology.TreeNode findDisplay(int p0, android.hardware.display.DisplayTopology.TreeNode p1) { return null; }
    public android.hardware.display.DisplayTopologyGraph getGraph() { return null; }
    public java.util.Map<java.lang.Integer, android.hardware.display.DisplayTopology.TreeNode> allNodesIdMap() { return null; }

    private static final record NodeDerivedInfo(android.hardware.display.DisplayTopology.TreeNode node, float left, float top, android.hardware.display.DisplayTopology.NodeDerivedInfo parent, int depth) {
        android.graphics.RectF absoluteBounds() { return null; }
        public final java.lang.String toString() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public android.hardware.display.DisplayTopology.TreeNode node() { return null; }
        public float left() { return 0.0f; }
        public float top() { return 0.0f; }
        @android.annotation.Nullable
        public android.hardware.display.DisplayTopology.NodeDerivedInfo parent() { return null; }
        public int depth() { return 0; }
    }

    public static final class TreeNode implements android.os.Parcelable {
        public static final int POSITION_LEFT = 0;
        public static final int POSITION_TOP = 1;
        public static final int POSITION_RIGHT = 2;
        public static final int POSITION_BOTTOM = 3;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.hardware.display.DisplayTopology.TreeNode> CREATOR = null;
        public TreeNode(int p0, int p1, int p2, int p3, int p4, float p5) {}
        public TreeNode(int p0, int p1, int p2, int p3, int p4, float p5, java.util.List<android.hardware.display.DisplayTopology.TreeNode> p6) {}
        public TreeNode(android.os.Parcel p0) {}
        public int getDisplayId() { return 0; }
        public float getWidth() { return 0.0f; }
        public float getHeight() { return 0.0f; }
        public int getLogicalWidth() { return 0; }
        public int getLogicalHeight() { return 0; }
        public int getLogicalDensity() { return 0; }
        public int getPosition() { return 0; }
        public float getOffset() { return 0.0f; }
        public java.util.List<android.hardware.display.DisplayTopology.TreeNode> getChildren() { return null; }
        public android.hardware.display.DisplayTopology.TreeNode copy() { return null; }
        public java.lang.String toString() { return null; }
        public static java.lang.String positionToString(int p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void dump(android.util.IndentingPrintWriter p0) {}
        public void addChild(android.hardware.display.DisplayTopology.TreeNode p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Position {
        }
    }
}
