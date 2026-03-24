package android.view;

public final class PointerIcon implements android.os.Parcelable {
    private static final java.lang.String TAG = "PointerIcon";
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
    private static final int TYPE_OEM_FIRST = 10000;
    public static final int TYPE_DEFAULT = 1000;
    private static final android.view.PointerIcon gNullIcon = null;
    private static final android.util.SparseArray<android.util.SparseArray<android.view.PointerIcon>> gSystemIconsByDisplay = null;
    private static boolean sUseLargeIcons;
    private final int mType = 0;
    private int mSystemIconResourceId;
    private android.graphics.Bitmap mBitmap;
    private float mHotSpotX;
    private float mHotSpotY;
    private android.graphics.Bitmap[] mBitmapFrames;
    private int mDurationPerFrame;
    private static android.hardware.display.DisplayManager.DisplayListener sDisplayListener;
    public static final android.os.Parcelable.Creator<android.view.PointerIcon> CREATOR = null;
    private PointerIcon(int p0) {}
    public static android.view.PointerIcon getNullIcon() { return null; }
    public static android.view.PointerIcon getDefaultIcon(android.content.Context p0) { return null; }
    public static android.view.PointerIcon getSystemIcon(android.content.Context p0, int p1) { return null; }
    public static void setUseLargeIcons(boolean p0) {}
    public static android.view.PointerIcon create(android.graphics.Bitmap p0, float p1, float p2) { return null; }
    public static android.view.PointerIcon load(android.content.res.Resources p0, int p1) { return null; }
    public android.view.PointerIcon load(android.content.Context p0) { return null; }
    public int getType() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    private android.graphics.Bitmap getBitmapFromDrawable(android.graphics.drawable.BitmapDrawable p0) { return null; }
    private void loadResource(android.content.Context p0, android.content.res.Resources p1, int p2) {}
    private static void validateHotSpot(android.graphics.Bitmap p0, float p1, float p2) {}
    private static int getSystemIconTypeIndex(int p0) { return 0; }
    private static void registerDisplayListener(android.content.Context p0) {}
}
