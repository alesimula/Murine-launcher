package android.app;

public class Notification implements android.os.Parcelable {
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final java.lang.String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final java.lang.String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final java.lang.String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final java.lang.String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";
    public static final java.lang.String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final java.lang.String EXTRA_REMOTE_INPUT_DRAFT = "android.remoteInputDraft";
    static final long WEARABLE_EXTENDER_BACKGROUND_BLOCKED = 270551184L;
    public long when;
    public long creationTime;
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
    public static final int FLAG_NO_DISMISS = 8192;
    public static final int FLAG_FSI_REQUESTED_BUT_DENIED = 16384;
    public static final int FLAG_USER_INITIATED_JOB = 32768;
    @android.annotation.FlaggedApi("android.app.lifetime_extension_refactor")
    public static final int FLAG_LIFETIME_EXTENDED_BY_DIRECT_REPLY = 65536;
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
    public static final java.lang.String CATEGORY_WORKOUT = "workout";
    public static final java.lang.String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final java.lang.String CATEGORY_STOPWATCH = "stopwatch";
    public static final java.lang.String CATEGORY_MISSED_CALL = "missed_call";
    @android.annotation.FlaggedApi("android.app.category_voicemail")
    public static final java.lang.String CATEGORY_VOICEMAIL = "voicemail";
    public java.lang.String category;
    public android.os.Bundle extras;
    public android.util.ArraySet<android.app.PendingIntent> allPendingIntents;
    public static android.os.IBinder processAllowlistToken;
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
    public static final java.lang.String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final java.lang.String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final java.lang.String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final java.lang.String EXTRA_TEXT_LINES = "android.textLines";
    public static final java.lang.String EXTRA_TEMPLATE = "android.template";
    public static final java.lang.String EXTRA_PEOPLE = "android.people";
    public static final java.lang.String EXTRA_PEOPLE_LIST = "android.people.list";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.NOTIFICATION_DURING_SETUP")
    public static final java.lang.String EXTRA_ALLOW_DURING_SETUP = "android.allowDuringSetup";
    public static final java.lang.String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final java.lang.String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final java.lang.String EXTRA_MEDIA_REMOTE_DEVICE = "android.mediaRemoteDevice";
    public static final java.lang.String EXTRA_MEDIA_REMOTE_ICON = "android.mediaRemoteIcon";
    public static final java.lang.String EXTRA_MEDIA_REMOTE_INTENT = "android.mediaRemoteIntent";
    public static final java.lang.String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final java.lang.String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final java.lang.String EXTRA_MESSAGING_PERSON = "android.messagingUser";
    public static final java.lang.String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final java.lang.String EXTRA_CONVERSATION_ICON = "android.conversationIcon";
    public static final java.lang.String EXTRA_CONVERSATION_UNREAD_MESSAGE_COUNT = "android.conversationUnreadMessageCount";
    public static final java.lang.String EXTRA_MESSAGES = "android.messages";
    public static final java.lang.String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final java.lang.String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final java.lang.String EXTRA_CALL_TYPE = "android.callType";
    public static final java.lang.String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    public static final java.lang.String EXTRA_CALL_PERSON = "android.callPerson";
    public static final java.lang.String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    public static final java.lang.String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final java.lang.String EXTRA_ANSWER_INTENT = "android.answerIntent";
    public static final java.lang.String EXTRA_DECLINE_INTENT = "android.declineIntent";
    public static final java.lang.String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    public static final java.lang.String EXTRA_ANSWER_COLOR = "android.answerColor";
    public static final java.lang.String EXTRA_DECLINE_COLOR = "android.declineColor";
    public static final java.lang.String EXTRA_COLORIZED = "android.colorized";
    public static final java.lang.String EXTRA_BUILDER_APPLICATION_INFO = "android.appInfo";
    public static final java.lang.String EXTRA_CONTAINS_CUSTOM_VIEW = "android.contains.customView";
    public static final java.lang.String EXTRA_REDUCED_IMAGES = "android.reduced.images";
    public static final java.lang.String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SUBSTITUTE_NOTIFICATION_APP_NAME")
    public static final java.lang.String EXTRA_SUBSTITUTE_APP_NAME = "android.substName";
    public static final java.lang.String EXTRA_FOREGROUND_APPS = "android.foregroundApps";
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final java.lang.String GROUP_KEY_SILENT = "silent";
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final int BADGE_ICON_LARGE = 2;
    public android.app.Notification.Action[] actions;
    public android.app.Notification publicVersion;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.Notification> CREATOR = null;
    public java.lang.String getGroup() { return null; }
    public java.lang.String getSortKey() { return null; }
    public Notification() {}
    public Notification(android.content.Context p0, int p1, java.lang.CharSequence p2, long p3, java.lang.CharSequence p4, java.lang.CharSequence p5, android.content.Intent p6) {}
    @java.lang.Deprecated
    public Notification(int p0, java.lang.CharSequence p1, long p2) {}
    public Notification(android.os.Parcel p0) {}
    public android.app.Notification clone() { return null; }
    public void cloneInto(android.app.Notification p0, boolean p1) {}
    public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    public java.lang.String loadHeaderAppName(android.content.Context p0) { return null; }
    public boolean belongsToHeadlessSystemApp(android.content.Context p0) { return false; }
    public int getHeaderAppIconRes(android.content.Context p0) { return 0; }
    public android.graphics.drawable.Drawable loadHeaderAppIcon(android.content.Context p0) { return null; }
    public final void lightenPayload() {}
    public static java.lang.CharSequence safeCharSequence(java.lang.CharSequence p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static boolean areActionsVisiblyDifferent(android.app.Notification p0, android.app.Notification p1) { return false; }
    public static boolean areIconsDifferent(android.app.Notification p0, android.app.Notification p1) { return false; }
    public static boolean areStyledNotificationsVisiblyDifferent(android.app.Notification.Builder p0, android.app.Notification.Builder p1) { return false; }
    public static boolean areRemoteViewsChanged(android.app.Notification.Builder p0, android.app.Notification.Builder p1) { return false; }
    @java.lang.Deprecated
    public void setLatestEventInfo(android.content.Context p0, java.lang.CharSequence p1, java.lang.CharSequence p2, android.app.PendingIntent p3) {}
    public void overrideAllowlistToken(android.os.IBinder p0) {}
    public android.os.IBinder getAllowlistToken() { return null; }
    public static void addFieldsFromContext(android.content.Context p0, android.app.Notification p1) {}
    public static void addFieldsFromContext(android.content.pm.ApplicationInfo p0, android.app.Notification p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public java.lang.String toString() { return null; }
    public static java.lang.String visibilityToString(int p0) { return null; }
    public static java.lang.String priorityToString(int p0) { return null; }
    public static java.lang.String flagsToString(int p0) { return null; }
    public static java.lang.String defaultsToString(int p0) { return null; }
    public boolean hasCompletedProgress() { return false; }
    @java.lang.Deprecated
    public java.lang.String getChannel() { return null; }
    public java.lang.String getChannelId() { return null; }
    @java.lang.Deprecated
    public long getTimeout() { return 0L; }
    public long getTimeoutAfter() { return 0L; }
    public void setTimeoutAfter(long p0) {}
    public int getBadgeIconType() { return 0; }
    public java.lang.String getShortcutId() { return null; }
    @android.annotation.Nullable
    public android.content.LocusId getLocusId() { return null; }
    public java.lang.CharSequence getSettingsText() { return null; }
    public int getGroupAlertBehavior() { return 0; }
    @android.annotation.Nullable
    public android.app.Notification.BubbleMetadata getBubbleMetadata() { return null; }
    public void setBubbleMetadata(android.app.Notification.BubbleMetadata p0) {}
    public boolean getAllowSystemGeneratedContextualActions() { return false; }
    public android.graphics.drawable.Icon getSmallIcon() { return null; }
    public void setSmallIcon(android.graphics.drawable.Icon p0) {}
    public android.graphics.drawable.Icon getAppIcon() { return null; }
    public boolean shouldUseAppIcon() { return false; }
    public android.graphics.drawable.Icon getLargeIcon() { return null; }
    public boolean hasAppProvidedWhen() { return false; }
    public boolean isGroupSummary() { return false; }
    public boolean isGroupChild() { return false; }
    public boolean suppressAlertingDueToGrouping() { return false; }
    @android.annotation.Nullable
    public android.util.Pair<android.app.RemoteInput, android.app.Notification.Action> findRemoteInputActionPair(boolean p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.Notification.Action> getContextualActions() { return null; }
    void reduceImageSizes(android.content.Context p0) {}
    public boolean isForegroundService() { return false; }
    public boolean isUserInitiatedJob() { return false; }
    public boolean isFgsOrUij() { return false; }
    public boolean shouldShowForegroundImmediately() { return false; }
    public boolean isForegroundDisplayForceDeferred() { return false; }
    public java.lang.Class<? extends android.app.Notification.Style> getNotificationStyle() { return null; }
    public boolean isStyle(java.lang.Class<? extends android.app.Notification.Style> p0) { return false; }
    public boolean isColorized() { return false; }
    public boolean hasColorizedPermission() { return false; }
    public boolean isMediaNotification() { return false; }
    public java.lang.Boolean isCustomNotification() { return null; }
    public boolean isBubbleNotification() { return false; }
    public long getWhen() { return 0L; }
    public boolean showsTime() { return false; }
    public boolean showsChronometer() { return false; }
    public boolean hasImage() { return false; }
    @android.annotation.SystemApi
    public static java.lang.Class<? extends android.app.Notification.Style> getNotificationStyleClass(java.lang.String p0) { return null; }

    public static class Action implements android.os.Parcelable {
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
        @android.annotation.SystemApi
        public static final int SEMANTIC_ACTION_MARK_CONVERSATION_AS_PRIORITY = 11;
        @android.annotation.SystemApi
        public static final int SEMANTIC_ACTION_CONVERSATION_IS_PHISHING = 12;
        @java.lang.Deprecated
        public int icon;
        public java.lang.CharSequence title;
        public android.app.PendingIntent actionIntent;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.app.Notification.Action> CREATOR = null;
        @java.lang.Deprecated
        public Action(int p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
        public android.graphics.drawable.Icon getIcon() { return null; }
        public android.os.Bundle getExtras() { return null; }
        public boolean getAllowGeneratedReplies() { return false; }
        public android.app.RemoteInput[] getRemoteInputs() { return null; }
        public int getSemanticAction() { return 0; }
        public boolean isContextual() { return false; }
        public android.app.RemoteInput[] getDataOnlyRemoteInputs() { return null; }
        public boolean isAuthenticationRequired() { return false; }
        public android.app.Notification.Action clone() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            @java.lang.Deprecated
            public Builder(int p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
            public Builder(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
            public Builder(android.app.Notification.Action p0) {}
            @android.annotation.NonNull
            public android.app.Notification.Action.Builder addExtras(android.os.Bundle p0) { return null; }
            @android.annotation.NonNull
            public android.os.Bundle getExtras() { return null; }
            @android.annotation.NonNull
            public android.app.Notification.Action.Builder addRemoteInput(android.app.RemoteInput p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.Action.Builder setAllowGeneratedReplies(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.Action.Builder setSemanticAction(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.Action.Builder setContextual(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.Action.Builder extend(android.app.Notification.Action.Extender p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.Action.Builder setAuthenticationRequired(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.Action build() { return null; }
        }

        public static interface Extender {
            public android.app.Notification.Action.Builder extend(android.app.Notification.Action.Builder p0);
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SemanticAction {
        }

        public static final class WearableExtender implements android.app.Notification.Action.Extender {
            public WearableExtender() {}
            public WearableExtender(android.app.Notification.Action p0) {}
            public android.app.Notification.Action.Builder extend(android.app.Notification.Action.Builder p0) { return null; }
            public android.app.Notification.Action.WearableExtender clone() { return null; }
            public android.app.Notification.Action.WearableExtender setAvailableOffline(boolean p0) { return null; }
            public boolean isAvailableOffline() { return false; }
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
        public static final int MIN_ASHMEM_BITMAP_SIZE = 131072;
        public BigPictureStyle() { super(); }
        @java.lang.Deprecated
        public BigPictureStyle(android.app.Notification.Builder p0) { super(); }
        @android.annotation.NonNull
        public android.app.Notification.BigPictureStyle setBigContentTitle(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.BigPictureStyle setSummaryText(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.BigPictureStyle setContentDescription(java.lang.CharSequence p0) { return null; }
        @android.annotation.Nullable
        public android.graphics.drawable.Icon getBigPicture() { return null; }
        @android.annotation.NonNull
        public android.app.Notification.BigPictureStyle bigPicture(android.graphics.Bitmap p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.BigPictureStyle bigPicture(android.graphics.drawable.Icon p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.BigPictureStyle showBigPictureWhenCollapsed(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.BigPictureStyle bigLargeIcon(android.graphics.Bitmap p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.BigPictureStyle bigLargeIcon(android.graphics.drawable.Icon p0) { return null; }
        public void purgeResources() {}
        public void reduceImageSizes(android.content.Context p0) {}
        public android.widget.RemoteViews makeContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeBigContentView() { return null; }
        public void addExtras(android.os.Bundle p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        @android.annotation.Nullable
        public static android.graphics.drawable.Icon getPictureIcon(android.os.Bundle p0) { return null; }
        public boolean hasSummaryInHeader() { return false; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
    }

    public static class BigTextStyle extends android.app.Notification.Style {
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
        public static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        public static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        public static final int FLAG_SUPPRESSABLE_BUBBLE = 4;
        public static final int FLAG_SUPPRESS_BUBBLE = 8;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.app.Notification.BubbleMetadata> CREATOR = null;
        @android.annotation.Nullable
        public java.lang.String getShortcutId() { return null; }
        @android.annotation.SuppressLint("InvalidNullConversion")
        @android.annotation.Nullable
        public android.app.PendingIntent getIntent() { return null; }
        @android.annotation.Nullable
        public android.app.PendingIntent getDeleteIntent() { return null; }
        @android.annotation.SuppressLint("InvalidNullConversion")
        @android.annotation.Nullable
        public android.graphics.drawable.Icon getIcon() { return null; }
        public int getDesiredHeight() { return 0; }
        public int getDesiredHeightResId() { return 0; }
        public boolean getAutoExpandBubble() { return false; }
        public boolean isNotificationSuppressed() { return false; }
        public boolean isBubbleSuppressable() { return false; }
        public boolean isBubbleSuppressed() { return false; }
        public void setSuppressNotification(boolean p0) {}
        public void setSuppressBubble(boolean p0) {}
        public void setFlags(int p0) {}
        public int getFlags() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            @java.lang.Deprecated
            public Builder() {}
            public Builder(java.lang.String p0) {}
            public Builder(android.app.PendingIntent p0, android.graphics.drawable.Icon p1) {}
            @android.annotation.NonNull
            public android.app.Notification.BubbleMetadata.Builder setIntent(android.app.PendingIntent p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.BubbleMetadata.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.BubbleMetadata.Builder setDesiredHeight(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.BubbleMetadata.Builder setDesiredHeightResId(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.BubbleMetadata.Builder setAutoExpandBubble(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.BubbleMetadata.Builder setSuppressNotification(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.BubbleMetadata.Builder setSuppressableBubble(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.BubbleMetadata.Builder setDeleteIntent(android.app.PendingIntent p0) { return null; }
            @android.annotation.NonNull
            public android.app.Notification.BubbleMetadata build() { return null; }
            public android.app.Notification.BubbleMetadata.Builder setFlag(int p0, boolean p1) { return null; }
        }
    }

    public static class Builder {
        public static final java.lang.String EXTRA_REBUILD_CONTENT_VIEW_ACTION_COUNT = "android.rebuild.contentViewActionCount";
        public static final java.lang.String EXTRA_REBUILD_BIG_CONTENT_VIEW_ACTION_COUNT = "android.rebuild.bigViewActionCount";
        public static final java.lang.String EXTRA_REBUILD_HEADS_UP_CONTENT_VIEW_ACTION_COUNT = "android.rebuild.hudViewActionCount";
        android.app.Notification.StandardTemplateParams mParams;
        android.app.Notification.Colors mColors;
        public Builder(android.content.Context p0, java.lang.String p1) {}
        @java.lang.Deprecated
        public Builder(android.content.Context p0) {}
        public Builder(android.content.Context p0, android.app.Notification p1) {}
        @android.annotation.NonNull
        public android.app.Notification.Builder setShortcutId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setLocusId(android.content.LocusId p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setBadgeIconType(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setGroupAlertBehavior(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setBubbleMetadata(android.app.Notification.BubbleMetadata p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setChannel(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setChannelId(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setTimeout(long p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setTimeoutAfter(long p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setWhen(long p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setShowWhen(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setUsesChronometer(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setChronometerCountDown(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setSmallIcon(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setSmallIcon(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setSmallIcon(android.graphics.drawable.Icon p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setSilent(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setContentTitle(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setContentText(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setSubText(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setSettingsText(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setRemoteInputHistory(java.lang.CharSequence[] p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setRemoteInputHistory(android.app.RemoteInputHistoryItem[] p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setShowRemoteInputSpinner(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setHideSmartReplies(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setNumber(int p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setContentInfo(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setProgress(int p0, int p1, boolean p2) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setContent(android.widget.RemoteViews p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setCustomContentView(android.widget.RemoteViews p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setCustomBigContentView(android.widget.RemoteViews p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setCustomHeadsUpContentView(android.widget.RemoteViews p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setContentIntent(android.app.PendingIntent p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setDeleteIntent(android.app.PendingIntent p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setFullScreenIntent(android.app.PendingIntent p0, boolean p1) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setTicker(java.lang.CharSequence p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setTicker(java.lang.CharSequence p0, android.widget.RemoteViews p1) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setLargeIcon(android.graphics.Bitmap p0) { return null; }
        @android.annotation.NonNull
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
        @android.annotation.NonNull
        public android.app.Notification.Builder setOngoing(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setColorized(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setOnlyAlertOnce(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setForegroundServiceBehavior(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setAutoCancel(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setLocalOnly(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setDefaults(int p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setPriority(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setCategory(java.lang.String p0) { return null; }
        public android.app.Notification.Builder addPerson(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder addPerson(android.app.Person p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setGroup(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setGroupSummary(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setSortKey(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder addExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.os.Bundle getExtras() { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder addAction(int p0, java.lang.CharSequence p1, android.app.PendingIntent p2) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder addAction(android.app.Notification.Action p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setActions(android.app.Notification.Action... p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setStyle(android.app.Notification.Style p0) { return null; }
        public android.app.Notification.Style getStyle() { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setVisibility(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setPublicVersion(android.app.Notification p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder extend(android.app.Notification.Extender p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setFlag(int p0, boolean p1) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setColor(int p0) { return null; }
        public boolean usesStandardHeader() { return false; }
        public int getPrimaryTextColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        public int getSecondaryTextColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        public java.lang.String loadHeaderAppName() { return null; }
        @java.lang.Deprecated
        public android.widget.RemoteViews createContentView() { return null; }
        public android.widget.RemoteViews createContentView(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.widget.RemoteViews createBigContentView() { return null; }
        public android.widget.RemoteViews makeNotificationGroupHeader() { return null; }
        public android.widget.RemoteViews makeAmbientNotification() { return null; }
        public static void makeHeaderExpanded(android.widget.RemoteViews p0) {}
        public android.widget.RemoteViews createHeadsUpContentView(boolean p0) { return null; }
        public android.widget.RemoteViews createCompactHeadsUpContentView() { return null; }
        @java.lang.Deprecated
        public android.widget.RemoteViews createHeadsUpContentView() { return null; }
        public android.widget.RemoteViews makePublicContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeLowPriorityContentView(boolean p0) { return null; }
        @android.annotation.Nullable
        public static java.lang.Integer getFullLengthSpanColor(java.lang.CharSequence p0) { return null; }
        public java.lang.CharSequence ensureColorSpanContrastOrStripStyling(java.lang.CharSequence p0, android.app.Notification.StandardTemplateParams p1) { return null; }
        public java.lang.CharSequence ensureColorSpanContrastOrStripStyling(java.lang.CharSequence p0, int p1) { return null; }
        public java.lang.CharSequence ensureColorSpanContrast(java.lang.CharSequence p0, android.app.Notification.StandardTemplateParams p1) { return null; }
        public static boolean isColorDark(int p0) { return false; }
        public static int ensureButtonFillContrast(int p0, int p1) { return 0; }
        public int getSmallIconColor(boolean p0) { return 0; }
        public int getBackgroundColor(boolean p0) { return 0; }
        @android.annotation.NonNull
        public android.app.Notification buildUnstyled() { return null; }
        @android.annotation.NonNull
        public static android.app.Notification.Builder recoverBuilder(android.content.Context p0, android.app.Notification p1) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.Builder setAllowSystemGeneratedContextualActions(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification getNotification() { return null; }
        @android.annotation.NonNull
        public android.app.Notification build() { return null; }
        @android.annotation.NonNull
        public android.app.Notification buildInto(android.app.Notification p0) { return null; }
        public static android.app.Notification maybeCloneStrippedForDelivery(android.app.Notification p0) { return null; }
        public java.lang.CharSequence getHeadsUpStatusBarText(boolean p0) { return null; }
        public boolean usesTemplate() { return false; }
    }

    private static class BuilderRemoteViews extends android.widget.RemoteViews {
        public BuilderRemoteViews(android.os.Parcel p0) { super((java.util.Map)null); }
        public BuilderRemoteViews(android.content.pm.ApplicationInfo p0, int p1) { super((java.util.Map)null); }
        public android.app.Notification.BuilderRemoteViews clone() { return null; }
        protected boolean shouldUseStaticFilter() { return false; }
    }

    public static class CallStyle extends android.app.Notification.Style {
        public static final boolean DEBUG_NEW_ACTION_LAYOUT = true;
        public static final int CALL_TYPE_UNKNOWN = 0;
        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        CallStyle() { super(); }
        @android.annotation.NonNull
        public static android.app.Notification.CallStyle forIncomingCall(android.app.Person p0, android.app.PendingIntent p1, android.app.PendingIntent p2) { return null; }
        @android.annotation.NonNull
        public static android.app.Notification.CallStyle forOngoingCall(android.app.Person p0, android.app.PendingIntent p1) { return null; }
        @android.annotation.NonNull
        public static android.app.Notification.CallStyle forScreeningCall(android.app.Person p0, android.app.PendingIntent p1, android.app.PendingIntent p2) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.CallStyle setIsVideo(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.CallStyle setVerificationIcon(android.graphics.drawable.Icon p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.CallStyle setVerificationText(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.CallStyle setAnswerButtonColorHint(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.CallStyle setDeclineButtonColorHint(int p0) { return null; }
        public android.app.Notification buildStyled(android.app.Notification p0) { return null; }
        public boolean displayCustomViewInline() { return false; }
        public void purgeResources() {}
        public void reduceImageSizes(android.content.Context p0) {}
        public android.widget.RemoteViews makeContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView(boolean p0) { return null; }
        @android.annotation.Nullable
        public android.widget.RemoteViews makeCompactHeadsUpContentView() { return null; }
        public android.widget.RemoteViews makeBigContentView() { return null; }
        @android.annotation.NonNull
        public java.util.ArrayList<android.app.Notification.Action> getActionsListWithSystemActions() { return null; }
        public void addExtras(android.os.Bundle p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public boolean hasSummaryInHeader() { return false; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CallType {
        }
    }

    public static final class CarExtender implements android.app.Notification.Extender {
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
            public Builder(java.lang.String p0) {}
            public android.app.Notification.CarExtender.Builder addMessage(java.lang.String p0) { return null; }
            public android.app.Notification.CarExtender.Builder setReplyAction(android.app.PendingIntent p0, android.app.RemoteInput p1) { return null; }
            public android.app.Notification.CarExtender.Builder setReadPendingIntent(android.app.PendingIntent p0) { return null; }
            public android.app.Notification.CarExtender.Builder setLatestTimestamp(long p0) { return null; }
            public android.app.Notification.CarExtender.UnreadConversation build() { return null; }
        }

        public static class UnreadConversation {
            static final java.lang.String KEY_REMOTE_INPUT = "remote_input";
            static final java.lang.String KEY_ON_REPLY = "on_reply";
            static final java.lang.String KEY_ON_READ = "on_read";
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

    public static class Colors {
        public Colors() {}
        public void resolvePalette(android.content.Context p0, int p1, boolean p2, boolean p3) {}
        public int getBackgroundColor() { return 0; }
        public int getProtectionColor() { return 0; }
        public int getPrimaryTextColor() { return 0; }
        public int getSecondaryTextColor() { return 0; }
        public int getPrimaryAccentColor() { return 0; }
        public int getSecondaryAccentColor() { return 0; }
        public int getTertiaryAccentColor() { return 0; }
        public int getOnTertiaryAccentTextColor() { return 0; }
        public int getTertiaryFixedDimAccentColor() { return 0; }
        public int getOnTertiaryFixedAccentTextColor() { return 0; }
        public int getContrastColor() { return 0; }
        public int getErrorColor() { return 0; }
        public int getRippleAlpha() { return 0; }
    }

    public static class DecoratedCustomViewStyle extends android.app.Notification.Style {
        public DecoratedCustomViewStyle() { super(); }
        public boolean displayCustomViewInline() { return false; }
        public android.widget.RemoteViews makeContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeBigContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView(boolean p0) { return null; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
    }

    public static class DecoratedMediaCustomViewStyle extends android.app.Notification.MediaStyle {
        public DecoratedMediaCustomViewStyle() { super(); }
        public boolean displayCustomViewInline() { return false; }
        public android.widget.RemoteViews makeContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeBigContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView(boolean p0) { return null; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
    }

    public static interface Extender {
        public android.app.Notification.Builder extend(android.app.Notification.Builder p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GroupAlertBehavior {
    }

    public static class InboxStyle extends android.app.Notification.Style {
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
    }

    public static class MediaStyle extends android.app.Notification.Style {
        static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
        static final int MAX_MEDIA_BUTTONS = 5;
        public MediaStyle() { super(); }
        @java.lang.Deprecated
        public MediaStyle(android.app.Notification.Builder p0) { super(); }
        public android.app.Notification.MediaStyle setShowActionsInCompactView(int... p0) { return null; }
        public android.app.Notification.MediaStyle setMediaSession(android.media.session.MediaSession.Token p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
        @android.annotation.NonNull
        public android.app.Notification.MediaStyle setRemotePlaybackInfo(java.lang.CharSequence p0, int p1, android.app.PendingIntent p2) { return null; }
        public android.app.Notification buildStyled(android.app.Notification p0) { return null; }
        public android.widget.RemoteViews makeContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeBigContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView(boolean p0) { return null; }
        public void addExtras(android.os.Bundle p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        protected android.widget.RemoteViews makeMediaContentView(android.widget.RemoteViews p0) { return null; }
        protected android.widget.RemoteViews makeMediaBigContentView(android.widget.RemoteViews p0) { return null; }
    }

    public static class MessagingStyle extends android.app.Notification.Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        public static final int CONVERSATION_TYPE_LEGACY = 0;
        public static final int CONVERSATION_TYPE_NORMAL = 1;
        public static final int CONVERSATION_TYPE_IMPORTANT = 2;
        @android.annotation.NonNull
        android.app.Person mUser;
        @android.annotation.Nullable
        java.lang.CharSequence mConversationTitle;
        @android.annotation.Nullable
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
        @android.annotation.NonNull
        public android.app.Person getUser() { return null; }
        public java.lang.CharSequence getUserDisplayName() { return null; }
        public android.app.Notification.MessagingStyle setConversationTitle(java.lang.CharSequence p0) { return null; }
        @android.annotation.Nullable
        public java.lang.CharSequence getConversationTitle() { return null; }
        public android.app.Notification.MessagingStyle setShortcutIcon(android.graphics.drawable.Icon p0) { return null; }
        @android.annotation.Nullable
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
        public void addExtras(android.os.Bundle p0, boolean p1, int p2) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public android.widget.RemoteViews makeContentView(boolean p0) { return null; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        @android.annotation.Nullable
        public static android.app.Notification.MessagingStyle.Message findLatestIncomingMessage(java.util.List<android.app.Notification.MessagingStyle.Message> p0) { return null; }
        public android.widget.RemoteViews makeBigContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView(boolean p0) { return null; }
        @android.annotation.Nullable
        public android.widget.RemoteViews makeCompactHeadsUpContentView() { return null; }
        public void reduceImageSizes(android.content.Context p0) {}

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
            public Message(java.lang.CharSequence p0, long p1, java.lang.CharSequence p2) {}
            public Message(java.lang.CharSequence p0, long p1, android.app.Person p2) {}
            public Message(java.lang.CharSequence p0, long p1, android.app.Person p2, boolean p3) {}
            public android.app.Notification.MessagingStyle.Message setData(java.lang.String p0, android.net.Uri p1) { return null; }
            public void ensureColorContrastOrStripStyling(int p0) {}
            public void ensureColorContrast(int p0) {}
            public java.lang.CharSequence getText() { return null; }
            public long getTimestamp() { return 0L; }
            public android.os.Bundle getExtras() { return null; }
            public java.lang.CharSequence getSender() { return null; }
            @android.annotation.Nullable
            public android.app.Person getSenderPerson() { return null; }
            public java.lang.String getDataMimeType() { return null; }
            public android.net.Uri getDataUri() { return null; }
            public boolean isRemoteInputHistory() { return false; }
            @android.annotation.NonNull
            public android.os.Bundle toBundle() { return null; }
            public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
            @android.annotation.NonNull
            public static java.util.List<android.app.Notification.MessagingStyle.Message> getMessagesFromBundleArray(android.os.Parcelable[] p0) { return null; }
            @android.annotation.Nullable
            public static android.app.Notification.MessagingStyle.Message getMessageFromBundle(android.os.Bundle p0) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NotificationFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NotificationVisibilityOverride {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Priority {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceNotificationPolicy {
    }

    private static class StandardTemplateParams {
        public static final int DECORATION_MINIMAL = 1;
        public static final int DECORATION_PARTIAL = 2;
        public static int VIEW_TYPE_UNSPECIFIED;
        public static int VIEW_TYPE_NORMAL;
        public static int VIEW_TYPE_BIG;
        public static int VIEW_TYPE_HEADS_UP;
        public static int VIEW_TYPE_MINIMIZED;
        public static int VIEW_TYPE_PUBLIC;
        public static int VIEW_TYPE_GROUP_HEADER;
        int mViewType;
        boolean mHeaderless;
        boolean mHideAppName;
        boolean mHideTitle;
        boolean mHideSubText;
        boolean mHideTime;
        boolean mHideActions;
        boolean mHideProgress;
        boolean mHideSnoozeButton;
        boolean mHideLeftIcon;
        boolean mHideRightIcon;
        android.graphics.drawable.Icon mPromotedPicture;
        boolean mCallStyleActions;
        boolean mAllowTextWithProgress;
        int mTitleViewId;
        int mTextViewId;
        @android.annotation.Nullable
        java.lang.CharSequence mTitle;
        @android.annotation.Nullable
        java.lang.CharSequence mText;
        @android.annotation.Nullable
        java.lang.CharSequence mHeaderTextSecondary;
        @android.annotation.Nullable
        java.lang.CharSequence mSubText;
        int maxRemoteInputHistory;
        boolean allowColorization;
        boolean mHighlightExpander;
        final android.app.Notification.StandardTemplateParams reset() { return null; }
        final boolean hasTitle() { return false; }
        final android.app.Notification.StandardTemplateParams viewType(int p0) { return null; }
        public android.app.Notification.StandardTemplateParams headerless(boolean p0) { return null; }
        public android.app.Notification.StandardTemplateParams hideAppName(boolean p0) { return null; }
        public android.app.Notification.StandardTemplateParams hideSubText(boolean p0) { return null; }
        public android.app.Notification.StandardTemplateParams hideTime(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideActions(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideProgress(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideTitle(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams callStyleActions(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams allowTextWithProgress(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideSnoozeButton(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams promotedPicture(android.graphics.drawable.Icon p0) { return null; }
        public android.app.Notification.StandardTemplateParams titleViewId(int p0) { return null; }
        public android.app.Notification.StandardTemplateParams textViewId(int p0) { return null; }
        final android.app.Notification.StandardTemplateParams title(java.lang.CharSequence p0) { return null; }
        final android.app.Notification.StandardTemplateParams text(java.lang.CharSequence p0) { return null; }
        final android.app.Notification.StandardTemplateParams summaryText(java.lang.CharSequence p0) { return null; }
        final android.app.Notification.StandardTemplateParams headerTextSecondary(java.lang.CharSequence p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideLeftIcon(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideRightIcon(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams disallowColorization() { return null; }
        final android.app.Notification.StandardTemplateParams highlightExpander(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams fillTextsFrom(android.app.Notification.Builder p0) { return null; }
        public android.app.Notification.StandardTemplateParams setMaxRemoteInputHistory(int p0) { return null; }
        public android.app.Notification.StandardTemplateParams decorationType(int p0) { return null; }
    }

    public static abstract class Style {
        static final int MAX_REMOTE_INPUT_HISTORY_LINES = 3;
        protected java.lang.CharSequence mSummaryText;
        protected boolean mSummaryTextSet;
        protected android.app.Notification.Builder mBuilder;
        @java.lang.Deprecated
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
        @android.annotation.Nullable
        public android.widget.RemoteViews makeCompactHeadsUpContentView() { return null; }
        public void addExtras(android.os.Bundle p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public android.app.Notification buildStyled(android.app.Notification p0) { return null; }
        public void purgeResources() {}
        public android.app.Notification build() { return null; }
        public boolean hasSummaryInHeader() { return false; }
        public boolean displayCustomViewInline() { return false; }
        public void reduceImageSizes(android.content.Context p0) {}
        public void validate(android.content.Context p0) {}
        public abstract boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0);
        public java.lang.CharSequence getHeadsUpStatusBarText() { return null; }
    }

    private static class TemplateBindResult {
        boolean mRightIconVisible;
        float mRightIconWidthDp;
        float mRightIconHeightDp;
        public final android.app.Notification.TemplateBindResult.MarginSet mHeadingExtraMarginSet = null;
        public final android.app.Notification.TemplateBindResult.MarginSet mHeadingFullMarginSet = null;
        public final android.app.Notification.TemplateBindResult.MarginSet mTitleMarginSet = null;
        public void setRightIconState(boolean p0, float p1, float p2, float p3, float p4) {}

        private class MarginSet {
            public void setValues(float p0, float p1) {}
            public void applyToView(android.widget.RemoteViews p0, int p1) {}
            public void applyToView(android.widget.RemoteViews p0, int p1, float p2) {}
            public float getDpValue() { return 0.0f; }
        }
    }

    @android.annotation.FlaggedApi("android.app.api_tvextender")
    public static final class TvExtender implements android.app.Notification.Extender {
        static final java.lang.String EXTRA_CONTENT_INTENT = "content_intent";
        static final java.lang.String EXTRA_DELETE_INTENT = "delete_intent";
        public TvExtender() {}
        public TvExtender(android.app.Notification p0) {}
        @android.annotation.NonNull
        public android.app.Notification.Builder extend(android.app.Notification.Builder p0) { return null; }
        public boolean isAvailableOnTv() { return false; }
        @android.annotation.SystemApi
        public android.app.Notification.TvExtender setChannel(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.Notification.TvExtender setChannelId(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.SystemApi
        public java.lang.String getChannel() { return null; }
        @android.annotation.Nullable
        public java.lang.String getChannelId() { return null; }
        @android.annotation.NonNull
        public android.app.Notification.TvExtender setContentIntent(android.app.PendingIntent p0) { return null; }
        @android.annotation.Nullable
        public android.app.PendingIntent getContentIntent() { return null; }
        @android.annotation.NonNull
        public android.app.Notification.TvExtender setDeleteIntent(android.app.PendingIntent p0) { return null; }
        @android.annotation.Nullable
        public android.app.PendingIntent getDeleteIntent() { return null; }
        @android.annotation.NonNull
        public android.app.Notification.TvExtender setSuppressShowOverApps(boolean p0) { return null; }
        @android.annotation.SystemApi
        public boolean getSuppressShowOverApps() { return false; }
        public boolean isSuppressShowOverApps() { return false; }
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
        static final java.lang.String KEY_DISPLAY_INTENT = "displayIntent";
        static final java.lang.String KEY_BACKGROUND = "background";
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
    }
}
