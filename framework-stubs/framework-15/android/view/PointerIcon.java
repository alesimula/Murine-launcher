package android.view;

public final class PointerIcon implements android.os.Parcelable {
    public static final int TYPE_CUSTOM = -1;
    public static final int TYPE_NULL = 0;
    public static final int TYPE_NOT_SPECIFIED = 1;
    public static final int TYPE_ARROW = 1000;
    public static final int TYPE_SPOT_HOVER = 2000;
    public static final int TYPE_SPOT_TOUCH = 2001;
    public static final int TYPE_SPOT_ANCHOR = 2002;
    public static final int TYPE_CONTEXT_MENU = 1001;
    public static final int TYPE_HAND = 1002;
    public static final int TYPE_HELP = 1003;
    public static final int TYPE_WAIT = 1004;
    public static final int TYPE_CELL = 1006;
    public static final int TYPE_CROSSHAIR = 1007;
    public static final int TYPE_TEXT = 1008;
    public static final int TYPE_VERTICAL_TEXT = 1009;
    public static final int TYPE_ALIAS = 1010;
    public static final int TYPE_COPY = 1011;
    public static final int TYPE_NO_DROP = 1012;
    public static final int TYPE_ALL_SCROLL = 1013;
    public static final int TYPE_HORIZONTAL_DOUBLE_ARROW = 1014;
    public static final int TYPE_VERTICAL_DOUBLE_ARROW = 1015;
    public static final int TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW = 1016;
    public static final int TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW = 1017;
    public static final int TYPE_ZOOM_IN = 1018;
    public static final int TYPE_ZOOM_OUT = 1019;
    public static final int TYPE_GRAB = 1020;
    public static final int TYPE_GRABBING = 1021;
    public static final int TYPE_HANDWRITING = 1022;
    public static final int TYPE_DEFAULT = 1000;
    public static final int POINTER_ICON_VECTOR_STYLE_FILL_BLACK = 0;
    public static final int POINTER_ICON_VECTOR_STYLE_FILL_GREEN = 1;
    public static final int POINTER_ICON_VECTOR_STYLE_FILL_YELLOW = 2;
    public static final int POINTER_ICON_VECTOR_STYLE_FILL_PINK = 3;
    public static final int POINTER_ICON_VECTOR_STYLE_FILL_BLUE = 4;
    public static final int POINTER_ICON_VECTOR_STYLE_FILL_BEGIN = 0;
    public static final int POINTER_ICON_VECTOR_STYLE_FILL_END = 4;
    public static final float DEFAULT_POINTER_SCALE = 1.0f;
    public static final float LARGE_POINTER_SCALE = 2.5f;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.PointerIcon> CREATOR = null;
    @android.annotation.NonNull
    public static android.view.PointerIcon getSystemIcon(android.content.Context p0, int p1) { return null; }
    @android.annotation.NonNull
    public static android.view.PointerIcon getLoadedSystemIcon(android.content.Context p0, int p1, boolean p2, float p3) { return null; }
    @android.annotation.NonNull
    public static android.view.PointerIcon create(android.graphics.Bitmap p0, float p1, float p2) { return null; }
    @android.annotation.NonNull
    public static android.view.PointerIcon load(android.content.res.Resources p0, int p1) { return null; }
    public int getType() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public static java.lang.String typeToString(int p0) { return null; }
    public static int vectorFillStyleToResource(int p0) { return 0; }
    @android.annotation.FlaggedApi("android.view.flags.enable_vector_cursors")
    public void setDrawNativeDropShadow(boolean p0) {}
    public android.graphics.Bitmap getBitmap() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PointerIconVectorStyleFill {
    }
}
