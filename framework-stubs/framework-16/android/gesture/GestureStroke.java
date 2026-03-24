package android.gesture;

public class GestureStroke {
    static final float TOUCH_TOLERANCE = 3.0f;
    public final android.graphics.RectF boundingBox = null;
    public final float length = 0.0f;
    public final float[] points = null;
    public GestureStroke(java.util.ArrayList<android.gesture.GesturePoint> p0) {}
    public java.lang.Object clone() { return null; }
    void draw(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    public android.graphics.Path getPath() { return null; }
    public android.graphics.Path toPath(float p0, float p1, int p2) { return null; }
    void serialize(java.io.DataOutputStream p0) throws java.io.IOException {}
    static android.gesture.GestureStroke deserialize(java.io.DataInputStream p0) throws java.io.IOException { return null; }
    public void clearPath() {}
    public android.gesture.OrientedBoundingBox computeOrientedBoundingBox() { return null; }
}
