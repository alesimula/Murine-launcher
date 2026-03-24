package android.app.ambientcontext;

@android.annotation.SystemApi
public final class AmbientContextEvent implements android.os.Parcelable {
    public static final int EVENT_UNKNOWN = 0;
    public static final int EVENT_COUGH = 1;
    public static final int EVENT_SNORE = 2;
    public static final int EVENT_BACK_DOUBLE_TAP = 3;
    public static final int LEVEL_UNKNOWN = 0;
    public static final int LEVEL_LOW = 1;
    public static final int LEVEL_MEDIUM_LOW = 2;
    public static final int LEVEL_MEDIUM = 3;
    public static final int LEVEL_MEDIUM_HIGH = 4;
    public static final int LEVEL_HIGH = 5;
    static com.android.internal.util.Parcelling<java.time.Instant> sParcellingForStartTime;
    static com.android.internal.util.Parcelling<java.time.Instant> sParcellingForEndTime;
    public static final android.os.Parcelable.Creator<android.app.ambientcontext.AmbientContextEvent> CREATOR = null;
    public static java.lang.String eventToString(int p0) { return null; }
    public static java.lang.String levelToString(int p0) { return null; }
    AmbientContextEvent(int p0, java.time.Instant p1, java.time.Instant p2, int p3, int p4) {}
    @android.app.ambientcontext.AmbientContextEvent.EventCode
    public int getEventType() { return 0; }
    public java.time.Instant getStartTime() { return null; }
    public java.time.Instant getEndTime() { return null; }
    @android.app.ambientcontext.AmbientContextEvent.LevelValue
    public int getConfidenceLevel() { return 0; }
    @android.app.ambientcontext.AmbientContextEvent.LevelValue
    public int getDensityLevel() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    AmbientContextEvent(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder() {}
        public android.app.ambientcontext.AmbientContextEvent.Builder setEventType(int p0) { return null; }
        public android.app.ambientcontext.AmbientContextEvent.Builder setStartTime(java.time.Instant p0) { return null; }
        public android.app.ambientcontext.AmbientContextEvent.Builder setEndTime(java.time.Instant p0) { return null; }
        public android.app.ambientcontext.AmbientContextEvent.Builder setConfidenceLevel(int p0) { return null; }
        public android.app.ambientcontext.AmbientContextEvent.Builder setDensityLevel(int p0) { return null; }
        public android.app.ambientcontext.AmbientContextEvent build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Event {
    }

    public static @interface EventCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Level {
    }

    public static @interface LevelValue {
    }
}
