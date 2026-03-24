package android.filterfw.geometry;

public class Quad {
    public android.filterfw.geometry.Point p0;
    public android.filterfw.geometry.Point p1;
    public android.filterfw.geometry.Point p2;
    public android.filterfw.geometry.Point p3;
    public Quad() {}
    public Quad(android.filterfw.geometry.Point p0, android.filterfw.geometry.Point p1, android.filterfw.geometry.Point p2, android.filterfw.geometry.Point p3) {}
    public boolean IsInUnitRange() { return false; }
    public android.filterfw.geometry.Quad translated(android.filterfw.geometry.Point p0) { return null; }
    public android.filterfw.geometry.Quad translated(float p0, float p1) { return null; }
    public android.filterfw.geometry.Quad scaled(float p0) { return null; }
    public android.filterfw.geometry.Quad scaled(float p0, float p1) { return null; }
    public android.filterfw.geometry.Rectangle boundingBox() { return null; }
    public float getBoundingWidth() { return 0.0f; }
    public float getBoundingHeight() { return 0.0f; }
    public java.lang.String toString() { return null; }
}
