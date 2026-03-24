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
    public RelativeLayout(android.content.Context p0) { super((android.content.Context)null); }
    public RelativeLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RelativeLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public RelativeLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
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
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public android.widget.RelativeLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
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
        public int[] getRules(int p0) { return null; }
        public int[] getRules() { return null; }
        public void resolveLayoutDirection(int p0) {}
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

        public static final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.RelativeLayout.LayoutParams> {
            public InspectionCompanion() {}
            public void mapProperties(android.view.inspector.PropertyMapper p0) {}
            public void readProperties(android.widget.RelativeLayout.LayoutParams p0, android.view.inspector.PropertyReader p1) {}
        }
    }

    private static class DependencyGraph {
        void clear() {}
        void add(android.view.View p0) {}
        void getSortedViews(android.view.View[] p0, int... p1) {}

        static class Node {
            android.view.View view;
            final android.util.ArrayMap<android.widget.RelativeLayout.DependencyGraph.Node, android.widget.RelativeLayout.DependencyGraph> dependents = null;
            final android.util.SparseArray<android.widget.RelativeLayout.DependencyGraph.Node> dependencies = null;
            Node() {}
            static android.widget.RelativeLayout.DependencyGraph.Node acquire(android.view.View p0) { return null; }
            void release() {}
        }
    }

    private abstract class TopToBottomLeftToRightComparator implements java.util.Comparator<android.view.View> {
        public int compare(android.view.View p0, android.view.View p1) { return 0; }
    }
}
