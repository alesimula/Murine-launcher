package android.widget;

@android.widget.RemoteViews.RemoteView
public class RelativeLayout extends android.view.ViewGroup {
    public static final int TRUE = -1;
    public static final int LEFT_OF = 0;
    public static final int RIGHT_OF = 1;
    public static final int ABOVE = 2;
    public static final int BELOW = 3;
    public static final int ALIGN_BASELINE = 4;
    public static final int ALIGN_LEFT = 5;
    public static final int ALIGN_TOP = 6;
    public static final int ALIGN_RIGHT = 7;
    public static final int ALIGN_BOTTOM = 8;
    public static final int ALIGN_PARENT_LEFT = 9;
    public static final int ALIGN_PARENT_TOP = 10;
    public static final int ALIGN_PARENT_RIGHT = 11;
    public static final int ALIGN_PARENT_BOTTOM = 12;
    public static final int CENTER_IN_PARENT = 13;
    public static final int CENTER_HORIZONTAL = 14;
    public static final int CENTER_VERTICAL = 15;
    public static final int START_OF = 16;
    public static final int END_OF = 17;
    public static final int ALIGN_START = 18;
    public static final int ALIGN_END = 19;
    public static final int ALIGN_PARENT_START = 20;
    public static final int ALIGN_PARENT_END = 21;
    private static final int VERB_COUNT = 22;
    private static final int[] RULES_VERTICAL = null;
    private static final int[] RULES_HORIZONTAL = null;
    private static final int VALUE_NOT_SET = -2147483648;
    private android.view.View mBaselineView;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private int mGravity;
    private final android.graphics.Rect mContentBounds = null;
    private final android.graphics.Rect mSelfBounds = null;
    private int mIgnoreGravity;
    private java.util.SortedSet<android.view.View> mTopToBottomLeftToRightSet;
    private boolean mDirtyHierarchy;
    private android.view.View[] mSortedHorizontalChildren;
    private android.view.View[] mSortedVerticalChildren;
    private final android.widget.RelativeLayout.DependencyGraph mGraph = null;
    private boolean mAllowBrokenMeasureSpecs;
    private boolean mMeasureVerticalWithPaddingMargin;
    private static final int DEFAULT_WIDTH = 65536;
    public RelativeLayout(android.content.Context p0) { super((android.content.Context)null); }
    public RelativeLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RelativeLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public RelativeLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void initFromAttributes(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) {}
    private void queryCompatibilityModes(android.content.Context p0) {}
    public boolean shouldDelayChildPressedState() { return false; }
    @android.view.RemotableViewMethod
    public void setIgnoreGravity(int p0) {}
    public int getIgnoreGravity() { return 0; }
    public int getGravity() { return 0; }
    @android.view.RemotableViewMethod
    public void setGravity(int p0) {}
    @android.view.RemotableViewMethod
    public void setHorizontalGravity(int p0) {}
    @android.view.RemotableViewMethod
    public void setVerticalGravity(int p0) {}
    public int getBaseline() { return 0; }
    public void requestLayout() {}
    private void sortChildren() {}
    protected void onMeasure(int p0, int p1) {}
    private int compareLayoutPosition(android.widget.RelativeLayout.LayoutParams p0, android.widget.RelativeLayout.LayoutParams p1) { return 0; }
    private void measureChild(android.view.View p0, android.widget.RelativeLayout.LayoutParams p1, int p2, int p3) {}
    private void measureChildHorizontal(android.view.View p0, android.widget.RelativeLayout.LayoutParams p1, int p2, int p3) {}
    private int getChildMeasureSpec(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) { return 0; }
    private boolean positionChildHorizontal(android.view.View p0, android.widget.RelativeLayout.LayoutParams p1, int p2, boolean p3) { return false; }
    private void positionAtEdge(android.view.View p0, android.widget.RelativeLayout.LayoutParams p1, int p2) {}
    private boolean positionChildVertical(android.view.View p0, android.widget.RelativeLayout.LayoutParams p1, int p2, boolean p3) { return false; }
    private void applyHorizontalSizeRules(android.widget.RelativeLayout.LayoutParams p0, int p1, int[] p2) {}
    private void applyVerticalSizeRules(android.widget.RelativeLayout.LayoutParams p0, int p1, int p2) {}
    private android.view.View getRelatedView(int[] p0, int p1) { return null; }
    private android.widget.RelativeLayout.LayoutParams getRelatedViewParams(int[] p0, int p1) { return null; }
    private int getRelatedViewBaselineOffset(int[] p0) { return 0; }
    private static void centerHorizontal(android.view.View p0, android.widget.RelativeLayout.LayoutParams p1, int p2) {}
    private static void centerVertical(android.view.View p0, android.widget.RelativeLayout.LayoutParams p1, int p2) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public android.widget.RelativeLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }

    private class TopToBottomLeftToRightComparator implements java.util.Comparator<android.view.View> {
        private TopToBottomLeftToRightComparator(android.widget.RelativeLayout p0) {}
        public int compare(android.view.View p0, android.view.View p1) { return 0; }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        @android.view.ViewDebug.ExportedProperty(category="layout", resolveId=true, indexMapping={@android.view.ViewDebug.IntToString(from=2, to="above"), @android.view.ViewDebug.IntToString(from=4, to="alignBaseline"), @android.view.ViewDebug.IntToString(from=8, to="alignBottom"), @android.view.ViewDebug.IntToString(from=5, to="alignLeft"), @android.view.ViewDebug.IntToString(from=12, to="alignParentBottom"), @android.view.ViewDebug.IntToString(from=9, to="alignParentLeft"), @android.view.ViewDebug.IntToString(from=11, to="alignParentRight"), @android.view.ViewDebug.IntToString(from=10, to="alignParentTop"), @android.view.ViewDebug.IntToString(from=7, to="alignRight"), @android.view.ViewDebug.IntToString(from=6, to="alignTop"), @android.view.ViewDebug.IntToString(from=3, to="below"), @android.view.ViewDebug.IntToString(from=14, to="centerHorizontal"), @android.view.ViewDebug.IntToString(from=13, to="center"), @android.view.ViewDebug.IntToString(from=15, to="centerVertical"), @android.view.ViewDebug.IntToString(from=0, to="leftOf"), @android.view.ViewDebug.IntToString(from=1, to="rightOf"), @android.view.ViewDebug.IntToString(from=18, to="alignStart"), @android.view.ViewDebug.IntToString(from=19, to="alignEnd"), @android.view.ViewDebug.IntToString(from=20, to="alignParentStart"), @android.view.ViewDebug.IntToString(from=21, to="alignParentEnd"), @android.view.ViewDebug.IntToString(from=16, to="startOf"), @android.view.ViewDebug.IntToString(from=17, to="endOf")}, mapping={@android.view.ViewDebug.IntToString(from=-1, to="true"), @android.view.ViewDebug.IntToString(from=0, to="false/NO_ID")})
        private int[] mRules;
        private int[] mInitialRules;
        @android.annotation.UnsupportedAppUsage
        private int mLeft;
        @android.annotation.UnsupportedAppUsage
        private int mTop;
        @android.annotation.UnsupportedAppUsage
        private int mRight;
        @android.annotation.UnsupportedAppUsage
        private int mBottom;
        private boolean mNeedsLayoutResolution;
        private boolean mRulesChanged;
        private boolean mIsRtlCompatibilityMode;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public boolean alignWithParent;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.widget.RelativeLayout.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public java.lang.String debug(java.lang.String p0) { return null; }
        public void addRule(int p0) {}
        public void addRule(int p0, int p1) {}
        public void removeRule(int p0) {}
        public int getRule(int p0) { return 0; }
        private boolean hasRelativeRules() { return false; }
        private boolean isRelativeRule(int p0) { return false; }
        private void resolveRules(int p0) {}
        public int[] getRules(int p0) { return null; }
        public int[] getRules() { return null; }
        public void resolveLayoutDirection(int p0) {}
        private boolean shouldResolveLayoutDirection(int p0) { return false; }
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

        public static final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.RelativeLayout.LayoutParams> {
            private boolean mPropertiesMapped;
            private int mAboveId;
            private int mAlignBaselineId;
            private int mAlignBottomId;
            private int mAlignEndId;
            private int mAlignLeftId;
            private int mAlignParentBottomId;
            private int mAlignParentEndId;
            private int mAlignParentLeftId;
            private int mAlignParentRightId;
            private int mAlignParentStartId;
            private int mAlignParentTopId;
            private int mAlignRightId;
            private int mAlignStartId;
            private int mAlignTopId;
            private int mAlignWithParentIfMissingId;
            private int mBelowId;
            private int mCenterHorizontalId;
            private int mCenterInParentId;
            private int mCenterVerticalId;
            private int mToEndOfId;
            private int mToLeftOfId;
            private int mToRightOfId;
            private int mToStartOfId;
            public InspectionCompanion() {}
            public void mapProperties(android.view.inspector.PropertyMapper p0) {}
            public void readProperties(android.widget.RelativeLayout.LayoutParams p0, android.view.inspector.PropertyReader p1) {}
        }
    }

    private static class DependencyGraph {
        private java.util.ArrayList<android.widget.RelativeLayout.DependencyGraph.Node> mNodes;
        private android.util.SparseArray<android.widget.RelativeLayout.DependencyGraph.Node> mKeyNodes;
        private java.util.ArrayDeque<android.widget.RelativeLayout.DependencyGraph.Node> mRoots;
        private DependencyGraph() {}
        void clear() {}
        void add(android.view.View p0) {}
        void getSortedViews(android.view.View[] p0, int... p1) {}
        private java.util.ArrayDeque<android.widget.RelativeLayout.DependencyGraph.Node> findRoots(int[] p0) { return null; }

        static class Node {
            android.view.View view;
            final android.util.ArrayMap<android.widget.RelativeLayout.DependencyGraph.Node, android.widget.RelativeLayout.DependencyGraph> dependents = null;
            final android.util.SparseArray<android.widget.RelativeLayout.DependencyGraph.Node> dependencies = null;
            private static final int POOL_LIMIT = 100;
            private static final android.util.Pools.SynchronizedPool<android.widget.RelativeLayout.DependencyGraph.Node> sPool = null;
            Node() {}
            static android.widget.RelativeLayout.DependencyGraph.Node acquire(android.view.View p0) { return null; }
            void release() {}
        }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.RelativeLayout> {
        private boolean mPropertiesMapped;
        private int mGravityId;
        private int mIgnoreGravityId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.RelativeLayout p0, android.view.inspector.PropertyReader p1) {}
    }
}
