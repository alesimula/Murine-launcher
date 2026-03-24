package android.view;

public class RemoteAnimationTarget implements android.os.Parcelable {
    public static final int MODE_OPENING = 0;
    public static final int MODE_CLOSING = 1;
    public static final int MODE_CHANGING = 2;
    @android.annotation.UnsupportedAppUsage
    public final int mode = 0;
    @android.annotation.UnsupportedAppUsage
    public final int taskId = 0;
    @android.annotation.UnsupportedAppUsage
    public final android.view.SurfaceControl leash = null;
    @android.annotation.UnsupportedAppUsage
    public final android.view.SurfaceControl startLeash = null;
    @android.annotation.UnsupportedAppUsage
    public final boolean isTranslucent = false;
    @android.annotation.UnsupportedAppUsage
    public final android.graphics.Rect clipRect = null;
    @android.annotation.UnsupportedAppUsage
    public final android.graphics.Rect contentInsets = null;
    @android.annotation.UnsupportedAppUsage
    public final int prefixOrderIndex = 0;
    @android.annotation.UnsupportedAppUsage
    public final android.graphics.Point position = null;
    @android.annotation.UnsupportedAppUsage
    public final android.graphics.Rect sourceContainerBounds = null;
    @android.annotation.UnsupportedAppUsage
    public final android.graphics.Rect startBounds = null;
    @android.annotation.UnsupportedAppUsage
    public final android.app.WindowConfiguration windowConfiguration = null;
    @android.annotation.UnsupportedAppUsage
    public boolean isNotInRecents;
    public static final android.os.Parcelable.Creator<android.view.RemoteAnimationTarget> CREATOR = null;
    public RemoteAnimationTarget(int p0, int p1, android.view.SurfaceControl p2, boolean p3, android.graphics.Rect p4, android.graphics.Rect p5, int p6, android.graphics.Point p7, android.graphics.Rect p8, android.app.WindowConfiguration p9, boolean p10, android.view.SurfaceControl p11, android.graphics.Rect p12) {}
    public RemoteAnimationTarget(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Mode {
    }
}
