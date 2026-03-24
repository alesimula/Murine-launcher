package android.internal.perfetto.protos;

public final class Windowmanagerservice {
    public Windowmanagerservice() {}

    public final class ActivityRecordProto {
        public static final long NAME = 1138166333441L;
        public static final long WINDOW_TOKEN = 1146756268034L;
        public static final long LAST_SURFACE_SHOWING = 1133871366147L;
        public static final long IS_WAITING_FOR_TRANSITION_START = 1133871366148L;
        public static final long IS_ANIMATING = 1133871366149L;
        public static final long THUMBNAIL = 1146756268038L;
        public static final long FILLS_PARENT = 1133871366151L;
        public static final long APP_STOPPED = 1133871366152L;
        public static final long VISIBLE_REQUESTED = 1133871366153L;
        public static final long CLIENT_VISIBLE = 1133871366154L;
        public static final long DEFER_HIDING_CLIENT = 1133871366155L;
        public static final long REPORTED_DRAWN = 1133871366156L;
        public static final long REPORTED_VISIBLE = 1133871366157L;
        public static final long NUM_INTERESTING_WINDOWS = 1120986464270L;
        public static final long NUM_DRAWN_WINDOWS = 1120986464271L;
        public static final long ALL_DRAWN = 1133871366160L;
        public static final long LAST_ALL_DRAWN = 1133871366161L;
        public static final long STARTING_WINDOW = 1146756268051L;
        public static final long STARTING_DISPLAYED = 1133871366164L;
        public static final long STARTING_MOVED = 1133871366345L;
        public static final long VISIBLE_SET_FROM_TRANSFERRED_STARTING_WINDOW = 1133871366166L;
        public static final long FROZEN_BOUNDS = 2246267895831L;
        public static final long VISIBLE = 1133871366168L;
        public static final long IDENTIFIER = 1146756268058L;
        public static final long STATE = 1138166333467L;
        public static final long FRONT_OF_TASK = 1133871366172L;
        public static final long PROC_ID = 1120986464285L;
        public static final long TRANSLUCENT = 1133871366174L;
        public static final long PIP_AUTO_ENTER_ENABLED = 1133871366175L;
        public static final long IN_SIZE_COMPAT_MODE = 1133871366176L;
        public static final long MIN_ASPECT_RATIO = 1108101562401L;
        public static final long PROVIDES_MAX_BOUNDS = 1133871366178L;
        public static final long ENABLE_RECENTS_SCREENSHOT = 1133871366179L;
        public static final long LAST_DROP_INPUT_MODE = 1120986464292L;
        public static final long OVERRIDE_ORIENTATION = 1120986464293L;
        public static final long SHOULD_SEND_COMPAT_FAKE_FOCUS = 1133871366182L;
        public static final long SHOULD_FORCE_ROTATE_FOR_CAMERA_COMPAT = 1133871366183L;
        public static final long SHOULD_REFRESH_ACTIVITY_FOR_CAMERA_COMPAT = 1133871366184L;
        public static final long SHOULD_REFRESH_ACTIVITY_VIA_PAUSE_FOR_CAMERA_COMPAT = 1133871366185L;
        public static final long SHOULD_OVERRIDE_MIN_ASPECT_RATIO = 1133871366186L;
        public static final long SHOULD_IGNORE_ORIENTATION_REQUEST_LOOP = 1133871366187L;
        public static final long SHOULD_OVERRIDE_FORCE_RESIZE_APP = 1133871366188L;
        public static final long SHOULD_ENABLE_USER_ASPECT_RATIO_SETTINGS = 1133871366189L;
        public static final long IS_USER_FULLSCREEN_OVERRIDE_ENABLED = 1133871366190L;
        public static final long REQUEST_OPEN_IN_BROWSER_EDUCATION_TIMESTAMP = 1112396529711L;
        public static final long SHOULD_ALLOW_SIMULATE_REQUESTED_ORIENTATION_FOR_CAMERA_COMPAT = 1133871366192L;
        public ActivityRecordProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class AppTransitionProto {
        public static final int APP_STATE_IDLE = 0;
        public static final int APP_STATE_READY = 1;
        public static final int APP_STATE_RUNNING = 2;
        public static final int APP_STATE_TIMEOUT = 3;
        public static final long APP_TRANSITION_STATE = 1159641169921L;
        public static final long LAST_USED_APP_TRANSITION = 1159641169922L;
        public AppTransitionProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class BackNavigationProto {
        public static final long ANIMATION_IN_PROGRESS = 1133871366145L;
        public static final long LAST_BACK_TYPE = 1120986464258L;
        public static final long SHOW_WALLPAPER = 1133871366147L;
        public static final long MAIN_OPEN_ACTIVITY = 1138166333444L;
        public static final long ANIMATION_RUNNING = 1133871366149L;
        public BackNavigationProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class ConfigurationContainerProto {
        public static final long OVERRIDE_CONFIGURATION = 1146756268033L;
        public static final long FULL_CONFIGURATION = 1146756268034L;
        public static final long MERGED_OVERRIDE_CONFIGURATION = 1146756268035L;
        public ConfigurationContainerProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class DisplayAreaProto {
        public static final long WINDOW_CONTAINER = 1146756268033L;
        public static final long NAME = 1138166333442L;
        public static final long CHILDREN = 2246267895811L;
        public static final long IS_TASK_DISPLAY_AREA = 1133871366148L;
        public static final long IS_ROOT_DISPLAY_AREA = 1133871366149L;
        public static final long FEATURE_ID = 1120986464262L;
        public static final long IS_ORGANIZED = 1133871366151L;
        public static final long IS_IGNORING_ORIENTATION_REQUEST = 1133871366152L;
        public DisplayAreaProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class DisplayContentProto {
        public static final long WINDOW_CONTAINER = 1146756268033L;
        public static final long ID = 1120986464258L;
        public static final long DOCKED_TASK_DIVIDER_CONTROLLER = 1146756268036L;
        public static final long PINNED_TASK_CONTROLLER = 1146756268037L;
        public static final long ABOVE_APP_WINDOWS = 2246267895814L;
        public static final long BELOW_APP_WINDOWS = 2246267895815L;
        public static final long IME_WINDOWS = 2246267895816L;
        public static final long DPI = 1120986464265L;
        public static final long DISPLAY_INFO = 1146756268042L;
        public static final long ROTATION = 1120986464267L;
        public static final long SCREEN_ROTATION_ANIMATION = 1146756268044L;
        public static final long DISPLAY_FRAMES = 1146756268045L;
        public static final long SURFACE_SIZE = 1120986464270L;
        public static final long FOCUSED_APP = 1138166333455L;
        public static final long APP_TRANSITION = 1146756268048L;
        public static final long OPENING_APPS = 2246267895825L;
        public static final long CLOSING_APPS = 2246267895826L;
        public static final long CHANGING_APPS = 2246267895827L;
        public static final long OVERLAY_WINDOWS = 2246267895828L;
        public static final long ROOT_DISPLAY_AREA = 1146756268053L;
        public static final long SINGLE_TASK_INSTANCE = 1133871366166L;
        public static final long FOCUSED_ROOT_TASK_ID = 1120986464279L;
        public static final long RESUMED_ACTIVITY = 1146756268056L;
        public static final long TASKS = 2246267895833L;
        public static final long DISPLAY_READY = 1133871366170L;
        public static final long INPUT_METHOD_TARGET = 1146756268059L;
        public static final long INPUT_METHOD_INPUT_TARGET = 1146756268060L;
        public static final long INPUT_METHOD_CONTROL_TARGET = 1146756268061L;
        public static final long CURRENT_FOCUS = 1146756268062L;
        public static final long IME_INSETS_SOURCE_PROVIDER = 1146756268063L;
        public static final long CAN_SHOW_IME = 1133871366176L;
        public static final long DISPLAY_ROTATION = 1146756268065L;
        public static final long IME_POLICY = 1120986464290L;
        public static final long INSETS_SOURCE_PROVIDERS = 2246267895843L;
        public static final long IS_SLEEPING = 1133871366180L;
        public static final long SLEEP_TOKENS = 2237677961253L;
        public static final long KEEP_CLEAR_AREAS = 2246267895846L;
        public static final long MIN_SIZE_OF_RESIZEABLE_TASK_DP = 1120986464295L;
        public static final long INPUT_METHOD_LAYERING_TARGET_IDENTIFIER = 1146756268072L;
        public static final long INPUT_METHOD_INPUT_TARGET_IDENTIFIER = 1146756268073L;
        public static final long INPUT_METHOD_CONTROL_TARGET_IDENTIFIER = 1146756268074L;
        public static final long CURRENT_FOCUS_IDENTIFIER = 1146756268075L;
        public static final long REMOTE_INSETS_CONTROL_TARGET = 1146756268076L;
        public DisplayContentProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class DisplayRotationProto {
        public static final long ROTATION = 1120986464257L;
        public static final long FROZEN_TO_USER_ROTATION = 1133871366146L;
        public static final long USER_ROTATION = 1120986464259L;
        public static final long FIXED_TO_USER_ROTATION_MODE = 1120986464260L;
        public static final long LAST_ORIENTATION = 1120986464261L;
        public static final long IS_FIXED_TO_USER_ROTATION = 1133871366150L;
        public DisplayRotationProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class IdentifierProto {
        public static final long HASH_CODE = 1120986464257L;
        public static final long USER_ID = 1120986464258L;
        public static final long TITLE = 1138166333443L;
        public IdentifierProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class ImeInsetsSourceProviderProto {
        public static final long INSETS_SOURCE_PROVIDER = 1146756268033L;
        public static final long IME_TARGET_FROM_IME = 1146756268034L;
        public static final long IS_IME_LAYOUT_DRAWN = 1133871366147L;
        public static final long IME_TARGET_FROM_IME_IDENTIFIER = 1146756268036L;
        public ImeInsetsSourceProviderProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class InsetsSourceProviderProto {
        public static final long SOURCE = 1146756268033L;
        public static final long FRAME = 1146756268034L;
        public static final long FAKE_CONTROL = 1146756268035L;
        public static final long CONTROL = 1146756268036L;
        public static final long CONTROL_TARGET = 1146756268037L;
        public static final long PENDING_CONTROL_TARGET = 1146756268038L;
        public static final long FAKE_CONTROL_TARGET = 1146756268039L;
        public static final long CAPTURED_LEASH = 1146756268040L;
        public static final long IME_OVERRIDDEN_FRAME = 1146756268041L;
        public static final long IS_LEASH_READY_FOR_DISPATCHING = 1133871366154L;
        public static final long CLIENT_VISIBLE = 1133871366155L;
        public static final long SERVER_VISIBLE = 1133871366156L;
        public static final long SEAMLESS_ROTATING = 1133871366157L;
        public static final long FINISH_SEAMLESS_ROTATE_FRAME_NUMBER = 1112396529678L;
        public static final long CONTROLLABLE = 1133871366159L;
        public static final long SOURCE_WINDOW_STATE = 1146756268048L;
        public static final long CONTROL_TARGET_IDENTIFIER = 1146756268049L;
        public static final long PENDING_CONTROL_TARGET_IDENTIFIER = 1146756268050L;
        public static final long FAKE_CONTROL_TARGET_IDENTIFIER = 1146756268051L;
        public static final long SOURCE_WINDOW_STATE_IDENTIFIER = 1146756268052L;
        public InsetsSourceProviderProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class KeyguardControllerProto {
        public static final long KEYGUARD_SHOWING = 1133871366145L;
        public static final long KEYGUARD_OCCLUDED_STATES = 2246267895810L;
        public static final long AOD_SHOWING = 1133871366147L;
        public static final long KEYGUARD_PER_DISPLAY = 2246267895812L;
        public static final long KEYGUARD_GOING_AWAY = 1133871366149L;
        public KeyguardControllerProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class KeyguardPerDisplayProto {
        public static final long DISPLAY_ID = 1120986464257L;
        public static final long KEYGUARD_SHOWING = 1133871366146L;
        public static final long AOD_SHOWING = 1133871366147L;
        public static final long KEYGUARD_OCCLUDED = 1133871366148L;
        public static final long KEYGUARD_GOING_AWAY = 1133871366149L;
        public KeyguardPerDisplayProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class KeyguardServiceDelegateProto {
        public static final int SCREEN_STATE_OFF = 0;
        public static final int SCREEN_STATE_TURNING_ON = 1;
        public static final int SCREEN_STATE_ON = 2;
        public static final int SCREEN_STATE_TURNING_OFF = 3;
        public static final int INTERACTIVE_STATE_SLEEP = 0;
        public static final int INTERACTIVE_STATE_WAKING = 1;
        public static final int INTERACTIVE_STATE_AWAKE = 2;
        public static final int INTERACTIVE_STATE_GOING_TO_SLEEP = 3;
        public static final long SHOWING = 1133871366145L;
        public static final long OCCLUDED = 1133871366146L;
        public static final long SECURE = 1133871366147L;
        public static final long SCREEN_STATE = 1159641169924L;
        public static final long INTERACTIVE_STATE = 1159641169925L;
        public KeyguardServiceDelegateProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class RemoteInsetsControlTargetProto {
        public static final long IDENTIFIER = 1146756268033L;
        public static final long REQUESTED_VISIBLE_TYPES = 1120986464258L;
        public static final long ANIMATING_TYPES = 1120986464259L;
        public RemoteInsetsControlTargetProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class RootWindowContainerProto {
        public static final long WINDOW_CONTAINER = 1146756268033L;
        public static final long DISPLAYS = 2246267895810L;
        public static final long WINDOWS = 2246267895812L;
        public static final long KEYGUARD_CONTROLLER = 1146756268037L;
        public static final long IS_HOME_RECENTS_COMPONENT = 1133871366150L;
        public static final long PENDING_ACTIVITIES = 2246267895815L;
        public static final long DEFAULT_MIN_SIZE_RESIZABLE_TASK = 1120986464264L;
        public RootWindowContainerProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class TaskFragmentProto {
        public static final long WINDOW_CONTAINER = 1146756268033L;
        public static final long DISPLAY_ID = 1120986464258L;
        public static final long ACTIVITY_TYPE = 1120986464259L;
        public static final long MIN_WIDTH = 1120986464260L;
        public static final long MIN_HEIGHT = 1120986464261L;
        public TaskFragmentProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class TaskProto {
        public static final long WINDOW_CONTAINER = 1146756268033L;
        public static final long ID = 1120986464258L;
        public static final long FILLS_PARENT = 1133871366148L;
        public static final long BOUNDS = 1146756268037L;
        public static final long DISPLAYED_BOUNDS = 1146756268038L;
        public static final long DEFER_REMOVAL = 1133871366151L;
        public static final long SURFACE_WIDTH = 1120986464264L;
        public static final long SURFACE_HEIGHT = 1120986464265L;
        public static final long TASKS = 2246267895818L;
        public static final long ACTIVITIES = 2246267895819L;
        public static final long RESUMED_ACTIVITY = 1146756268044L;
        public static final long REAL_ACTIVITY = 1138166333453L;
        public static final long ORIG_ACTIVITY = 1138166333454L;
        public static final long DISPLAY_ID = 1120986464271L;
        public static final long ROOT_TASK_ID = 1120986464272L;
        public static final long ACTIVITY_TYPE = 1120986464273L;
        public static final long RESIZE_MODE = 1120986464274L;
        public static final long MIN_WIDTH = 1120986464275L;
        public static final long MIN_HEIGHT = 1120986464276L;
        public static final long ADJUSTED_BOUNDS = 1146756268053L;
        public static final long LAST_NON_FULLSCREEN_BOUNDS = 1146756268054L;
        public static final long ADJUSTED_FOR_IME = 1133871366167L;
        public static final long ADJUST_IME_AMOUNT = 1108101562392L;
        public static final long ADJUST_DIVIDER_AMOUNT = 1108101562393L;
        public static final long ANIMATING_BOUNDS = 1133871366170L;
        public static final long MINIMIZE_AMOUNT = 1108101562395L;
        public static final long CREATED_BY_ORGANIZER = 1133871366172L;
        public static final long AFFINITY = 1138166333469L;
        public static final long HAS_CHILD_PIP_ACTIVITY = 1133871366174L;
        public static final long TASK_FRAGMENT = 1146756268063L;
        public TaskProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class WindowContainerChildProto {
        public static final long WINDOW_CONTAINER = 1146756268034L;
        public static final long DISPLAY_CONTENT = 1146756268035L;
        public static final long DISPLAY_AREA = 1146756268036L;
        public static final long TASK = 1146756268037L;
        public static final long ACTIVITY = 1146756268038L;
        public static final long WINDOW_TOKEN = 1146756268039L;
        public static final long WINDOW = 1146756268040L;
        public static final long TASK_FRAGMENT = 1146756268041L;
        public WindowContainerChildProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class WindowContainerProto {
        public static final long CONFIGURATION_CONTAINER = 1146756268033L;
        public static final long ORIENTATION = 1120986464258L;
        public static final long VISIBLE = 1133871366147L;
        public static final long SURFACE_ANIMATOR = 1146756268036L;
        public static final long CHILDREN = 2246267895813L;
        public static final long IDENTIFIER = 1146756268038L;
        public static final long SURFACE_CONTROL = 1146756268039L;
        public WindowContainerProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class WindowFramesProto {
        public static final long CONTAINING_FRAME = 1146756268033L;
        public static final long CONTENT_FRAME = 1146756268034L;
        public static final long DECOR_FRAME = 1146756268035L;
        public static final long DISPLAY_FRAME = 1146756268036L;
        public static final long FRAME = 1146756268037L;
        public static final long OUTSET_FRAME = 1146756268038L;
        public static final long OVERSCAN_FRAME = 1146756268039L;
        public static final long PARENT_FRAME = 1146756268040L;
        public static final long VISIBLE_FRAME = 1146756268041L;
        public static final long CUTOUT = 1146756268042L;
        public static final long CONTENT_INSETS = 1146756268043L;
        public static final long OVERSCAN_INSETS = 1146756268044L;
        public static final long VISIBLE_INSETS = 1146756268045L;
        public static final long STABLE_INSETS = 1146756268046L;
        public static final long OUTSETS = 1146756268047L;
        public static final long COMPAT_FRAME = 1146756268048L;
        public WindowFramesProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class WindowManagerPolicyProto {
        public static final int USER_ROTATION_FREE = 0;
        public static final int USER_ROTATION_LOCKED = 1;
        public static final long LAST_SYSTEM_UI_FLAGS = 1120986464257L;
        public static final long ROTATION_MODE = 1159641169922L;
        public static final long ROTATION = 1159641169923L;
        public static final long ORIENTATION = 1159641169924L;
        public static final long SCREEN_ON_FULLY = 1133871366149L;
        public static final long KEYGUARD_DRAW_COMPLETE = 1133871366150L;
        public static final long WINDOW_MANAGER_DRAW_COMPLETE = 1133871366151L;
        public static final long FOCUSED_APP_TOKEN = 1138166333448L;
        public static final long FOCUSED_WINDOW = 1146756268041L;
        public static final long TOP_FULLSCREEN_OPAQUE_WINDOW = 1146756268042L;
        public static final long TOP_FULLSCREEN_OPAQUE_OR_DIMMING_WINDOW = 1146756268043L;
        public static final long KEYGUARD_OCCLUDED = 1133871366156L;
        public static final long KEYGUARD_OCCLUDED_CHANGED = 1133871366157L;
        public static final long KEYGUARD_OCCLUDED_PENDING = 1133871366158L;
        public static final long FORCE_STATUS_BAR = 1133871366159L;
        public static final long FORCE_STATUS_BAR_FROM_KEYGUARD = 1133871366160L;
        public static final long STATUS_BAR = 1146756268049L;
        public static final long NAVIGATION_BAR = 1146756268050L;
        public static final long ORIENTATION_LISTENER = 1146756268051L;
        public static final long KEYGUARD_DELEGATE = 1146756268052L;
        public WindowManagerPolicyProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class WindowManagerServiceDumpProto {
        public static final long POLICY = 1146756268033L;
        public static final long ROOT_WINDOW_CONTAINER = 1146756268034L;
        public static final long FOCUSED_WINDOW = 1146756268035L;
        public static final long FOCUSED_APP = 1138166333444L;
        public static final long INPUT_METHOD_WINDOW = 1146756268037L;
        public static final long DISPLAY_FROZEN = 1133871366150L;
        public static final long ROTATION = 1120986464263L;
        public static final long LAST_ORIENTATION = 1120986464264L;
        public static final long FOCUSED_DISPLAY_ID = 1120986464265L;
        public static final long HARD_KEYBOARD_AVAILABLE = 1133871366154L;
        public static final long WINDOW_FRAMES_VALID = 1133871366155L;
        public static final long BACK_NAVIGATION = 1146756268044L;
        public WindowManagerServiceDumpProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class WindowOrientationListenerProto {
        public static final long ENABLED = 1133871366145L;
        public static final long ROTATION = 1159641169922L;
        public WindowOrientationListenerProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class WindowStateAnimatorProto {
        public static final int NO_SURFACE = 0;
        public static final int DRAW_PENDING = 1;
        public static final int COMMIT_DRAW_PENDING = 2;
        public static final int READY_TO_SHOW = 3;
        public static final int HAS_DRAWN = 4;
        public static final long LAST_CLIP_RECT = 1146756268033L;
        public static final long SURFACE = 1146756268034L;
        public static final long DRAW_STATE = 1159641169923L;
        public static final long SYSTEM_DECOR_RECT = 1146756268036L;
        public WindowStateAnimatorProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class WindowStateProto {
        public static final long WINDOW_CONTAINER = 1146756268033L;
        public static final long IDENTIFIER = 1146756268034L;
        public static final long DISPLAY_ID = 1120986464259L;
        public static final long STACK_ID = 1120986464260L;
        public static final long ATTRIBUTES = 1146756268037L;
        public static final long GIVEN_CONTENT_INSETS = 1146756268038L;
        public static final long FRAME = 1146756268039L;
        public static final long CONTAINING_FRAME = 1146756268040L;
        public static final long PARENT_FRAME = 1146756268041L;
        public static final long CONTENT_FRAME = 1146756268042L;
        public static final long CONTENT_INSETS = 1146756268043L;
        public static final long SURFACE_INSETS = 1146756268044L;
        public static final long ANIMATOR = 1146756268045L;
        public static final long ANIMATING_EXIT = 1133871366158L;
        public static final long CHILD_WINDOWS = 2246267895823L;
        public static final long SURFACE_POSITION = 1146756268048L;
        public static final long REQUESTED_WIDTH = 1120986464274L;
        public static final long REQUESTED_HEIGHT = 1120986464275L;
        public static final long VIEW_VISIBILITY = 1120986464276L;
        public static final long SYSTEM_UI_VISIBILITY = 1120986464277L;
        public static final long HAS_SURFACE = 1133871366166L;
        public static final long IS_READY_FOR_DISPLAY = 1133871366167L;
        public static final long DISPLAY_FRAME = 1146756268056L;
        public static final long OVERSCAN_FRAME = 1146756268057L;
        public static final long VISIBLE_FRAME = 1146756268058L;
        public static final long DECOR_FRAME = 1146756268059L;
        public static final long OUTSET_FRAME = 1146756268060L;
        public static final long OVERSCAN_INSETS = 1146756268061L;
        public static final long VISIBLE_INSETS = 1146756268062L;
        public static final long STABLE_INSETS = 1146756268063L;
        public static final long OUTSETS = 1146756268064L;
        public static final long CUTOUT = 1146756268065L;
        public static final long REMOVE_ON_EXIT = 1133871366178L;
        public static final long DESTROYING = 1133871366179L;
        public static final long REMOVED = 1133871366180L;
        public static final long IS_ON_SCREEN = 1133871366181L;
        public static final long IS_VISIBLE = 1133871366182L;
        public static final long PENDING_SEAMLESS_ROTATION = 1133871366183L;
        public static final long FINISHED_SEAMLESS_ROTATION_FRAME = 1112396529704L;
        public static final long WINDOW_FRAMES = 1146756268073L;
        public static final long FORCE_SEAMLESS_ROTATION = 1133871366186L;
        public static final long HAS_COMPAT_SCALE = 1133871366187L;
        public static final long GLOBAL_SCALE = 1108101562412L;
        public static final long KEEP_CLEAR_AREAS = 2246267895853L;
        public static final long UNRESTRICTED_KEEP_CLEAR_AREAS = 2246267895854L;
        public static final long MERGED_LOCAL_INSETS_SOURCES = 2246267895855L;
        public static final long REQUESTED_VISIBLE_TYPES = 1120986464304L;
        public static final long DIM_BOUNDS = 1146756268081L;
        public static final long BUFFER_SEQ_ID = 1120986464306L;
        public static final long SYNC_SEQ_ID = 1120986464307L;
        public WindowStateProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class WindowSurfaceControllerProto {
        public static final long SHOWN = 1133871366145L;
        public static final long LAYER = 1120986464258L;
        public WindowSurfaceControllerProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }

    public final class WindowTokenProto {
        public static final long WINDOW_CONTAINER = 1146756268033L;
        public static final long HASH_CODE = 1120986464258L;
        public static final long WINDOWS = 2246267895811L;
        public static final long WAITING_TO_SHOW = 1133871366149L;
        public static final long PAUSED = 1133871366150L;
        public WindowTokenProto(android.internal.perfetto.protos.Windowmanagerservice p0) {}
    }
}
