package android.app;

public class Notification implements android.os.Parcelable {
    private static final java.lang.String TAG = "Notification";
    public static final java.lang.String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final java.lang.String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final java.lang.String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final java.lang.String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";
    public static final java.lang.String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final int DEFAULT_LIGHTS = 4;
    private static final int MAX_CHARSEQUENCE_LENGTH = 1024;
    private static final int MAX_REPLY_HISTORY = 5;
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final java.lang.String EXTRA_REMOTE_INPUT_DRAFT = "android.remoteInputDraft";
    public long when;
    private long creationTime;
    @java.lang.Deprecated
    public int icon;
    public int iconLevel;
    public int number;
    public android.app.PendingIntent contentIntent;
    public android.app.PendingIntent deleteIntent;
    public android.app.PendingIntent fullScreenIntent;
    public java.lang.CharSequence tickerText;
    @java.lang.Deprecated
    public android.widget.RemoteViews tickerView;
    @java.lang.Deprecated
    public android.widget.RemoteViews contentView;
    @java.lang.Deprecated
    public android.widget.RemoteViews bigContentView;
    @java.lang.Deprecated
    public android.widget.RemoteViews headsUpContentView;
    private boolean mUsesStandardHeader;
    private static final android.util.ArraySet<java.lang.Integer> STANDARD_LAYOUTS = null;
    @java.lang.Deprecated
    public android.graphics.Bitmap largeIcon;
    @java.lang.Deprecated
    public android.net.Uri sound;
    @java.lang.Deprecated
    public static final int STREAM_DEFAULT = -1;
    @java.lang.Deprecated
    public int audioStreamType;
    public static final android.media.AudioAttributes AUDIO_ATTRIBUTES_DEFAULT = null;
    @java.lang.Deprecated
    public android.media.AudioAttributes audioAttributes;
    @java.lang.Deprecated
    public long[] vibrate;
    @java.lang.Deprecated
    public int ledARGB;
    @java.lang.Deprecated
    public int ledOnMS;
    @java.lang.Deprecated
    public int ledOffMS;
    @java.lang.Deprecated
    public int defaults;
    @java.lang.Deprecated
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    @java.lang.Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_GROUP_SUMMARY = 512;
    @android.annotation.SystemApi
    public static final int FLAG_AUTOGROUP_SUMMARY = 1024;
    public static final int FLAG_CAN_COLORIZE = 2048;
    public static final int FLAG_BUBBLE = 4096;
    public int flags;
    @java.lang.Deprecated
    public static final int PRIORITY_DEFAULT = 0;
    @java.lang.Deprecated
    public static final int PRIORITY_LOW = -1;
    @java.lang.Deprecated
    public static final int PRIORITY_MIN = -2;
    @java.lang.Deprecated
    public static final int PRIORITY_HIGH = 1;
    @java.lang.Deprecated
    public static final int PRIORITY_MAX = 2;
    @java.lang.Deprecated
    public int priority;
    public int color;
    public static final int COLOR_DEFAULT = 0;
    public static final int COLOR_INVALID = 1;
    public int visibility;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_SECRET = -1;
    public static final java.lang.String CATEGORY_CALL = "call";
    public static final java.lang.String CATEGORY_NAVIGATION = "navigation";
    public static final java.lang.String CATEGORY_MESSAGE = "msg";
    public static final java.lang.String CATEGORY_EMAIL = "email";
    public static final java.lang.String CATEGORY_EVENT = "event";
    public static final java.lang.String CATEGORY_PROMO = "promo";
    public static final java.lang.String CATEGORY_ALARM = "alarm";
    public static final java.lang.String CATEGORY_PROGRESS = "progress";
    public static final java.lang.String CATEGORY_SOCIAL = "social";
    public static final java.lang.String CATEGORY_ERROR = "err";
    public static final java.lang.String CATEGORY_TRANSPORT = "transport";
    public static final java.lang.String CATEGORY_SYSTEM = "sys";
    public static final java.lang.String CATEGORY_SERVICE = "service";
    public static final java.lang.String CATEGORY_RECOMMENDATION = "recommendation";
    public static final java.lang.String CATEGORY_STATUS = "status";
    public static final java.lang.String CATEGORY_REMINDER = "reminder";
    @android.annotation.SystemApi
    public static final java.lang.String CATEGORY_CAR_EMERGENCY = "car_emergency";
    @android.annotation.SystemApi
    public static final java.lang.String CATEGORY_CAR_WARNING = "car_warning";
    @android.annotation.SystemApi
    public static final java.lang.String CATEGORY_CAR_INFORMATION = "car_information";
    public java.lang.String category;
    private java.lang.String mGroupKey;
    private java.lang.String mSortKey;
    public android.os.Bundle extras;
    public android.util.ArraySet<android.app.PendingIntent> allPendingIntents;
    private android.os.IBinder mWhitelistToken;
    public static android.os.IBinder processWhitelistToken;
    public static final java.lang.String EXTRA_TITLE = "android.title";
    public static final java.lang.String EXTRA_TITLE_BIG = "android.title.big";
    public static final java.lang.String EXTRA_TEXT = "android.text";
    public static final java.lang.String EXTRA_SUB_TEXT = "android.subText";
    public static final java.lang.String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final java.lang.String EXTRA_REMOTE_INPUT_HISTORY_ITEMS = "android.remoteInputHistoryItems";
    public static final java.lang.String EXTRA_SHOW_REMOTE_INPUT_SPINNER = "android.remoteInputSpinner";
    public static final java.lang.String EXTRA_HIDE_SMART_REPLIES = "android.hideSmartReplies";
    public static final java.lang.String EXTRA_INFO_TEXT = "android.infoText";
    public static final java.lang.String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final java.lang.String EXTRA_BIG_TEXT = "android.bigText";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SMALL_ICON = "android.icon";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final java.lang.String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final java.lang.String EXTRA_PROGRESS = "android.progress";
    public static final java.lang.String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final java.lang.String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final java.lang.String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final java.lang.String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final java.lang.String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final java.lang.String EXTRA_PICTURE = "android.picture";
    public static final java.lang.String EXTRA_TEXT_LINES = "android.textLines";
    public static final java.lang.String EXTRA_TEMPLATE = "android.template";
    public static final java.lang.String EXTRA_PEOPLE = "android.people";
    public static final java.lang.String EXTRA_PEOPLE_LIST = "android.people.list";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ALLOW_DURING_SETUP = "android.allowDuringSetup";
    public static final java.lang.String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final java.lang.String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final java.lang.String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final java.lang.String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final java.lang.String EXTRA_MESSAGING_PERSON = "android.messagingUser";
    public static final java.lang.String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final java.lang.String EXTRA_CONVERSATION_ICON = "android.conversationIcon";
    public static final java.lang.String EXTRA_CONVERSATION_UNREAD_MESSAGE_COUNT = "android.conversationUnreadMessageCount";
    public static final java.lang.String EXTRA_MESSAGES = "android.messages";
    public static final java.lang.String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final java.lang.String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final java.lang.String EXTRA_COLORIZED = "android.colorized";
    public static final java.lang.String EXTRA_BUILDER_APPLICATION_INFO = "android.appInfo";
    public static final java.lang.String EXTRA_CONTAINS_CUSTOM_VIEW = "android.contains.customView";
    public static final java.lang.String EXTRA_REDUCED_IMAGES = "android.reduced.images";
    public static final java.lang.String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_SUBSTITUTE_APP_NAME = "android.substName";
    public static final java.lang.String EXTRA_FOREGROUND_APPS = "android.foregroundApps";
    private android.graphics.drawable.Icon mSmallIcon;
    private android.graphics.drawable.Icon mLargeIcon;
    private java.lang.String mChannelId;
    private long mTimeout;
    private java.lang.String mShortcutId;
    private android.content.LocusId mLocusId;
    private java.lang.CharSequence mSettingsText;
    private android.app.Notification.BubbleMetadata mBubbleMetadata;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final int GROUP_ALERT_CHILDREN = 2;
    private int mGroupAlertBehavior;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final int BADGE_ICON_LARGE = 2;
    private int mBadgeIcon;
    private boolean mAllowSystemGeneratedContextualActions;
    public android.app.Notification.Action[] actions;
    public android.app.Notification publicVersion;
    public static final android.os.Parcelable.Creator<android.app.Notification> CREATOR = null;
    public java.lang.String getGroup() { return null; }
    public java.lang.String getSortKey() { return null; }
    public Notification() {}
    public Notification(android.content.Context p0, int p1, java.lang.CharSequence p2, long p3, java.lang.CharSequence p4, java.lang.CharSequence p5, android.content.Intent p6) {}
    @java.lang.Deprecated
    public Notification(int p0, java.lang.CharSequence p1, long p2) {}
    public Notification(android.os.Parcel p0) {}
    private void readFromParcelImpl(android.os.Parcel p0) {}
    public android.app.Notification clone() { return null; }
    public void cloneInto(android.app.Notification p0, boolean p1) {}
    public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    public final void lightenPayload() {}
    public static java.lang.CharSequence safeCharSequence(java.lang.CharSequence p0) { return null; }
    private static java.lang.CharSequence removeTextSizeSpans(java.lang.CharSequence p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private void writeToParcelImpl(android.os.Parcel p0, int p1) {}
    public static boolean areActionsVisiblyDifferent(android.app.Notification p0, android.app.Notification p1) { return false; }
    public static boolean areStyledNotificationsVisiblyDifferent(android.app.Notification.Builder p0, android.app.Notification.Builder p1) { return false; }
    public static boolean areRemoteViewsChanged(android.app.Notification.Builder p0, android.app.Notification.Builder p1) { return false; }
    private static boolean areRemoteViewsChanged(android.widget.RemoteViews p0, android.widget.RemoteViews p1) { return false; }
    private void fixDuplicateExtras() {}
    private void fixDuplicateExtra(android.os.Parcelable p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void setLatestEventInfo(android.content.Context p0, java.lang.CharSequence p1, java.lang.CharSequence p2, android.app.PendingIntent p3) {}
    public static void addFieldsFromContext(android.content.Context p0, android.app.Notification p1) {}
    public static void addFieldsFromContext(android.content.pm.ApplicationInfo p0, android.app.Notification p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public java.lang.String toString() { return null; }
    public static java.lang.String visibilityToString(int p0) { return null; }
    public static java.lang.String priorityToString(int p0) { return null; }
    public boolean hasCompletedProgress() { return false; }
    @java.lang.Deprecated
    public java.lang.String getChannel() { return null; }
    public java.lang.String getChannelId() { return null; }
    @java.lang.Deprecated
    public long getTimeout() { return 0L; }
    public long getTimeoutAfter() { return 0L; }
    public int getBadgeIconType() { return 0; }
    public java.lang.String getShortcutId() { return null; }
    public android.content.LocusId getLocusId() { return null; }
    public java.lang.CharSequence getSettingsText() { return null; }
    public int getGroupAlertBehavior() { return 0; }
    public android.app.Notification.BubbleMetadata getBubbleMetadata() { return null; }
    public void setBubbleMetadata(android.app.Notification.BubbleMetadata p0) {}
    public boolean getAllowSystemGeneratedContextualActions() { return false; }
    public android.graphics.drawable.Icon getSmallIcon() { return null; }
    public void setSmallIcon(android.graphics.drawable.Icon p0) {}
    public android.graphics.drawable.Icon getLargeIcon() { return null; }
    public boolean isGroupSummary() { return false; }
    public boolean isGroupChild() { return false; }
    public boolean suppressAlertingDueToGrouping() { return false; }
    public android.util.Pair<android.app.RemoteInput, android.app.Notification.Action> findRemoteInputActionPair(boolean p0) { return null; }
    public java.util.List<android.app.Notification.Action> getContextualActions() { return null; }
    void reduceImageSizes(android.content.Context p0) {}
    private void reduceImageSizesForRemoteView(android.widget.RemoteViews p0, android.content.Context p1, boolean p2) {}
    public boolean isForegroundService() { return false; }
    public boolean hasMediaSession() { return false; }
    public java.lang.Class<? extends android.app.Notification.Style> getNotificationStyle() { return null; }
    public boolean isColorized() { return false; }
    private boolean hasColorizedPermission() { return false; }
    public boolean isColorizedMedia() { return false; }
    public boolean isMediaNotification() { return false; }
    public boolean isBubbleNotification() { return false; }
    private boolean hasLargeIcon() { return false; }
    public boolean showsTime() { return false; }
    public boolean showsChronometer() { return false; }
    @android.annotation.SystemApi
    public static java.lang.Class<? extends android.app.Notification.Style> getNotificationStyleClass(java.lang.String p0) { return null; }
    private static <T extends android.os.Parcelable> T[] getParcelableArrayFromBundle(android.os.Bundle p0, java.lang.String p1, java.lang.Class<T> p2) { return null; }

    public static class Action implements android.os.Parcelable {
        private static final java.lang.String EXTRA_DATA_ONLY_INPUTS = "android.extra.DATA_ONLY_INPUTS";
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_CALL = 10;
        private final android.os.Bundle mExtras = null;
        private android.graphics.drawable.Icon mIcon;
        private final android.app.RemoteInput[] mRemoteInputs = null;
        private boolean mAllowGeneratedReplies;
        private final int mSemanticAction = 0;
        private final boolean mIsContextual = false;
        @java.lang.Deprecated
        public int icon;
        public java.lang.CharSequence title;
        public android.app.PendingIntent actionIntent;
        public static final android.os.Parcelable.Creator<android.app.Notification.Action> CREATOR = null;
        private Action(android.os.Parcel p0) {}
        @java.lang.Deprecated
        public Action(int p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
        private Action(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, android.app.PendingIntent p2, android.os.Bundle p3, android.app.RemoteInput[] p4, boolean p5, int p6, boolean p7) {}
        public android.graphics.drawable.Icon getIcon() { return null; }
        public android.os.Bundle getExtras() { return null; }
        public boolean getAllowGeneratedReplies() { return false; }
        public android.app.RemoteInput[] getRemoteInputs() { return null; }
        public int getSemanticAction() { return 0; }
        public boolean isContextual() { return false; }
        public android.app.RemoteInput[] getDataOnlyRemoteInputs() { return null; }
        public android.app.Notification.Action clone() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private final android.graphics.drawable.Icon mIcon = null;
            private final java.lang.CharSequence mTitle = null;
            private final android.app.PendingIntent mIntent = null;
            private boolean mAllowGeneratedReplies;
            private final android.os.Bundle mExtras = null;
            private java.util.ArrayList<android.app.RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private boolean mIsContextual;
            @java.lang.Deprecated
            public Builder(int p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
            public Builder(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
            public Builder(android.app.Notification.Action p0) {}
            private Builder(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, android.app.PendingIntent p2, android.os.Bundle p3, android.app.RemoteInput[] p4, boolean p5, int p6) {}
            public android.app.Notification.Action.Builder addExtras(android.os.Bundle p0) { return null; }
            public android.os.Bundle getExtras() { return null; }
            public android.app.Notification.Action.Builder addRemoteInput(android.app.RemoteInput p0) { return null; }
            public android.app.Notification.Action.Builder setAllowGeneratedReplies(boolean p0) { return null; }
            public android.app.Notification.Action.Builder setSemanticAction(int p0) { return null; }
            public android.app.Notification.Action.Builder setContextual(boolean p0) { return null; }
            public android.app.Notification.Action.Builder extend(android.app.Notification.Action.Extender p0) { return null; }
            private void checkContextualActionNullFields() {}
            public android.app.Notification.Action build() { return null; }
        }

        public static interface Extender {
            public android.app.Notification.Action.Builder extend(android.app.Notification.Action.Builder p0);
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SemanticAction {
        }

        public static final class WearableExtender implements android.app.Notification.Action.Extender {
            private static final java.lang.String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final java.lang.String KEY_FLAGS = "flags";
            private static final java.lang.String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private static final java.lang.String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final java.lang.String KEY_CANCEL_LABEL = "cancelLabel";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int DEFAULT_FLAGS = 1;
            private int mFlags;
            private java.lang.CharSequence mInProgressLabel;
            private java.lang.CharSequence mConfirmLabel;
            private java.lang.CharSequence mCancelLabel;
            public WearableExtender() {}
            public WearableExtender(android.app.Notification.Action p0) {}
            public android.app.Notification.Action.Builder extend(android.app.Notification.Action.Builder p0) { return null; }
            public android.app.Notification.Action.WearableExtender clone() { return null; }
            public android.app.Notification.Action.WearableExtender setAvailableOffline(boolean p0) { return null; }
            public boolean isAvailableOffline() { return false; }
            private void setFlag(int p0, boolean p1) {}
            @java.lang.Deprecated
            public android.app.Notification.Action.WearableExtender setInProgressLabel(java.lang.CharSequence p0) { return null; }
            @java.lang.Deprecated
            public java.lang.CharSequence getInProgressLabel() { return null; }
            @java.lang.Deprecated
            public android.app.Notification.Action.WearableExtender setConfirmLabel(java.lang.CharSequence p0) { return null; }
            @java.lang.Deprecated
            public java.lang.CharSequence getConfirmLabel() { return null; }
            @java.lang.Deprecated
            public android.app.Notification.Action.WearableExtender setCancelLabel(java.lang.CharSequence p0) { return null; }
            @java.lang.Deprecated
            public java.lang.CharSequence getCancelLabel() { return null; }
            public android.app.Notification.Action.WearableExtender setHintLaunchesActivity(boolean p0) { return null; }
            public boolean getHintLaunchesActivity() { return false; }
            public android.app.Notification.Action.WearableExtender setHintDisplayActionInline(boolean p0) { return null; }
            public boolean getHintDisplayActionInline() { return false; }
        }
    }

    public static class BigPictureStyle extends android.app.Notification.Style {
        private android.graphics.Bitmap mPicture;
        private android.graphics.drawable.Icon mBigLargeIcon;
        private boolean mBigLargeIconSet;
        public static final int MIN_ASHMEM_BITMAP_SIZE = 131072;
        public BigPictureStyle() { super(); }
        @java.lang.Deprecated
        public BigPictureStyle(android.app.Notification.Builder p0) { super(); }
        public android.app.Notification.BigPictureStyle setBigContentTitle(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.BigPictureStyle setSummaryText(java.lang.CharSequence p0) { return null; }
        public android.graphics.Bitmap getBigPicture() { return null; }
        public android.app.Notification.BigPictureStyle bigPicture(android.graphics.Bitmap p0) { return null; }
        public android.app.Notification.BigPictureStyle bigLargeIcon(android.graphics.Bitmap p0) { return null; }
        public android.app.Notification.BigPictureStyle bigLargeIcon(android.graphics.drawable.Icon p0) { return null; }
        public void purgeResources() {}
        public void reduceImageSizes(android.content.Context p0) {}
        public android.widget.RemoteViews makeBigContentView() { return null; }
        public void addExtras(android.os.Bundle p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public boolean hasSummaryInHeader() { return false; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        private static boolean areBitmapsObviouslyDifferent(android.graphics.Bitmap p0, android.graphics.Bitmap p1) { return false; }
    }

    public static class BigTextStyle extends android.app.Notification.Style {
        private java.lang.CharSequence mBigText;
        public BigTextStyle() { super(); }
        @java.lang.Deprecated
        public BigTextStyle(android.app.Notification.Builder p0) { super(); }
        public android.app.Notification.BigTextStyle setBigContentTitle(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.BigTextStyle setSummaryText(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.BigTextStyle bigText(java.lang.CharSequence p0) { return null; }
        public java.lang.CharSequence getBigText() { return null; }
        public void addExtras(android.os.Bundle p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public android.widget.RemoteViews makeContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeBigContentView() { return null; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
    }

    public static final class BubbleMetadata implements android.os.Parcelable {
        private android.app.PendingIntent mPendingIntent;
        private android.app.PendingIntent mDeleteIntent;
        private android.graphics.drawable.Icon mIcon;
        private int mDesiredHeight;
        private int mDesiredHeightResId;
        private int mFlags;
        private java.lang.String mShortcutId;
        public static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        public static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        public static final android.os.Parcelable.Creator<android.app.Notification.BubbleMetadata> CREATOR = null;
        private BubbleMetadata(android.app.PendingIntent p0, android.app.PendingIntent p1, android.graphics.drawable.Icon p2, int p3, int p4, java.lang.String p5) {}
        private BubbleMetadata(android.os.Parcel p0) {}
        public java.lang.String getShortcutId() { return null; }
        @android.annotation.SuppressLint("InvalidNullConversion")
        public android.app.PendingIntent getIntent() { return null; }
        @java.lang.Deprecated
        public android.app.PendingIntent getBubbleIntent() { return null; }
        public android.app.PendingIntent getDeleteIntent() { return null; }
        @android.annotation.SuppressLint("InvalidNullConversion")
        public android.graphics.drawable.Icon getIcon() { return null; }
        @java.lang.Deprecated
        public android.graphics.drawable.Icon getBubbleIcon() { return null; }
        public int getDesiredHeight() { return 0; }
        public int getDesiredHeightResId() { return 0; }
        public boolean getAutoExpandBubble() { return false; }
        public boolean isNotificationSuppressed() { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void setFlags(int p0) {}
        public int getFlags() { return 0; }

        public static final class Builder {
            private android.app.PendingIntent mPendingIntent;
            private android.graphics.drawable.Icon mIcon;
            private int mDesiredHeight;
            private int mDesiredHeightResId;
            private int mFlags;
            private android.app.PendingIntent mDeleteIntent;
            private java.lang.String mShortcutId;
            @java.lang.Deprecated
            public Builder() {}
            public Builder(java.lang.String p0) {}
            public Builder(android.app.PendingIntent p0, android.graphics.drawable.Icon p1) {}
            @java.lang.Deprecated
            public android.app.Notification.BubbleMetadata.Builder createShortcutBubble(java.lang.String p0) { return null; }
            @java.lang.Deprecated
            public android.app.Notification.BubbleMetadata.Builder createIntentBubble(android.app.PendingIntent p0, android.graphics.drawable.Icon p1) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setIntent(android.app.PendingIntent p0) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setDesiredHeight(int p0) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setDesiredHeightResId(int p0) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setAutoExpandBubble(boolean p0) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setSuppressNotification(boolean p0) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setDeleteIntent(android.app.PendingIntent p0) { return null; }
            public android.app.Notification.BubbleMetadata build() { return null; }
            public android.app.Notification.BubbleMetadata.Builder setFlag(int p0, boolean p1) { return null; }
        }
    }

    public static class Builder {
        public static final java.lang.String EXTRA_REBUILD_CONTENT_VIEW_ACTION_COUNT = "android.rebuild.contentViewActionCount";
        public static final java.lang.String EXTRA_REBUILD_BIG_CONTENT_VIEW_ACTION_COUNT = "android.rebuild.bigViewActionCount";
        public static final java.lang.String EXTRA_REBUILD_HEADS_UP_CONTENT_VIEW_ACTION_COUNT = "android.rebuild.hudViewActionCount";
        private static final boolean USE_ONLY_TITLE_IN_LOW_PRIORITY_SUMMARY = Boolean.valueOf(false);
        private static final int LIGHTNESS_TEXT_DIFFERENCE_LIGHT = 20;
        private static final int LIGHTNESS_TEXT_DIFFERENCE_DARK = -10;
        private android.content.Context mContext;
        private android.app.Notification mN;
        private android.os.Bundle mUserExtras;
        private android.app.Notification.Style mStyle;
        private java.util.ArrayList<android.app.Notification.Action> mActions;
        private java.util.ArrayList<android.app.Person> mPersonList;
        private com.android.internal.util.ContrastColorUtil mColorUtil;
        private boolean mIsLegacy;
        private boolean mIsLegacyInitialized;
        private int mCachedContrastColor;
        private int mCachedContrastColorIsFor;
        private int mNeutralColor;
        android.app.Notification.StandardTemplateParams mParams;
        private int mTextColorsAreForBackground;
        private int mPrimaryTextColor;
        private int mSecondaryTextColor;
        private int mBackgroundColor;
        private int mForegroundColor;
        private java.util.ArrayList<android.app.Notification.Action> mOriginalActions;
        private boolean mRebuildStyledRemoteViews;
        private boolean mTintActionButtons;
        private boolean mInNightMode;
        public Builder(android.content.Context p0, java.lang.String p1) {}
        @java.lang.Deprecated
        public Builder(android.content.Context p0) {}
        public Builder(android.content.Context p0, android.app.Notification p1) {}
        private com.android.internal.util.ContrastColorUtil getColorUtil() { return null; }
        public android.app.Notification.Builder setShortcutId(java.lang.String p0) { return null; }
        public android.app.Notification.Builder setLocusId(android.content.LocusId p0) { return null; }
        public android.app.Notification.Builder setBadgeIconType(int p0) { return null; }
        public android.app.Notification.Builder setGroupAlertBehavior(int p0) { return null; }
        public android.app.Notification.Builder setBubbleMetadata(android.app.Notification.BubbleMetadata p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setChannel(java.lang.String p0) { return null; }
        public android.app.Notification.Builder setChannelId(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setTimeout(long p0) { return null; }
        public android.app.Notification.Builder setTimeoutAfter(long p0) { return null; }
        public android.app.Notification.Builder setWhen(long p0) { return null; }
        public android.app.Notification.Builder setShowWhen(boolean p0) { return null; }
        public android.app.Notification.Builder setUsesChronometer(boolean p0) { return null; }
        public android.app.Notification.Builder setChronometerCountDown(boolean p0) { return null; }
        public android.app.Notification.Builder setSmallIcon(int p0) { return null; }
        public android.app.Notification.Builder setSmallIcon(int p0, int p1) { return null; }
        public android.app.Notification.Builder setSmallIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.app.Notification.Builder setContentTitle(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.Builder setContentText(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.Builder setSubText(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.Builder setSettingsText(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.Builder setRemoteInputHistory(java.lang.CharSequence[] p0) { return null; }
        public android.app.Notification.Builder setRemoteInputHistory(android.app.RemoteInputHistoryItem[] p0) { return null; }
        public android.app.Notification.Builder setShowRemoteInputSpinner(boolean p0) { return null; }
        public android.app.Notification.Builder setHideSmartReplies(boolean p0) { return null; }
        public android.app.Notification.Builder setNumber(int p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setContentInfo(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.Builder setProgress(int p0, int p1, boolean p2) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setContent(android.widget.RemoteViews p0) { return null; }
        public android.app.Notification.Builder setCustomContentView(android.widget.RemoteViews p0) { return null; }
        public android.app.Notification.Builder setCustomBigContentView(android.widget.RemoteViews p0) { return null; }
        public android.app.Notification.Builder setCustomHeadsUpContentView(android.widget.RemoteViews p0) { return null; }
        public android.app.Notification.Builder setContentIntent(android.app.PendingIntent p0) { return null; }
        public android.app.Notification.Builder setDeleteIntent(android.app.PendingIntent p0) { return null; }
        public android.app.Notification.Builder setFullScreenIntent(android.app.PendingIntent p0, boolean p1) { return null; }
        public android.app.Notification.Builder setTicker(java.lang.CharSequence p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setTicker(java.lang.CharSequence p0, android.widget.RemoteViews p1) { return null; }
        public android.app.Notification.Builder setLargeIcon(android.graphics.Bitmap p0) { return null; }
        public android.app.Notification.Builder setLargeIcon(android.graphics.drawable.Icon p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setSound(android.net.Uri p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setSound(android.net.Uri p0, int p1) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setSound(android.net.Uri p0, android.media.AudioAttributes p1) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setVibrate(long[] p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setLights(int p0, int p1, int p2) { return null; }
        public android.app.Notification.Builder setOngoing(boolean p0) { return null; }
        public android.app.Notification.Builder setColorized(boolean p0) { return null; }
        public android.app.Notification.Builder setOnlyAlertOnce(boolean p0) { return null; }
        public android.app.Notification.Builder setAutoCancel(boolean p0) { return null; }
        public android.app.Notification.Builder setLocalOnly(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setDefaults(int p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setPriority(int p0) { return null; }
        public android.app.Notification.Builder setCategory(java.lang.String p0) { return null; }
        public android.app.Notification.Builder addPerson(java.lang.String p0) { return null; }
        public android.app.Notification.Builder addPerson(android.app.Person p0) { return null; }
        public android.app.Notification.Builder setGroup(java.lang.String p0) { return null; }
        public android.app.Notification.Builder setGroupSummary(boolean p0) { return null; }
        public android.app.Notification.Builder setSortKey(java.lang.String p0) { return null; }
        public android.app.Notification.Builder addExtras(android.os.Bundle p0) { return null; }
        public android.app.Notification.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.os.Bundle getExtras() { return null; }
        private android.os.Bundle getAllExtras() { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder addAction(int p0, java.lang.CharSequence p1, android.app.PendingIntent p2) { return null; }
        public android.app.Notification.Builder addAction(android.app.Notification.Action p0) { return null; }
        public android.app.Notification.Builder setActions(android.app.Notification.Action... p0) { return null; }
        public android.app.Notification.Builder setStyle(android.app.Notification.Style p0) { return null; }
        public android.app.Notification.Style getStyle() { return null; }
        public android.app.Notification.Builder setVisibility(int p0) { return null; }
        public android.app.Notification.Builder setPublicVersion(android.app.Notification p0) { return null; }
        public android.app.Notification.Builder extend(android.app.Notification.Extender p0) { return null; }
        public android.app.Notification.Builder setFlag(int p0, boolean p1) { return null; }
        public android.app.Notification.Builder setColor(int p0) { return null; }
        private android.graphics.drawable.Drawable getProfileBadgeDrawable() { return null; }
        private android.graphics.Bitmap getProfileBadge() { return null; }
        private void bindProfileBadge(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private void bindAlertedIcon(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        public boolean usesStandardHeader() { return false; }
        private void resetStandardTemplate(android.widget.RemoteViews p0) {}
        private void resetNotificationHeader(android.widget.RemoteViews p0) {}
        private android.widget.RemoteViews applyStandardTemplate(int p0, android.app.Notification.TemplateBindResult p1) { return null; }
        private android.widget.RemoteViews applyStandardTemplate(int p0, android.app.Notification.StandardTemplateParams p1, android.app.Notification.TemplateBindResult p2) { return null; }
        private java.lang.CharSequence processTextSpans(java.lang.CharSequence p0) { return null; }
        private void setTextViewColorPrimary(android.widget.RemoteViews p0, int p1, android.app.Notification.StandardTemplateParams p2) {}
        private boolean hasForegroundColor() { return false; }
        public int getPrimaryTextColor() { return 0; }
        public int getPrimaryTextColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        public int getSecondaryTextColor() { return 0; }
        public int getSecondaryTextColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        private void setTextViewColorSecondary(android.widget.RemoteViews p0, int p1, android.app.Notification.StandardTemplateParams p2) {}
        private void ensureColors(android.app.Notification.StandardTemplateParams p0) {}
        private void updateBackgroundColor(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        void setContentMinHeight(android.widget.RemoteViews p0, boolean p1) {}
        private boolean handleProgressBar(android.widget.RemoteViews p0, android.os.Bundle p1, android.app.Notification.StandardTemplateParams p2) { return false; }
        private void bindLargeIconAndReply(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1, android.app.Notification.TemplateBindResult p2) {}
        private int calculateMarginEnd(boolean p0, boolean p1) { return 0; }
        private boolean bindLargeIcon(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) { return false; }
        private boolean bindReplyIcon(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) { return false; }
        private android.app.Notification.Action findReplyAction() { return null; }
        private void bindNotificationHeader(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private void bindActivePermissions(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private void bindExpandButton(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private void bindHeaderChronometerAndTime(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private void bindHeaderText(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private void bindHeaderTextSecondary(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        public java.lang.String loadHeaderAppName() { return null; }
        private void bindHeaderAppName(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private boolean isColorized(android.app.Notification.StandardTemplateParams p0) { return false; }
        private void bindSmallIcon(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private boolean showsTimeOrChronometer() { return false; }
        private void resetStandardTemplateWithActions(android.widget.RemoteViews p0) {}
        private android.widget.RemoteViews applyStandardTemplateWithActions(int p0, android.app.Notification.TemplateBindResult p1) { return null; }
        private static java.util.List<android.app.Notification.Action> filterOutContextualActions(java.util.List<android.app.Notification.Action> p0) { return null; }
        private android.widget.RemoteViews applyStandardTemplateWithActions(int p0, android.app.Notification.StandardTemplateParams p1, android.app.Notification.TemplateBindResult p2) { return null; }
        private boolean hasValidRemoteInput(android.app.Notification.Action p0) { return false; }
        public android.widget.RemoteViews createContentView() { return null; }
        public android.widget.RemoteViews createContentView(boolean p0) { return null; }
        private boolean useExistingRemoteView() { return false; }
        public android.widget.RemoteViews createBigContentView() { return null; }
        public android.widget.RemoteViews makeNotificationHeader() { return null; }
        private android.widget.RemoteViews makeNotificationHeader(android.app.Notification.StandardTemplateParams p0) { return null; }
        public android.widget.RemoteViews makeAmbientNotification() { return null; }
        private void hideLine1Text(android.widget.RemoteViews p0) {}
        public static void makeHeaderExpanded(android.widget.RemoteViews p0) {}
        public android.widget.RemoteViews createHeadsUpContentView(boolean p0) { return null; }
        public android.widget.RemoteViews createHeadsUpContentView() { return null; }
        public android.widget.RemoteViews makePublicContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeLowPriorityContentView(boolean p0) { return null; }
        private java.lang.CharSequence createSummaryText() { return null; }
        private android.widget.RemoteViews generateActionButton(android.app.Notification.Action p0, boolean p1, android.app.Notification.StandardTemplateParams p2) { return null; }
        private java.lang.CharSequence ensureColorSpanContrast(java.lang.CharSequence p0, int p1, android.content.res.ColorStateList[] p2) { return null; }
        private boolean isLegacy() { return false; }
        private java.lang.CharSequence processLegacyText(java.lang.CharSequence p0) { return null; }
        private void processSmallIconColor(android.graphics.drawable.Icon p0, android.widget.RemoteViews p1, android.app.Notification.StandardTemplateParams p2) {}
        private void processLargeLegacyIcon(android.graphics.drawable.Icon p0, android.widget.RemoteViews p1, android.app.Notification.StandardTemplateParams p2) {}
        private void sanitizeColor() {}
        int resolveContrastColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        private int getRawColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        int resolveNeutralColor() { return 0; }
        public android.app.Notification buildUnstyled() { return null; }
        public static android.app.Notification.Builder recoverBuilder(android.content.Context p0, android.app.Notification p1) { return null; }
        public android.app.Notification.Builder setAllowSystemGeneratedContextualActions(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification getNotification() { return null; }
        public android.app.Notification build() { return null; }
        public android.app.Notification buildInto(android.app.Notification p0) { return null; }
        public static android.app.Notification maybeCloneStrippedForDelivery(android.app.Notification p0) { return null; }
        private int getBaseLayoutResource() { return 0; }
        private int getBigBaseLayoutResource() { return 0; }
        private int getBigPictureLayoutResource() { return 0; }
        private int getBigTextLayoutResource() { return 0; }
        private int getInboxLayoutResource() { return 0; }
        private int getMessagingLayoutResource() { return 0; }
        private int getConversationLayoutResource() { return 0; }
        private int getActionLayoutResource() { return 0; }
        private int getEmphasizedActionLayoutResource() { return 0; }
        private int getActionTombstoneLayoutResource() { return 0; }
        private int getBackgroundColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        private int getNeutralColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        private int resolveBackgroundColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        private boolean shouldTintActionButtons() { return false; }
        private boolean textColorsNeedInversion() { return false; }
        public void setColorPalette(int p0, int p1) {}
        public void setRebuildStyledRemoteViews(boolean p0) {}
        public java.lang.CharSequence getHeadsUpStatusBarText(boolean p0) { return null; }
        public boolean usesTemplate() { return false; }
    }

    private static class BuilderRemoteViews extends android.widget.RemoteViews {
        public BuilderRemoteViews(android.os.Parcel p0) { super((android.widget.RemoteViews)null); }
        public BuilderRemoteViews(android.content.pm.ApplicationInfo p0, int p1) { super((android.widget.RemoteViews)null); }
        public android.app.Notification.BuilderRemoteViews clone() { return null; }
        protected boolean shouldUseStaticFilter() { return false; }
    }

    public static final class CarExtender implements android.app.Notification.Extender {
        private static final java.lang.String TAG = "CarExtender";
        private static final java.lang.String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final java.lang.String EXTRA_LARGE_ICON = "large_icon";
        private static final java.lang.String EXTRA_CONVERSATION = "car_conversation";
        private static final java.lang.String EXTRA_COLOR = "app_color";
        private android.graphics.Bitmap mLargeIcon;
        private android.app.Notification.CarExtender.UnreadConversation mUnreadConversation;
        private int mColor;
        public CarExtender() {}
        public CarExtender(android.app.Notification p0) {}
        public android.app.Notification.Builder extend(android.app.Notification.Builder p0) { return null; }
        public android.app.Notification.CarExtender setColor(int p0) { return null; }
        public int getColor() { return 0; }
        public android.app.Notification.CarExtender setLargeIcon(android.graphics.Bitmap p0) { return null; }
        public android.graphics.Bitmap getLargeIcon() { return null; }
        public android.app.Notification.CarExtender setUnreadConversation(android.app.Notification.CarExtender.UnreadConversation p0) { return null; }
        public android.app.Notification.CarExtender.UnreadConversation getUnreadConversation() { return null; }

        public static class Builder {
            private final java.util.List<java.lang.String> mMessages = null;
            private final java.lang.String mParticipant = null;
            private android.app.RemoteInput mRemoteInput;
            private android.app.PendingIntent mReadPendingIntent;
            private android.app.PendingIntent mReplyPendingIntent;
            private long mLatestTimestamp;
            public Builder(java.lang.String p0) {}
            public android.app.Notification.CarExtender.Builder addMessage(java.lang.String p0) { return null; }
            public android.app.Notification.CarExtender.Builder setReplyAction(android.app.PendingIntent p0, android.app.RemoteInput p1) { return null; }
            public android.app.Notification.CarExtender.Builder setReadPendingIntent(android.app.PendingIntent p0) { return null; }
            public android.app.Notification.CarExtender.Builder setLatestTimestamp(long p0) { return null; }
            public android.app.Notification.CarExtender.UnreadConversation build() { return null; }
        }

        public static class UnreadConversation {
            private static final java.lang.String KEY_AUTHOR = "author";
            private static final java.lang.String KEY_TEXT = "text";
            private static final java.lang.String KEY_MESSAGES = "messages";
            private static final java.lang.String KEY_REMOTE_INPUT = "remote_input";
            private static final java.lang.String KEY_ON_REPLY = "on_reply";
            private static final java.lang.String KEY_ON_READ = "on_read";
            private static final java.lang.String KEY_PARTICIPANTS = "participants";
            private static final java.lang.String KEY_TIMESTAMP = "timestamp";
            private final java.lang.String[] mMessages = null;
            private final android.app.RemoteInput mRemoteInput = null;
            private final android.app.PendingIntent mReplyPendingIntent = null;
            private final android.app.PendingIntent mReadPendingIntent = null;
            private final java.lang.String[] mParticipants = null;
            private final long mLatestTimestamp = 0L;
            UnreadConversation(java.lang.String[] p0, android.app.RemoteInput p1, android.app.PendingIntent p2, android.app.PendingIntent p3, java.lang.String[] p4, long p5) {}
            public java.lang.String[] getMessages() { return null; }
            public android.app.RemoteInput getRemoteInput() { return null; }
            public android.app.PendingIntent getReplyPendingIntent() { return null; }
            public android.app.PendingIntent getReadPendingIntent() { return null; }
            public java.lang.String[] getParticipants() { return null; }
            public java.lang.String getParticipant() { return null; }
            public long getLatestTimestamp() { return 0L; }
            android.os.Bundle getBundleForUnreadConversation() { return null; }
            static android.app.Notification.CarExtender.UnreadConversation getUnreadConversationFromBundle(android.os.Bundle p0) { return null; }
        }
    }

    public static class DecoratedCustomViewStyle extends android.app.Notification.Style {
        public DecoratedCustomViewStyle() { super(); }
        public boolean displayCustomViewInline() { return false; }
        public android.widget.RemoteViews makeContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeBigContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView(boolean p0) { return null; }
        private android.widget.RemoteViews makeDecoratedHeadsUpContentView() { return null; }
        private android.widget.RemoteViews makeStandardTemplateWithCustomContent(android.widget.RemoteViews p0) { return null; }
        private android.widget.RemoteViews makeDecoratedBigContentView() { return null; }
        private void buildIntoRemoteViewContent(android.widget.RemoteViews p0, android.widget.RemoteViews p1, android.app.Notification.TemplateBindResult p2) {}
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
    }

    public static class DecoratedMediaCustomViewStyle extends android.app.Notification.MediaStyle {
        public DecoratedMediaCustomViewStyle() { super(); }
        public boolean displayCustomViewInline() { return false; }
        public android.widget.RemoteViews makeContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeBigContentView() { return null; }
        private android.widget.RemoteViews makeBigContentViewWithCustomContent(android.widget.RemoteViews p0) { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView(boolean p0) { return null; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        private android.widget.RemoteViews buildIntoRemoteView(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews p2) { return null; }
    }

    public static interface Extender {
        public android.app.Notification.Builder extend(android.app.Notification.Builder p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GroupAlertBehavior {
    }

    public static class InboxStyle extends android.app.Notification.Style {
        private static final int NUMBER_OF_HISTORY_ALLOWED_UNTIL_REDUCTION = 1;
        private java.util.ArrayList<java.lang.CharSequence> mTexts;
        public InboxStyle() { super(); }
        @java.lang.Deprecated
        public InboxStyle(android.app.Notification.Builder p0) { super(); }
        public android.app.Notification.InboxStyle setBigContentTitle(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.InboxStyle setSummaryText(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.InboxStyle addLine(java.lang.CharSequence p0) { return null; }
        public java.util.ArrayList<java.lang.CharSequence> getLines() { return null; }
        public void addExtras(android.os.Bundle p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public android.widget.RemoteViews makeBigContentView() { return null; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        private void handleInboxImageMargin(android.widget.RemoteViews p0, int p1, boolean p2, int p3) {}
    }

    public static class MediaStyle extends android.app.Notification.Style {
        static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
        static final int MAX_MEDIA_BUTTONS = 5;
        private static final int[] MEDIA_BUTTON_IDS = null;
        private int[] mActionsToShowInCompact;
        private android.media.session.MediaSession.Token mToken;
        public MediaStyle() { super(); }
        @java.lang.Deprecated
        public MediaStyle(android.app.Notification.Builder p0) { super(); }
        public android.app.Notification.MediaStyle setShowActionsInCompactView(int... p0) { return null; }
        public android.app.Notification.MediaStyle setMediaSession(android.media.session.MediaSession.Token p0) { return null; }
        public android.app.Notification buildStyled(android.app.Notification p0) { return null; }
        public android.widget.RemoteViews makeContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeBigContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView(boolean p0) { return null; }
        public void addExtras(android.os.Bundle p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        private void bindMediaActionButton(android.widget.RemoteViews p0, int p1, android.app.Notification.Action p2, android.app.Notification.StandardTemplateParams p3) {}
        private android.widget.RemoteViews makeMediaContentView() { return null; }
        private int getActionColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        private android.widget.RemoteViews makeMediaBigContentView() { return null; }
        private void handleImage(android.widget.RemoteViews p0) {}
        protected boolean hasProgress() { return false; }
    }

    public static class MessagingStyle extends android.app.Notification.Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        public static final int CONVERSATION_TYPE_LEGACY = 0;
        public static final int CONVERSATION_TYPE_NORMAL = 1;
        public static final int CONVERSATION_TYPE_IMPORTANT = 2;
        android.app.Person mUser;
        java.lang.CharSequence mConversationTitle;
        android.graphics.drawable.Icon mShortcutIcon;
        java.util.List<android.app.Notification.MessagingStyle.Message> mMessages;
        java.util.List<android.app.Notification.MessagingStyle.Message> mHistoricMessages;
        boolean mIsGroupConversation;
        int mConversationType;
        int mUnreadMessageCount;
        MessagingStyle() { super(); }
        public MessagingStyle(java.lang.CharSequence p0) { super(); }
        public MessagingStyle(android.app.Person p0) { super(); }
        public void validate(android.content.Context p0) {}
        public java.lang.CharSequence getHeadsUpStatusBarText() { return null; }
        public android.app.Person getUser() { return null; }
        public java.lang.CharSequence getUserDisplayName() { return null; }
        public android.app.Notification.MessagingStyle setConversationTitle(java.lang.CharSequence p0) { return null; }
        public java.lang.CharSequence getConversationTitle() { return null; }
        public android.app.Notification.MessagingStyle setShortcutIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.graphics.drawable.Icon getShortcutIcon() { return null; }
        public android.app.Notification.MessagingStyle setConversationType(int p0) { return null; }
        public int getConversationType() { return 0; }
        public int getUnreadMessageCount() { return 0; }
        public android.app.Notification.MessagingStyle setUnreadMessageCount(int p0) { return null; }
        public android.app.Notification.MessagingStyle addMessage(java.lang.CharSequence p0, long p1, java.lang.CharSequence p2) { return null; }
        public android.app.Notification.MessagingStyle addMessage(java.lang.CharSequence p0, long p1, android.app.Person p2) { return null; }
        public android.app.Notification.MessagingStyle addMessage(android.app.Notification.MessagingStyle.Message p0) { return null; }
        public android.app.Notification.MessagingStyle addHistoricMessage(android.app.Notification.MessagingStyle.Message p0) { return null; }
        public java.util.List<android.app.Notification.MessagingStyle.Message> getMessages() { return null; }
        public java.util.List<android.app.Notification.MessagingStyle.Message> getHistoricMessages() { return null; }
        public android.app.Notification.MessagingStyle setGroupConversation(boolean p0) { return null; }
        public boolean isGroupConversation() { return false; }
        public void addExtras(android.os.Bundle p0) {}
        private void fixTitleAndTextExtras(android.os.Bundle p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public android.widget.RemoteViews makeContentView(boolean p0) { return null; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        private android.app.Notification.MessagingStyle.Message findLatestIncomingMessage() { return null; }
        public static android.app.Notification.MessagingStyle.Message findLatestIncomingMessage(java.util.List<android.app.Notification.MessagingStyle.Message> p0) { return null; }
        public android.widget.RemoteViews makeBigContentView() { return null; }
        private android.widget.RemoteViews makeMessagingView(boolean p0, boolean p1) { return null; }
        private boolean hasOnlyWhiteSpaceSenders() { return false; }
        private boolean isWhiteSpace(java.lang.CharSequence p0) { return false; }
        private java.lang.CharSequence createConversationTitleFromMessages() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView(boolean p0) { return null; }
        private static android.text.style.TextAppearanceSpan makeFontColorSpan(int p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ConversationType {
        }

        public static final class Message {
            public static final java.lang.String KEY_TEXT = "text";
            static final java.lang.String KEY_TIMESTAMP = "time";
            static final java.lang.String KEY_SENDER = "sender";
            static final java.lang.String KEY_SENDER_PERSON = "sender_person";
            static final java.lang.String KEY_DATA_MIME_TYPE = "type";
            static final java.lang.String KEY_DATA_URI = "uri";
            static final java.lang.String KEY_EXTRAS_BUNDLE = "extras";
            static final java.lang.String KEY_REMOTE_INPUT_HISTORY = "remote_input_history";
            private final java.lang.CharSequence mText = null;
            private final long mTimestamp = 0L;
            private final android.app.Person mSender = null;
            private final boolean mRemoteInputHistory = false;
            private android.os.Bundle mExtras;
            private java.lang.String mDataMimeType;
            private android.net.Uri mDataUri;
            public Message(java.lang.CharSequence p0, long p1, java.lang.CharSequence p2) {}
            public Message(java.lang.CharSequence p0, long p1, android.app.Person p2) {}
            public Message(java.lang.CharSequence p0, long p1, android.app.Person p2, boolean p3) {}
            public android.app.Notification.MessagingStyle.Message setData(java.lang.String p0, android.net.Uri p1) { return null; }
            public java.lang.CharSequence getText() { return null; }
            public long getTimestamp() { return 0L; }
            public android.os.Bundle getExtras() { return null; }
            public java.lang.CharSequence getSender() { return null; }
            public android.app.Person getSenderPerson() { return null; }
            public java.lang.String getDataMimeType() { return null; }
            public android.net.Uri getDataUri() { return null; }
            public boolean isRemoteInputHistory() { return false; }
            public android.os.Bundle toBundle() { return null; }
            static android.os.Bundle[] getBundleArrayForMessages(java.util.List<android.app.Notification.MessagingStyle.Message> p0) { return null; }
            public static java.util.List<android.app.Notification.MessagingStyle.Message> getMessagesFromBundleArray(android.os.Parcelable[] p0) { return null; }
            public static android.app.Notification.MessagingStyle.Message getMessageFromBundle(android.os.Bundle p0) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NotificationFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Priority {
    }

    private static class StandardTemplateParams {
        boolean hasProgress;
        java.lang.CharSequence title;
        java.lang.CharSequence text;
        java.lang.CharSequence headerTextSecondary;
        java.lang.CharSequence summaryText;
        int maxRemoteInputHistory;
        boolean hideLargeIcon;
        boolean hideReplyIcon;
        boolean allowColorization;
        boolean forceDefaultColor;
        private StandardTemplateParams() {}
        final android.app.Notification.StandardTemplateParams reset() { return null; }
        final android.app.Notification.StandardTemplateParams hasProgress(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams title(java.lang.CharSequence p0) { return null; }
        final android.app.Notification.StandardTemplateParams text(java.lang.CharSequence p0) { return null; }
        final android.app.Notification.StandardTemplateParams summaryText(java.lang.CharSequence p0) { return null; }
        final android.app.Notification.StandardTemplateParams headerTextSecondary(java.lang.CharSequence p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideLargeIcon(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideReplyIcon(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams disallowColorization() { return null; }
        final android.app.Notification.StandardTemplateParams forceDefaultColor() { return null; }
        final android.app.Notification.StandardTemplateParams fillTextsFrom(android.app.Notification.Builder p0) { return null; }
        public android.app.Notification.StandardTemplateParams setMaxRemoteInputHistory(int p0) { return null; }
    }

    public static abstract class Style {
        static final int MAX_REMOTE_INPUT_HISTORY_LINES = 3;
        private java.lang.CharSequence mBigContentTitle;
        protected java.lang.CharSequence mSummaryText;
        protected boolean mSummaryTextSet;
        protected android.app.Notification.Builder mBuilder;
        public Style() {}
        protected void internalSetBigContentTitle(java.lang.CharSequence p0) {}
        protected void internalSetSummaryText(java.lang.CharSequence p0) {}
        public void setBuilder(android.app.Notification.Builder p0) {}
        protected void checkBuilder() {}
        protected android.widget.RemoteViews getStandardView(int p0) { return null; }
        protected android.widget.RemoteViews getStandardView(int p0, android.app.Notification.StandardTemplateParams p1, android.app.Notification.TemplateBindResult p2) { return null; }
        public android.widget.RemoteViews makeContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeBigContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView(boolean p0) { return null; }
        public void addExtras(android.os.Bundle p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public android.app.Notification buildStyled(android.app.Notification p0) { return null; }
        public void purgeResources() {}
        public android.app.Notification build() { return null; }
        protected boolean hasProgress() { return false; }
        public boolean hasSummaryInHeader() { return false; }
        public boolean displayCustomViewInline() { return false; }
        public void reduceImageSizes(android.content.Context p0) {}
        public void validate(android.content.Context p0) {}
        public abstract boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0);
        public java.lang.CharSequence getHeadsUpStatusBarText() { return null; }
    }

    private static class TemplateBindResult {
        int mIconMarginEnd;
        boolean mRightIconContainerVisible;
        private TemplateBindResult() {}
        public int getIconMarginEnd() { return 0; }
        public boolean isRightIconContainerVisible() { return false; }
        public void setIconMarginEnd(int p0) {}
        public void setRightIconContainerVisible(boolean p0) {}
    }

    @android.annotation.SystemApi
    public static final class TvExtender implements android.app.Notification.Extender {
        private static final java.lang.String TAG = "TvExtender";
        private static final java.lang.String EXTRA_TV_EXTENDER = "android.tv.EXTENSIONS";
        private static final java.lang.String EXTRA_FLAGS = "flags";
        private static final java.lang.String EXTRA_CONTENT_INTENT = "content_intent";
        private static final java.lang.String EXTRA_DELETE_INTENT = "delete_intent";
        private static final java.lang.String EXTRA_CHANNEL_ID = "channel_id";
        private static final java.lang.String EXTRA_SUPPRESS_SHOW_OVER_APPS = "suppressShowOverApps";
        private static final int FLAG_AVAILABLE_ON_TV = 1;
        private int mFlags;
        private java.lang.String mChannelId;
        private android.app.PendingIntent mContentIntent;
        private android.app.PendingIntent mDeleteIntent;
        private boolean mSuppressShowOverApps;
        public TvExtender() {}
        public TvExtender(android.app.Notification p0) {}
        public android.app.Notification.Builder extend(android.app.Notification.Builder p0) { return null; }
        public boolean isAvailableOnTv() { return false; }
        public android.app.Notification.TvExtender setChannel(java.lang.String p0) { return null; }
        public android.app.Notification.TvExtender setChannelId(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public java.lang.String getChannel() { return null; }
        public java.lang.String getChannelId() { return null; }
        public android.app.Notification.TvExtender setContentIntent(android.app.PendingIntent p0) { return null; }
        public android.app.PendingIntent getContentIntent() { return null; }
        public android.app.Notification.TvExtender setDeleteIntent(android.app.PendingIntent p0) { return null; }
        public android.app.PendingIntent getDeleteIntent() { return null; }
        public android.app.Notification.TvExtender setSuppressShowOverApps(boolean p0) { return null; }
        public boolean getSuppressShowOverApps() { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Visibility {
    }

    public static final class WearableExtender implements android.app.Notification.Extender {
        public static final int UNSET_ACTION_INDEX = -1;
        @java.lang.Deprecated
        public static final int SIZE_DEFAULT = 0;
        @java.lang.Deprecated
        public static final int SIZE_XSMALL = 1;
        @java.lang.Deprecated
        public static final int SIZE_SMALL = 2;
        @java.lang.Deprecated
        public static final int SIZE_MEDIUM = 3;
        @java.lang.Deprecated
        public static final int SIZE_LARGE = 4;
        @java.lang.Deprecated
        public static final int SIZE_FULL_SCREEN = 5;
        @java.lang.Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;
        @java.lang.Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;
        private static final java.lang.String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final java.lang.String KEY_ACTIONS = "actions";
        private static final java.lang.String KEY_FLAGS = "flags";
        private static final java.lang.String KEY_DISPLAY_INTENT = "displayIntent";
        private static final java.lang.String KEY_PAGES = "pages";
        private static final java.lang.String KEY_BACKGROUND = "background";
        private static final java.lang.String KEY_CONTENT_ICON = "contentIcon";
        private static final java.lang.String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final java.lang.String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final java.lang.String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final java.lang.String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final java.lang.String KEY_GRAVITY = "gravity";
        private static final java.lang.String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final java.lang.String KEY_DISMISSAL_ID = "dismissalId";
        private static final java.lang.String KEY_BRIDGE_TAG = "bridgeTag";
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_GRAVITY = 80;
        private java.util.ArrayList<android.app.Notification.Action> mActions;
        private int mFlags;
        private android.app.PendingIntent mDisplayIntent;
        private java.util.ArrayList<android.app.Notification> mPages;
        private android.graphics.Bitmap mBackground;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mContentActionIndex;
        private int mCustomSizePreset;
        private int mCustomContentHeight;
        private int mGravity;
        private int mHintScreenTimeout;
        private java.lang.String mDismissalId;
        private java.lang.String mBridgeTag;
        public WearableExtender() {}
        public WearableExtender(android.app.Notification p0) {}
        public android.app.Notification.Builder extend(android.app.Notification.Builder p0) { return null; }
        public android.app.Notification.WearableExtender clone() { return null; }
        public android.app.Notification.WearableExtender addAction(android.app.Notification.Action p0) { return null; }
        public android.app.Notification.WearableExtender addActions(java.util.List<android.app.Notification.Action> p0) { return null; }
        public android.app.Notification.WearableExtender clearActions() { return null; }
        public java.util.List<android.app.Notification.Action> getActions() { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setDisplayIntent(android.app.PendingIntent p0) { return null; }
        @java.lang.Deprecated
        public android.app.PendingIntent getDisplayIntent() { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender addPage(android.app.Notification p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender addPages(java.util.List<android.app.Notification> p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender clearPages() { return null; }
        @java.lang.Deprecated
        public java.util.List<android.app.Notification> getPages() { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setBackground(android.graphics.Bitmap p0) { return null; }
        @java.lang.Deprecated
        public android.graphics.Bitmap getBackground() { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setContentIcon(int p0) { return null; }
        @java.lang.Deprecated
        public int getContentIcon() { return 0; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setContentIconGravity(int p0) { return null; }
        @java.lang.Deprecated
        public int getContentIconGravity() { return 0; }
        public android.app.Notification.WearableExtender setContentAction(int p0) { return null; }
        public int getContentAction() { return 0; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setGravity(int p0) { return null; }
        @java.lang.Deprecated
        public int getGravity() { return 0; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setCustomSizePreset(int p0) { return null; }
        @java.lang.Deprecated
        public int getCustomSizePreset() { return 0; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setCustomContentHeight(int p0) { return null; }
        @java.lang.Deprecated
        public int getCustomContentHeight() { return 0; }
        public android.app.Notification.WearableExtender setStartScrollBottom(boolean p0) { return null; }
        public boolean getStartScrollBottom() { return false; }
        public android.app.Notification.WearableExtender setContentIntentAvailableOffline(boolean p0) { return null; }
        public boolean getContentIntentAvailableOffline() { return false; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setHintHideIcon(boolean p0) { return null; }
        @java.lang.Deprecated
        public boolean getHintHideIcon() { return false; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setHintShowBackgroundOnly(boolean p0) { return null; }
        @java.lang.Deprecated
        public boolean getHintShowBackgroundOnly() { return false; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setHintAvoidBackgroundClipping(boolean p0) { return null; }
        @java.lang.Deprecated
        public boolean getHintAvoidBackgroundClipping() { return false; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setHintScreenTimeout(int p0) { return null; }
        @java.lang.Deprecated
        public int getHintScreenTimeout() { return 0; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setHintAmbientBigPicture(boolean p0) { return null; }
        @java.lang.Deprecated
        public boolean getHintAmbientBigPicture() { return false; }
        public android.app.Notification.WearableExtender setHintContentIntentLaunchesActivity(boolean p0) { return null; }
        public boolean getHintContentIntentLaunchesActivity() { return false; }
        public android.app.Notification.WearableExtender setDismissalId(java.lang.String p0) { return null; }
        public java.lang.String getDismissalId() { return null; }
        public android.app.Notification.WearableExtender setBridgeTag(java.lang.String p0) { return null; }
        public java.lang.String getBridgeTag() { return null; }
        private void setFlag(int p0, boolean p1) {}
    }
}
