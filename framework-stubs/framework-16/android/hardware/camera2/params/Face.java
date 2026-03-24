package android.hardware.camera2.params;

public final class Face {
    public static final int ID_UNSUPPORTED = -1;
    public static final int SCORE_MIN = 1;
    public static final int SCORE_MAX = 100;
    public Face(android.graphics.Rect p0, int p1, int p2, android.graphics.Point p3, android.graphics.Point p4, android.graphics.Point p5) {}
    public Face(android.graphics.Rect p0, int p1) {}
    public android.graphics.Rect getBounds() { return null; }
    public int getScore() { return 0; }
    public int getId() { return 0; }
    public android.graphics.Point getLeftEyePosition() { return null; }
    public android.graphics.Point getRightEyePosition() { return null; }
    public android.graphics.Point getMouthPosition() { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.hardware.camera2.params.Face p0) {}
        @android.annotation.NonNull
        public android.hardware.camera2.params.Face.Builder setBounds(android.graphics.Rect p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.camera2.params.Face.Builder setScore(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.camera2.params.Face.Builder setId(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.camera2.params.Face.Builder setLeftEyePosition(android.graphics.Point p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.camera2.params.Face.Builder setRightEyePosition(android.graphics.Point p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.camera2.params.Face.Builder setMouthPosition(android.graphics.Point p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.camera2.params.Face build() { return null; }
    }
}
