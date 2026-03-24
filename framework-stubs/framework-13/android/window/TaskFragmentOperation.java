package android.window;

public final class TaskFragmentOperation implements android.os.Parcelable {
    public static final int OP_TYPE_SET_ANIMATION_PARAMS = 0;
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentOperation> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getOpType() { return 0; }
    public android.window.TaskFragmentAnimationParams getAnimationParams() { return null; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder(int p0) {}
        public android.window.TaskFragmentOperation.Builder setAnimationParams(android.window.TaskFragmentAnimationParams p0) { return null; }
        public android.window.TaskFragmentOperation build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface OperationType {
    }
}
