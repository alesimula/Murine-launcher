package com.android.server.notification;

public final class NotificationHistoryProto {
    public static final long STRING_POOL = 1146756268033L;
    public static final long MAJOR_VERSION = 1120986464258L;
    public static final long NOTIFICATION = 2246267895811L;
    public NotificationHistoryProto() {}

    public final class Notification {
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_BITMAP = 1;
        public static final int TYPE_RESOURCE = 2;
        public static final int TYPE_DATA = 3;
        public static final int TYPE_URI = 4;
        public static final int TYPE_ADAPTIVE_BITMAP = 5;
        public static final long PACKAGE = 1138166333441L;
        public static final long PACKAGE_INDEX = 1120986464258L;
        public static final long CHANNEL_NAME = 1138166333443L;
        public static final long CHANNEL_NAME_INDEX = 1120986464260L;
        public static final long CHANNEL_ID = 1138166333445L;
        public static final long CHANNEL_ID_INDEX = 1120986464262L;
        public static final long UID = 1120986464263L;
        public static final long USER_ID = 1120986464264L;
        public static final long POSTED_TIME_MS = 1112396529673L;
        public static final long TITLE = 1138166333450L;
        public static final long TEXT = 1138166333451L;
        public static final long ICON = 1146756268044L;
        public static final long CONVERSATION_ID = 1138166333453L;
        public static final long CONVERSATION_ID_INDEX = 1120986464270L;
        public Notification(com.android.server.notification.NotificationHistoryProto p0) {}

        public final class Icon {
            public static final long IMAGE_TYPE = 1159641169921L;
            public static final long IMAGE_BITMAP_FILENAME = 1138166333442L;
            public static final long IMAGE_RESOURCE_ID = 1120986464259L;
            public static final long IMAGE_RESOURCE_ID_PACKAGE = 1138166333444L;
            public static final long IMAGE_DATA = 1151051235333L;
            public static final long IMAGE_DATA_LENGTH = 1120986464262L;
            public static final long IMAGE_DATA_OFFSET = 1120986464263L;
            public static final long IMAGE_URI = 1138166333448L;
            public Icon(com.android.server.notification.NotificationHistoryProto.Notification p0) {}
        }
    }

    public final class StringPool {
        public static final long SIZE = 1120986464257L;
        public static final long STRINGS = 2237677961218L;
        public StringPool(com.android.server.notification.NotificationHistoryProto p0) {}
    }
}
