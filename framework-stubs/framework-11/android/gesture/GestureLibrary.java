package android.gesture;

public abstract class GestureLibrary {
    protected final android.gesture.GestureStore mStore = null;
    protected GestureLibrary() {}
    public abstract boolean save();
    public abstract boolean load();
    public boolean isReadOnly() { return false; }
    public android.gesture.Learner getLearner() { return null; }
    public void setOrientationStyle(int p0) {}
    public int getOrientationStyle() { return 0; }
    public void setSequenceType(int p0) {}
    public int getSequenceType() { return 0; }
    public java.util.Set<java.lang.String> getGestureEntries() { return null; }
    public java.util.ArrayList<android.gesture.Prediction> recognize(android.gesture.Gesture p0) { return null; }
    public void addGesture(java.lang.String p0, android.gesture.Gesture p1) {}
    public void removeGesture(java.lang.String p0, android.gesture.Gesture p1) {}
    public void removeEntry(java.lang.String p0) {}
    public java.util.ArrayList<android.gesture.Gesture> getGestures(java.lang.String p0) { return null; }
}
