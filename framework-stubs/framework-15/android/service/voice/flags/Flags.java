package android.service.voice.flags;

public final class Flags {
    public static final java.lang.String FLAG_ALLOW_FOREGROUND_ACTIVITIES_IN_ON_SHOW = "android.service.voice.flags.allow_foreground_activities_in_on_show";
    public static final java.lang.String FLAG_ALLOW_HOTWORD_BUMP_EGRESS = "android.service.voice.flags.allow_hotword_bump_egress";
    public static final java.lang.String FLAG_ALLOW_TRAINING_DATA_EGRESS_FROM_HDS = "android.service.voice.flags.allow_training_data_egress_from_hds";
    public Flags() {}
    public static boolean allowForegroundActivitiesInOnShow() { return false; }
    public static boolean allowHotwordBumpEgress() { return false; }
    public static boolean allowTrainingDataEgressFromHds() { return false; }
}
