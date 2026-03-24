package android.graphics.drawable.shapes;

public abstract class Shape implements java.lang.Cloneable {
    public Shape() {}
    public final float getWidth() { return 0.0f; }
    public final float getHeight() { return 0.0f; }
    public abstract void draw(android.graphics.Canvas p0, android.graphics.Paint p1);
    public final void resize(float p0, float p1) {}
    public boolean hasAlpha() { return false; }
    protected void onResize(float p0, float p1) {}
    public void getOutline(android.graphics.Outline p0) {}
    public android.graphics.drawable.shapes.Shape clone() throws java.lang.CloneNotSupportedException { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
