package android.gesture;

public class GestureStore {
    public static final int SEQUENCE_INVARIANT = 1;
    public static final int SEQUENCE_SENSITIVE = 2;
    public static final int ORIENTATION_INVARIANT = 1;
    public static final int ORIENTATION_SENSITIVE = 2;
    static final int ORIENTATION_SENSITIVE_4 = 4;
    static final int ORIENTATION_SENSITIVE_8 = 8;
    private static final short FILE_FORMAT_VERSION = 1;
    private static final boolean PROFILE_LOADING_SAVING = false;
    private int mSequenceType;
    private int mOrientationStyle;
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<android.gesture.Gesture>> mNamedGestures = null;
    private android.gesture.Learner mClassifier;
    private boolean mChanged;
    public GestureStore() {}
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
    public boolean hasChanged() { return false; }
    public void save(java.io.OutputStream p0) throws java.io.IOException {}
    public void save(java.io.OutputStream p0, boolean p1) throws java.io.IOException {}
    public void load(java.io.InputStream p0) throws java.io.IOException {}
    public void load(java.io.InputStream p0, boolean p1) throws java.io.IOException {}
    private void readFormatV1(java.io.DataInputStream p0) throws java.io.IOException {}
    android.gesture.Learner getLearner() { return null; }
}
