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
    private static final int DEFAULT_ORIENTATION = 0;
    private static final int DEFAULT_COUNT = -2147483648;
    private static final boolean DEFAULT_USE_DEFAULT_MARGINS = false;
    private static final boolean DEFAULT_ORDER_PRESERVED = true;
    private static final int DEFAULT_ALIGNMENT_MODE = 1;
    private static final int ORIENTATION = 0;
    private static final int ROW_COUNT = 1;
    private static final int COLUMN_COUNT = 3;
    private static final int USE_DEFAULT_MARGINS = 5;
    private static final int ALIGNMENT_MODE = 6;
    private static final int ROW_ORDER_PRESERVED = 2;
    private static final int COLUMN_ORDER_PRESERVED = 4;
    final android.widget.GridLayout.Axis mHorizontalAxis = null;
    final android.widget.GridLayout.Axis mVerticalAxis = null;
    int mOrientation;
    boolean mUseDefaultMargins;
    int mAlignmentMode;
    int mDefaultGap;
    int mLastLayoutParamsHashCode;
    android.util.Printer mPrinter;
    @android.annotation.UnsupportedAppUsage
    static final android.widget.GridLayout.Alignment UNDEFINED_ALIGNMENT = null;
    private static final android.widget.GridLayout.Alignment LEADING = null;
    private static final android.widget.GridLayout.Alignment TRAILING = null;
    public static final android.widget.GridLayout.Alignment TOP = null;
    public static final android.widget.GridLayout.Alignment BOTTOM = null;
    public static final android.widget.GridLayout.Alignment START = null;
    public static final android.widget.GridLayout.Alignment END = null;
    public static final android.widget.GridLayout.Alignment LEFT = null;
    public static final android.widget.GridLayout.Alignment RIGHT = null;
    public static final android.widget.GridLayout.Alignment CENTER = null;
    public static final android.widget.GridLayout.Alignment BASELINE = null;
    public static final android.widget.GridLayout.Alignment FILL = null;
    private static final int INFLEXIBLE = 0;
    private static final int CAN_STRETCH = 2;
    public GridLayout(android.content.Context p0) { super((android.content.Context)null); }
    public GridLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public GridLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public GridLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public int getOrientation() { return 0; }
    public void setOrientation(int p0) {}
    public int getRowCount() { return 0; }
    public void setRowCount(int p0) {}
    public int getColumnCount() { return 0; }
    public void setColumnCount(int p0) {}
    public boolean getUseDefaultMargins() { return false; }
    public void setUseDefaultMargins(boolean p0) {}
    public int getAlignmentMode() { return 0; }
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
    private int getDefaultMargin(android.view.View p0, boolean p1, boolean p2) { return 0; }
    private int getDefaultMargin(android.view.View p0, boolean p1, boolean p2, boolean p3) { return 0; }
    private int getDefaultMargin(android.view.View p0, android.widget.GridLayout.LayoutParams p1, boolean p2, boolean p3) { return 0; }
    int getMargin1(android.view.View p0, boolean p1, boolean p2) { return 0; }
    private int getMargin(android.view.View p0, boolean p1, boolean p2) { return 0; }
    private int getTotalMargin(android.view.View p0, boolean p1) { return 0; }
    private static boolean fits(int[] p0, int p1, int p2, int p3) { return false; }
    private static void procrusteanFill(int[] p0, int p1, int p2, int p3) {}
    private static void setCellGroup(android.widget.GridLayout.LayoutParams p0, int p1, int p2, int p3, int p4) {}
    private static int clip(android.widget.GridLayout.Interval p0, boolean p1, int p2) { return 0; }
    private void validateLayoutParams() {}
    private void invalidateStructure() {}
    private void invalidateValues() {}
    protected void onSetLayoutParams(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    final android.widget.GridLayout.LayoutParams getLayoutParams(android.view.View p0) { return null; }
    private static void handleInvalidParams(java.lang.String p0) {}
    private void checkLayoutParams(android.widget.GridLayout.LayoutParams p0, boolean p1) {}
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected android.widget.GridLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.widget.GridLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.widget.GridLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    private void drawLine(android.graphics.Canvas p0, int p1, int p2, int p3, int p4, android.graphics.Paint p5) {}
    protected void onDebugDrawMargins(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    protected void onDebugDraw(android.graphics.Canvas p0) {}
    public void onViewAdded(android.view.View p0) {}
    public void onViewRemoved(android.view.View p0) {}
    protected void onChildVisibilityChanged(android.view.View p0, int p1, int p2) {}
    private int computeLayoutParamsHashCode() { return 0; }
    private void consistencyCheck() {}
    private void measureChildWithMargins2(android.view.View p0, int p1, int p2, int p3, int p4) {}
    private void measureChildrenWithMargins(int p0, int p1, boolean p2) {}
    static int adjust(int p0, int p1) { return 0; }
    protected void onMeasure(int p0, int p1) {}
    private int getMeasurement(android.view.View p0, boolean p1) { return 0; }
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
    private static android.widget.GridLayout.Alignment createSwitchingAlignment(android.widget.GridLayout.Alignment p0, android.widget.GridLayout.Alignment p1) { return null; }
    static boolean canStretch(int p0) { return false; }

    public static class Spec {
        static final android.widget.GridLayout.Spec UNDEFINED = null;
        static final float DEFAULT_WEIGHT = 0.0f;
        final boolean startDefined = false;
        final android.widget.GridLayout.Interval span = null;
        final android.widget.GridLayout.Alignment alignment = null;
        final float weight = 0.0f;
        private Spec(boolean p0, android.widget.GridLayout.Interval p1, android.widget.GridLayout.Alignment p2, float p3) {}
        private Spec(boolean p0, int p1, int p2, android.widget.GridLayout.Alignment p3, float p4) {}
        private android.widget.GridLayout.Alignment getAbsoluteAlignment(boolean p0) { return null; }
        final android.widget.GridLayout.Spec copyWriteSpan(android.widget.GridLayout.Interval p0) { return null; }
        final android.widget.GridLayout.Spec copyWriteAlignment(android.widget.GridLayout.Alignment p0) { return null; }
        final int getFlexibility() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    static final class PackedMap<K extends java.lang.Object, V extends java.lang.Object> {
        public final int[] index = null;
        public final K[] keys = null;
        public final V[] values = null;
        private PackedMap(K[] p0, V[] p1) {}
        public V getValue(int p0) { return null; }
        private static <K extends java.lang.Object> int[] createIndex(K[] p0) { return null; }
        private static <K extends java.lang.Object> K[] compact(K[] p0, int[] p1) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Orientation {
    }

    static final class MutableInt {
        public int value;
        public MutableInt() {}
        public MutableInt(int p0) {}
        public void reset() {}
        public java.lang.String toString() { return null; }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        private static final int DEFAULT_WIDTH = -2;
        private static final int DEFAULT_HEIGHT = -2;
        private static final int DEFAULT_MARGIN = -2147483648;
        private static final int DEFAULT_ROW = -2147483648;
        private static final int DEFAULT_COLUMN = -2147483648;
        private static final android.widget.GridLayout.Interval DEFAULT_SPAN = null;
        private static final int DEFAULT_SPAN_SIZE = Integer.valueOf(0);
        private static final int MARGIN = 2;
        private static final int LEFT_MARGIN = 3;
        private static final int TOP_MARGIN = 4;
        private static final int RIGHT_MARGIN = 5;
        private static final int BOTTOM_MARGIN = 6;
        private static final int COLUMN = 1;
        private static final int COLUMN_SPAN = 4;
        private static final int COLUMN_WEIGHT = 6;
        private static final int ROW = 2;
        private static final int ROW_SPAN = 3;
        private static final int ROW_WEIGHT = 5;
        private static final int GRAVITY = 0;
        public android.widget.GridLayout.Spec rowSpec;
        public android.widget.GridLayout.Spec columnSpec;
        private LayoutParams(int p0, int p1, int p2, int p3, int p4, int p5, android.widget.GridLayout.Spec p6, android.widget.GridLayout.Spec p7) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.widget.GridLayout.Spec p0, android.widget.GridLayout.Spec p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams() { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.widget.GridLayout.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        private void reInitSuper(android.content.Context p0, android.util.AttributeSet p1) {}
        private void init(android.content.Context p0, android.util.AttributeSet p1) {}
        public void setGravity(int p0) {}
        protected void setBaseAttributes(android.content.res.TypedArray p0, int p1, int p2) {}
        final void setRowSpecSpan(android.widget.GridLayout.Interval p0) {}
        final void setColumnSpecSpan(android.widget.GridLayout.Interval p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
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

    static class Bounds {
        public int before;
        public int after;
        public int flexibility;
        private Bounds() {}
        protected void reset() {}
        protected void include(int p0, int p1) {}
        protected int size(boolean p0) { return 0; }
        protected int getOffset(android.widget.GridLayout p0, android.view.View p1, android.widget.GridLayout.Alignment p2, int p3, boolean p4) { return 0; }
        protected final void include(android.widget.GridLayout p0, android.view.View p1, android.widget.GridLayout.Spec p2, android.widget.GridLayout.Axis p3, int p4) {}
        public java.lang.String toString() { return null; }
    }

    final class Axis {
        private static final int NEW = 0;
        private static final int PENDING = 1;
        private static final int COMPLETE = 2;
        public final boolean horizontal = false;
        public int definedCount;
        private int maxIndex;
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
        private android.widget.GridLayout.MutableInt parentMin;
        private android.widget.GridLayout.MutableInt parentMax;
        private Axis(android.widget.GridLayout p0, boolean p1) {}
        private int calculateMaxIndex() { return 0; }
        private int getMaxIndex() { return 0; }
        public int getCount() { return 0; }
        public void setCount(int p0) {}
        public boolean isOrderPreserved() { return false; }
        public void setOrderPreserved(boolean p0) {}
        private android.widget.GridLayout.PackedMap<android.widget.GridLayout.Spec, android.widget.GridLayout.Bounds> createGroupBounds() { return null; }
        private void computeGroupBounds() {}
        public android.widget.GridLayout.PackedMap<android.widget.GridLayout.Spec, android.widget.GridLayout.Bounds> getGroupBounds() { return null; }
        private android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> createLinks(boolean p0) { return null; }
        private void computeLinks(android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> p0, boolean p1) {}
        private android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> getForwardLinks() { return null; }
        private android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> getBackwardLinks() { return null; }
        private void include(java.util.List<android.widget.GridLayout.Arc> p0, android.widget.GridLayout.Interval p1, android.widget.GridLayout.MutableInt p2, boolean p3) {}
        private void include(java.util.List<android.widget.GridLayout.Arc> p0, android.widget.GridLayout.Interval p1, android.widget.GridLayout.MutableInt p2) {}
        android.widget.GridLayout.Arc[][] groupArcsByFirstVertex(android.widget.GridLayout.Arc[] p0) { return null; }
        private android.widget.GridLayout.Arc[] topologicalSort(android.widget.GridLayout.Arc[] p0) { return null; }
        private android.widget.GridLayout.Arc[] topologicalSort(java.util.List<android.widget.GridLayout.Arc> p0) { return null; }
        private void addComponentSizes(java.util.List<android.widget.GridLayout.Arc> p0, android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> p1) {}
        private android.widget.GridLayout.Arc[] createArcs() { return null; }
        private void computeArcs() {}
        public android.widget.GridLayout.Arc[] getArcs() { return null; }
        private boolean relax(int[] p0, android.widget.GridLayout.Arc p1) { return false; }
        private void init(int[] p0) {}
        private java.lang.String arcsToString(java.util.List<android.widget.GridLayout.Arc> p0) { return null; }
        private void logError(java.lang.String p0, android.widget.GridLayout.Arc[] p1, boolean[] p2) {}
        private boolean solve(android.widget.GridLayout.Arc[] p0, int[] p1) { return false; }
        private boolean solve(android.widget.GridLayout.Arc[] p0, int[] p1, boolean p2) { return false; }
        private void computeMargins(boolean p0) {}
        public int[] getLeadingMargins() { return null; }
        public int[] getTrailingMargins() { return null; }
        private boolean solve(int[] p0) { return false; }
        private boolean computeHasWeights() { return false; }
        private boolean hasWeights() { return false; }
        public int[] getDeltas() { return null; }
        private void shareOutDelta(int p0, float p1) {}
        private void solveAndDistributeSpace(int[] p0) {}
        private float calculateTotalWeight() { return 0.0f; }
        private void computeLocations(int[] p0) {}
        public int[] getLocations() { return null; }
        private int size(int[] p0) { return 0; }
        private void setParentConstraints(int p0, int p1) {}
        private int getMeasure(int p0, int p1) { return 0; }
        public int getMeasure(int p0) { return 0; }
        public void layout(int p0) {}
        public void invalidateStructure() {}
        public void invalidateValues() {}
    }

    static final class Assoc<K extends java.lang.Object, V extends java.lang.Object> extends java.util.ArrayList<android.util.Pair<K, V>> {
        private final java.lang.Class<K> keyType = null;
        private final java.lang.Class<V> valueType = null;
        private Assoc(java.lang.Class<K> p0, java.lang.Class<V> p1) { super(); }
        public static <K extends java.lang.Object, V extends java.lang.Object> android.widget.GridLayout.Assoc<K, V> of(java.lang.Class<K> p0, java.lang.Class<V> p1) { return null; }
        public void put(K p0, V p1) {}
        public android.widget.GridLayout.PackedMap<K, V> pack() { return null; }
    }

    static final class Arc {
        public final android.widget.GridLayout.Interval span = null;
        public final android.widget.GridLayout.MutableInt value = null;
        public boolean valid;
        public Arc(android.widget.GridLayout.Interval p0, android.widget.GridLayout.MutableInt p1) {}
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlignmentMode {
    }

    public static abstract class Alignment {
        Alignment() {}
        abstract int getGravityOffset(android.view.View p0, int p1);
        abstract int getAlignmentValue(android.view.View p0, int p1, int p2);
        int getSizeInCell(android.view.View p0, int p1, int p2) { return 0; }
        android.widget.GridLayout.Bounds getBounds() { return null; }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.GridLayout> {
        private boolean mPropertiesMapped;
        private int mAlignmentModeId;
        private int mColumnCountId;
        private int mColumnOrderPreservedId;
        private int mOrientationId;
        private int mRowCountId;
        private int mRowOrderPreservedId;
        private int mUseDefaultMarginsId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.GridLayout p0, android.view.inspector.PropertyReader p1) {}
    }
}
