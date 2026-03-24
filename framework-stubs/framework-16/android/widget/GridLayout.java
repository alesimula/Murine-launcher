package android.widget;

@android.widget.RemoteViews.RemoteView
public class GridLayout extends android.view.ViewGroup {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public static final int UNDEFINED = -2147483648;
    public static final int ALIGN_BOUNDS = 0;
    public static final int ALIGN_MARGINS = 1;
    static final int MAX_SIZE = 100000;
    static final int DEFAULT_CONTAINER_MARGIN = 0;
    static final int UNINITIALIZED_HASH = 0;
    static final android.util.Printer LOG_PRINTER = null;
    static final android.util.Printer NO_PRINTER = null;
    final android.widget.GridLayout.Axis mHorizontalAxis = null;
    final android.widget.GridLayout.Axis mVerticalAxis = null;
    int mOrientation;
    boolean mUseDefaultMargins;
    int mAlignmentMode;
    int mDefaultGap;
    int mLastLayoutParamsHashCode;
    android.util.Printer mPrinter;
    static final android.widget.GridLayout.Alignment UNDEFINED_ALIGNMENT = null;
    public static final android.widget.GridLayout.Alignment TOP = null;
    public static final android.widget.GridLayout.Alignment BOTTOM = null;
    public static final android.widget.GridLayout.Alignment START = null;
    public static final android.widget.GridLayout.Alignment END = null;
    public static final android.widget.GridLayout.Alignment LEFT = null;
    public static final android.widget.GridLayout.Alignment RIGHT = null;
    public static final android.widget.GridLayout.Alignment CENTER = null;
    public static final android.widget.GridLayout.Alignment BASELINE = null;
    public static final android.widget.GridLayout.Alignment FILL = null;
    public GridLayout(android.content.Context p0) { super((android.content.Context)null); }
    public GridLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public GridLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public GridLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public int getOrientation() { return 0; }
    public void setOrientation(int p0) {}
    public int getRowCount() { return 0; }
    @android.view.RemotableViewMethod
    public void setRowCount(int p0) {}
    public int getColumnCount() { return 0; }
    @android.view.RemotableViewMethod
    public void setColumnCount(int p0) {}
    public boolean getUseDefaultMargins() { return false; }
    public void setUseDefaultMargins(boolean p0) {}
    public int getAlignmentMode() { return 0; }
    @android.view.RemotableViewMethod
    public void setAlignmentMode(int p0) {}
    public boolean isRowOrderPreserved() { return false; }
    public void setRowOrderPreserved(boolean p0) {}
    public boolean isColumnOrderPreserved() { return false; }
    public void setColumnOrderPreserved(boolean p0) {}
    public android.util.Printer getPrinter() { return null; }
    public void setPrinter(android.util.Printer p0) {}
    static int max2(int[] p0, int p1) { return 0; }
    static <T extends java.lang.Object> T[] append(T[] p0, T[] p1) { return null; }
    static android.widget.GridLayout.Alignment getAlignment(int p0, boolean p1) { return null; }
    int getMargin1(android.view.View p0, boolean p1, boolean p2) { return 0; }
    protected void onSetLayoutParams(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    final android.widget.GridLayout.LayoutParams getLayoutParams(android.view.View p0) { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected android.widget.GridLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.widget.GridLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.widget.GridLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    protected void onDebugDrawMargins(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    protected void onDebugDraw(android.graphics.Canvas p0) {}
    public void onViewAdded(android.view.View p0) {}
    public void onViewRemoved(android.view.View p0) {}
    protected void onChildVisibilityChanged(android.view.View p0, int p1, int p2) {}
    static int adjust(int p0, int p1) { return 0; }
    protected void onMeasure(int p0, int p1) {}
    final int getMeasurementIncludingMargin(android.view.View p0, boolean p1) { return 0; }
    public void requestLayout() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, int p1, android.widget.GridLayout.Alignment p2, float p3) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, android.widget.GridLayout.Alignment p1, float p2) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, int p1, float p2) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, float p1) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, int p1, android.widget.GridLayout.Alignment p2) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, android.widget.GridLayout.Alignment p1) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, int p1) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0) { return null; }
    static boolean canStretch(int p0) { return false; }

    public static abstract class Alignment {
        Alignment() {}
        abstract int getGravityOffset(android.view.View p0, int p1);
        abstract int getAlignmentValue(android.view.View p0, int p1, int p2);
        int getSizeInCell(android.view.View p0, int p1, int p2) { return 0; }
        android.widget.GridLayout.Bounds getBounds() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlignmentMode {
    }

    static final class Arc {
        public final android.widget.GridLayout.Interval span = null;
        public final android.widget.GridLayout.MutableInt value = null;
        public boolean valid;
        public Arc(android.widget.GridLayout.Interval p0, android.widget.GridLayout.MutableInt p1) {}
        public java.lang.String toString() { return null; }
    }

    static final class Assoc<K extends java.lang.Object, V extends java.lang.Object> extends java.util.ArrayList<android.util.Pair<K, V>> {
        public static <K extends java.lang.Object, V extends java.lang.Object> android.widget.GridLayout.Assoc<K, V> of(java.lang.Class<K> p0, java.lang.Class<V> p1) { return null; }
        public void put(K p0, V p1) {}
        public android.widget.GridLayout.PackedMap<K, V> pack() { return null; }
    }

    final class Axis {
        public final boolean horizontal = false;
        public int definedCount;
        android.widget.GridLayout.PackedMap<android.widget.GridLayout.Spec, android.widget.GridLayout.Bounds> groupBounds;
        public boolean groupBoundsValid;
        android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> forwardLinks;
        public boolean forwardLinksValid;
        android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> backwardLinks;
        public boolean backwardLinksValid;
        public int[] leadingMargins;
        public boolean leadingMarginsValid;
        public int[] trailingMargins;
        public boolean trailingMarginsValid;
        public android.widget.GridLayout.Arc[] arcs;
        public boolean arcsValid;
        public int[] locations;
        public boolean locationsValid;
        public boolean hasWeights;
        public boolean hasWeightsValid;
        public int[] deltas;
        boolean orderPreserved;
        public int getCount() { return 0; }
        public void setCount(int p0) {}
        public boolean isOrderPreserved() { return false; }
        public void setOrderPreserved(boolean p0) {}
        public android.widget.GridLayout.PackedMap<android.widget.GridLayout.Spec, android.widget.GridLayout.Bounds> getGroupBounds() { return null; }
        android.widget.GridLayout.Arc[][] groupArcsByFirstVertex(android.widget.GridLayout.Arc[] p0) { return null; }
        public android.widget.GridLayout.Arc[] getArcs() { return null; }
        public int[] getLeadingMargins() { return null; }
        public int[] getTrailingMargins() { return null; }
        public int[] getDeltas() { return null; }
        public int[] getLocations() { return null; }
        public int getMeasure(int p0) { return 0; }
        public void layout(int p0) {}
        public void invalidateStructure() {}
        public void invalidateValues() {}
    }

    static class Bounds {
        public int before;
        public int after;
        public int flexibility;
        protected void reset() {}
        protected void include(int p0, int p1) {}
        protected int size(boolean p0) { return 0; }
        protected int getOffset(android.widget.GridLayout p0, android.view.View p1, android.widget.GridLayout.Alignment p2, int p3, boolean p4) { return 0; }
        protected final void include(android.widget.GridLayout p0, android.view.View p1, android.widget.GridLayout.Spec p2, android.widget.GridLayout.Axis p3, int p4) {}
        public java.lang.String toString() { return null; }
    }

    static final class Interval {
        public final int min = 0;
        public final int max = 0;
        public Interval(int p0, int p1) {}
        int size() { return 0; }
        android.widget.GridLayout.Interval inverse() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public android.widget.GridLayout.Spec rowSpec;
        public android.widget.GridLayout.Spec columnSpec;
        public LayoutParams(android.widget.GridLayout.Spec p0, android.widget.GridLayout.Spec p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams() { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.widget.GridLayout.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public void setGravity(int p0) {}
        protected void setBaseAttributes(android.content.res.TypedArray p0, int p1, int p2) {}
        final void setRowSpecSpan(android.widget.GridLayout.Interval p0) {}
        final void setColumnSpecSpan(android.widget.GridLayout.Interval p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    static final class MutableInt {
        public int value;
        public MutableInt() {}
        public MutableInt(int p0) {}
        public void reset() {}
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Orientation {
    }

    static final class PackedMap<K extends java.lang.Object, V extends java.lang.Object> {
        public final int[] index = null;
        public final K[] keys = null;
        public final V[] values = null;
        public V getValue(int p0) { return null; }
    }

    public static class Spec {
        static final android.widget.GridLayout.Spec UNDEFINED = null;
        static final float DEFAULT_WEIGHT = 0.0f;
        final boolean startDefined = false;
        final android.widget.GridLayout.Interval span = null;
        final android.widget.GridLayout.Alignment alignment = null;
        final float weight = 0.0f;
        final android.widget.GridLayout.Spec copyWriteSpan(android.widget.GridLayout.Interval p0) { return null; }
        final android.widget.GridLayout.Spec copyWriteAlignment(android.widget.GridLayout.Alignment p0) { return null; }
        final int getFlexibility() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
