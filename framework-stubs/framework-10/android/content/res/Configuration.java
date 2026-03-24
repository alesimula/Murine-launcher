package android.content.res;

public final class Configuration implements android.os.Parcelable, java.lang.Comparable<android.content.res.Configuration> {
    public static final android.content.res.Configuration EMPTY = null;
    private static final java.lang.String TAG = "Configuration";
    public float fontScale;
    public int mcc;
    public int mnc;
    public static final int MNC_ZERO = 65535;
    @java.lang.Deprecated
    public java.util.Locale locale;
    private android.os.LocaleList mLocaleList;
    @android.annotation.UnsupportedAppUsage
    public boolean userSetLocale;
    public static final int COLOR_MODE_WIDE_COLOR_GAMUT_MASK = 3;
    public static final int COLOR_MODE_WIDE_COLOR_GAMUT_UNDEFINED = 0;
    public static final int COLOR_MODE_WIDE_COLOR_GAMUT_NO = 1;
    public static final int COLOR_MODE_WIDE_COLOR_GAMUT_YES = 2;
    public static final int COLOR_MODE_HDR_MASK = 12;
    public static final int COLOR_MODE_HDR_SHIFT = 2;
    public static final int COLOR_MODE_HDR_UNDEFINED = 0;
    public static final int COLOR_MODE_HDR_NO = 4;
    public static final int COLOR_MODE_HDR_YES = 8;
    public static final int COLOR_MODE_UNDEFINED = 0;
    public int colorMode;
    public static final int SCREENLAYOUT_SIZE_MASK = 15;
    public static final int SCREENLAYOUT_SIZE_UNDEFINED = 0;
    public static final int SCREENLAYOUT_SIZE_SMALL = 1;
    public static final int SCREENLAYOUT_SIZE_NORMAL = 2;
    public static final int SCREENLAYOUT_SIZE_LARGE = 3;
    public static final int SCREENLAYOUT_SIZE_XLARGE = 4;
    public static final int SCREENLAYOUT_LONG_MASK = 48;
    public static final int SCREENLAYOUT_LONG_UNDEFINED = 0;
    public static final int SCREENLAYOUT_LONG_NO = 16;
    public static final int SCREENLAYOUT_LONG_YES = 32;
    public static final int SCREENLAYOUT_LAYOUTDIR_MASK = 192;
    public static final int SCREENLAYOUT_LAYOUTDIR_SHIFT = 6;
    public static final int SCREENLAYOUT_LAYOUTDIR_UNDEFINED = 0;
    public static final int SCREENLAYOUT_LAYOUTDIR_LTR = 64;
    public static final int SCREENLAYOUT_LAYOUTDIR_RTL = 128;
    public static final int SCREENLAYOUT_ROUND_MASK = 768;
    public static final int SCREENLAYOUT_ROUND_SHIFT = 8;
    public static final int SCREENLAYOUT_ROUND_UNDEFINED = 0;
    public static final int SCREENLAYOUT_ROUND_NO = 256;
    public static final int SCREENLAYOUT_ROUND_YES = 512;
    public static final int SCREENLAYOUT_UNDEFINED = 0;
    public static final int SCREENLAYOUT_COMPAT_NEEDED = 268435456;
    public int screenLayout;
    public final android.app.WindowConfiguration windowConfiguration = null;
    public static final int TOUCHSCREEN_UNDEFINED = 0;
    public static final int TOUCHSCREEN_NOTOUCH = 1;
    @java.lang.Deprecated
    public static final int TOUCHSCREEN_STYLUS = 2;
    public static final int TOUCHSCREEN_FINGER = 3;
    public int touchscreen;
    public static final int KEYBOARD_UNDEFINED = 0;
    public static final int KEYBOARD_NOKEYS = 1;
    public static final int KEYBOARD_QWERTY = 2;
    public static final int KEYBOARD_12KEY = 3;
    public int keyboard;
    public static final int KEYBOARDHIDDEN_UNDEFINED = 0;
    public static final int KEYBOARDHIDDEN_NO = 1;
    public static final int KEYBOARDHIDDEN_YES = 2;
    public static final int KEYBOARDHIDDEN_SOFT = 3;
    public int keyboardHidden;
    public static final int HARDKEYBOARDHIDDEN_UNDEFINED = 0;
    public static final int HARDKEYBOARDHIDDEN_NO = 1;
    public static final int HARDKEYBOARDHIDDEN_YES = 2;
    public int hardKeyboardHidden;
    public static final int NAVIGATION_UNDEFINED = 0;
    public static final int NAVIGATION_NONAV = 1;
    public static final int NAVIGATION_DPAD = 2;
    public static final int NAVIGATION_TRACKBALL = 3;
    public static final int NAVIGATION_WHEEL = 4;
    public int navigation;
    public static final int NAVIGATIONHIDDEN_UNDEFINED = 0;
    public static final int NAVIGATIONHIDDEN_NO = 1;
    public static final int NAVIGATIONHIDDEN_YES = 2;
    public int navigationHidden;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIENTATION_PORTRAIT = 1;
    public static final int ORIENTATION_LANDSCAPE = 2;
    @java.lang.Deprecated
    public static final int ORIENTATION_SQUARE = 3;
    public int orientation;
    public static final int UI_MODE_TYPE_MASK = 15;
    public static final int UI_MODE_TYPE_UNDEFINED = 0;
    public static final int UI_MODE_TYPE_NORMAL = 1;
    public static final int UI_MODE_TYPE_DESK = 2;
    public static final int UI_MODE_TYPE_CAR = 3;
    public static final int UI_MODE_TYPE_TELEVISION = 4;
    public static final int UI_MODE_TYPE_APPLIANCE = 5;
    public static final int UI_MODE_TYPE_WATCH = 6;
    public static final int UI_MODE_TYPE_VR_HEADSET = 7;
    public static final int UI_MODE_NIGHT_MASK = 48;
    public static final int UI_MODE_NIGHT_UNDEFINED = 0;
    public static final int UI_MODE_NIGHT_NO = 16;
    public static final int UI_MODE_NIGHT_YES = 32;
    public int uiMode;
    public static final int SCREEN_WIDTH_DP_UNDEFINED = 0;
    public int screenWidthDp;
    public static final int SCREEN_HEIGHT_DP_UNDEFINED = 0;
    public int screenHeightDp;
    public static final int SMALLEST_SCREEN_WIDTH_DP_UNDEFINED = 0;
    public int smallestScreenWidthDp;
    public static final int DENSITY_DPI_UNDEFINED = 0;
    public static final int DENSITY_DPI_ANY = 65534;
    public static final int DENSITY_DPI_NONE = 65535;
    public int densityDpi;
    public int compatScreenWidthDp;
    public int compatScreenHeightDp;
    public int compatSmallestScreenWidthDp;
    public static final int ASSETS_SEQ_UNDEFINED = 0;
    public int assetsSeq;
    @android.annotation.UnsupportedAppUsage
    public int seq;
    public static final int NATIVE_CONFIG_MCC = 1;
    public static final int NATIVE_CONFIG_MNC = 2;
    public static final int NATIVE_CONFIG_LOCALE = 4;
    public static final int NATIVE_CONFIG_TOUCHSCREEN = 8;
    public static final int NATIVE_CONFIG_KEYBOARD = 16;
    public static final int NATIVE_CONFIG_KEYBOARD_HIDDEN = 32;
    public static final int NATIVE_CONFIG_NAVIGATION = 64;
    public static final int NATIVE_CONFIG_ORIENTATION = 128;
    public static final int NATIVE_CONFIG_DENSITY = 256;
    public static final int NATIVE_CONFIG_SCREEN_SIZE = 512;
    public static final int NATIVE_CONFIG_VERSION = 1024;
    public static final int NATIVE_CONFIG_SCREEN_LAYOUT = 2048;
    public static final int NATIVE_CONFIG_UI_MODE = 4096;
    public static final int NATIVE_CONFIG_SMALLEST_SCREEN_SIZE = 8192;
    public static final int NATIVE_CONFIG_LAYOUTDIR = 16384;
    public static final int NATIVE_CONFIG_COLOR_MODE = 65536;
    public static final android.os.Parcelable.Creator<android.content.res.Configuration> CREATOR = null;
    private static final java.lang.String XML_ATTR_FONT_SCALE = "fs";
    private static final java.lang.String XML_ATTR_MCC = "mcc";
    private static final java.lang.String XML_ATTR_MNC = "mnc";
    private static final java.lang.String XML_ATTR_LOCALES = "locales";
    private static final java.lang.String XML_ATTR_TOUCHSCREEN = "touch";
    private static final java.lang.String XML_ATTR_KEYBOARD = "key";
    private static final java.lang.String XML_ATTR_KEYBOARD_HIDDEN = "keyHid";
    private static final java.lang.String XML_ATTR_HARD_KEYBOARD_HIDDEN = "hardKeyHid";
    private static final java.lang.String XML_ATTR_NAVIGATION = "nav";
    private static final java.lang.String XML_ATTR_NAVIGATION_HIDDEN = "navHid";
    private static final java.lang.String XML_ATTR_ORIENTATION = "ori";
    private static final java.lang.String XML_ATTR_ROTATION = "rot";
    private static final java.lang.String XML_ATTR_SCREEN_LAYOUT = "scrLay";
    private static final java.lang.String XML_ATTR_COLOR_MODE = "clrMod";
    private static final java.lang.String XML_ATTR_UI_MODE = "ui";
    private static final java.lang.String XML_ATTR_SCREEN_WIDTH = "width";
    private static final java.lang.String XML_ATTR_SCREEN_HEIGHT = "height";
    private static final java.lang.String XML_ATTR_SMALLEST_WIDTH = "sw";
    private static final java.lang.String XML_ATTR_DENSITY = "density";
    private static final java.lang.String XML_ATTR_APP_BOUNDS = "app_bounds";
    public static int resetScreenLayout(int p0) { return 0; }
    public static int reduceScreenLayout(int p0, int p1, int p2) { return 0; }
    public static java.lang.String configurationDiffToString(int p0) { return null; }
    public boolean isLayoutSizeAtLeast(int p0) { return false; }
    public Configuration() {}
    public Configuration(android.content.res.Configuration p0) {}
    private void fixUpLocaleList() {}
    public void setTo(android.content.res.Configuration p0) {}
    public java.lang.String toString() { return null; }
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1, boolean p2, boolean p3) {}
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1, boolean p2) {}
    public void readFromProto(android.util.proto.ProtoInputStream p0, long p1) throws java.io.IOException {}
    public void writeResConfigToProto(android.util.proto.ProtoOutputStream p0, long p1, android.util.DisplayMetrics p2) {}
    public static java.lang.String uiModeToString(int p0) { return null; }
    public void setToDefaults() {}
    public void unset() {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void makeDefault() {}
    public int updateFrom(android.content.res.Configuration p0) { return 0; }
    public int diff(android.content.res.Configuration p0) { return 0; }
    public int diffPublicOnly(android.content.res.Configuration p0) { return 0; }
    public int diff(android.content.res.Configuration p0, boolean p1, boolean p2) { return 0; }
    public static boolean needNewResources(int p0, int p1) { return false; }
    public boolean isOtherSeqNewer(android.content.res.Configuration p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    private Configuration(android.os.Parcel p0) {}
    public int compareTo(android.content.res.Configuration p0) { return 0; }
    public boolean equals(android.content.res.Configuration p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public android.os.LocaleList getLocales() { return null; }
    public void setLocales(android.os.LocaleList p0) {}
    public void setLocale(java.util.Locale p0) {}
    public void clearLocales() {}
    public int getLayoutDirection() { return 0; }
    public void setLayoutDirection(java.util.Locale p0) {}
    private static int getScreenLayoutNoDirection(int p0) { return 0; }
    public boolean isScreenRound() { return false; }
    public boolean isScreenWideColorGamut() { return false; }
    public boolean isScreenHdr() { return false; }
    public static java.lang.String localesToResourceQualifier(android.os.LocaleList p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String resourceQualifierString(android.content.res.Configuration p0) { return null; }
    public static java.lang.String resourceQualifierString(android.content.res.Configuration p0, android.util.DisplayMetrics p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.content.res.Configuration generateDelta(android.content.res.Configuration p0, android.content.res.Configuration p1) { return null; }
    public static void readXmlAttrs(org.xmlpull.v1.XmlPullParser p0, android.content.res.Configuration p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static void writeXmlAttrs(org.xmlpull.v1.XmlSerializer p0, android.content.res.Configuration p1) throws java.io.IOException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NativeConfig {
    }
}
