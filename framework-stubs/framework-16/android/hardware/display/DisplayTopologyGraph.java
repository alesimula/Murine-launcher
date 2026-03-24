package android.hardware.display;

public class DisplayTopologyGraph {
    public DisplayTopologyGraph(int p0, android.hardware.display.DisplayTopologyGraph.DisplayNode[] p1) {}
    public int getPrimaryDisplayId() { return 0; }
    public java.util.List<android.hardware.display.DisplayTopologyGraph.DisplayNode> getDisplayNodes() { return null; }

    public static final class AdjacentDisplay {
        public AdjacentDisplay(int p0, int p1, float p2) {}
        public int getDisplayId() { return 0; }
        public int getPosition() { return 0; }
        public float getOffsetDp() { return 0.0f; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class DisplayNode {
        public DisplayNode(int p0, int p1, android.graphics.RectF p2, android.hardware.display.DisplayTopologyGraph.AdjacentDisplay[] p3) {}
        public int getDisplayId() { return 0; }
        public int getDensity() { return 0; }
        public android.graphics.RectF getBoundsInGlobalDp() { return null; }
        public java.util.List<android.hardware.display.DisplayTopologyGraph.AdjacentDisplay> getAdjacentDisplays() { return null; }
    }
}
