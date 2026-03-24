package android.view;

public class KeyEvent extends android.view.InputEvent implements android.os.Parcelable {
    public static final int KEYCODE_UNKNOWN = 0;
    public static final int KEYCODE_SOFT_LEFT = 1;
    public static final int KEYCODE_SOFT_RIGHT = 2;
    public static final int KEYCODE_HOME = 3;
    public static final int KEYCODE_BACK = 4;
    public static final int KEYCODE_CALL = 5;
    public static final int KEYCODE_ENDCALL = 6;
    public static final int KEYCODE_0 = 7;
    public static final int KEYCODE_1 = 8;
    public static final int KEYCODE_2 = 9;
    public static final int KEYCODE_3 = 10;
    public static final int KEYCODE_4 = 11;
    public static final int KEYCODE_5 = 12;
    public static final int KEYCODE_6 = 13;
    public static final int KEYCODE_7 = 14;
    public static final int KEYCODE_8 = 15;
    public static final int KEYCODE_9 = 16;
    public static final int KEYCODE_STAR = 17;
    public static final int KEYCODE_POUND = 18;
    public static final int KEYCODE_DPAD_UP = 19;
    public static final int KEYCODE_DPAD_DOWN = 20;
    public static final int KEYCODE_DPAD_LEFT = 21;
    public static final int KEYCODE_DPAD_RIGHT = 22;
    public static final int KEYCODE_DPAD_CENTER = 23;
    public static final int KEYCODE_VOLUME_UP = 24;
    public static final int KEYCODE_VOLUME_DOWN = 25;
    public static final int KEYCODE_POWER = 26;
    public static final int KEYCODE_CAMERA = 27;
    public static final int KEYCODE_CLEAR = 28;
    public static final int KEYCODE_A = 29;
    public static final int KEYCODE_B = 30;
    public static final int KEYCODE_C = 31;
    public static final int KEYCODE_D = 32;
    public static final int KEYCODE_E = 33;
    public static final int KEYCODE_F = 34;
    public static final int KEYCODE_G = 35;
    public static final int KEYCODE_H = 36;
    public static final int KEYCODE_I = 37;
    public static final int KEYCODE_J = 38;
    public static final int KEYCODE_K = 39;
    public static final int KEYCODE_L = 40;
    public static final int KEYCODE_M = 41;
    public static final int KEYCODE_N = 42;
    public static final int KEYCODE_O = 43;
    public static final int KEYCODE_P = 44;
    public static final int KEYCODE_Q = 45;
    public static final int KEYCODE_R = 46;
    public static final int KEYCODE_S = 47;
    public static final int KEYCODE_T = 48;
    public static final int KEYCODE_U = 49;
    public static final int KEYCODE_V = 50;
    public static final int KEYCODE_W = 51;
    public static final int KEYCODE_X = 52;
    public static final int KEYCODE_Y = 53;
    public static final int KEYCODE_Z = 54;
    public static final int KEYCODE_COMMA = 55;
    public static final int KEYCODE_PERIOD = 56;
    public static final int KEYCODE_ALT_LEFT = 57;
    public static final int KEYCODE_ALT_RIGHT = 58;
    public static final int KEYCODE_SHIFT_LEFT = 59;
    public static final int KEYCODE_SHIFT_RIGHT = 60;
    public static final int KEYCODE_TAB = 61;
    public static final int KEYCODE_SPACE = 62;
    public static final int KEYCODE_SYM = 63;
    public static final int KEYCODE_EXPLORER = 64;
    public static final int KEYCODE_ENVELOPE = 65;
    public static final int KEYCODE_ENTER = 66;
    public static final int KEYCODE_DEL = 67;
    public static final int KEYCODE_GRAVE = 68;
    public static final int KEYCODE_MINUS = 69;
    public static final int KEYCODE_EQUALS = 70;
    public static final int KEYCODE_LEFT_BRACKET = 71;
    public static final int KEYCODE_RIGHT_BRACKET = 72;
    public static final int KEYCODE_BACKSLASH = 73;
    public static final int KEYCODE_SEMICOLON = 74;
    public static final int KEYCODE_APOSTROPHE = 75;
    public static final int KEYCODE_SLASH = 76;
    public static final int KEYCODE_AT = 77;
    public static final int KEYCODE_NUM = 78;
    public static final int KEYCODE_HEADSETHOOK = 79;
    public static final int KEYCODE_FOCUS = 80;
    public static final int KEYCODE_PLUS = 81;
    public static final int KEYCODE_MENU = 82;
    public static final int KEYCODE_NOTIFICATION = 83;
    public static final int KEYCODE_SEARCH = 84;
    public static final int KEYCODE_MEDIA_PLAY_PAUSE = 85;
    public static final int KEYCODE_MEDIA_STOP = 86;
    public static final int KEYCODE_MEDIA_NEXT = 87;
    public static final int KEYCODE_MEDIA_PREVIOUS = 88;
    public static final int KEYCODE_MEDIA_REWIND = 89;
    public static final int KEYCODE_MEDIA_FAST_FORWARD = 90;
    public static final int KEYCODE_MUTE = 91;
    public static final int KEYCODE_PAGE_UP = 92;
    public static final int KEYCODE_PAGE_DOWN = 93;
    public static final int KEYCODE_PICTSYMBOLS = 94;
    public static final int KEYCODE_SWITCH_CHARSET = 95;
    public static final int KEYCODE_BUTTON_A = 96;
    public static final int KEYCODE_BUTTON_B = 97;
    public static final int KEYCODE_BUTTON_C = 98;
    public static final int KEYCODE_BUTTON_X = 99;
    public static final int KEYCODE_BUTTON_Y = 100;
    public static final int KEYCODE_BUTTON_Z = 101;
    public static final int KEYCODE_BUTTON_L1 = 102;
    public static final int KEYCODE_BUTTON_R1 = 103;
    public static final int KEYCODE_BUTTON_L2 = 104;
    public static final int KEYCODE_BUTTON_R2 = 105;
    public static final int KEYCODE_BUTTON_THUMBL = 106;
    public static final int KEYCODE_BUTTON_THUMBR = 107;
    public static final int KEYCODE_BUTTON_START = 108;
    public static final int KEYCODE_BUTTON_SELECT = 109;
    public static final int KEYCODE_BUTTON_MODE = 110;
    public static final int KEYCODE_ESCAPE = 111;
    public static final int KEYCODE_FORWARD_DEL = 112;
    public static final int KEYCODE_CTRL_LEFT = 113;
    public static final int KEYCODE_CTRL_RIGHT = 114;
    public static final int KEYCODE_CAPS_LOCK = 115;
    public static final int KEYCODE_SCROLL_LOCK = 116;
    public static final int KEYCODE_META_LEFT = 117;
    public static final int KEYCODE_META_RIGHT = 118;
    public static final int KEYCODE_FUNCTION = 119;
    public static final int KEYCODE_SYSRQ = 120;
    public static final int KEYCODE_BREAK = 121;
    public static final int KEYCODE_MOVE_HOME = 122;
    public static final int KEYCODE_MOVE_END = 123;
    public static final int KEYCODE_INSERT = 124;
    public static final int KEYCODE_FORWARD = 125;
    public static final int KEYCODE_MEDIA_PLAY = 126;
    public static final int KEYCODE_MEDIA_PAUSE = 127;
    public static final int KEYCODE_MEDIA_CLOSE = 128;
    public static final int KEYCODE_MEDIA_EJECT = 129;
    public static final int KEYCODE_MEDIA_RECORD = 130;
    public static final int KEYCODE_F1 = 131;
    public static final int KEYCODE_F2 = 132;
    public static final int KEYCODE_F3 = 133;
    public static final int KEYCODE_F4 = 134;
    public static final int KEYCODE_F5 = 135;
    public static final int KEYCODE_F6 = 136;
    public static final int KEYCODE_F7 = 137;
    public static final int KEYCODE_F8 = 138;
    public static final int KEYCODE_F9 = 139;
    public static final int KEYCODE_F10 = 140;
    public static final int KEYCODE_F11 = 141;
    public static final int KEYCODE_F12 = 142;
    public static final int KEYCODE_NUM_LOCK = 143;
    public static final int KEYCODE_NUMPAD_0 = 144;
    public static final int KEYCODE_NUMPAD_1 = 145;
    public static final int KEYCODE_NUMPAD_2 = 146;
    public static final int KEYCODE_NUMPAD_3 = 147;
    public static final int KEYCODE_NUMPAD_4 = 148;
    public static final int KEYCODE_NUMPAD_5 = 149;
    public static final int KEYCODE_NUMPAD_6 = 150;
    public static final int KEYCODE_NUMPAD_7 = 151;
    public static final int KEYCODE_NUMPAD_8 = 152;
    public static final int KEYCODE_NUMPAD_9 = 153;
    public static final int KEYCODE_NUMPAD_DIVIDE = 154;
    public static final int KEYCODE_NUMPAD_MULTIPLY = 155;
    public static final int KEYCODE_NUMPAD_SUBTRACT = 156;
    public static final int KEYCODE_NUMPAD_ADD = 157;
    public static final int KEYCODE_NUMPAD_DOT = 158;
    public static final int KEYCODE_NUMPAD_COMMA = 159;
    public static final int KEYCODE_NUMPAD_ENTER = 160;
    public static final int KEYCODE_NUMPAD_EQUALS = 161;
    public static final int KEYCODE_NUMPAD_LEFT_PAREN = 162;
    public static final int KEYCODE_NUMPAD_RIGHT_PAREN = 163;
    public static final int KEYCODE_VOLUME_MUTE = 164;
    public static final int KEYCODE_INFO = 165;
    public static final int KEYCODE_CHANNEL_UP = 166;
    public static final int KEYCODE_CHANNEL_DOWN = 167;
    public static final int KEYCODE_ZOOM_IN = 168;
    public static final int KEYCODE_ZOOM_OUT = 169;
    public static final int KEYCODE_TV = 170;
    public static final int KEYCODE_WINDOW = 171;
    public static final int KEYCODE_GUIDE = 172;
    public static final int KEYCODE_DVR = 173;
    public static final int KEYCODE_BOOKMARK = 174;
    public static final int KEYCODE_CAPTIONS = 175;
    public static final int KEYCODE_SETTINGS = 176;
    public static final int KEYCODE_TV_POWER = 177;
    public static final int KEYCODE_TV_INPUT = 178;
    public static final int KEYCODE_STB_POWER = 179;
    public static final int KEYCODE_STB_INPUT = 180;
    public static final int KEYCODE_AVR_POWER = 181;
    public static final int KEYCODE_AVR_INPUT = 182;
    public static final int KEYCODE_PROG_RED = 183;
    public static final int KEYCODE_PROG_GREEN = 184;
    public static final int KEYCODE_PROG_YELLOW = 185;
    public static final int KEYCODE_PROG_BLUE = 186;
    public static final int KEYCODE_APP_SWITCH = 187;
    public static final int KEYCODE_BUTTON_1 = 188;
    public static final int KEYCODE_BUTTON_2 = 189;
    public static final int KEYCODE_BUTTON_3 = 190;
    public static final int KEYCODE_BUTTON_4 = 191;
    public static final int KEYCODE_BUTTON_5 = 192;
    public static final int KEYCODE_BUTTON_6 = 193;
    public static final int KEYCODE_BUTTON_7 = 194;
    public static final int KEYCODE_BUTTON_8 = 195;
    public static final int KEYCODE_BUTTON_9 = 196;
    public static final int KEYCODE_BUTTON_10 = 197;
    public static final int KEYCODE_BUTTON_11 = 198;
    public static final int KEYCODE_BUTTON_12 = 199;
    public static final int KEYCODE_BUTTON_13 = 200;
    public static final int KEYCODE_BUTTON_14 = 201;
    public static final int KEYCODE_BUTTON_15 = 202;
    public static final int KEYCODE_BUTTON_16 = 203;
    public static final int KEYCODE_LANGUAGE_SWITCH = 204;
    public static final int KEYCODE_MANNER_MODE = 205;
    public static final int KEYCODE_3D_MODE = 206;
    public static final int KEYCODE_CONTACTS = 207;
    public static final int KEYCODE_CALENDAR = 208;
    public static final int KEYCODE_MUSIC = 209;
    public static final int KEYCODE_CALCULATOR = 210;
    public static final int KEYCODE_ZENKAKU_HANKAKU = 211;
    public static final int KEYCODE_EISU = 212;
    public static final int KEYCODE_MUHENKAN = 213;
    public static final int KEYCODE_HENKAN = 214;
    public static final int KEYCODE_KATAKANA_HIRAGANA = 215;
    public static final int KEYCODE_YEN = 216;
    public static final int KEYCODE_RO = 217;
    public static final int KEYCODE_KANA = 218;
    public static final int KEYCODE_ASSIST = 219;
    public static final int KEYCODE_BRIGHTNESS_DOWN = 220;
    public static final int KEYCODE_BRIGHTNESS_UP = 221;
    public static final int KEYCODE_MEDIA_AUDIO_TRACK = 222;
    public static final int KEYCODE_SLEEP = 223;
    public static final int KEYCODE_WAKEUP = 224;
    public static final int KEYCODE_PAIRING = 225;
    public static final int KEYCODE_MEDIA_TOP_MENU = 226;
    public static final int KEYCODE_11 = 227;
    public static final int KEYCODE_12 = 228;
    public static final int KEYCODE_LAST_CHANNEL = 229;
    public static final int KEYCODE_TV_DATA_SERVICE = 230;
    public static final int KEYCODE_VOICE_ASSIST = 231;
    public static final int KEYCODE_TV_RADIO_SERVICE = 232;
    public static final int KEYCODE_TV_TELETEXT = 233;
    public static final int KEYCODE_TV_NUMBER_ENTRY = 234;
    public static final int KEYCODE_TV_TERRESTRIAL_ANALOG = 235;
    public static final int KEYCODE_TV_TERRESTRIAL_DIGITAL = 236;
    public static final int KEYCODE_TV_SATELLITE = 237;
    public static final int KEYCODE_TV_SATELLITE_BS = 238;
    public static final int KEYCODE_TV_SATELLITE_CS = 239;
    public static final int KEYCODE_TV_SATELLITE_SERVICE = 240;
    public static final int KEYCODE_TV_NETWORK = 241;
    public static final int KEYCODE_TV_ANTENNA_CABLE = 242;
    public static final int KEYCODE_TV_INPUT_HDMI_1 = 243;
    public static final int KEYCODE_TV_INPUT_HDMI_2 = 244;
    public static final int KEYCODE_TV_INPUT_HDMI_3 = 245;
    public static final int KEYCODE_TV_INPUT_HDMI_4 = 246;
    public static final int KEYCODE_TV_INPUT_COMPOSITE_1 = 247;
    public static final int KEYCODE_TV_INPUT_COMPOSITE_2 = 248;
    public static final int KEYCODE_TV_INPUT_COMPONENT_1 = 249;
    public static final int KEYCODE_TV_INPUT_COMPONENT_2 = 250;
    public static final int KEYCODE_TV_INPUT_VGA_1 = 251;
    public static final int KEYCODE_TV_AUDIO_DESCRIPTION = 252;
    public static final int KEYCODE_TV_AUDIO_DESCRIPTION_MIX_UP = 253;
    public static final int KEYCODE_TV_AUDIO_DESCRIPTION_MIX_DOWN = 254;
    public static final int KEYCODE_TV_ZOOM_MODE = 255;
    public static final int KEYCODE_TV_CONTENTS_MENU = 256;
    public static final int KEYCODE_TV_MEDIA_CONTEXT_MENU = 257;
    public static final int KEYCODE_TV_TIMER_PROGRAMMING = 258;
    public static final int KEYCODE_HELP = 259;
    public static final int KEYCODE_NAVIGATE_PREVIOUS = 260;
    public static final int KEYCODE_NAVIGATE_NEXT = 261;
    public static final int KEYCODE_NAVIGATE_IN = 262;
    public static final int KEYCODE_NAVIGATE_OUT = 263;
    public static final int KEYCODE_STEM_PRIMARY = 264;
    public static final int KEYCODE_STEM_1 = 265;
    public static final int KEYCODE_STEM_2 = 266;
    public static final int KEYCODE_STEM_3 = 267;
    public static final int KEYCODE_DPAD_UP_LEFT = 268;
    public static final int KEYCODE_DPAD_DOWN_LEFT = 269;
    public static final int KEYCODE_DPAD_UP_RIGHT = 270;
    public static final int KEYCODE_DPAD_DOWN_RIGHT = 271;
    public static final int KEYCODE_MEDIA_SKIP_FORWARD = 272;
    public static final int KEYCODE_MEDIA_SKIP_BACKWARD = 273;
    public static final int KEYCODE_MEDIA_STEP_FORWARD = 274;
    public static final int KEYCODE_MEDIA_STEP_BACKWARD = 275;
    public static final int KEYCODE_SOFT_SLEEP = 276;
    public static final int KEYCODE_CUT = 277;
    public static final int KEYCODE_COPY = 278;
    public static final int KEYCODE_PASTE = 279;
    public static final int KEYCODE_SYSTEM_NAVIGATION_UP = 280;
    public static final int KEYCODE_SYSTEM_NAVIGATION_DOWN = 281;
    public static final int KEYCODE_SYSTEM_NAVIGATION_LEFT = 282;
    public static final int KEYCODE_SYSTEM_NAVIGATION_RIGHT = 283;
    public static final int KEYCODE_ALL_APPS = 284;
    public static final int KEYCODE_REFRESH = 285;
    public static final int KEYCODE_THUMBS_UP = 286;
    public static final int KEYCODE_THUMBS_DOWN = 287;
    public static final int KEYCODE_PROFILE_SWITCH = 288;
    public static final int LAST_KEYCODE = 288;
    private static final java.lang.String[] META_SYMBOLIC_NAMES = null;
    private static final java.lang.String LABEL_PREFIX = "KEYCODE_";
    @java.lang.Deprecated
    public static final int MAX_KEYCODE = 84;
    public static final int ACTION_DOWN = 0;
    public static final int ACTION_UP = 1;
    @java.lang.Deprecated
    public static final int ACTION_MULTIPLE = 2;
    public static final int META_CAP_LOCKED = 256;
    public static final int META_ALT_LOCKED = 512;
    public static final int META_SYM_LOCKED = 1024;
    public static final int META_SELECTING = 2048;
    public static final int META_ALT_ON = 2;
    public static final int META_ALT_LEFT_ON = 16;
    public static final int META_ALT_RIGHT_ON = 32;
    public static final int META_SHIFT_ON = 1;
    public static final int META_SHIFT_LEFT_ON = 64;
    public static final int META_SHIFT_RIGHT_ON = 128;
    public static final int META_SYM_ON = 4;
    public static final int META_FUNCTION_ON = 8;
    public static final int META_CTRL_ON = 4096;
    public static final int META_CTRL_LEFT_ON = 8192;
    public static final int META_CTRL_RIGHT_ON = 16384;
    public static final int META_META_ON = 65536;
    public static final int META_META_LEFT_ON = 131072;
    public static final int META_META_RIGHT_ON = 262144;
    public static final int META_CAPS_LOCK_ON = 1048576;
    public static final int META_NUM_LOCK_ON = 2097152;
    public static final int META_SCROLL_LOCK_ON = 4194304;
    public static final int META_SHIFT_MASK = 193;
    public static final int META_ALT_MASK = 50;
    public static final int META_CTRL_MASK = 28672;
    public static final int META_META_MASK = 458752;
    @java.lang.Deprecated
    public static final int FLAG_WOKE_HERE = 1;
    public static final int FLAG_SOFT_KEYBOARD = 2;
    public static final int FLAG_KEEP_TOUCH_MODE = 4;
    public static final int FLAG_FROM_SYSTEM = 8;
    public static final int FLAG_EDITOR_ACTION = 16;
    public static final int FLAG_CANCELED = 32;
    public static final int FLAG_VIRTUAL_HARD_KEY = 64;
    public static final int FLAG_LONG_PRESS = 128;
    public static final int FLAG_CANCELED_LONG_PRESS = 256;
    public static final int FLAG_TRACKING = 512;
    public static final int FLAG_FALLBACK = 1024;
    public static final int FLAG_IS_ACCESSIBILITY_EVENT = 2048;
    public static final int FLAG_PREDISPATCH = 536870912;
    public static final int FLAG_START_TRACKING = 1073741824;
    public static final int FLAG_TAINTED = -2147483648;
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "KeyEvent";
    private static final int MAX_RECYCLED = 10;
    private static final java.lang.Object gRecyclerLock = null;
    private static int gRecyclerUsed;
    private static android.view.KeyEvent gRecyclerTop;
    private android.view.KeyEvent mNext;
    private int mId;
    private int mDeviceId;
    private int mSource;
    private int mDisplayId;
    private byte[] mHmac;
    private int mMetaState;
    private int mAction;
    private int mKeyCode;
    private int mScanCode;
    private int mRepeatCount;
    private int mFlags;
    private long mDownTime;
    private long mEventTime;
    private java.lang.String mCharacters;
    private static final int META_MODIFIER_MASK = 487679;
    private static final int META_LOCK_MASK = 7340032;
    private static final int META_ALL_MASK = 7827711;
    private static final int META_SYNTHETIC_MASK = 3840;
    private static final int META_INVALID_MODIFIER_MASK = 7343872;
    public static final android.os.Parcelable.Creator<android.view.KeyEvent> CREATOR = null;
    public static int getMaxKeyCode() { return 0; }
    public static int getDeadChar(int p0, int p1) { return 0; }
    private static native java.lang.String nativeKeyCodeToString(int p0);
    private static native int nativeKeyCodeFromString(java.lang.String p0);
    private static native int nativeNextId();
    private KeyEvent() { super(); }
    public KeyEvent(int p0, int p1) { super(); }
    public KeyEvent(long p0, long p1, int p2, int p3, int p4) { super(); }
    public KeyEvent(long p0, long p1, int p2, int p3, int p4, int p5) { super(); }
    public KeyEvent(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7) { super(); }
    public KeyEvent(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) { super(); }
    public KeyEvent(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) { super(); }
    public KeyEvent(long p0, java.lang.String p1, int p2, int p3) { super(); }
    public KeyEvent(android.view.KeyEvent p0) { super(); }
    @java.lang.Deprecated
    public KeyEvent(android.view.KeyEvent p0, long p1, int p2) { super(); }
    private static android.view.KeyEvent obtain() { return null; }
    public static android.view.KeyEvent obtain(int p0, long p1, long p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11, byte[] p12, java.lang.String p13) { return null; }
    public static android.view.KeyEvent obtain(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, java.lang.String p11) { return null; }
    public static android.view.KeyEvent obtain(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, java.lang.String p10) { return null; }
    public static android.view.KeyEvent obtain(android.view.KeyEvent p0) { return null; }
    public android.view.KeyEvent copy() { return null; }
    public final void recycle() {}
    public final void recycleIfNeededAfterDispatch() {}
    public int getId() { return 0; }
    public static android.view.KeyEvent changeTimeRepeat(android.view.KeyEvent p0, long p1, int p2) { return null; }
    public static android.view.KeyEvent changeTimeRepeat(android.view.KeyEvent p0, long p1, int p2, int p3) { return null; }
    private KeyEvent(android.view.KeyEvent p0, int p1) { super(); }
    public static android.view.KeyEvent changeAction(android.view.KeyEvent p0, int p1) { return null; }
    public static android.view.KeyEvent changeFlags(android.view.KeyEvent p0, int p1) { return null; }
    public final boolean isTainted() { return false; }
    public final void setTainted(boolean p0) {}
    @java.lang.Deprecated
    public final boolean isDown() { return false; }
    public final boolean isSystem() { return false; }
    public final boolean isWakeKey() { return false; }
    public static final boolean isGamepadButton(int p0) { return false; }
    public static final boolean isConfirmKey(int p0) { return false; }
    public static final boolean isMediaSessionKey(int p0) { return false; }
    public static final boolean isSystemKey(int p0) { return false; }
    public static final boolean isWakeKey(int p0) { return false; }
    public static final boolean isMetaKey(int p0) { return false; }
    public static final boolean isAltKey(int p0) { return false; }
    public final int getDeviceId() { return 0; }
    public final int getSource() { return 0; }
    public final void setSource(int p0) {}
    public final int getDisplayId() { return 0; }
    public final void setDisplayId(int p0) {}
    public final int getMetaState() { return 0; }
    public final int getModifiers() { return 0; }
    public final void setFlags(int p0) {}
    public final int getFlags() { return 0; }
    public static int getModifierMetaStateMask() { return 0; }
    public static boolean isModifierKey(int p0) { return false; }
    public static int normalizeMetaState(int p0) { return 0; }
    public static boolean metaStateHasNoModifiers(int p0) { return false; }
    public static boolean metaStateHasModifiers(int p0, int p1) { return false; }
    private static int metaStateFilterDirectionalModifiers(int p0, int p1, int p2, int p3, int p4) { return 0; }
    public final boolean hasNoModifiers() { return false; }
    public final boolean hasModifiers(int p0) { return false; }
    public final boolean isAltPressed() { return false; }
    public final boolean isShiftPressed() { return false; }
    public final boolean isSymPressed() { return false; }
    public final boolean isCtrlPressed() { return false; }
    public final boolean isMetaPressed() { return false; }
    public final boolean isFunctionPressed() { return false; }
    public final boolean isCapsLockOn() { return false; }
    public final boolean isNumLockOn() { return false; }
    public final boolean isScrollLockOn() { return false; }
    public final int getAction() { return 0; }
    public final boolean isCanceled() { return false; }
    public final void cancel() {}
    public final void startTracking() {}
    public final boolean isTracking() { return false; }
    public final boolean isLongPress() { return false; }
    public final int getKeyCode() { return 0; }
    @java.lang.Deprecated
    public final java.lang.String getCharacters() { return null; }
    public final int getScanCode() { return 0; }
    public final int getRepeatCount() { return 0; }
    public final void setTime(long p0, long p1) {}
    public final long getDownTime() { return 0L; }
    public final long getEventTime() { return 0L; }
    public final long getEventTimeNano() { return 0L; }
    @java.lang.Deprecated
    public final int getKeyboardDevice() { return 0; }
    public final android.view.KeyCharacterMap getKeyCharacterMap() { return null; }
    public char getDisplayLabel() { return 0; }
    public int getUnicodeChar() { return 0; }
    public int getUnicodeChar(int p0) { return 0; }
    @java.lang.Deprecated
    public boolean getKeyData(android.view.KeyCharacterMap.KeyData p0) { return false; }
    public char getMatch(char[] p0) { return 0; }
    public char getMatch(char[] p0, int p1) { return 0; }
    public char getNumber() { return 0; }
    public boolean isPrintingKey() { return false; }
    @java.lang.Deprecated
    public final boolean dispatch(android.view.KeyEvent.Callback p0) { return false; }
    public final boolean dispatch(android.view.KeyEvent.Callback p0, android.view.KeyEvent.DispatcherState p1, java.lang.Object p2) { return false; }
    public java.lang.String toString() { return null; }
    public static java.lang.String actionToString(int p0) { return null; }
    public static java.lang.String keyCodeToString(int p0) { return null; }
    public static int keyCodeFromString(java.lang.String p0) { return 0; }
    private static boolean keyCodeIsValid(int p0) { return false; }
    public static java.lang.String metaStateToString(int p0) { return null; }
    public static android.view.KeyEvent createFromParcelBody(android.os.Parcel p0) { return null; }
    private KeyEvent(android.os.Parcel p0) { super(); }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static interface Callback {
        public boolean onKeyDown(int p0, android.view.KeyEvent p1);
        public boolean onKeyLongPress(int p0, android.view.KeyEvent p1);
        public boolean onKeyUp(int p0, android.view.KeyEvent p1);
        public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2);
    }

    public static class DispatcherState {
        int mDownKeyCode;
        java.lang.Object mDownTarget;
        android.util.SparseIntArray mActiveLongPresses;
        public DispatcherState() {}
        public void reset() {}
        public void reset(java.lang.Object p0) {}
        public void startTracking(android.view.KeyEvent p0, java.lang.Object p1) {}
        public boolean isTracking(android.view.KeyEvent p0) { return false; }
        public void performedLongPress(android.view.KeyEvent p0) {}
        public void handleUpEvent(android.view.KeyEvent p0) {}
    }
}
