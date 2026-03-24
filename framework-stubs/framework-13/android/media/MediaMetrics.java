package android.media;

public class MediaMetrics {
    public static final java.lang.String TAG = "MediaMetrics";
    public static final java.lang.String SEPARATOR = ".";
    public MediaMetrics() {}
    public static <T extends java.lang.Object> android.media.MediaMetrics.Key<T> createKey(java.lang.String p0, java.lang.Class<T> p1) { return null; }

    public static class Item {
        public static final java.lang.String BUNDLE_TOTAL_SIZE = "_totalSize";
        public static final java.lang.String BUNDLE_HEADER_SIZE = "_headerSize";
        public static final java.lang.String BUNDLE_VERSION = "_version";
        public static final java.lang.String BUNDLE_KEY_SIZE = "_keySize";
        public static final java.lang.String BUNDLE_KEY = "_key";
        public static final java.lang.String BUNDLE_PID = "_pid";
        public static final java.lang.String BUNDLE_UID = "_uid";
        public static final java.lang.String BUNDLE_TIMESTAMP = "_timestamp";
        public static final java.lang.String BUNDLE_PROPERTY_COUNT = "_propertyCount";
        public Item(java.lang.String p0) {}
        public Item(java.lang.String p0, int p1, int p2, long p3, int p4) {}
        public <T extends java.lang.Object> android.media.MediaMetrics.Item set(android.media.MediaMetrics.Key<T> p0, T p1) { return null; }
        public android.media.MediaMetrics.Item putInt(java.lang.String p0, int p1) { return null; }
        public android.media.MediaMetrics.Item putLong(java.lang.String p0, long p1) { return null; }
        public android.media.MediaMetrics.Item putDouble(java.lang.String p0, double p1) { return null; }
        public android.media.MediaMetrics.Item putString(java.lang.String p0, java.lang.String p1) { return null; }
        public android.media.MediaMetrics.Item setPid(int p0) { return null; }
        public android.media.MediaMetrics.Item setUid(int p0) { return null; }
        public android.media.MediaMetrics.Item setTimestamp(long p0) { return null; }
        public android.media.MediaMetrics.Item clear() { return null; }
        public boolean record() { return false; }
        public android.os.Bundle toBundle() { return null; }
        public static android.os.Bundle toBundle(java.nio.ByteBuffer p0) { return null; }
    }

    public static interface Key<T extends java.lang.Object> {
        public java.lang.String getName();
        public java.lang.Class<T> getValueClass();
    }

    public static class Name {
        public static final java.lang.String AUDIO = "audio";
        public static final java.lang.String AUDIO_BLUETOOTH = "audio.bluetooth";
        public static final java.lang.String AUDIO_DEVICE = "audio.device";
        public static final java.lang.String AUDIO_FOCUS = "audio.focus";
        public static final java.lang.String AUDIO_FORCE_USE = "audio.forceUse";
        public static final java.lang.String AUDIO_MIC = "audio.mic";
        public static final java.lang.String AUDIO_SERVICE = "audio.service";
        public static final java.lang.String AUDIO_VOLUME = "audio.volume";
        public static final java.lang.String AUDIO_VOLUME_EVENT = "audio.volume.event";
        public static final java.lang.String AUDIO_MODE = "audio.mode";
        public static final java.lang.String METRICS_MANAGER = "metrics.manager";
        public Name() {}
    }

    public static class Property {
        public static final android.media.MediaMetrics.Key<java.lang.String> ADDRESS = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> ATTRIBUTES = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> CALLING_PACKAGE = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> CLIENT_NAME = null;
        public static final android.media.MediaMetrics.Key<java.lang.Integer> DELAY_MS = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> DEVICE = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> DIRECTION = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> EARLY_RETURN = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> ENCODING = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> EVENT = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> ENABLED = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> EXTERNAL = null;
        public static final android.media.MediaMetrics.Key<java.lang.Integer> FLAGS = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> FOCUS_CHANGE_HINT = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> FORCE_USE_DUE_TO = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> FORCE_USE_MODE = null;
        public static final android.media.MediaMetrics.Key<java.lang.Double> GAIN_DB = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> GROUP = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> HAS_HEAD_TRACKER = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> HEAD_TRACKER_ENABLED = null;
        public static final android.media.MediaMetrics.Key<java.lang.Integer> INDEX = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> LOG_SESSION_ID = null;
        public static final android.media.MediaMetrics.Key<java.lang.Integer> MAX_INDEX = null;
        public static final android.media.MediaMetrics.Key<java.lang.Integer> MIN_INDEX = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> MODE = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> MUTE = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> NAME = null;
        public static final android.media.MediaMetrics.Key<java.lang.Integer> OBSERVERS = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> REQUEST = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> REQUESTED_MODE = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> SCO_AUDIO_MODE = null;
        public static final android.media.MediaMetrics.Key<java.lang.Integer> SDK = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> STATE = null;
        public static final android.media.MediaMetrics.Key<java.lang.Integer> STATUS = null;
        public static final android.media.MediaMetrics.Key<java.lang.String> STREAM_TYPE = null;
        public Property() {}
    }

    public static class Value {
        public static final java.lang.String CONNECT = "connect";
        public static final java.lang.String CONNECTED = "connected";
        public static final java.lang.String DISCONNECT = "disconnect";
        public static final java.lang.String DISCONNECTED = "disconnected";
        public static final java.lang.String DOWN = "down";
        public static final java.lang.String MUTE = "mute";
        public static final java.lang.String NO = "no";
        public static final java.lang.String OFF = "off";
        public static final java.lang.String ON = "on";
        public static final java.lang.String UNMUTE = "unmute";
        public static final java.lang.String UP = "up";
        public static final java.lang.String YES = "yes";
        public Value() {}
    }
}
