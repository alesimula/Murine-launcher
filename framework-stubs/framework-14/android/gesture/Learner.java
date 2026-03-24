package android.gesture;

abstract class Learner {
    Learner() {}
    void addInstance(android.gesture.Instance p0) {}
    java.util.ArrayList<android.gesture.Instance> getInstances() { return null; }
    void removeInstance(long p0) {}
    void removeInstances(java.lang.String p0) {}
    abstract java.util.ArrayList<android.gesture.Prediction> classify(int p0, int p1, float[] p2);
}
