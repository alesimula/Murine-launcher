package android.view;

public class View implements android.graphics.drawable.Drawable.Callback, android.view.KeyEvent.Callback, android.view.accessibility.AccessibilityEventSource {
    public static boolean DEBUG_DRAW;
    protected static final java.lang.String VIEW_LOG_TAG = "View";
    public static boolean sDebugViewAttributes;
    public static java.lang.String sDebugViewAttributesApplicationPackage;
    public static final int NO_ID = -1;
    public static final int LAST_APP_AUTOFILL_ID = 1073741823;
    public android.view.HapticScrollFeedbackProvider mScrollFeedbackProvider;
    static boolean sTextureViewIgnoresDrawableSetters;
    protected static boolean sPreserveMarginParamsInLayoutParamConversion;
    static boolean sCascadedDragDrop;
    static boolean sHasFocusableExcludeAutoFocusable;
    static boolean sBrokenInsetsDispatch;
    protected static boolean sBrokenWindowBackground;
    static boolean sForceLayoutWhenInsetsChanged;
    public static final int NOT_FOCUSABLE = 0;
    public static final int FOCUSABLE = 1;
    public static final int FOCUSABLE_AUTO = 16;
    public static final int VISIBLE = 0;
    public static final int INVISIBLE = 4;
    public static final int GONE = 8;
    static final int VISIBILITY_MASK = 12;
    public static final java.lang.String AUTOFILL_HINT_EMAIL_ADDRESS = "emailAddress";
    public static final java.lang.String AUTOFILL_HINT_NAME = "name";
    public static final java.lang.String AUTOFILL_HINT_USERNAME = "username";
    public static final java.lang.String AUTOFILL_HINT_PASSWORD = "password";
    public static final java.lang.String AUTOFILL_HINT_PHONE = "phone";
    public static final java.lang.String AUTOFILL_HINT_POSTAL_ADDRESS = "postalAddress";
    public static final java.lang.String AUTOFILL_HINT_POSTAL_CODE = "postalCode";
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_NUMBER = "creditCardNumber";
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE = "creditCardSecurityCode";
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE = "creditCardExpirationDate";
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH = "creditCardExpirationMonth";
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR = "creditCardExpirationYear";
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY = "creditCardExpirationDay";
    public static final java.lang.String AUTOFILL_HINT_PASSWORD_AUTO = "passwordAuto";
    public static final java.lang.String AUTOFILL_HINT_CREDENTIAL_MANAGER = "credential";
    public static final int AUTOFILL_TYPE_NONE = 0;
    public static final int AUTOFILL_TYPE_TEXT = 1;
    public static final int AUTOFILL_TYPE_TOGGLE = 2;
    public static final int AUTOFILL_TYPE_LIST = 3;
    public static final int AUTOFILL_TYPE_DATE = 4;
    public static final int IMPORTANT_FOR_AUTOFILL_AUTO = 0;
    public static final int IMPORTANT_FOR_AUTOFILL_YES = 1;
    public static final int IMPORTANT_FOR_AUTOFILL_NO = 2;
    public static final int IMPORTANT_FOR_AUTOFILL_YES_EXCLUDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_AUTOFILL_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int AUTOFILL_FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int SCROLL_CAPTURE_HINT_AUTO = 0;
    public static final int SCROLL_CAPTURE_HINT_EXCLUDE = 1;
    public static final int SCROLL_CAPTURE_HINT_INCLUDE = 2;
    public static final int SCROLL_CAPTURE_HINT_EXCLUDE_DESCENDANTS = 4;
    static final int ENABLED = 0;
    static final int DISABLED = 32;
    static final int ENABLED_MASK = 32;
    static final int WILL_NOT_DRAW = 128;
    static final int DRAW_MASK = 128;
    static final int SCROLLBARS_NONE = 0;
    static final int SCROLLBARS_HORIZONTAL = 256;
    static final int SCROLLBARS_VERTICAL = 512;
    static final int SCROLLBARS_MASK = 768;
    static final int FILTER_TOUCHES_WHEN_OBSCURED = 1024;
    static final int OPTIONAL_FITS_SYSTEM_WINDOWS = 2048;
    static final int FADING_EDGE_NONE = 0;
    static final int FADING_EDGE_HORIZONTAL = 4096;
    static final int FADING_EDGE_VERTICAL = 8192;
    static final int FADING_EDGE_MASK = 12288;
    static final int CLICKABLE = 16384;
    static final int DRAWING_CACHE_ENABLED = 32768;
    static final int SAVE_DISABLED = 65536;
    static final int SAVE_DISABLED_MASK = 65536;
    static final int WILL_NOT_CACHE_DRAWING = 131072;
    static final int FOCUSABLE_IN_TOUCH_MODE = 262144;
    @java.lang.Deprecated
    public static final int DRAWING_CACHE_QUALITY_LOW = 524288;
    @java.lang.Deprecated
    public static final int DRAWING_CACHE_QUALITY_HIGH = 1048576;
    @java.lang.Deprecated
    public static final int DRAWING_CACHE_QUALITY_AUTO = 0;
    static final int DRAWING_CACHE_QUALITY_MASK = 1572864;
    static final int LONG_CLICKABLE = 2097152;
    static final int DUPLICATE_PARENT_STATE = 4194304;
    static final int CONTEXT_CLICKABLE = 8388608;
    public static final int SCROLLBARS_INSIDE_OVERLAY = 0;
    public static final int SCROLLBARS_INSIDE_INSET = 16777216;
    public static final int SCROLLBARS_OUTSIDE_OVERLAY = 33554432;
    public static final int SCROLLBARS_OUTSIDE_INSET = 50331648;
    static final int SCROLLBARS_INSET_MASK = 16777216;
    static final int SCROLLBARS_OUTSIDE_MASK = 33554432;
    static final int SCROLLBARS_STYLE_MASK = 50331648;
    public static final int KEEP_SCREEN_ON = 67108864;
    public static final int SOUND_EFFECTS_ENABLED = 134217728;
    public static final int HAPTIC_FEEDBACK_ENABLED = 268435456;
    static final int PARENT_SAVE_DISABLED = 536870912;
    static final int PARENT_SAVE_DISABLED_MASK = 536870912;
    static final int TOOLTIP = 1073741824;
    @android.annotation.FlaggedApi("android.view.flags.sensitive_content_app_protection_api")
    public static final int CONTENT_SENSITIVITY_AUTO = 0;
    @android.annotation.FlaggedApi("android.view.flags.sensitive_content_app_protection_api")
    public static final int CONTENT_SENSITIVITY_SENSITIVE = 1;
    @android.annotation.FlaggedApi("android.view.flags.sensitive_content_app_protection_api")
    public static final int CONTENT_SENSITIVITY_NOT_SENSITIVE = 2;
    public static final int FOCUSABLES_ALL = 0;
    public static final int FOCUSABLES_TOUCH_MODE = 1;
    public static final int FOCUS_BACKWARD = 1;
    public static final int FOCUS_FORWARD = 2;
    public static final int FOCUS_LEFT = 17;
    public static final int FOCUS_UP = 33;
    public static final int FOCUS_RIGHT = 66;
    public static final int FOCUS_DOWN = 130;
    public static final int MEASURED_SIZE_MASK = 16777215;
    public static final int MEASURED_STATE_MASK = -16777216;
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    protected static final int[] EMPTY_STATE_SET = null;
    protected static final int[] ENABLED_STATE_SET = null;
    protected static final int[] FOCUSED_STATE_SET = null;
    protected static final int[] SELECTED_STATE_SET = null;
    protected static final int[] PRESSED_STATE_SET = null;
    protected static final int[] WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] ENABLED_FOCUSED_STATE_SET = null;
    protected static final int[] ENABLED_SELECTED_STATE_SET = null;
    protected static final int[] ENABLED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] FOCUSED_SELECTED_STATE_SET = null;
    protected static final int[] FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] ENABLED_FOCUSED_SELECTED_STATE_SET = null;
    protected static final int[] ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_SELECTED_STATE_SET = null;
    protected static final int[] PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_FOCUSED_SELECTED_STATE_SET = null;
    protected static final int[] PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_SELECTED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    public static final int FRAME_RATE_CATEGORY_REASON_UNKNOWN = 0;
    public static final int FRAME_RATE_CATEGORY_REASON_SMALL = 16777216;
    public static final int FRAME_RATE_CATEGORY_REASON_INTERMITTENT = 33554432;
    public static final int FRAME_RATE_CATEGORY_REASON_LARGE = 50331648;
    public static final int FRAME_RATE_CATEGORY_REASON_REQUESTED = 67108864;
    public static final int FRAME_RATE_CATEGORY_REASON_INVALID = 83886080;
    public static final int FRAME_RATE_CATEGORY_REASON_VELOCITY = 100663296;
    public static final int FRAME_RATE_CATEGORY_REASON_BOOST = 134217728;
    public static final int FRAME_RATE_CATEGORY_REASON_TOUCH = 150994944;
    public static final int FRAME_RATE_CATEGORY_REASON_CONFLICTED = 167772160;
    protected static boolean sToolkitSetFrameRateReadOnlyFlagValue;
    int mFrameRateCompatibility;
    static final int DEBUG_CORNERS_COLOR = Integer.valueOf(0);
    static final int DEBUG_CORNERS_SIZE_DIP = 8;
    static final java.lang.ThreadLocal<android.graphics.Rect> sThreadLocal = null;
    protected android.view.animation.Animation mCurrentAnimation;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    int mMeasuredWidth;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    int mMeasuredHeight;
    boolean mRecreateDisplayList;
    @android.view.ViewDebug.ExportedProperty(resolveId=true)
    int mID;
    protected java.lang.Object mTag;
    static final int PFLAG_WANTS_FOCUS = 1;
    static final int PFLAG_FOCUSED = 2;
    static final int PFLAG_SELECTED = 4;
    static final int PFLAG_IS_ROOT_NAMESPACE = 8;
    static final int PFLAG_HAS_BOUNDS = 16;
    static final int PFLAG_DRAWN = 32;
    static final int PFLAG_DRAW_ANIMATION = 64;
    static final int PFLAG_SKIP_DRAW = 128;
    static final int PFLAG_REQUEST_TRANSPARENT_REGIONS = 512;
    static final int PFLAG_DRAWABLE_STATE_DIRTY = 1024;
    static final int PFLAG_MEASURED_DIMENSION_SET = 2048;
    static final int PFLAG_FORCE_LAYOUT = 4096;
    static final int PFLAG_LAYOUT_REQUIRED = 8192;
    static final int PFLAG_DRAWING_CACHE_VALID = 32768;
    static final int PFLAG_ANIMATION_STARTED = 65536;
    static final int PFLAG_ALPHA_SET = 262144;
    static final int PFLAG_SCROLL_CONTAINER = 524288;
    static final int PFLAG_SCROLL_CONTAINER_ADDED = 1048576;
    static final int PFLAG_DIRTY = 2097152;
    static final int PFLAG_DIRTY_MASK = 2097152;
    static final int PFLAG_OPAQUE_BACKGROUND = 8388608;
    static final int PFLAG_OPAQUE_SCROLLBARS = 16777216;
    static final int PFLAG_OPAQUE_MASK = 25165824;
    static final int PFLAG_CANCEL_NEXT_UP_EVENT = 67108864;
    static final int PFLAG_ACTIVATED = 1073741824;
    static final int PFLAG_INVALIDATED = -2147483648;
    static final int PFLAG2_DRAG_CAN_ACCEPT = 1;
    static final int PFLAG2_DRAG_HOVERED = 2;
    public static final int LAYOUT_DIRECTION_UNDEFINED = -1;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    static final int PFLAG2_LAYOUT_DIRECTION_MASK_SHIFT = 2;
    static final int PFLAG2_LAYOUT_DIRECTION_MASK = 12;
    static final int PFLAG2_LAYOUT_DIRECTION_RESOLVED_RTL = 16;
    static final int PFLAG2_LAYOUT_DIRECTION_RESOLVED = 32;
    static final int PFLAG2_LAYOUT_DIRECTION_RESOLVED_MASK = 48;
    static final int LAYOUT_DIRECTION_RESOLVED_DEFAULT = 0;
    public static final int TEXT_DIRECTION_INHERIT = 0;
    public static final int TEXT_DIRECTION_FIRST_STRONG = 1;
    public static final int TEXT_DIRECTION_ANY_RTL = 2;
    public static final int TEXT_DIRECTION_LTR = 3;
    public static final int TEXT_DIRECTION_RTL = 4;
    public static final int TEXT_DIRECTION_LOCALE = 5;
    public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 6;
    public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 7;
    static final int TEXT_DIRECTION_RESOLVED_DEFAULT = 1;
    static final int PFLAG2_TEXT_DIRECTION_MASK_SHIFT = 6;
    static final int PFLAG2_TEXT_DIRECTION_MASK = 448;
    static final int PFLAG2_TEXT_DIRECTION_RESOLVED = 512;
    static final int PFLAG2_TEXT_DIRECTION_RESOLVED_MASK_SHIFT = 10;
    static final int PFLAG2_TEXT_DIRECTION_RESOLVED_MASK = 7168;
    static final int PFLAG2_TEXT_DIRECTION_RESOLVED_DEFAULT = 1024;
    public static final int TEXT_ALIGNMENT_INHERIT = 0;
    public static final int TEXT_ALIGNMENT_GRAVITY = 1;
    public static final int TEXT_ALIGNMENT_TEXT_START = 2;
    public static final int TEXT_ALIGNMENT_TEXT_END = 3;
    public static final int TEXT_ALIGNMENT_CENTER = 4;
    public static final int TEXT_ALIGNMENT_VIEW_START = 5;
    public static final int TEXT_ALIGNMENT_VIEW_END = 6;
    static final int TEXT_ALIGNMENT_RESOLVED_DEFAULT = 1;
    static final int PFLAG2_TEXT_ALIGNMENT_MASK_SHIFT = 13;
    static final int PFLAG2_TEXT_ALIGNMENT_MASK = 57344;
    static final int PFLAG2_TEXT_ALIGNMENT_RESOLVED = 65536;
    static final int PFLAG2_TEXT_ALIGNMENT_RESOLVED_MASK_SHIFT = 17;
    static final int PFLAG2_TEXT_ALIGNMENT_RESOLVED_MASK = 917504;
    static final int PFLAG2_IMPORTANT_FOR_ACCESSIBILITY_SHIFT = 20;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    static final int IMPORTANT_FOR_ACCESSIBILITY_DEFAULT = 0;
    public static final int ACCESSIBILITY_DATA_SENSITIVE_AUTO = 0;
    public static final int ACCESSIBILITY_DATA_SENSITIVE_YES = 1;
    public static final int ACCESSIBILITY_DATA_SENSITIVE_NO = 2;
    static final int PFLAG2_IMPORTANT_FOR_ACCESSIBILITY_MASK = 7340032;
    static final int PFLAG2_ACCESSIBILITY_LIVE_REGION_SHIFT = 23;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    static final int ACCESSIBILITY_LIVE_REGION_DEFAULT = 0;
    static final int PFLAG2_ACCESSIBILITY_LIVE_REGION_MASK = 25165824;
    static final int PFLAG2_ACCESSIBILITY_FOCUSED = 67108864;
    static final int PFLAG2_SUBTREE_ACCESSIBILITY_STATE_CHANGED = 134217728;
    static final int PFLAG2_VIEW_QUICK_REJECTED = 268435456;
    static final int PFLAG2_PADDING_RESOLVED = 536870912;
    static final int PFLAG2_DRAWABLE_RESOLVED = 1073741824;
    static final int PFLAG2_HAS_TRANSIENT_STATE = -2147483648;
    static final int ALL_RTL_PROPERTIES_RESOLVED = 1610678816;
    static final int PFLAG3_VIEW_IS_ANIMATING_TRANSFORM = 1;
    static final int PFLAG3_VIEW_IS_ANIMATING_ALPHA = 2;
    static final int PFLAG3_IS_LAID_OUT = 4;
    static final int PFLAG3_MEASURE_NEEDED_BEFORE_LAYOUT = 8;
    static final int PFLAG3_CALLED_SUPER = 16;
    static final int PFLAG3_APPLYING_INSETS = 32;
    static final int PFLAG3_FITTING_SYSTEM_WINDOWS = 64;
    static final int PFLAG3_NESTED_SCROLLING_ENABLED = 128;
    static final int PFLAG3_SCROLL_INDICATOR_TOP = 256;
    static final int PFLAG3_SCROLL_INDICATOR_BOTTOM = 512;
    static final int PFLAG3_SCROLL_INDICATOR_LEFT = 1024;
    static final int PFLAG3_SCROLL_INDICATOR_RIGHT = 2048;
    static final int PFLAG3_SCROLL_INDICATOR_START = 4096;
    static final int PFLAG3_SCROLL_INDICATOR_END = 8192;
    static final int DRAG_MASK = 3;
    static final int SCROLL_INDICATORS_NONE = 0;
    static final int SCROLL_INDICATORS_PFLAG3_MASK = 16128;
    static final int SCROLL_INDICATORS_TO_PFLAGS3_LSHIFT = 8;
    public static final int SCROLL_INDICATOR_TOP = 1;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_END = 32;
    static final int PFLAG3_ASSIST_BLOCKED = 16384;
    static final int PFLAG3_IMPORTANT_FOR_AUTOFILL_SHIFT = 19;
    static final int PFLAG3_IMPORTANT_FOR_AUTOFILL_MASK = 7864320;
    static final int PFLAG3_TEMPORARY_DETACH = 33554432;
    static final int PFLAG3_NOTIFY_AUTOFILL_ENTER_ON_LAYOUT = 134217728;
    static final int PFLAG4_FRAMEWORK_OPTIONAL_FITS_SYSTEM_WINDOWS = 256;
    static final int PFLAG4_SCROLL_CAPTURE_HINT_SHIFT = 10;
    static final int PFLAG4_SCROLL_CAPTURE_HINT_MASK = 7168;
    protected static final int VIEW_STRUCTURE_FOR_ASSIST = 0;
    protected static final int VIEW_STRUCTURE_FOR_AUTOFILL = 1;
    protected static final int VIEW_STRUCTURE_FOR_CONTENT_CAPTURE = 2;
    public static final int OVER_SCROLL_ALWAYS = 0;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    public static final int OVER_SCROLL_NEVER = 2;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_VISIBLE = 0;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_LOW_PROFILE = 1;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_HIDE_NAVIGATION = 2;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_FULLSCREEN = 4;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_LAYOUT_STABLE = 256;
    public static final int SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION = 512;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN = 1024;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_IMMERSIVE = 2048;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_IMMERSIVE_STICKY = 4096;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = 8192;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR = 16;
    @java.lang.Deprecated
    public static final int STATUS_BAR_HIDDEN = 1;
    @java.lang.Deprecated
    public static final int STATUS_BAR_VISIBLE = 0;
    public static final int STATUS_BAR_DISABLE_EXPAND = 65536;
    public static final int STATUS_BAR_DISABLE_NOTIFICATION_ICONS = 131072;
    public static final int STATUS_BAR_DISABLE_NOTIFICATION_ALERTS = 262144;
    public static final int STATUS_BAR_DISABLE_NOTIFICATION_TICKER = 524288;
    public static final int STATUS_BAR_DISABLE_SYSTEM_INFO = 1048576;
    public static final int STATUS_BAR_DISABLE_HOME = 2097152;
    public static final int STATUS_BAR_DISABLE_BACK = 4194304;
    public static final int STATUS_BAR_DISABLE_CLOCK = 8388608;
    public static final int STATUS_BAR_DISABLE_RECENT = 16777216;
    public static final int STATUS_BAR_DISABLE_SEARCH = 33554432;
    public static final int STATUS_BAR_DISABLE_ONGOING_CALL_CHIP = 67108864;
    public static final int PUBLIC_STATUS_BAR_VISIBILITY_MASK = 16375;
    public static final int SYSTEM_UI_CLEARABLE_FLAGS = 7;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_LAYOUT_FLAGS = 1536;
    public static final int FIND_VIEWS_WITH_TEXT = 1;
    public static final int FIND_VIEWS_WITH_CONTENT_DESCRIPTION = 2;
    public static final int FIND_VIEWS_WITH_ACCESSIBILITY_NODE_PROVIDERS = 4;
    public static final int ACCESSIBILITY_CURSOR_POSITION_UNDEFINED = -1;
    public static final int SCREEN_STATE_OFF = 0;
    public static final int SCREEN_STATE_ON = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    protected android.view.ViewParent mParent;
    android.view.View.AttachInfo mAttachInfo;
    @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(mask=4096, equals=4096, name="FORCE_LAYOUT"), @android.view.ViewDebug.FlagToString(mask=8192, equals=8192, name="LAYOUT_REQUIRED"), @android.view.ViewDebug.FlagToString(mask=32768, equals=32768, name="DRAWING_CACHE_INVALID", outputIf=false), @android.view.ViewDebug.FlagToString(mask=32, equals=32, name="DRAWN", outputIf=true), @android.view.ViewDebug.FlagToString(mask=32, equals=32, name="NOT_DRAWN", outputIf=false), @android.view.ViewDebug.FlagToString(mask=2097152, equals=2097152, name="DIRTY")}, formatToHexString=true)
    public int mPrivateFlags;
    int mPrivateFlags2;
    int mPrivateFlags3;
    @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(mask=1, equals=1, name="LOW_PROFILE"), @android.view.ViewDebug.FlagToString(mask=2, equals=2, name="HIDE_NAVIGATION"), @android.view.ViewDebug.FlagToString(mask=4, equals=4, name="FULLSCREEN"), @android.view.ViewDebug.FlagToString(mask=256, equals=256, name="LAYOUT_STABLE"), @android.view.ViewDebug.FlagToString(mask=512, equals=512, name="LAYOUT_HIDE_NAVIGATION"), @android.view.ViewDebug.FlagToString(mask=1024, equals=1024, name="LAYOUT_FULLSCREEN"), @android.view.ViewDebug.FlagToString(mask=2048, equals=2048, name="IMMERSIVE"), @android.view.ViewDebug.FlagToString(mask=4096, equals=4096, name="IMMERSIVE_STICKY"), @android.view.ViewDebug.FlagToString(mask=8192, equals=8192, name="LIGHT_STATUS_BAR"), @android.view.ViewDebug.FlagToString(mask=16, equals=16, name="LIGHT_NAVIGATION_BAR"), @android.view.ViewDebug.FlagToString(mask=65536, equals=65536, name="STATUS_BAR_DISABLE_EXPAND"), @android.view.ViewDebug.FlagToString(mask=131072, equals=131072, name="STATUS_BAR_DISABLE_NOTIFICATION_ICONS"), @android.view.ViewDebug.FlagToString(mask=262144, equals=262144, name="STATUS_BAR_DISABLE_NOTIFICATION_ALERTS"), @android.view.ViewDebug.FlagToString(mask=524288, equals=524288, name="STATUS_BAR_DISABLE_NOTIFICATION_TICKER"), @android.view.ViewDebug.FlagToString(mask=1048576, equals=1048576, name="STATUS_BAR_DISABLE_SYSTEM_INFO"), @android.view.ViewDebug.FlagToString(mask=2097152, equals=2097152, name="STATUS_BAR_DISABLE_HOME"), @android.view.ViewDebug.FlagToString(mask=4194304, equals=4194304, name="STATUS_BAR_DISABLE_BACK"), @android.view.ViewDebug.FlagToString(mask=8388608, equals=8388608, name="STATUS_BAR_DISABLE_CLOCK"), @android.view.ViewDebug.FlagToString(mask=16777216, equals=16777216, name="STATUS_BAR_DISABLE_RECENT"), @android.view.ViewDebug.FlagToString(mask=33554432, equals=33554432, name="STATUS_BAR_DISABLE_SEARCH"), @android.view.ViewDebug.FlagToString(mask=67108864, equals=67108864, name="STATUS_BAR_DISABLE_ONGOING_CALL_CHIP")}, formatToHexString=true)
    int mSystemUiVisibility;
    int mTransientStateCount;
    int mWindowAttachCount;
    protected android.view.ViewGroup.LayoutParams mLayoutParams;
    @android.view.ViewDebug.ExportedProperty(formatToHexString=true)
    int mViewFlags;
    public android.view.View.TransformationInfo mTransformationInfo;
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    android.graphics.Rect mClipBounds;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    protected int mLeft;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    protected int mRight;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    protected int mTop;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    protected int mBottom;
    @android.view.ViewDebug.ExportedProperty(category="scrolling")
    protected int mScrollX;
    @android.view.ViewDebug.ExportedProperty(category="scrolling")
    protected int mScrollY;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mPaddingLeft;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mPaddingRight;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mPaddingTop;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mPaddingBottom;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mUserPaddingRight;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mUserPaddingBottom;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mUserPaddingLeft;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    int mUserPaddingStart;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    int mUserPaddingEnd;
    int mUserPaddingLeftInitial;
    int mUserPaddingRightInitial;
    int mOldWidthMeasureSpec;
    int mOldHeightMeasureSpec;
    android.graphics.RenderNode mBackgroundRenderNode;
    android.view.View.ListenerInfo mListenerInfo;
    android.view.View.TooltipInfo mTooltipInfo;
    @android.view.ViewDebug.ExportedProperty(deepExport=true)
    protected android.content.Context mContext;
    android.view.ViewOutlineProvider mOutlineProvider;
    int mNextFocusForwardId;
    int mNextClusterForwardId;
    boolean mDefaultFocusHighlightEnabled;
    public static final int DRAG_FLAG_GLOBAL = 256;
    public static final int DRAG_FLAG_GLOBAL_URI_READ = 1;
    public static final int DRAG_FLAG_GLOBAL_URI_WRITE = 2;
    public static final int DRAG_FLAG_GLOBAL_PERSISTABLE_URI_PERMISSION = 64;
    public static final int DRAG_FLAG_GLOBAL_PREFIX_URI_PERMISSION = 128;
    public static final int DRAG_FLAG_OPAQUE = 512;
    public static final int DRAG_FLAG_ACCESSIBILITY_ACTION = 1024;
    public static final int DRAG_FLAG_REQUEST_SURFACE_FOR_RETURN_ANIMATION = 2048;
    @android.annotation.FlaggedApi("com.android.window.flags.delegate_unhandled_drags")
    public static final int DRAG_FLAG_GLOBAL_SAME_APPLICATION = 4096;
    @android.annotation.FlaggedApi("com.android.window.flags.delegate_unhandled_drags")
    public static final int DRAG_FLAG_START_INTENT_SENDER_ON_UNHANDLED_DRAG = 8192;
    public static final int SCROLLBAR_POSITION_DEFAULT = 0;
    public static final int SCROLLBAR_POSITION_LEFT = 1;
    public static final int SCROLLBAR_POSITION_RIGHT = 2;
    public static final int LAYER_TYPE_NONE = 0;
    public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int LAYER_TYPE_HARDWARE = 2;
    int mLayerType;
    android.graphics.Paint mLayerPaint;
    public boolean mCachingFailed;
    final android.graphics.RenderNode mRenderNode = null;
    android.view.View.AccessibilityDelegate mAccessibilityDelegate;
    android.view.ViewOverlay mOverlay;
    protected final android.view.InputEventConsistencyVerifier mInputEventConsistencyVerifier = null;
    android.view.GhostView mGhostView;
    @android.view.ViewDebug.ExportedProperty(category="attributes", hasAdjacentMapping=true)
    public java.lang.String[] mAttributes;
    java.lang.String mStartActivityRequestWho;
    int mUnbufferedInputSource;
    static final float MAX_FRAME_RATE = 120.0f;
    @android.annotation.FlaggedApi("android.view.flags.toolkit_set_frame_rate_read_only")
    public static final float REQUESTED_FRAME_RATE_CATEGORY_DEFAULT = Float.NaN;
    @android.annotation.FlaggedApi("android.view.flags.toolkit_set_frame_rate_read_only")
    public static final float REQUESTED_FRAME_RATE_CATEGORY_NO_PREFERENCE = -1.0f;
    @android.annotation.FlaggedApi("android.view.flags.toolkit_set_frame_rate_read_only")
    public static final float REQUESTED_FRAME_RATE_CATEGORY_LOW = -2.0f;
    @android.annotation.FlaggedApi("android.view.flags.toolkit_set_frame_rate_read_only")
    public static final float REQUESTED_FRAME_RATE_CATEGORY_NORMAL = -3.0f;
    @android.annotation.FlaggedApi("android.view.flags.toolkit_set_frame_rate_read_only")
    public static final float REQUESTED_FRAME_RATE_CATEGORY_HIGH = -4.0f;
    public static final android.util.Property<android.view.View, java.lang.Float> ALPHA = null;
    public static final android.util.Property<android.view.View, java.lang.Float> TRANSLATION_X = null;
    public static final android.util.Property<android.view.View, java.lang.Float> TRANSLATION_Y = null;
    public static final android.util.Property<android.view.View, java.lang.Float> TRANSLATION_Z = null;
    public static final android.util.Property<android.view.View, java.lang.Float> X = null;
    public static final android.util.Property<android.view.View, java.lang.Float> Y = null;
    public static final android.util.Property<android.view.View, java.lang.Float> Z = null;
    public static final android.util.Property<android.view.View, java.lang.Float> ROTATION = null;
    public static final android.util.Property<android.view.View, java.lang.Float> ROTATION_X = null;
    public static final android.util.Property<android.view.View, java.lang.Float> ROTATION_Y = null;
    public static final android.util.Property<android.view.View, java.lang.Float> SCALE_X = null;
    public static final android.util.Property<android.view.View, java.lang.Float> SCALE_Y = null;
    public View(android.content.Context p0) {}
    public View(android.content.Context p0, android.util.AttributeSet p1) {}
    public View(android.content.Context p0, android.util.AttributeSet p1, int p2) {}
    public View(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) {}
    @android.annotation.NonNull
    public int[] getAttributeResolutionStack(int p0) { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.Integer, java.lang.Integer> getAttributeSourceResourceMap() { return null; }
    public int getExplicitStyle() { return 0; }
    View() {}
    public final boolean isShowingLayoutBounds() { return false; }
    public final void setShowingLayoutBounds(boolean p0) {}
    public final void saveAttributeDataForStyleable(android.content.Context p0, int[] p1, android.util.AttributeSet p2, android.content.res.TypedArray p3, int p4, int p5) {}
    public java.lang.String toString() { return null; }
    void appendId(java.lang.StringBuilder p0) {}
    protected void initializeFadingEdge(android.content.res.TypedArray p0) {}
    protected void initializeFadingEdgeInternal(android.content.res.TypedArray p0) {}
    public int getVerticalFadingEdgeLength() { return 0; }
    public void setFadingEdgeLength(int p0) {}
    @android.annotation.FlaggedApi("android.service.autofill.autofill_credman_dev_integration")
    public void clearPendingCredentialRequest() {}
    @android.annotation.FlaggedApi("android.service.autofill.autofill_credman_dev_integration")
    public void setPendingCredentialRequest(android.credentials.GetCredentialRequest p0, android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> p1) {}
    @android.annotation.Nullable
    public android.view.ViewCredentialHandler getViewCredentialHandler() { return null; }
    public int getHorizontalFadingEdgeLength() { return 0; }
    public int getVerticalScrollbarWidth() { return 0; }
    protected int getHorizontalScrollbarHeight() { return 0; }
    protected void initializeScrollbars(android.content.res.TypedArray p0) {}
    protected void initializeScrollbarsInternal(android.content.res.TypedArray p0) {}
    public void setVerticalScrollbarThumbDrawable(android.graphics.drawable.Drawable p0) {}
    public void setVerticalScrollbarTrackDrawable(android.graphics.drawable.Drawable p0) {}
    public void setHorizontalScrollbarThumbDrawable(android.graphics.drawable.Drawable p0) {}
    public void setHorizontalScrollbarTrackDrawable(android.graphics.drawable.Drawable p0) {}
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getVerticalScrollbarThumbDrawable() { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getVerticalScrollbarTrackDrawable() { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getHorizontalScrollbarThumbDrawable() { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getHorizontalScrollbarTrackDrawable() { return null; }
    public void setVerticalScrollbarPosition(int p0) {}
    public int getVerticalScrollbarPosition() { return 0; }
    boolean isOnScrollbar(float p0, float p1) { return false; }
    boolean isOnScrollbarThumb(float p0, float p1) { return false; }
    boolean isDraggingScrollBar() { return false; }
    @android.view.RemotableViewMethod
    public void setScrollIndicators(int p0) {}
    public void setScrollIndicators(int p0, int p1) {}
    public int getScrollIndicators() { return 0; }
    android.view.View.ListenerInfo getListenerInfo() { return null; }
    public void setOnScrollChangeListener(android.view.View.OnScrollChangeListener p0) {}
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener p0) {}
    public void addOnLayoutChangeListener(android.view.View.OnLayoutChangeListener p0) {}
    public void removeOnLayoutChangeListener(android.view.View.OnLayoutChangeListener p0) {}
    public void addOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener p0) {}
    public void removeOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener p0) {}
    public android.view.View.OnFocusChangeListener getOnFocusChangeListener() { return null; }
    public void setOnClickListener(android.view.View.OnClickListener p0) {}
    public boolean hasOnClickListeners() { return false; }
    public void setOnLongClickListener(android.view.View.OnLongClickListener p0) {}
    public boolean hasOnLongClickListeners() { return false; }
    @android.annotation.Nullable
    public android.view.View.OnLongClickListener getOnLongClickListener() { return null; }
    public void setOnContextClickListener(android.view.View.OnContextClickListener p0) {}
    public void setOnCreateContextMenuListener(android.view.View.OnCreateContextMenuListener p0) {}
    public void addFrameMetricsListener(android.view.Window p0, android.view.Window.OnFrameMetricsAvailableListener p1, android.os.Handler p2) {}
    public void removeFrameMetricsListener(android.view.Window.OnFrameMetricsAvailableListener p0) {}
    public void setNotifyAutofillManagerOnClick(boolean p0) {}
    public boolean performClick() { return false; }
    public boolean callOnClick() { return false; }
    public boolean performLongClick() { return false; }
    public boolean performLongClick(float p0, float p1) { return false; }
    public boolean performContextClick(float p0, float p1) { return false; }
    public boolean performContextClick() { return false; }
    protected boolean performButtonActionOnTouchDown(android.view.MotionEvent p0) { return false; }
    public boolean showContextMenu() { return false; }
    public boolean showContextMenu(float p0, float p1) { return false; }
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0) { return null; }
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0, int p1) { return null; }
    public void startActivityForResult(android.content.Intent p0, int p1) {}
    public boolean dispatchActivityResult(java.lang.String p0, int p1, int p2, android.content.Intent p3) { return false; }
    public void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    public void setOnKeyListener(android.view.View.OnKeyListener p0) {}
    public void setOnTouchListener(android.view.View.OnTouchListener p0) {}
    public void setOnGenericMotionListener(android.view.View.OnGenericMotionListener p0) {}
    public void setOnHoverListener(android.view.View.OnHoverListener p0) {}
    public void setOnDragListener(android.view.View.OnDragListener p0) {}
    void handleFocusGainInternal(int p0, android.graphics.Rect p1) {}
    public final void setRevealOnFocusHint(boolean p0) {}
    public final boolean getRevealOnFocusHint() { return false; }
    public void getHotspotBounds(android.graphics.Rect p0) {}
    public boolean requestRectangleOnScreen(android.graphics.Rect p0) { return false; }
    public boolean requestRectangleOnScreen(android.graphics.Rect p0, boolean p1) { return false; }
    public void clearFocus() {}
    public void clearFocusInternal(android.view.View p0, boolean p1, boolean p2) {}
    void notifyGlobalFocusCleared(android.view.View p0) {}
    boolean rootViewRequestFocus() { return false; }
    void unFocus(android.view.View p0) {}
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public boolean hasFocus() { return false; }
    public boolean hasFocusable() { return false; }
    public boolean hasExplicitFocusable() { return false; }
    boolean hasFocusable(boolean p0, boolean p1) { return false; }
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public void notifyEnterOrExitForAutoFillIfNeeded(boolean p0) {}
    public void setAccessibilityPaneTitle(java.lang.CharSequence p0) {}
    @android.annotation.Nullable
    public java.lang.CharSequence getAccessibilityPaneTitle() { return null; }
    public void sendAccessibilityEvent(int p0) {}
    public void announceForAccessibility(java.lang.CharSequence p0) {}
    public void sendAccessibilityEventInternal(int p0) {}
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent p0) {}
    public void sendAccessibilityEventUncheckedInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public void onPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo() { return null; }
    @android.annotation.Nullable
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfoInternal() { return null; }
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void getBoundsOnScreen(android.graphics.Rect p0) {}
    public void getBoundsOnScreen(android.graphics.Rect p0, boolean p1) {}
    public void getBoundsOnScreen(android.graphics.RectF p0, boolean p1) {}
    public void getBoundsInWindow(android.graphics.Rect p0, boolean p1) {}
    public void mapRectFromViewToScreenCoords(android.graphics.RectF p0, boolean p1) {}
    public void mapRectFromViewToWindowCoords(android.graphics.RectF p0, boolean p1) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onProvideStructure(android.view.ViewStructure p0) {}
    public void onProvideAutofillStructure(android.view.ViewStructure p0, int p1) {}
    public void onProvideContentCaptureStructure(android.view.ViewStructure p0, int p1) {}
    protected void onProvideStructure(android.view.ViewStructure p0, int p1, int p2) {}
    public void onProvideVirtualStructure(android.view.ViewStructure p0) {}
    public void onProvideAutofillVirtualStructure(android.view.ViewStructure p0, int p1) {}
    public void setOnReceiveContentListener(java.lang.String[] p0, android.view.OnReceiveContentListener p1) {}
    @android.annotation.Nullable
    public android.view.ContentInfo performReceiveContent(android.view.ContentInfo p0) { return null; }
    @android.annotation.Nullable
    public android.view.ContentInfo onReceiveContent(android.view.ContentInfo p0) { return null; }
    @android.annotation.SuppressLint("NullableCollection")
    @android.annotation.Nullable
    public java.lang.String[] getReceiveContentMimeTypes() { return null; }
    public void autofill(android.view.autofill.AutofillValue p0) {}
    public void autofill(android.util.SparseArray<android.view.autofill.AutofillValue> p0) {}
    public void onGetCredentialResponse(android.credentials.GetCredentialResponse p0) {}
    public void onGetCredentialException(java.lang.String p0, java.lang.String p1) {}
    public final android.view.autofill.AutofillId getAutofillId() { return null; }
    @android.annotation.FlaggedApi("android.service.autofill.autofill_credman_dev_integration")
    @android.annotation.Nullable
    public final android.credentials.GetCredentialRequest getPendingCredentialRequest() { return null; }
    @android.annotation.FlaggedApi("android.service.autofill.autofill_credman_dev_integration")
    @android.annotation.Nullable
    public final android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> getPendingCredentialCallback() { return null; }
    public void setAutofillId(android.view.autofill.AutofillId p0) {}
    public void resetSubtreeAutofillIds() {}
    public int getAutofillType() { return 0; }
    @android.view.ViewDebug.ExportedProperty
    @android.annotation.Nullable
    public java.lang.String[] getAutofillHints() { return null; }
    public boolean isAutofilled() { return false; }
    public boolean hideAutofillHighlight() { return false; }
    @android.annotation.Nullable
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }
    @android.view.ViewDebug.ExportedProperty(mapping={@android.view.ViewDebug.IntToString(from=0, to="auto"), @android.view.ViewDebug.IntToString(from=1, to="yes"), @android.view.ViewDebug.IntToString(from=2, to="no"), @android.view.ViewDebug.IntToString(from=4, to="yesExcludeDescendants"), @android.view.ViewDebug.IntToString(from=8, to="noExcludeDescendants")})
    public int getImportantForAutofill() { return 0; }
    public void setImportantForAutofill(int p0) {}
    public final boolean isImportantForAutofill() { return false; }
    @android.annotation.FlaggedApi("android.view.flags.sensitive_content_app_protection_api")
    public final void setContentSensitivity(int p0) {}
    @android.annotation.FlaggedApi("android.view.flags.sensitive_content_app_protection_api")
    public final int getContentSensitivity() { return 0; }
    @android.annotation.FlaggedApi("android.view.flags.sensitive_content_app_protection_api")
    public final boolean isContentSensitive() { return false; }
    @android.view.ViewDebug.ExportedProperty(mapping={@android.view.ViewDebug.IntToString(from=0, to="auto"), @android.view.ViewDebug.IntToString(from=1, to="yes"), @android.view.ViewDebug.IntToString(from=2, to="no"), @android.view.ViewDebug.IntToString(from=4, to="yesExcludeDescendants"), @android.view.ViewDebug.IntToString(from=8, to="noExcludeDescendants")})
    public int getImportantForContentCapture() { return 0; }
    public void setImportantForContentCapture(int p0) {}
    public final boolean isImportantForContentCapture() { return false; }
    protected boolean getNotifiedContentCaptureAppeared() { return false; }
    public void setContentCaptureSession(android.view.contentcapture.ContentCaptureSession p0) {}
    @android.annotation.Nullable
    public final android.view.contentcapture.ContentCaptureSession getContentCaptureSession() { return null; }
    final boolean isActivityDeniedForAutofillForUnimportantView() { return false; }
    final boolean isMatchingAutofillableHeuristics() { return false; }
    public boolean canNotifyAutofillEnterExitEvent() { return false; }
    public void dispatchProvideStructure(android.view.ViewStructure p0) {}
    public void dispatchProvideAutofillStructure(android.view.ViewStructure p0, int p1) {}
    public void dispatchInitialProvideContentCaptureStructure() {}
    void dispatchProvideContentCaptureStructure() {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void addExtraDataToAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0, java.lang.String p1, android.os.Bundle p2) {}
    public boolean isVisibleToUserForAutofill(int p0) { return false; }
    public boolean isVisibleToUser() { return false; }
    protected boolean isVisibleToUser(android.graphics.Rect p0) { return false; }
    public android.view.View.AccessibilityDelegate getAccessibilityDelegate() { return null; }
    public void setAccessibilityDelegate(android.view.View.AccessibilityDelegate p0) {}
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() { return null; }
    public int getAccessibilityViewId() { return 0; }
    public int getAutofillViewId() { return 0; }
    public int getAccessibilityWindowId() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="accessibility")
    @android.annotation.Nullable
    public final java.lang.CharSequence getStateDescription() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="accessibility")
    public java.lang.CharSequence getContentDescription() { return null; }
    @android.view.RemotableViewMethod
    public void setStateDescription(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public void setContentDescription(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public void setAccessibilityTraversalBefore(int p0) {}
    public int getAccessibilityTraversalBefore() { return 0; }
    @android.view.RemotableViewMethod
    public void setAccessibilityTraversalAfter(int p0) {}
    public int getAccessibilityTraversalAfter() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="accessibility")
    public int getLabelFor() { return 0; }
    @android.view.RemotableViewMethod
    public void setLabelFor(int p0) {}
    protected void onFocusLost() {}
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public boolean isFocused() { return false; }
    public android.view.View findFocus() { return null; }
    public boolean isScrollContainer() { return false; }
    public void setScrollContainer(boolean p0) {}
    @java.lang.Deprecated
    public int getDrawingCacheQuality() { return 0; }
    @java.lang.Deprecated
    public void setDrawingCacheQuality(int p0) {}
    public boolean getKeepScreenOn() { return false; }
    public void setKeepScreenOn(boolean p0) {}
    public int getNextFocusLeftId() { return 0; }
    public void setNextFocusLeftId(int p0) {}
    public int getNextFocusRightId() { return 0; }
    public void setNextFocusRightId(int p0) {}
    public int getNextFocusUpId() { return 0; }
    public void setNextFocusUpId(int p0) {}
    public int getNextFocusDownId() { return 0; }
    public void setNextFocusDownId(int p0) {}
    public int getNextFocusForwardId() { return 0; }
    public void setNextFocusForwardId(int p0) {}
    public int getNextClusterForwardId() { return 0; }
    public void setNextClusterForwardId(int p0) {}
    public boolean isShown() { return false; }
    @java.lang.Deprecated
    protected boolean fitSystemWindows(android.graphics.Rect p0) { return false; }
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener p0) {}
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    public void setWindowInsetsAnimationCallback(android.view.WindowInsetsAnimation.Callback p0) {}
    public boolean hasWindowInsetsAnimationCallback() { return false; }
    public void dispatchWindowInsetsAnimationPrepare(android.view.WindowInsetsAnimation p0) {}
    @android.annotation.NonNull
    public android.view.WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(android.view.WindowInsetsAnimation p0, android.view.WindowInsetsAnimation.Bounds p1) { return null; }
    @android.annotation.NonNull
    public android.view.WindowInsets dispatchWindowInsetsAnimationProgress(android.view.WindowInsets p0, java.util.List<android.view.WindowInsetsAnimation> p1) { return null; }
    public void dispatchWindowInsetsAnimationEnd(android.view.WindowInsetsAnimation p0) {}
    public void setSystemGestureExclusionRects(java.util.List<android.graphics.Rect> p0) {}
    void updateSystemGestureExclusionRects() {}
    @android.annotation.NonNull
    public java.util.List<android.graphics.Rect> getSystemGestureExclusionRects() { return null; }
    public final void setPreferKeepClear(boolean p0) {}
    public final boolean isPreferKeepClear() { return false; }
    public final void setPreferKeepClearRects(java.util.List<android.graphics.Rect> p0) {}
    @android.annotation.NonNull
    public final java.util.List<android.graphics.Rect> getPreferKeepClearRects() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_UNRESTRICTED_KEEP_CLEAR_AREAS")
    public final void setUnrestrictedPreferKeepClearRects(java.util.List<android.graphics.Rect> p0) {}
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public final java.util.List<android.graphics.Rect> getUnrestrictedPreferKeepClearRects() { return null; }
    void updateKeepClearRects() {}
    @android.annotation.NonNull
    java.util.List<android.graphics.Rect> collectPreferKeepClearRects() { return null; }
    @android.annotation.NonNull
    java.util.List<android.graphics.Rect> collectUnrestrictedPreferKeepClearRects() { return null; }
    public void setHandwritingBoundsOffsets(float p0, float p1, float p2, float p3) {}
    public float getHandwritingBoundsOffsetLeft() { return 0.0f; }
    public float getHandwritingBoundsOffsetTop() { return 0.0f; }
    public float getHandwritingBoundsOffsetRight() { return 0.0f; }
    public float getHandwritingBoundsOffsetBottom() { return 0.0f; }
    public void setHandwritingArea(android.graphics.Rect p0) {}
    @android.annotation.Nullable
    public android.graphics.Rect getHandwritingArea() { return null; }
    void updateHandwritingArea() {}
    boolean shouldInitiateHandwriting() { return false; }
    public boolean shouldTrackHandwritingArea() { return false; }
    public void setHandwritingDelegatorCallback(java.lang.Runnable p0) {}
    @android.annotation.Nullable
    public java.lang.Runnable getHandwritingDelegatorCallback() { return null; }
    public void setAllowedHandwritingDelegatePackage(java.lang.String p0) {}
    @android.annotation.Nullable
    public java.lang.String getAllowedHandwritingDelegatePackageName() { return null; }
    public void setIsHandwritingDelegate(boolean p0) {}
    public boolean isHandwritingDelegate() { return false; }
    public void setAllowedHandwritingDelegatorPackage(java.lang.String p0) {}
    @android.annotation.Nullable
    public java.lang.String getAllowedHandwritingDelegatorPackageName() { return null; }
    @android.annotation.FlaggedApi("android.view.inputmethod.home_screen_handwriting_delegator")
    public void setHandwritingDelegateFlags(int p0) {}
    @android.annotation.FlaggedApi("android.view.inputmethod.home_screen_handwriting_delegator")
    public int getHandwritingDelegateFlags() { return 0; }
    public void getLocationInSurface(int[] p0) {}
    public android.view.WindowInsets getRootWindowInsets() { return null; }
    @android.annotation.Nullable
    public android.view.WindowInsetsController getWindowInsetsController() { return null; }
    @android.annotation.Nullable
    public final android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcher() { return null; }
    @java.lang.Deprecated
    protected boolean computeFitSystemWindows(android.graphics.Rect p0, android.graphics.Rect p1) { return false; }
    public android.view.WindowInsets computeSystemWindowInsets(android.view.WindowInsets p0, android.graphics.Rect p1) { return null; }
    protected boolean hasContentOnApplyWindowInsetsListener() { return false; }
    public void setFitsSystemWindows(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty
    public boolean getFitsSystemWindows() { return false; }
    public boolean fitsSystemWindows() { return false; }
    @java.lang.Deprecated
    public void requestFitSystemWindows() {}
    public void requestApplyInsets() {}
    public void makeOptionalFitsSystemWindows() {}
    public void makeFrameworkOptionalFitsSystemWindows() {}
    public boolean isFrameworkOptionalFitsSystemWindows() { return false; }
    @android.view.ViewDebug.ExportedProperty(mapping={@android.view.ViewDebug.IntToString(from=0, to="VISIBLE"), @android.view.ViewDebug.IntToString(from=4, to="INVISIBLE"), @android.view.ViewDebug.IntToString(from=8, to="GONE")})
    public int getVisibility() { return 0; }
    @android.view.RemotableViewMethod
    public void setVisibility(int p0) {}
    @android.view.ViewDebug.ExportedProperty
    public boolean isEnabled() { return false; }
    @android.view.RemotableViewMethod
    public void setEnabled(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setFocusable(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setFocusable(int p0) {}
    @android.view.RemotableViewMethod
    public void setFocusableInTouchMode(boolean p0) {}
    public void setAutofillHints(java.lang.String... p0) {}
    public void setAutofilled(boolean p0, boolean p1) {}
    public void setSoundEffectsEnabled(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty
    public boolean isSoundEffectsEnabled() { return false; }
    public void setHapticFeedbackEnabled(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty
    public boolean isHapticFeedbackEnabled() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="layout", mapping={@android.view.ViewDebug.IntToString(from=0, to="LTR"), @android.view.ViewDebug.IntToString(from=1, to="RTL"), @android.view.ViewDebug.IntToString(from=2, to="INHERIT"), @android.view.ViewDebug.IntToString(from=3, to="LOCALE")})
    public int getRawLayoutDirection() { return 0; }
    @android.view.RemotableViewMethod
    public void setLayoutDirection(int p0) {}
    @android.view.ViewDebug.ExportedProperty(category="layout", mapping={@android.view.ViewDebug.IntToString(from=0, to="RESOLVED_DIRECTION_LTR"), @android.view.ViewDebug.IntToString(from=1, to="RESOLVED_DIRECTION_RTL")})
    public int getLayoutDirection() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="layout")
    public boolean isLayoutRtl() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="layout")
    public boolean hasTransientState() { return false; }
    public void setHasTransientState(boolean p0) {}
    public void setHasTranslationTransientState(boolean p0) {}
    public boolean hasTranslationTransientState() { return false; }
    public void clearTranslationState() {}
    public boolean isAttachedToWindow() { return false; }
    public boolean isLaidOut() { return false; }
    boolean isLayoutValid() { return false; }
    public void setWillNotDraw(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean willNotDraw() { return false; }
    @java.lang.Deprecated
    public void setWillNotCacheDrawing(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    @java.lang.Deprecated
    public boolean willNotCacheDrawing() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isClickable() { return false; }
    public void setClickable(boolean p0) {}
    public void setAllowClickWhenDisabled(boolean p0) {}
    public boolean isLongClickable() { return false; }
    public void setLongClickable(boolean p0) {}
    public boolean isContextClickable() { return false; }
    public void setContextClickable(boolean p0) {}
    public void setPressed(boolean p0) {}
    protected void dispatchSetPressed(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty
    public boolean isPressed() { return false; }
    public boolean isAssistBlocked() { return false; }
    public void setAssistBlocked(boolean p0) {}
    public boolean isSaveEnabled() { return false; }
    public void setSaveEnabled(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty
    public boolean getFilterTouchesWhenObscured() { return false; }
    public void setFilterTouchesWhenObscured(boolean p0) {}
    public boolean isSaveFromParentEnabled() { return false; }
    public void setSaveFromParentEnabled(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public final boolean isFocusable() { return false; }
    @android.view.ViewDebug.ExportedProperty(mapping={@android.view.ViewDebug.IntToString(from=0, to="NOT_FOCUSABLE"), @android.view.ViewDebug.IntToString(from=1, to="FOCUSABLE"), @android.view.ViewDebug.IntToString(from=16, to="FOCUSABLE_AUTO")}, category="focus")
    public int getFocusable() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public final boolean isFocusableInTouchMode() { return false; }
    public boolean isScreenReaderFocusable() { return false; }
    public void setScreenReaderFocusable(boolean p0) {}
    public boolean isAccessibilityHeading() { return false; }
    public void setAccessibilityHeading(boolean p0) {}
    public android.view.View focusSearch(int p0) { return null; }
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public final boolean isKeyboardNavigationCluster() { return false; }
    android.view.View findKeyboardNavigationCluster() { return null; }
    public void setKeyboardNavigationCluster(boolean p0) {}
    public final void setFocusedInCluster() {}
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public final boolean isFocusedByDefault() { return false; }
    @android.view.RemotableViewMethod
    public void setFocusedByDefault(boolean p0) {}
    boolean hasDefaultFocus() { return false; }
    public android.view.View keyboardNavigationClusterSearch(android.view.View p0, int p1) { return null; }
    public boolean dispatchUnhandledMove(android.view.View p0, int p1) { return false; }
    public void setDefaultFocusHighlightEnabled(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public final boolean getDefaultFocusHighlightEnabled() { return false; }
    android.view.View findUserSetNextFocus(android.view.View p0, int p1) { return null; }
    android.view.View findUserSetNextKeyboardNavigationCluster(android.view.View p0, int p1) { return null; }
    public java.util.ArrayList<android.view.View> getFocusables(int p0) { return null; }
    public void addFocusables(java.util.ArrayList<android.view.View> p0, int p1) {}
    public void addFocusables(java.util.ArrayList<android.view.View> p0, int p1, int p2) {}
    public void addKeyboardNavigationClusters(java.util.Collection<android.view.View> p0, int p1) {}
    public void findViewsWithText(java.util.ArrayList<android.view.View> p0, java.lang.CharSequence p1, int p2) {}
    public java.util.ArrayList<android.view.View> getTouchables() { return null; }
    public void addTouchables(java.util.ArrayList<android.view.View> p0) {}
    public boolean isAccessibilityFocused() { return false; }
    public boolean requestAccessibilityFocus() { return false; }
    public void clearAccessibilityFocus() {}
    void clearAccessibilityFocusNoCallbacks(int p0) {}
    public final boolean requestFocus() { return false; }
    public boolean restoreFocusInCluster(int p0) { return false; }
    public boolean restoreFocusNotInCluster() { return false; }
    public boolean restoreDefaultFocus() { return false; }
    public final boolean requestFocus(int p0) { return false; }
    public boolean requestFocus(int p0, android.graphics.Rect p1) { return false; }
    void clearParentsWantFocus() {}
    public final boolean requestFocusFromTouch() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="accessibility", mapping={@android.view.ViewDebug.IntToString(from=0, to="auto"), @android.view.ViewDebug.IntToString(from=1, to="yes"), @android.view.ViewDebug.IntToString(from=2, to="no"), @android.view.ViewDebug.IntToString(from=4, to="noHideDescendants")})
    public int getImportantForAccessibility() { return 0; }
    public void setAccessibilityLiveRegion(int p0) {}
    public int getAccessibilityLiveRegion() { return 0; }
    public void setImportantForAccessibility(int p0) {}
    public boolean isImportantForAccessibility() { return false; }
    public android.view.ViewParent getParentForAccessibility() { return null; }
    @android.annotation.Nullable
    android.view.View getSelfOrParentImportantForA11y() { return null; }
    public void addChildrenForAccessibility(java.util.ArrayList<android.view.View> p0) {}
    public boolean includeForAccessibility() { return false; }
    public boolean includeForAccessibility(boolean p0) { return false; }
    @android.view.ViewDebug.ExportedProperty(category="accessibility")
    public boolean isAccessibilityDataSensitive() { return false; }
    void calculateAccessibilityDataSensitive() {}
    public void setAccessibilityDataSensitive(int p0) {}
    public boolean isActionableForAccessibility() { return false; }
    public void notifyViewAccessibilityStateChangedIfNeeded(int p0) {}
    public void notifySubtreeAccessibilityStateChangedIfNeeded() {}
    public void setTransitionVisibility(int p0) {}
    void resetSubtreeAccessibilityStateChanged() {}
    public boolean dispatchNestedPrePerformAccessibilityAction(int p0, android.os.Bundle p1) { return false; }
    public boolean performAccessibilityAction(int p0, android.os.Bundle p1) { return false; }
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public java.lang.CharSequence getIterableTextForAccessibility() { return null; }
    public boolean isAccessibilitySelectionExtendable() { return false; }
    public void prepareForExtendedAccessibilitySelection() {}
    public int getAccessibilitySelectionStart() { return 0; }
    public int getAccessibilitySelectionEnd() { return 0; }
    public void setAccessibilitySelection(int p0, int p1) {}
    public android.view.AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(int p0) { return null; }
    public final boolean isTemporarilyDetached() { return false; }
    public void dispatchStartTemporaryDetach() {}
    public void onStartTemporaryDetach() {}
    public void dispatchFinishTemporaryDetach() {}
    public void onFinishTemporaryDetach() {}
    public android.view.KeyEvent.DispatcherState getKeyDispatcherState() { return null; }
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    boolean isAccessibilityFocusedViewOrHost() { return false; }
    protected boolean canReceivePointerEvents() { return false; }
    public boolean onFilterTouchEventForSecurity(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchCapturedPointerEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    protected boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    protected boolean hasHoveredChild() { return false; }
    protected boolean pointInHoveredChild(android.view.MotionEvent p0) { return false; }
    protected boolean dispatchGenericPointerEvent(android.view.MotionEvent p0) { return false; }
    protected boolean dispatchGenericFocusedEvent(android.view.MotionEvent p0) { return false; }
    public final boolean dispatchPointerEvent(android.view.MotionEvent p0) { return false; }
    public void dispatchWindowFocusChanged(boolean p0) {}
    public void onWindowFocusChanged(boolean p0) {}
    public boolean hasWindowFocus() { return false; }
    public boolean hasImeFocus() { return false; }
    protected void dispatchVisibilityChanged(android.view.View p0, int p1) {}
    protected void onVisibilityChanged(android.view.View p0, int p1) {}
    public void dispatchDisplayHint(int p0) {}
    protected void onDisplayHint(int p0) {}
    public void dispatchWindowVisibilityChanged(int p0) {}
    protected void onWindowVisibilityChanged(int p0) {}
    public boolean isAggregatedVisible() { return false; }
    boolean dispatchVisibilityAggregated(boolean p0) { return false; }
    public void onVisibilityAggregated(boolean p0) {}
    public int getWindowVisibility() { return 0; }
    public void getWindowVisibleDisplayFrame(android.graphics.Rect p0) {}
    public void getWindowDisplayFrame(android.graphics.Rect p0) {}
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    void dispatchCollectViewAttributes(android.view.View.AttachInfo p0, int p1) {}
    void performCollectViewAttributes(android.view.View.AttachInfo p0, int p1) {}
    void needGlobalAttributesUpdate(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty
    public boolean isInTouchMode() { return false; }
    @android.view.ViewDebug.CapturedViewProperty
    public final android.content.Context getContext() { return null; }
    public boolean onKeyPreIme(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyShortcut(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onCheckIsTextEditor() { return false; }
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p0) { return null; }
    public void onInputConnectionOpenedInternal(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1, android.os.Handler p2) {}
    public void onInputConnectionClosedInternal() {}
    public boolean checkInputConnectionProxy(android.view.View p0) { return false; }
    public void createContextMenu(android.view.ContextMenu p0) {}
    protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo() { return null; }
    protected void onCreateContextMenu(android.view.ContextMenu p0) {}
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isHovered() { return false; }
    public void setHovered(boolean p0) {}
    public void onHoverChanged(boolean p0) {}
    protected boolean handleScrollBarDragging(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean isInScrollingContainer() { return false; }
    public void cancelLongPress() {}
    public void setTouchDelegate(android.view.TouchDelegate p0) {}
    public android.view.TouchDelegate getTouchDelegate() { return null; }
    public final void requestUnbufferedDispatch(android.view.MotionEvent p0) {}
    public final void requestUnbufferedDispatch(int p0) {}
    void setFlags(int p0, int p1) {}
    public void bringToFront() {}
    protected void onScrollChanged(int p0, int p1, int p2, int p3) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public final android.view.ViewParent getParent() { return null; }
    public void setScrollX(int p0) {}
    public void setScrollY(int p0) {}
    public final int getScrollX() { return 0; }
    public final int getScrollY() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="layout")
    public final int getWidth() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="layout")
    public final int getHeight() { return 0; }
    public void getDrawingRect(android.graphics.Rect p0) {}
    public final int getMeasuredWidth() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="measurement", flagMapping=@android.view.ViewDebug.FlagToString(mask=-16777216, equals=16777216, name="MEASURED_STATE_TOO_SMALL"))
    public final int getMeasuredWidthAndState() { return 0; }
    public final int getMeasuredHeight() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="measurement", flagMapping=@android.view.ViewDebug.FlagToString(mask=-16777216, equals=16777216, name="MEASURED_STATE_TOO_SMALL"))
    public final int getMeasuredHeightAndState() { return 0; }
    public final int getMeasuredState() { return 0; }
    public android.graphics.Matrix getMatrix() { return null; }
    public final boolean hasIdentityMatrix() { return false; }
    void ensureTransformationInfo() {}
    public final android.graphics.Matrix getInverseMatrix() { return null; }
    public float getCameraDistance() { return 0.0f; }
    public void setCameraDistance(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getRotation() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setRotation(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getRotationY() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setRotationY(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getRotationX() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setRotationX(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getScaleX() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setScaleX(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getScaleY() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setScaleY(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getPivotX() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setPivotX(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getPivotY() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setPivotY(float p0) {}
    public boolean isPivotSet() { return false; }
    public void resetPivot() {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getAlpha() { return 0.0f; }
    public void forceHasOverlappingRendering(boolean p0) {}
    public final boolean getHasOverlappingRendering() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean hasOverlappingRendering() { return false; }
    @android.view.RemotableViewMethod
    public void setAlpha(float p0) {}
    boolean setAlphaNoInvalidation(float p0) { return false; }
    void setAlphaInternal(float p0) {}
    public void setTransitionAlpha(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getTransitionAlpha() { return 0.0f; }
    public void setForceDarkAllowed(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean isForceDarkAllowed() { return false; }
    @android.view.ViewDebug.CapturedViewProperty
    public final int getTop() { return 0; }
    public final void setTop(int p0) {}
    @android.view.ViewDebug.CapturedViewProperty
    public final int getBottom() { return 0; }
    public boolean isDirty() { return false; }
    public final void setBottom(int p0) {}
    @android.view.ViewDebug.CapturedViewProperty
    public final int getLeft() { return 0; }
    public final void setLeft(int p0) {}
    @android.view.ViewDebug.CapturedViewProperty
    public final int getRight() { return 0; }
    public final void setRight(int p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getX() { return 0.0f; }
    public void setX(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getY() { return 0.0f; }
    public void setY(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getZ() { return 0.0f; }
    public void setZ(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getElevation() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setElevation(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getTranslationX() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setTranslationX(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getTranslationY() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setTranslationY(float p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getTranslationZ() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setTranslationZ(float p0) {}
    public void setAnimationMatrix(android.graphics.Matrix p0) {}
    @android.annotation.Nullable
    public android.graphics.Matrix getAnimationMatrix() { return null; }
    public android.animation.StateListAnimator getStateListAnimator() { return null; }
    public void setStateListAnimator(android.animation.StateListAnimator p0) {}
    public final boolean getClipToOutline() { return false; }
    @android.view.RemotableViewMethod
    public void setClipToOutline(boolean p0) {}
    public void setOutlineProvider(android.view.ViewOutlineProvider p0) {}
    public android.view.ViewOutlineProvider getOutlineProvider() { return null; }
    public void invalidateOutline() {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean hasShadow() { return false; }
    public void setOutlineSpotShadowColor(int p0) {}
    public int getOutlineSpotShadowColor() { return 0; }
    public void setOutlineAmbientShadowColor(int p0) {}
    public int getOutlineAmbientShadowColor() { return 0; }
    public void setRevealClip(boolean p0, float p1, float p2, float p3) {}
    public void getHitRect(android.graphics.Rect p0) {}
    final boolean pointInView(float p0, float p1) { return false; }
    public boolean pointInView(float p0, float p1, float p2) { return false; }
    public void getFocusedRect(android.graphics.Rect p0) {}
    public boolean getGlobalVisibleRect(android.graphics.Rect p0, android.graphics.Point p1) { return false; }
    public final boolean getGlobalVisibleRect(android.graphics.Rect p0) { return false; }
    public final boolean getLocalVisibleRect(android.graphics.Rect p0) { return false; }
    public void offsetTopAndBottom(int p0) {}
    public void offsetLeftAndRight(int p0) {}
    @android.view.ViewDebug.ExportedProperty(deepExport=true, prefix="layout_")
    public android.view.ViewGroup.LayoutParams getLayoutParams() { return null; }
    public void setLayoutParams(android.view.ViewGroup.LayoutParams p0) {}
    public void resolveLayoutParams() {}
    public void scrollTo(int p0, int p1) {}
    public void scrollBy(int p0, int p1) {}
    protected boolean awakenScrollBars() { return false; }
    protected boolean awakenScrollBars(int p0) { return false; }
    protected boolean awakenScrollBars(int p0, boolean p1) { return false; }
    @java.lang.Deprecated
    public void invalidate(android.graphics.Rect p0) {}
    @java.lang.Deprecated
    public void invalidate(int p0, int p1, int p2, int p3) {}
    public void invalidate() {}
    public void invalidate(boolean p0) {}
    void invalidateInternal(int p0, int p1, int p2, int p3, boolean p4, boolean p5) {}
    void invalidateViewProperty(boolean p0, boolean p1) {}
    protected void damageInParent() {}
    protected void invalidateParentCaches() {}
    protected void invalidateParentIfNeeded() {}
    protected void invalidateParentIfNeededAndWasQuickRejected() {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean isOpaque() { return false; }
    protected void computeOpaqueFlags() {}
    protected boolean hasOpaqueScrollbars() { return false; }
    public android.os.Handler getHandler() { return null; }
    public android.view.ViewRootImpl getViewRootImpl() { return null; }
    public android.view.ThreadedRenderer getThreadedRenderer() { return null; }
    public boolean post(java.lang.Runnable p0) { return false; }
    public boolean postDelayed(java.lang.Runnable p0, long p1) { return false; }
    public void postOnAnimation(java.lang.Runnable p0) {}
    public void postOnAnimationDelayed(java.lang.Runnable p0, long p1) {}
    public boolean removeCallbacks(java.lang.Runnable p0) { return false; }
    public void postInvalidate() {}
    public void postInvalidate(int p0, int p1, int p2, int p3) {}
    public void postInvalidateDelayed(long p0) {}
    public void postInvalidateDelayed(long p0, int p1, int p2, int p3, int p4) {}
    public void postInvalidateOnAnimation() {}
    public void postInvalidateOnAnimation(int p0, int p1, int p2, int p3) {}
    public void computeScroll() {}
    public boolean isHorizontalFadingEdgeEnabled() { return false; }
    public void setHorizontalFadingEdgeEnabled(boolean p0) {}
    public boolean isVerticalFadingEdgeEnabled() { return false; }
    public void setVerticalFadingEdgeEnabled(boolean p0) {}
    public int getFadingEdge() { return 0; }
    public int getFadingEdgeLength() { return 0; }
    protected float getTopFadingEdgeStrength() { return 0.0f; }
    protected float getBottomFadingEdgeStrength() { return 0.0f; }
    protected float getLeftFadingEdgeStrength() { return 0.0f; }
    protected float getRightFadingEdgeStrength() { return 0.0f; }
    public boolean isHorizontalScrollBarEnabled() { return false; }
    public void setHorizontalScrollBarEnabled(boolean p0) {}
    public boolean isVerticalScrollBarEnabled() { return false; }
    public void setVerticalScrollBarEnabled(boolean p0) {}
    protected void recomputePadding() {}
    public void setScrollbarFadingEnabled(boolean p0) {}
    public boolean isScrollbarFadingEnabled() { return false; }
    public int getScrollBarDefaultDelayBeforeFade() { return 0; }
    public void setScrollBarDefaultDelayBeforeFade(int p0) {}
    public int getScrollBarFadeDuration() { return 0; }
    public void setScrollBarFadeDuration(int p0) {}
    public int getScrollBarSize() { return 0; }
    public void setScrollBarSize(int p0) {}
    public void setScrollBarStyle(int p0) {}
    @android.view.ViewDebug.ExportedProperty(mapping={@android.view.ViewDebug.IntToString(from=0, to="INSIDE_OVERLAY"), @android.view.ViewDebug.IntToString(from=16777216, to="INSIDE_INSET"), @android.view.ViewDebug.IntToString(from=33554432, to="OUTSIDE_OVERLAY"), @android.view.ViewDebug.IntToString(from=50331648, to="OUTSIDE_INSET")})
    public int getScrollBarStyle() { return 0; }
    protected int computeHorizontalScrollRange() { return 0; }
    protected int computeHorizontalScrollOffset() { return 0; }
    protected int computeHorizontalScrollExtent() { return 0; }
    protected int computeVerticalScrollRange() { return 0; }
    protected int computeVerticalScrollOffset() { return 0; }
    protected int computeVerticalScrollExtent() { return 0; }
    public boolean canScrollHorizontally(int p0) { return false; }
    public boolean canScrollVertically(int p0) { return false; }
    void getScrollIndicatorBounds(android.graphics.Rect p0) {}
    protected final void onDrawScrollBars(android.graphics.Canvas p0) {}
    protected boolean isVerticalScrollBarHidden() { return false; }
    protected void onDrawHorizontalScrollBar(android.graphics.Canvas p0, android.graphics.drawable.Drawable p1, int p2, int p3, int p4, int p5) {}
    protected void onDrawVerticalScrollBar(android.graphics.Canvas p0, android.graphics.drawable.Drawable p1, int p2, int p3, int p4, int p5) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    void assignParent(android.view.ViewParent p0) {}
    protected void onAttachedToWindow() {}
    public boolean resolveRtlPropertiesIfNeeded() { return false; }
    public void resetRtlProperties() {}
    void dispatchScreenStateChanged(int p0) {}
    public void onScreenStateChanged(int p0) {}
    void dispatchMovedToDisplay(android.view.Display p0, android.content.res.Configuration p1) {}
    public void onMovedToDisplay(int p0, android.content.res.Configuration p1) {}
    public void onRtlPropertiesChanged(int p0) {}
    public boolean resolveLayoutDirection() { return false; }
    public boolean canResolveLayoutDirection() { return false; }
    public void resetResolvedLayoutDirection() {}
    public boolean isLayoutDirectionInherited() { return false; }
    public boolean isLayoutDirectionResolved() { return false; }
    boolean isPaddingResolved() { return false; }
    public void resolvePadding() {}
    public void resetResolvedPadding() {}
    void resetResolvedPaddingInternal() {}
    protected void onDetachedFromWindow() {}
    protected void onDetachedFromWindowInternal() {}
    void invalidateInheritedLayoutMode(int p0) {}
    protected int getWindowAttachCount() { return 0; }
    public android.os.IBinder getWindowToken() { return null; }
    public android.view.WindowId getWindowId() { return null; }
    public android.os.IBinder getApplicationWindowToken() { return null; }
    public android.view.Display getDisplay() { return null; }
    android.view.IWindowSession getWindowSession() { return null; }
    protected android.view.IWindow getWindow() { return null; }
    int combineVisibility(int p0, int p1) { return 0; }
    public void fakeFocusAfterAttachingToWindow() {}
    void dispatchAttachedToWindow(android.view.View.AttachInfo p0, int p1) {}
    void dispatchDetachedFromWindow() {}
    public final void cancelPendingInputEvents() {}
    void dispatchCancelPendingInputEvents() {}
    public void onCancelPendingInputEvents() {}
    public void saveHierarchyState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    @android.annotation.Nullable
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    public void restoreHierarchyState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    public long getDrawingTime() { return 0L; }
    public void setDuplicateParentStateEnabled(boolean p0) {}
    public boolean isDuplicateParentStateEnabled() { return false; }
    public void setLayerType(int p0, android.graphics.Paint p1) {}
    public void setRenderEffect(android.graphics.RenderEffect p0) {}
    public void setBackdropRenderEffect(android.graphics.RenderEffect p0) {}
    public void setLayerPaint(android.graphics.Paint p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing", mapping={@android.view.ViewDebug.IntToString(from=0, to="NONE"), @android.view.ViewDebug.IntToString(from=1, to="SOFTWARE"), @android.view.ViewDebug.IntToString(from=2, to="HARDWARE")})
    public int getLayerType() { return 0; }
    public void buildLayer() {}
    public boolean probablyHasInput() { return false; }
    protected void destroyHardwareResources() {}
    @java.lang.Deprecated
    public void setDrawingCacheEnabled(boolean p0) {}
    @java.lang.Deprecated
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean isDrawingCacheEnabled() { return false; }
    public void outputDirtyFlags(java.lang.String p0, boolean p1, int p2) {}
    protected void dispatchGetDisplayList() {}
    public boolean canHaveDisplayList() { return false; }
    @android.annotation.NonNull
    public android.graphics.RenderNode updateDisplayListIfDirty() { return null; }
    @java.lang.Deprecated
    public android.graphics.Bitmap getDrawingCache() { return null; }
    @java.lang.Deprecated
    public android.graphics.Bitmap getDrawingCache(boolean p0) { return null; }
    @java.lang.Deprecated
    public void destroyDrawingCache() {}
    @java.lang.Deprecated
    public void setDrawingCacheBackgroundColor(int p0) {}
    @java.lang.Deprecated
    public int getDrawingCacheBackgroundColor() { return 0; }
    @java.lang.Deprecated
    public void buildDrawingCache() {}
    @java.lang.Deprecated
    public void buildDrawingCache(boolean p0) {}
    public android.graphics.Bitmap createSnapshot(android.view.ViewDebug.CanvasProvider p0, boolean p1) { return null; }
    public boolean isInEditMode() { return false; }
    protected boolean isPaddingOffsetRequired() { return false; }
    protected int getLeftPaddingOffset() { return 0; }
    protected int getRightPaddingOffset() { return 0; }
    protected int getTopPaddingOffset() { return 0; }
    protected int getBottomPaddingOffset() { return 0; }
    protected int getFadeTop(boolean p0) { return 0; }
    protected int getFadeHeight(boolean p0) { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean isHardwareAccelerated() { return false; }
    public void setClipBounds(android.graphics.Rect p0) {}
    public android.graphics.Rect getClipBounds() { return null; }
    public boolean getClipBounds(android.graphics.Rect p0) { return false; }
    void setDisplayListProperties(android.graphics.RenderNode p0) {}
    protected final boolean drawsWithRenderNode(android.graphics.Canvas p0) { return false; }
    boolean draw(android.graphics.Canvas p0, android.view.ViewGroup p1, long p2) { return false; }
    static android.graphics.Paint getDebugPaint() { return null; }
    final int dipsToPixels(int p0) { return 0; }
    public void draw(android.graphics.Canvas p0) {}
    void setBackgroundBounds() {}
    public android.view.ViewOverlay getOverlay() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public int getSolidColor() { return 0; }
    public boolean isLayoutRequested() { return false; }
    public static boolean isLayoutModeOptical(java.lang.Object p0) { return false; }
    public static void setTraceLayoutSteps(boolean p0) {}
    public static void setTracedRequestLayoutClassClass(java.lang.String p0) {}
    public void layout(int p0, int p1, int p2, int p3) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    public final void setLeftTopRightBottom(int p0, int p1, int p2, int p3) {}
    protected void onFinishInflate() {}
    public android.content.res.Resources getResources() { return null; }
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2) {}
    public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1) {}
    public void unscheduleDrawable(android.graphics.drawable.Drawable p0) {}
    protected void resolveDrawables() {}
    boolean areDrawablesResolved() { return false; }
    public void onResolveDrawables(int p0) {}
    protected void resetResolvedDrawables() {}
    void resetResolvedDrawablesInternal() {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    protected void drawableStateChanged() {}
    public void drawableHotspotChanged(float p0, float p1) {}
    public void dispatchDrawableHotspotChanged(float p0, float p1) {}
    public void refreshDrawableState() {}
    public boolean isDefaultFocusHighlightNeeded(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1) { return false; }
    public final int[] getDrawableState() { return null; }
    protected int[] onCreateDrawableState(int p0) { return null; }
    protected static int[] mergeDrawableStates(int[] p0, int[] p1) { return null; }
    public void jumpDrawablesToCurrentState() {}
    @android.view.RemotableViewMethod
    public void setBackgroundColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setBackgroundResource(int p0) {}
    public void setBackground(android.graphics.drawable.Drawable p0) {}
    @java.lang.Deprecated
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getBackground() { return null; }
    @android.view.RemotableViewMethod
    public void setBackgroundTintList(android.content.res.ColorStateList p0) {}
    @android.annotation.Nullable
    public android.content.res.ColorStateList getBackgroundTintList() { return null; }
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode p0) {}
    @android.view.RemotableViewMethod
    public void setBackgroundTintBlendMode(android.graphics.BlendMode p0) {}
    @android.annotation.Nullable
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() { return null; }
    @android.annotation.Nullable
    public android.graphics.BlendMode getBackgroundTintBlendMode() { return null; }
    public android.graphics.drawable.Drawable getForeground() { return null; }
    public void setForeground(android.graphics.drawable.Drawable p0) {}
    public boolean isForegroundInsidePadding() { return false; }
    public int getForegroundGravity() { return 0; }
    public void setForegroundGravity(int p0) {}
    @android.view.RemotableViewMethod
    public void setForegroundTintList(android.content.res.ColorStateList p0) {}
    @android.annotation.Nullable
    public android.content.res.ColorStateList getForegroundTintList() { return null; }
    public void setForegroundTintMode(android.graphics.PorterDuff.Mode p0) {}
    @android.view.RemotableViewMethod
    public void setForegroundTintBlendMode(android.graphics.BlendMode p0) {}
    @android.annotation.Nullable
    public android.graphics.PorterDuff.Mode getForegroundTintMode() { return null; }
    @android.annotation.Nullable
    public android.graphics.BlendMode getForegroundTintBlendMode() { return null; }
    public void onDrawForeground(android.graphics.Canvas p0) {}
    public void setPadding(int p0, int p1, int p2, int p3) {}
    protected void internalSetPadding(int p0, int p1, int p2, int p3) {}
    public void setPaddingRelative(int p0, int p1, int p2, int p3) {}
    public int getSourceLayoutResId() { return 0; }
    public int getPaddingTop() { return 0; }
    public int getPaddingBottom() { return 0; }
    public int getPaddingLeft() { return 0; }
    public int getPaddingStart() { return 0; }
    public int getPaddingRight() { return 0; }
    public int getPaddingEnd() { return 0; }
    public boolean isPaddingRelative() { return false; }
    android.graphics.Insets computeOpticalInsets() { return null; }
    public void resetPaddingToInitialValues() {}
    public android.graphics.Insets getOpticalInsets() { return null; }
    public void setOpticalInsets(android.graphics.Insets p0) {}
    public void setSelected(boolean p0) {}
    protected void dispatchSetSelected(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty
    public boolean isSelected() { return false; }
    public void setActivated(boolean p0) {}
    protected void dispatchSetActivated(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty
    public boolean isActivated() { return false; }
    public android.view.ViewTreeObserver getViewTreeObserver() { return null; }
    public android.view.View getRootView() { return null; }
    public boolean toGlobalMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean toLocalMotionEvent(android.view.MotionEvent p0) { return false; }
    public void transformMatrixToGlobal(android.graphics.Matrix p0) {}
    public void transformMatrixToLocal(android.graphics.Matrix p0) {}
    @android.view.ViewDebug.ExportedProperty(category="layout", indexMapping={@android.view.ViewDebug.IntToString(from=0, to="x"), @android.view.ViewDebug.IntToString(from=1, to="y")})
    public int[] getLocationOnScreen() { return null; }
    public void getLocationOnScreen(int[] p0) {}
    public void getLocationInWindow(int[] p0) {}
    public void transformFromViewToWindowSpace(int[] p0) {}
    protected <T extends android.view.View> T findViewTraversal(int p0) { return null; }
    protected <T extends android.view.View> T findViewWithTagTraversal(java.lang.Object p0) { return null; }
    protected <T extends android.view.View> T findViewByPredicateTraversal(java.util.function.Predicate<android.view.View> p0, android.view.View p1) { return null; }
    @android.annotation.Nullable
    public final <T extends android.view.View> T findViewById(int p0) { return null; }
    @android.annotation.NonNull
    public final <T extends android.view.View> T requireViewById(int p0) { return null; }
    public <T extends android.view.View> T findViewByAccessibilityIdTraversal(int p0) { return null; }
    public <T extends android.view.View> T findViewByAutofillIdTraversal(int p0) { return null; }
    public final <T extends android.view.View> T findViewWithTag(java.lang.Object p0) { return null; }
    public final <T extends android.view.View> T findViewByPredicate(java.util.function.Predicate<android.view.View> p0) { return null; }
    public final <T extends android.view.View> T findViewByPredicateInsideOut(android.view.View p0, java.util.function.Predicate<android.view.View> p1) { return null; }
    public void setId(int p0) {}
    public void setIsRootNamespace(boolean p0) {}
    public boolean isRootNamespace() { return false; }
    @android.view.ViewDebug.CapturedViewProperty
    public int getId() { return 0; }
    public long getUniqueDrawingId() { return 0L; }
    @android.view.ViewDebug.ExportedProperty
    public java.lang.Object getTag() { return null; }
    public void setTag(java.lang.Object p0) {}
    public java.lang.Object getTag(int p0) { return null; }
    public void setTag(int p0, java.lang.Object p1) {}
    public void setTagInternal(int p0, java.lang.Object p1) {}
    public void debug() {}
    protected void debug(int p0) {}
    protected static java.lang.String debugIndent(int p0) { return null; }
    @android.view.ViewDebug.ExportedProperty(category="layout")
    public int getBaseline() { return 0; }
    public boolean isInLayout() { return false; }
    public void requestLayout() {}
    public void forceLayout() {}
    public final void measure(int p0, int p1) {}
    protected void onMeasure(int p0, int p1) {}
    protected final void setMeasuredDimension(int p0, int p1) {}
    public static int combineMeasuredStates(int p0, int p1) { return 0; }
    public static int resolveSize(int p0, int p1) { return 0; }
    public static int resolveSizeAndState(int p0, int p1, int p2) { return 0; }
    public static int getDefaultSize(int p0, int p1) { return 0; }
    protected int getSuggestedMinimumHeight() { return 0; }
    protected int getSuggestedMinimumWidth() { return 0; }
    public int getMinimumHeight() { return 0; }
    @android.view.RemotableViewMethod
    public void setMinimumHeight(int p0) {}
    public int getMinimumWidth() { return 0; }
    @android.view.RemotableViewMethod
    public void setMinimumWidth(int p0) {}
    public android.view.animation.Animation getAnimation() { return null; }
    public void startAnimation(android.view.animation.Animation p0) {}
    public void clearAnimation() {}
    public void setAnimation(android.view.animation.Animation p0) {}
    protected void onAnimationStart() {}
    protected void onAnimationEnd() {}
    protected boolean onSetAlpha(int p0) { return false; }
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    public void playSoundEffect(int p0) {}
    public boolean performHapticFeedback(int p0) { return false; }
    public boolean performHapticFeedback(int p0, int p1) { return false; }
    @java.lang.Deprecated
    public void setSystemUiVisibility(int p0) {}
    @java.lang.Deprecated
    public int getSystemUiVisibility() { return 0; }
    @java.lang.Deprecated
    public int getWindowSystemUiVisibility() { return 0; }
    @java.lang.Deprecated
    public void onWindowSystemUiVisibilityChanged(int p0) {}
    @java.lang.Deprecated
    public void dispatchWindowSystemUiVisiblityChanged(int p0) {}
    @java.lang.Deprecated
    public void setOnSystemUiVisibilityChangeListener(android.view.View.OnSystemUiVisibilityChangeListener p0) {}
    @java.lang.Deprecated
    public void dispatchSystemUiVisibilityChanged(int p0) {}
    boolean updateLocalSystemUiVisibility(int p0, int p1) { return false; }
    public void setDisabledSystemUiVisibility(int p0) {}
    public void onSystemBarAppearanceChanged(int p0) {}
    @java.lang.Deprecated
    public final boolean startDrag(android.content.ClipData p0, android.view.View.DragShadowBuilder p1, java.lang.Object p2, int p3) { return false; }
    public final boolean startDragAndDrop(android.content.ClipData p0, android.view.View.DragShadowBuilder p1, java.lang.Object p2, int p3) { return false; }
    static boolean hasActivityPendingIntents(android.content.ClipData p0) { return false; }
    static void cleanUpPendingIntents(android.content.ClipData p0) {}
    void setAccessibilityDragStarted(boolean p0) {}
    public final void cancelDragAndDrop() {}
    public final void updateDragShadow(android.view.View.DragShadowBuilder p0) {}
    public final boolean startMovingTask(float p0, float p1) { return false; }
    public void finishMovingTask() {}
    public boolean onDragEvent(android.view.DragEvent p0) { return false; }
    boolean dispatchDragEnterExitInPreN(android.view.DragEvent p0) { return false; }
    public boolean dispatchDragEvent(android.view.DragEvent p0) { return false; }
    final boolean callDragEventHandler(android.view.DragEvent p0) { return false; }
    boolean canAcceptDrag() { return false; }
    void sendWindowContentChangedAccessibilityEvent(int p0) {}
    public void onCloseSystemDialogs(java.lang.String p0) {}
    public void applyDrawableToTransparentRegion(android.graphics.drawable.Drawable p0, android.graphics.Region p1) {}
    public static android.view.View inflate(android.content.Context p0, int p1, android.view.ViewGroup p2) { return null; }
    protected boolean overScrollBy(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, boolean p8) { return false; }
    protected void onOverScrolled(int p0, int p1, boolean p2, boolean p3) {}
    public int getOverScrollMode() { return 0; }
    public void setOverScrollMode(int p0) {}
    public void setNestedScrollingEnabled(boolean p0) {}
    public boolean isNestedScrollingEnabled() { return false; }
    public boolean startNestedScroll(int p0) { return false; }
    public void stopNestedScroll() {}
    public boolean hasNestedScrollingParent() { return false; }
    public boolean dispatchNestedScroll(int p0, int p1, int p2, int p3, int[] p4) { return false; }
    public boolean dispatchNestedPreScroll(int p0, int p1, int[] p2, int[] p3) { return false; }
    public boolean dispatchNestedFling(float p0, float p1, boolean p2) { return false; }
    public boolean dispatchNestedPreFling(float p0, float p1) { return false; }
    protected float getVerticalScrollFactor() { return 0.0f; }
    protected float getHorizontalScrollFactor() { return 0.0f; }
    @android.view.ViewDebug.ExportedProperty(category="text", mapping={@android.view.ViewDebug.IntToString(from=0, to="INHERIT"), @android.view.ViewDebug.IntToString(from=1, to="FIRST_STRONG"), @android.view.ViewDebug.IntToString(from=2, to="ANY_RTL"), @android.view.ViewDebug.IntToString(from=3, to="LTR"), @android.view.ViewDebug.IntToString(from=4, to="RTL"), @android.view.ViewDebug.IntToString(from=5, to="LOCALE"), @android.view.ViewDebug.IntToString(from=6, to="FIRST_STRONG_LTR"), @android.view.ViewDebug.IntToString(from=7, to="FIRST_STRONG_RTL")})
    public int getRawTextDirection() { return 0; }
    public void setTextDirection(int p0) {}
    @android.view.ViewDebug.ExportedProperty(category="text", mapping={@android.view.ViewDebug.IntToString(from=0, to="INHERIT"), @android.view.ViewDebug.IntToString(from=1, to="FIRST_STRONG"), @android.view.ViewDebug.IntToString(from=2, to="ANY_RTL"), @android.view.ViewDebug.IntToString(from=3, to="LTR"), @android.view.ViewDebug.IntToString(from=4, to="RTL"), @android.view.ViewDebug.IntToString(from=5, to="LOCALE"), @android.view.ViewDebug.IntToString(from=6, to="FIRST_STRONG_LTR"), @android.view.ViewDebug.IntToString(from=7, to="FIRST_STRONG_RTL")})
    public int getTextDirection() { return 0; }
    public boolean resolveTextDirection() { return false; }
    public boolean canResolveTextDirection() { return false; }
    public void resetResolvedTextDirection() {}
    public boolean isTextDirectionInherited() { return false; }
    public boolean isTextDirectionResolved() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="text", mapping={@android.view.ViewDebug.IntToString(from=0, to="INHERIT"), @android.view.ViewDebug.IntToString(from=1, to="GRAVITY"), @android.view.ViewDebug.IntToString(from=2, to="TEXT_START"), @android.view.ViewDebug.IntToString(from=3, to="TEXT_END"), @android.view.ViewDebug.IntToString(from=4, to="CENTER"), @android.view.ViewDebug.IntToString(from=5, to="VIEW_START"), @android.view.ViewDebug.IntToString(from=6, to="VIEW_END")})
    public int getRawTextAlignment() { return 0; }
    public void setTextAlignment(int p0) {}
    @android.view.ViewDebug.ExportedProperty(category="text", mapping={@android.view.ViewDebug.IntToString(from=0, to="INHERIT"), @android.view.ViewDebug.IntToString(from=1, to="GRAVITY"), @android.view.ViewDebug.IntToString(from=2, to="TEXT_START"), @android.view.ViewDebug.IntToString(from=3, to="TEXT_END"), @android.view.ViewDebug.IntToString(from=4, to="CENTER"), @android.view.ViewDebug.IntToString(from=5, to="VIEW_START"), @android.view.ViewDebug.IntToString(from=6, to="VIEW_END")})
    public int getTextAlignment() { return 0; }
    public boolean resolveTextAlignment() { return false; }
    public boolean canResolveTextAlignment() { return false; }
    public void resetResolvedTextAlignment() {}
    public boolean isTextAlignmentInherited() { return false; }
    public boolean isTextAlignmentResolved() { return false; }
    public static int generateViewId() { return 0; }
    public void captureTransitioningViews(java.util.List<android.view.View> p0) {}
    public void findNamedViews(java.util.Map<java.lang.String, android.view.View> p0) {}
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }
    public void setPointerIcon(android.view.PointerIcon p0) {}
    public android.view.PointerIcon getPointerIcon() { return null; }
    public boolean hasPointerCapture() { return false; }
    public void requestPointerCapture() {}
    public void releasePointerCapture() {}
    public void onPointerCaptureChange(boolean p0) {}
    public void dispatchPointerCaptureChanged(boolean p0) {}
    public boolean onCapturedPointerEvent(android.view.MotionEvent p0) { return false; }
    public void setOnCapturedPointerListener(android.view.View.OnCapturedPointerListener p0) {}
    public android.view.ViewPropertyAnimator animate() { return null; }
    public final void setTransitionName(java.lang.String p0) {}
    @android.view.ViewDebug.ExportedProperty
    public java.lang.String getTransitionName() { return null; }
    public void requestKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> p0, int p1) {}
    public int getScrollCaptureHint() { return 0; }
    public void setScrollCaptureHint(int p0) {}
    public final void setScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    @android.annotation.Nullable
    public android.view.ScrollCaptureCallback createScrollCaptureCallbackInternal(android.graphics.Rect p0, android.graphics.Point p1) { return null; }
    public void dispatchScrollCaptureSearch(android.graphics.Rect p0, android.graphics.Point p1, java.util.function.Consumer<android.view.ScrollCaptureTarget> p2) {}
    public void onScrollCaptureSearch(android.graphics.Rect p0, android.graphics.Point p1, java.util.function.Consumer<android.view.ScrollCaptureTarget> p2) {}
    public void encode(android.view.ViewHierarchyEncoder p0) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    boolean shouldDrawRoundScrollbar() { return false; }
    public void setTooltipText(java.lang.CharSequence p0) {}
    public void setTooltip(java.lang.CharSequence p0) {}
    @android.annotation.Nullable
    public java.lang.CharSequence getTooltipText() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getTooltip() { return null; }
    void hideTooltip() {}
    boolean dispatchTooltipHoverEvent(android.view.MotionEvent p0) { return false; }
    void handleTooltipKey(android.view.KeyEvent p0) {}
    public android.view.View getTooltipView() { return null; }
    public static boolean isDefaultFocusHighlightEnabled() { return false; }
    android.view.View dispatchUnhandledKeyEvent(android.view.KeyEvent p0) { return null; }
    boolean onUnhandledKeyEvent(android.view.KeyEvent p0) { return false; }
    boolean hasUnhandledKeyListener() { return false; }
    public void addOnUnhandledKeyEventListener(android.view.View.OnUnhandledKeyEventListener p0) {}
    public void removeOnUnhandledKeyEventListener(android.view.View.OnUnhandledKeyEventListener p0) {}
    protected void setDetached(boolean p0) {}
    public void setIsCredential(boolean p0) {}
    public boolean isCredential() { return false; }
    public void setAutoHandwritingEnabled(boolean p0) {}
    public boolean isAutoHandwritingEnabled() { return false; }
    public boolean isStylusHandwritingAvailable() { return false; }
    public void onCreateViewTranslationRequest(int[] p0, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> p1) {}
    @android.annotation.SuppressLint("NullableCollection")
    public void onCreateVirtualViewTranslationRequests(long[] p0, int[] p1, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> p2) {}
    @android.annotation.Nullable
    public android.view.translation.ViewTranslationCallback getViewTranslationCallback() { return null; }
    public void setViewTranslationCallback(android.view.translation.ViewTranslationCallback p0) {}
    public void clearViewTranslationCallback() {}
    @android.annotation.Nullable
    public android.view.translation.ViewTranslationResponse getViewTranslationResponse() { return null; }
    public void onViewTranslationResponse(android.view.translation.ViewTranslationResponse p0) {}
    public void clearViewTranslationResponse() {}
    public void onVirtualViewTranslationResponses(android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> p0) {}
    public void dispatchCreateViewTranslationRequest(java.util.Map<android.view.autofill.AutofillId, long[]> p0, int[] p1, android.view.translation.TranslationCapability p2, java.util.List<android.view.translation.ViewTranslationRequest> p3) {}
    public void generateDisplayHash(java.lang.String p0, android.graphics.Rect p1, java.util.concurrent.Executor p2, android.view.displayhash.DisplayHashResultCallback p3) {}
    @android.annotation.Nullable
    public android.view.AttachedSurfaceControl getRootSurfaceControl() { return null; }
    protected int calculateFrameRateCategory() { return 0; }
    protected void votePreferredFrameRate() {}
    @android.annotation.FlaggedApi("android.view.flags.view_velocity_api")
    public void setFrameContentVelocity(float p0) {}
    @android.annotation.FlaggedApi("android.view.flags.view_velocity_api")
    public float getFrameContentVelocity() { return 0.0f; }
    @android.annotation.FlaggedApi("android.view.flags.toolkit_set_frame_rate_read_only")
    public void setRequestedFrameRate(float p0) {}
    @android.annotation.FlaggedApi("android.view.flags.toolkit_set_frame_rate_read_only")
    public float getRequestedFrameRate() { return 0.0f; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AccessibilityDataSensitive {
    }

    public static class AccessibilityDelegate {
        public AccessibilityDelegate() {}
        public void sendAccessibilityEvent(android.view.View p0, int p1) {}
        public boolean performAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
        public void sendAccessibilityEventUnchecked(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) {}
        public boolean dispatchPopulateAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
        public void onPopulateAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) {}
        public void onInitializeAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) {}
        public void onInitializeAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        public void addExtraDataToAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1, java.lang.String p2, android.os.Bundle p3) {}
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup p0, android.view.View p1, android.view.accessibility.AccessibilityEvent p2) { return false; }
        @android.annotation.Nullable
        public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View p0) { return null; }
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(android.view.View p0) { return null; }
    }

    static final class AttachInfo {
        final android.view.IWindowSession mSession = null;
        final android.view.IWindow mWindow = null;
        final android.os.IBinder mWindowToken = null;
        android.view.Display mDisplay;
        final android.view.View.AttachInfo.Callbacks mRootCallbacks = null;
        android.view.IWindowId mIWindowId;
        android.view.WindowId mWindowId;
        android.view.View mRootView;
        android.os.IBinder mPanelParentWindowToken;
        boolean mHardwareAccelerated;
        boolean mHardwareAccelerationRequested;
        android.view.ThreadedRenderer mThreadedRenderer;
        java.util.List<android.graphics.RenderNode> mPendingAnimatingRenderNodes;
        int mDisplayState;
        float mApplicationScale;
        boolean mScalingRequired;
        int mWindowLeft;
        int mWindowTop;
        boolean mUse32BitDrawingCache;
        final android.graphics.Rect mContentInsets = null;
        final android.graphics.Rect mVisibleInsets = null;
        final android.graphics.Rect mStableInsets = null;
        final android.graphics.Rect mCaptionInsets = null;
        boolean mAlwaysConsumeSystemBars;
        final android.view.ViewTreeObserver.InternalInsetsInfo mGivenInternalInsets = null;
        boolean mHasNonEmptyGivenInternalInsets;
        final java.util.ArrayList<android.view.View> mScrollContainers = null;
        final android.view.KeyEvent.DispatcherState mKeyDispatchState = null;
        boolean mHasWindowFocus;
        int mWindowVisibility;
        long mDrawingTime;
        boolean mInTouchMode;
        boolean mUnbufferedDispatchRequested;
        boolean mRecomputeGlobalAttributes;
        boolean mForceReportNewAttributes;
        boolean mKeepScreenOn;
        boolean mNeedsUpdateLightCenter;
        int mSystemUiVisibility;
        int mDisabledSystemUiVisibility;
        boolean mHasSystemUiListeners;
        boolean mViewVisibilityChanged;
        boolean mViewScrollChanged;
        boolean mHandlingPointerEvent;
        android.graphics.Matrix mWindowMatrixInEmbeddedHierarchy;
        final int[] mTransparentLocation = null;
        final int[] mInvalidateChildLocation = null;
        final int[] mTmpLocation = null;
        final float[] mTmpTransformLocation = null;
        final android.view.ViewTreeObserver mTreeObserver = null;
        android.graphics.Canvas mCanvas;
        final android.view.ViewRootImpl mViewRootImpl = null;
        final android.os.Handler mHandler = null;
        final android.graphics.Rect mTmpInvalRect = null;
        final android.graphics.RectF mTmpTransformRect = null;
        final android.graphics.RectF mTmpTransformRect1 = null;
        final java.util.List<android.graphics.RectF> mTmpRectList = null;
        final android.graphics.Matrix mTmpMatrix = null;
        final android.view.animation.Transformation mTmpTransformation = null;
        final android.graphics.Outline mTmpOutline = null;
        final java.util.ArrayList<android.view.View> mTempArrayList = null;
        boolean mNextFocusLooped;
        int mAccessibilityWindowId;
        int mAccessibilityFetchFlags;
        android.graphics.drawable.Drawable mAccessibilityFocusDrawable;
        android.graphics.drawable.Drawable mAutofilledDrawable;
        boolean mDebugLayout;
        final android.graphics.Point mPoint = null;
        android.view.View mViewRequestingLayout;
        android.os.IBinder mDragToken;
        android.content.ClipData mDragData;
        public android.view.Surface mDragSurface;
        android.view.View mTooltipHost;
        boolean mReadyForContentCaptureUpdates;
        android.util.SparseArray<java.util.ArrayList<java.lang.Object>> mContentCaptureEvents;
        android.view.contentcapture.ContentCaptureManager mContentCaptureManager;
        android.view.Window.OnContentApplyWindowInsetsListener mContentOnApplyWindowInsetsListener;
        android.os.IBinder mLeashedParentToken;
        int mLeashedParentAccessibilityViewId;
        com.android.internal.view.ScrollCaptureInternal mScrollCaptureInternal;
        int mSensitiveViewsCount;
        final boolean mViewVelocityApi = false;
        final float mDensity = 0.0f;
        final float mDisplayPixelCount = 0.0f;
        AttachInfo(android.view.IWindowSession p0, android.view.IWindow p1, android.view.Display p2, android.view.ViewRootImpl p3, android.os.Handler p4, android.view.View.AttachInfo.Callbacks p5, android.content.Context p6) {}
        void increaseSensitiveViewsCount() {}
        void decreaseSensitiveViewsCount() {}
        @android.annotation.Nullable
        android.view.contentcapture.ContentCaptureManager getContentCaptureManager(android.content.Context p0) { return null; }
        void delayNotifyContentCaptureInsetsEvent(android.graphics.Insets p0) {}
        @android.annotation.Nullable
        com.android.internal.view.ScrollCaptureInternal getScrollCaptureInternal() { return null; }
        android.view.AttachedSurfaceControl getRootSurfaceControl() { return null; }
        public void dump(java.lang.String p0, java.io.PrintWriter p1) {}

        static interface Callbacks {
            public void playSoundEffect(int p0);
            public boolean performHapticFeedback(int p0, boolean p1, boolean p2);
        }

        static class InvalidateInfo {
            android.view.View target;
            int left;
            int top;
            int right;
            int bottom;
            InvalidateInfo() {}
            public static android.view.View.AttachInfo.InvalidateInfo obtain() { return null; }
            public void recycle() {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutofillFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutofillImportance {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutofillType {
    }

    public static class BaseSavedState extends android.view.AbsSavedState {
        static final int START_ACTIVITY_REQUESTED_WHO_SAVED = 1;
        static final int IS_AUTOFILLED = 2;
        static final int AUTOFILL_ID = 4;
        int mSavedData;
        java.lang.String mStartActivityRequestWhoSaved;
        boolean mIsAutofilled;
        boolean mHideHighlight;
        int mAutofillViewId;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.view.View.BaseSavedState> CREATOR = null;
        public BaseSavedState(android.os.Parcel p0) { super((android.os.Parcelable)null); }
        public BaseSavedState(android.os.Parcel p0, java.lang.ClassLoader p1) { super((android.os.Parcelable)null); }
        public BaseSavedState(android.os.Parcelable p0) { super((android.os.Parcelable)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private final class CheckForLongPress implements java.lang.Runnable {
        public void run() {}
        public void setAnchor(float p0, float p1) {}
        public void rememberWindowAttachCount() {}
        public void rememberPressedState() {}
        public void setClassification(int p0) {}
    }

    private final class CheckForTap implements java.lang.Runnable {
        public float x;
        public float y;
        public void run() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentCaptureImportance {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentSensitivity {
    }

    private static class DeclaredOnClickListener implements android.view.View.OnClickListener {
        public DeclaredOnClickListener(android.view.View p0, java.lang.String p1) {}
        public void onClick(android.view.View p0) {}
    }

    public static class DragShadowBuilder {
        public DragShadowBuilder(android.view.View p0) {}
        public DragShadowBuilder() {}
        public final android.view.View getView() { return null; }
        public void onProvideShadowMetrics(android.graphics.Point p0, android.graphics.Point p1) {}
        public void onDrawShadow(android.graphics.Canvas p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DrawingCacheQuality {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FindViewFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FocusDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FocusRealDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Focusable {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FocusableMode {
    }

    private static class ForegroundInfo {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LayerType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LayoutDir {
    }

    static class ListenerInfo {
        protected android.view.View.OnFocusChangeListener mOnFocusChangeListener;
        protected android.view.View.OnScrollChangeListener mOnScrollChangeListener;
        public android.view.View.OnClickListener mOnClickListener;
        protected android.view.View.OnLongClickListener mOnLongClickListener;
        protected android.view.View.OnContextClickListener mOnContextClickListener;
        protected android.view.View.OnCreateContextMenuListener mOnCreateContextMenuListener;
        android.view.View.OnApplyWindowInsetsListener mOnApplyWindowInsetsListener;
        android.view.View.OnCapturedPointerListener mOnCapturedPointerListener;
        android.view.WindowInsetsAnimation.Callback mWindowInsetsAnimationCallback;
        public android.graphics.RenderNode.PositionUpdateListener mPositionUpdateListener;
        android.view.ScrollCaptureCallback mScrollCaptureCallback;
        ListenerInfo() {}
    }

    private static class MatchIdPredicate implements java.util.function.Predicate<android.view.View> {
        public int mId;
        public boolean test(android.view.View p0) { return false; }
    }

    private static class MatchLabelForPredicate implements java.util.function.Predicate<android.view.View> {
        public boolean test(android.view.View p0) { return false; }
    }

    public static class MeasureSpec {
        public static final int UNSPECIFIED = 0;
        public static final int EXACTLY = 1073741824;
        public static final int AT_MOST = -2147483648;
        public MeasureSpec() {}
        public static int makeMeasureSpec(int p0, int p1) { return 0; }
        public static int makeSafeMeasureSpec(int p0, int p1) { return 0; }
        public static int getMode(int p0) { return 0; }
        public static int getSize(int p0) { return 0; }
        static int adjust(int p0, int p1) { return 0; }
        public static java.lang.String toString(int p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface MeasureSpecMode {
        }
    }

    public static interface OnApplyWindowInsetsListener {
        @android.annotation.NonNull
        public android.view.WindowInsets onApplyWindowInsets(android.view.View p0, android.view.WindowInsets p1);
    }

    public static interface OnAttachStateChangeListener {
        public void onViewAttachedToWindow(android.view.View p0);
        public void onViewDetachedFromWindow(android.view.View p0);
    }

    public static interface OnCapturedPointerListener {
        public boolean onCapturedPointer(android.view.View p0, android.view.MotionEvent p1);
    }

    public static interface OnClickListener {
        public void onClick(android.view.View p0);
    }

    public static interface OnContextClickListener {
        public boolean onContextClick(android.view.View p0);
    }

    public static interface OnCreateContextMenuListener {
        public void onCreateContextMenu(android.view.ContextMenu p0, android.view.View p1, android.view.ContextMenu.ContextMenuInfo p2);
    }

    public static interface OnDragListener {
        public boolean onDrag(android.view.View p0, android.view.DragEvent p1);
    }

    public static interface OnFocusChangeListener {
        public void onFocusChange(android.view.View p0, boolean p1);
    }

    public static interface OnGenericMotionListener {
        public boolean onGenericMotion(android.view.View p0, android.view.MotionEvent p1);
    }

    public static interface OnHoverListener {
        public boolean onHover(android.view.View p0, android.view.MotionEvent p1);
    }

    public static interface OnKeyListener {
        public boolean onKey(android.view.View p0, int p1, android.view.KeyEvent p2);
    }

    public static interface OnLayoutChangeListener {
        public void onLayoutChange(android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8);
    }

    public static interface OnLongClickListener {
        public boolean onLongClick(android.view.View p0);
        default public boolean onLongClickUseDefaultHapticFeedback(android.view.View p0) { return false; }
    }

    public static interface OnScrollChangeListener {
        public void onScrollChange(android.view.View p0, int p1, int p2, int p3, int p4);
    }

    @java.lang.Deprecated
    public static interface OnSystemUiVisibilityChangeListener {
        public void onSystemUiVisibilityChange(int p0);
    }

    public static interface OnTouchListener {
        public boolean onTouch(android.view.View p0, android.view.MotionEvent p1);
    }

    public static interface OnUnhandledKeyEventListener {
        public boolean onUnhandledKeyEvent(android.view.View p0, android.view.KeyEvent p1);
    }

    private final class PerformClick implements java.lang.Runnable {
        public void run() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResolvedLayoutDir {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScrollBarStyle {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScrollCaptureHint {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScrollIndicators {
    }

    private static class ScrollabilityCache implements java.lang.Runnable {
        public static final int OFF = 0;
        public static final int ON = 1;
        public static final int FADING = 2;
        public boolean fadeScrollBars;
        public int fadingEdgeLength;
        public int scrollBarDefaultDelayBeforeFade;
        public int scrollBarFadeDuration;
        public int scrollBarSize;
        public int scrollBarMinTouchTarget;
        public android.widget.ScrollBarDrawable scrollBar;
        public float[] interpolatorValues;
        public android.view.View host;
        public final android.graphics.Paint paint = null;
        public final android.graphics.Matrix matrix = null;
        public android.graphics.Shader shader;
        public final android.graphics.Interpolator scrollBarInterpolator = null;
        public long fadeStartTime;
        public int state;
        public final android.graphics.Rect mScrollBarBounds = null;
        public final android.graphics.Rect mScrollBarTouchBounds = null;
        public static final int NOT_DRAGGING = 0;
        public static final int DRAGGING_VERTICAL_SCROLL_BAR = 1;
        public static final int DRAGGING_HORIZONTAL_SCROLL_BAR = 2;
        public int mScrollBarDraggingState;
        public float mScrollBarDraggingPos;
        public ScrollabilityCache(android.view.ViewConfiguration p0, android.view.View p1) {}
        public void setFadeColor(int p0) {}
        public void run() {}
    }

    private class SendAccessibilityEventThrottle implements java.lang.Runnable {
        public volatile boolean mIsPending;
        public void post(android.view.accessibility.AccessibilityEvent p0) {}
        public void run() {}
        public void updateWithAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
        public void reset() {}
    }

    private class SendViewScrolledAccessibilityEvent extends android.view.View.SendAccessibilityEventThrottle {
        public int mDeltaX;
        public int mDeltaY;
        public void updateWithAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
        public void reset() {}
    }

    private static class SensitiveAutofillHintsHelper {
        static boolean containsSensitiveAutofillHint(java.lang.String[] p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SystemUiVisibility {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TextAlignment {
    }

    static class TintInfo {
        android.content.res.ColorStateList mTintList;
        android.graphics.BlendMode mBlendMode;
        boolean mHasTintMode;
        boolean mHasTintList;
        TintInfo() {}
    }

    private static class TooltipInfo {
        @android.annotation.Nullable
        java.lang.CharSequence mTooltipText;
        int mAnchorX;
        int mAnchorY;
        @android.annotation.Nullable
        com.android.internal.view.TooltipPopup mTooltipPopup;
        boolean mTooltipFromLongClick;
        java.lang.Runnable mShowTooltipRunnable;
        java.lang.Runnable mHideTooltipRunnable;
        int mHoverSlop;
    }

    static class TransformationInfo {
        float mTransitionAlpha;
        TransformationInfo() {}
    }

    private final class UnsetPressedState implements java.lang.Runnable {
        public void run() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ViewStructureType {
    }

    private class ViewTranslationRequestConsumer implements java.util.function.Consumer<android.view.translation.ViewTranslationRequest> {
        ViewTranslationRequestConsumer(java.util.List<android.view.translation.ViewTranslationRequest> p0) {}
        public void accept(android.view.translation.ViewTranslationRequest p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Visibility {
    }

    private static class VisibilityChangeForAutofillHandler extends android.os.Handler {
        public void handleMessage(android.os.Message p0) {}
    }
}
