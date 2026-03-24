package android.graphics;

public class Camera {
    public Camera() {}
    public native void save();
    public native void restore();
    public native void translate(float p0, float p1, float p2);
    public native void rotateX(float p0);
    public native void rotateY(float p0);
    public native void rotateZ(float p0);
    public native void rotate(float p0, float p1, float p2);
    public native float getLocationX();
    public native float getLocationY();
    public native float getLocationZ();
    public native void setLocation(float p0, float p1, float p2);
    public void getMatrix(android.graphics.Matrix p0) {}
    public void applyToCanvas(android.graphics.Canvas p0) {}
    public native float dotWithNormal(float p0, float p1, float p2);
    protected void finalize() throws java.lang.Throwable {}
}
