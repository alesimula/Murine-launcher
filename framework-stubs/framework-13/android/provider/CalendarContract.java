package android.provider;

public final class CalendarContract {
    public static final java.lang.String ACTION_EVENT_REMINDER = "android.intent.action.EVENT_REMINDER";
    public static final java.lang.String ACTION_HANDLE_CUSTOM_EVENT = "android.provider.calendar.action.HANDLE_CUSTOM_EVENT";
    public static final java.lang.String ACTION_VIEW_MANAGED_PROFILE_CALENDAR_EVENT = "android.provider.calendar.action.VIEW_MANAGED_PROFILE_CALENDAR_EVENT";
    public static final java.lang.String EXTRA_CUSTOM_APP_URI = "customAppUri";
    public static final java.lang.String EXTRA_EVENT_BEGIN_TIME = "beginTime";
    public static final java.lang.String EXTRA_EVENT_END_TIME = "endTime";
    public static final java.lang.String EXTRA_EVENT_ALL_DAY = "allDay";
    public static final java.lang.String EXTRA_EVENT_ID = "id";
    public static final java.lang.String AUTHORITY = "com.android.calendar";
    public static final android.net.Uri CONTENT_URI = null;
    public static final android.net.Uri ENTERPRISE_CONTENT_URI = null;
    public static final java.lang.String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";
    public static final java.lang.String ACCOUNT_TYPE_LOCAL = "LOCAL";
    public static boolean startViewCalendarEventInManagedProfile(android.content.Context p0, long p1, long p2, long p3, boolean p4, int p5) { return false; }

    public static final class Attendees implements android.provider.BaseColumns, android.provider.CalendarContract.AttendeesColumns, android.provider.CalendarContract.EventsColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.database.Cursor query(android.content.ContentResolver p0, long p1, java.lang.String[] p2) { return null; }
    }

    protected static interface AttendeesColumns {
        public static final java.lang.String EVENT_ID = "event_id";
        public static final java.lang.String ATTENDEE_NAME = "attendeeName";
        public static final java.lang.String ATTENDEE_EMAIL = "attendeeEmail";
        public static final java.lang.String ATTENDEE_RELATIONSHIP = "attendeeRelationship";
        public static final int RELATIONSHIP_NONE = 0;
        public static final int RELATIONSHIP_ATTENDEE = 1;
        public static final int RELATIONSHIP_ORGANIZER = 2;
        public static final int RELATIONSHIP_PERFORMER = 3;
        public static final int RELATIONSHIP_SPEAKER = 4;
        public static final java.lang.String ATTENDEE_TYPE = "attendeeType";
        public static final int TYPE_NONE = 0;
        public static final int TYPE_REQUIRED = 1;
        public static final int TYPE_OPTIONAL = 2;
        public static final int TYPE_RESOURCE = 3;
        public static final java.lang.String ATTENDEE_STATUS = "attendeeStatus";
        public static final int ATTENDEE_STATUS_NONE = 0;
        public static final int ATTENDEE_STATUS_ACCEPTED = 1;
        public static final int ATTENDEE_STATUS_DECLINED = 2;
        public static final int ATTENDEE_STATUS_INVITED = 3;
        public static final int ATTENDEE_STATUS_TENTATIVE = 4;
        public static final java.lang.String ATTENDEE_IDENTITY = "attendeeIdentity";
        public static final java.lang.String ATTENDEE_ID_NAMESPACE = "attendeeIdNamespace";
    }

    public static final class CalendarAlerts implements android.provider.BaseColumns, android.provider.CalendarContract.CalendarAlertsColumns, android.provider.CalendarContract.EventsColumns, android.provider.CalendarContract.CalendarColumns {
        public static final java.lang.String TABLE_NAME = "CalendarAlerts";
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri CONTENT_URI_BY_INSTANCE = null;
        public static final android.net.Uri insert(android.content.ContentResolver p0, long p1, long p2, long p3, long p4, int p5) { return null; }
        public static final long findNextAlarmTime(android.content.ContentResolver p0, long p1) { return 0L; }
        public static final void rescheduleMissedAlarms(android.content.ContentResolver p0, android.content.Context p1, android.app.AlarmManager p2) {}
        public static void scheduleAlarm(android.content.Context p0, android.app.AlarmManager p1, long p2) {}
        public static final boolean alarmExists(android.content.ContentResolver p0, long p1, long p2, long p3) { return false; }
    }

    protected static interface CalendarAlertsColumns {
        public static final java.lang.String EVENT_ID = "event_id";
        public static final java.lang.String BEGIN = "begin";
        public static final java.lang.String END = "end";
        public static final java.lang.String ALARM_TIME = "alarmTime";
        public static final java.lang.String CREATION_TIME = "creationTime";
        public static final java.lang.String RECEIVED_TIME = "receivedTime";
        public static final java.lang.String NOTIFY_TIME = "notifyTime";
        public static final java.lang.String STATE = "state";
        public static final int STATE_SCHEDULED = 0;
        public static final int STATE_FIRED = 1;
        public static final int STATE_DISMISSED = 2;
        public static final java.lang.String MINUTES = "minutes";
        public static final java.lang.String DEFAULT_SORT_ORDER = "begin ASC,title ASC";
    }

    public static final class CalendarCache implements android.provider.CalendarContract.CalendarCacheColumns {
        public static final android.net.Uri URI = null;
        public static final java.lang.String KEY_TIMEZONE_TYPE = "timezoneType";
        public static final java.lang.String KEY_TIMEZONE_INSTANCES = "timezoneInstances";
        public static final java.lang.String KEY_TIMEZONE_INSTANCES_PREVIOUS = "timezoneInstancesPrevious";
        public static final java.lang.String TIMEZONE_TYPE_AUTO = "auto";
        public static final java.lang.String TIMEZONE_TYPE_HOME = "home";
    }

    protected static interface CalendarCacheColumns {
        public static final java.lang.String KEY = "key";
        public static final java.lang.String VALUE = "value";
    }

    protected static interface CalendarColumns {
        public static final java.lang.String CALENDAR_COLOR = "calendar_color";
        public static final java.lang.String CALENDAR_COLOR_KEY = "calendar_color_index";
        public static final java.lang.String CALENDAR_DISPLAY_NAME = "calendar_displayName";
        public static final java.lang.String CALENDAR_ACCESS_LEVEL = "calendar_access_level";
        public static final int CAL_ACCESS_NONE = 0;
        public static final int CAL_ACCESS_FREEBUSY = 100;
        public static final int CAL_ACCESS_READ = 200;
        public static final int CAL_ACCESS_RESPOND = 300;
        public static final int CAL_ACCESS_OVERRIDE = 400;
        public static final int CAL_ACCESS_CONTRIBUTOR = 500;
        public static final int CAL_ACCESS_EDITOR = 600;
        public static final int CAL_ACCESS_OWNER = 700;
        public static final int CAL_ACCESS_ROOT = 800;
        public static final java.lang.String VISIBLE = "visible";
        public static final java.lang.String CALENDAR_TIME_ZONE = "calendar_timezone";
        public static final java.lang.String SYNC_EVENTS = "sync_events";
        public static final java.lang.String OWNER_ACCOUNT = "ownerAccount";
        public static final java.lang.String CAN_ORGANIZER_RESPOND = "canOrganizerRespond";
        public static final java.lang.String CAN_MODIFY_TIME_ZONE = "canModifyTimeZone";
        public static final java.lang.String MAX_REMINDERS = "maxReminders";
        public static final java.lang.String ALLOWED_REMINDERS = "allowedReminders";
        public static final java.lang.String ALLOWED_AVAILABILITY = "allowedAvailability";
        public static final java.lang.String ALLOWED_ATTENDEE_TYPES = "allowedAttendeeTypes";
        public static final java.lang.String IS_PRIMARY = "isPrimary";
    }

    public static final class CalendarEntity implements android.provider.BaseColumns, android.provider.CalendarContract.SyncColumns, android.provider.CalendarContract.CalendarColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static android.content.EntityIterator newEntityIterator(android.database.Cursor p0) { return null; }

        private static class EntityIteratorImpl extends android.content.CursorEntityIterator {
            public EntityIteratorImpl(android.database.Cursor p0) { super(null); }
            public android.content.Entity getEntityAndIncrementCursor(android.database.Cursor p0) throws android.os.RemoteException { return null; }
        }
    }

    public static final class CalendarMetaData implements android.provider.CalendarContract.CalendarMetaDataColumns, android.provider.BaseColumns {
    }

    protected static interface CalendarMetaDataColumns {
        public static final java.lang.String LOCAL_TIMEZONE = "localTimezone";
        public static final java.lang.String MIN_INSTANCE = "minInstance";
        public static final java.lang.String MAX_INSTANCE = "maxInstance";
        public static final java.lang.String MIN_EVENTDAYS = "minEventDays";
        public static final java.lang.String MAX_EVENTDAYS = "maxEventDays";
    }

    protected static interface CalendarSyncColumns {
        public static final java.lang.String CAL_SYNC1 = "cal_sync1";
        public static final java.lang.String CAL_SYNC2 = "cal_sync2";
        public static final java.lang.String CAL_SYNC3 = "cal_sync3";
        public static final java.lang.String CAL_SYNC4 = "cal_sync4";
        public static final java.lang.String CAL_SYNC5 = "cal_sync5";
        public static final java.lang.String CAL_SYNC6 = "cal_sync6";
        public static final java.lang.String CAL_SYNC7 = "cal_sync7";
        public static final java.lang.String CAL_SYNC8 = "cal_sync8";
        public static final java.lang.String CAL_SYNC9 = "cal_sync9";
        public static final java.lang.String CAL_SYNC10 = "cal_sync10";
    }

    public static final class Calendars implements android.provider.BaseColumns, android.provider.CalendarContract.SyncColumns, android.provider.CalendarContract.CalendarColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri ENTERPRISE_CONTENT_URI = null;
        public static final java.lang.String DEFAULT_SORT_ORDER = "calendar_displayName";
        public static final java.lang.String NAME = "name";
        public static final java.lang.String CALENDAR_LOCATION = "calendar_location";
        public static final java.lang.String[] SYNC_WRITABLE_COLUMNS = null;
    }

    public static final class Colors implements android.provider.CalendarContract.ColorsColumns {
        public static final java.lang.String TABLE_NAME = "Colors";
        public static final android.net.Uri CONTENT_URI = null;
    }

    protected static interface ColorsColumns extends android.provider.SyncStateContract.Columns {
        public static final java.lang.String COLOR_TYPE = "color_type";
        public static final int TYPE_CALENDAR = 0;
        public static final int TYPE_EVENT = 1;
        public static final java.lang.String COLOR_KEY = "color_index";
        public static final java.lang.String COLOR = "color";
    }

    public static final class EventDays implements android.provider.CalendarContract.EventDaysColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.database.Cursor query(android.content.ContentResolver p0, int p1, int p2, java.lang.String[] p3) { return null; }
    }

    protected static interface EventDaysColumns {
        public static final java.lang.String STARTDAY = "startDay";
        public static final java.lang.String ENDDAY = "endDay";
    }

    public static final class Events implements android.provider.BaseColumns, android.provider.CalendarContract.SyncColumns, android.provider.CalendarContract.EventsColumns, android.provider.CalendarContract.CalendarColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri ENTERPRISE_CONTENT_URI = null;
        public static final android.net.Uri CONTENT_EXCEPTION_URI = null;
        public static java.lang.String[] PROVIDER_WRITABLE_COLUMNS;
        public static final java.lang.String[] SYNC_WRITABLE_COLUMNS = null;
    }

    protected static interface EventsColumns {
        public static final java.lang.String CALENDAR_ID = "calendar_id";
        public static final java.lang.String TITLE = "title";
        public static final java.lang.String DESCRIPTION = "description";
        public static final java.lang.String EVENT_LOCATION = "eventLocation";
        public static final java.lang.String EVENT_COLOR = "eventColor";
        public static final java.lang.String EVENT_COLOR_KEY = "eventColor_index";
        public static final java.lang.String DISPLAY_COLOR = "displayColor";
        public static final java.lang.String STATUS = "eventStatus";
        public static final int STATUS_TENTATIVE = 0;
        public static final int STATUS_CONFIRMED = 1;
        public static final int STATUS_CANCELED = 2;
        public static final java.lang.String SELF_ATTENDEE_STATUS = "selfAttendeeStatus";
        public static final java.lang.String SYNC_DATA1 = "sync_data1";
        public static final java.lang.String SYNC_DATA2 = "sync_data2";
        public static final java.lang.String SYNC_DATA3 = "sync_data3";
        public static final java.lang.String SYNC_DATA4 = "sync_data4";
        public static final java.lang.String SYNC_DATA5 = "sync_data5";
        public static final java.lang.String SYNC_DATA6 = "sync_data6";
        public static final java.lang.String SYNC_DATA7 = "sync_data7";
        public static final java.lang.String SYNC_DATA8 = "sync_data8";
        public static final java.lang.String SYNC_DATA9 = "sync_data9";
        public static final java.lang.String SYNC_DATA10 = "sync_data10";
        public static final java.lang.String LAST_SYNCED = "lastSynced";
        public static final java.lang.String DTSTART = "dtstart";
        public static final java.lang.String DTEND = "dtend";
        public static final java.lang.String DURATION = "duration";
        public static final java.lang.String EVENT_TIMEZONE = "eventTimezone";
        public static final java.lang.String EVENT_END_TIMEZONE = "eventEndTimezone";
        public static final java.lang.String ALL_DAY = "allDay";
        public static final java.lang.String ACCESS_LEVEL = "accessLevel";
        public static final int ACCESS_DEFAULT = 0;
        public static final int ACCESS_CONFIDENTIAL = 1;
        public static final int ACCESS_PRIVATE = 2;
        public static final int ACCESS_PUBLIC = 3;
        public static final java.lang.String AVAILABILITY = "availability";
        public static final int AVAILABILITY_BUSY = 0;
        public static final int AVAILABILITY_FREE = 1;
        public static final int AVAILABILITY_TENTATIVE = 2;
        public static final java.lang.String HAS_ALARM = "hasAlarm";
        public static final java.lang.String HAS_EXTENDED_PROPERTIES = "hasExtendedProperties";
        public static final java.lang.String RRULE = "rrule";
        public static final java.lang.String RDATE = "rdate";
        public static final java.lang.String EXRULE = "exrule";
        public static final java.lang.String EXDATE = "exdate";
        public static final java.lang.String ORIGINAL_ID = "original_id";
        public static final java.lang.String ORIGINAL_SYNC_ID = "original_sync_id";
        public static final java.lang.String ORIGINAL_INSTANCE_TIME = "originalInstanceTime";
        public static final java.lang.String ORIGINAL_ALL_DAY = "originalAllDay";
        public static final java.lang.String LAST_DATE = "lastDate";
        public static final java.lang.String HAS_ATTENDEE_DATA = "hasAttendeeData";
        public static final java.lang.String GUESTS_CAN_MODIFY = "guestsCanModify";
        public static final java.lang.String GUESTS_CAN_INVITE_OTHERS = "guestsCanInviteOthers";
        public static final java.lang.String GUESTS_CAN_SEE_GUESTS = "guestsCanSeeGuests";
        public static final java.lang.String ORGANIZER = "organizer";
        public static final java.lang.String IS_ORGANIZER = "isOrganizer";
        public static final java.lang.String CAN_INVITE_OTHERS = "canInviteOthers";
        public static final java.lang.String CUSTOM_APP_PACKAGE = "customAppPackage";
        public static final java.lang.String CUSTOM_APP_URI = "customAppUri";
        public static final java.lang.String UID_2445 = "uid2445";
    }

    public static final class EventsEntity implements android.provider.BaseColumns, android.provider.CalendarContract.SyncColumns, android.provider.CalendarContract.EventsColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static android.content.EntityIterator newEntityIterator(android.database.Cursor p0, android.content.ContentResolver p1) { return null; }
        public static android.content.EntityIterator newEntityIterator(android.database.Cursor p0, android.content.ContentProviderClient p1) { return null; }

        private static class EntityIteratorImpl extends android.content.CursorEntityIterator {
            public EntityIteratorImpl(android.database.Cursor p0, android.content.ContentResolver p1) { super(null); }
            public EntityIteratorImpl(android.database.Cursor p0, android.content.ContentProviderClient p1) { super(null); }
            public android.content.Entity getEntityAndIncrementCursor(android.database.Cursor p0) throws android.os.RemoteException { return null; }
        }
    }

    public static final class EventsRawTimes implements android.provider.BaseColumns, android.provider.CalendarContract.EventsRawTimesColumns {
    }

    protected static interface EventsRawTimesColumns {
        public static final java.lang.String EVENT_ID = "event_id";
        public static final java.lang.String DTSTART_2445 = "dtstart2445";
        public static final java.lang.String DTEND_2445 = "dtend2445";
        public static final java.lang.String ORIGINAL_INSTANCE_TIME_2445 = "originalInstanceTime2445";
        public static final java.lang.String LAST_DATE_2445 = "lastDate2445";
    }

    public static final class ExtendedProperties implements android.provider.BaseColumns, android.provider.CalendarContract.ExtendedPropertiesColumns, android.provider.CalendarContract.EventsColumns {
        public static final android.net.Uri CONTENT_URI = null;
    }

    protected static interface ExtendedPropertiesColumns {
        public static final java.lang.String EVENT_ID = "event_id";
        public static final java.lang.String NAME = "name";
        public static final java.lang.String VALUE = "value";
    }

    public static final class Instances implements android.provider.BaseColumns, android.provider.CalendarContract.EventsColumns, android.provider.CalendarContract.CalendarColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri CONTENT_BY_DAY_URI = null;
        public static final android.net.Uri CONTENT_SEARCH_URI = null;
        public static final android.net.Uri CONTENT_SEARCH_BY_DAY_URI = null;
        public static final android.net.Uri ENTERPRISE_CONTENT_URI = null;
        public static final android.net.Uri ENTERPRISE_CONTENT_BY_DAY_URI = null;
        public static final android.net.Uri ENTERPRISE_CONTENT_SEARCH_URI = null;
        public static final android.net.Uri ENTERPRISE_CONTENT_SEARCH_BY_DAY_URI = null;
        public static final java.lang.String BEGIN = "begin";
        public static final java.lang.String END = "end";
        public static final java.lang.String EVENT_ID = "event_id";
        public static final java.lang.String START_DAY = "startDay";
        public static final java.lang.String END_DAY = "endDay";
        public static final java.lang.String START_MINUTE = "startMinute";
        public static final java.lang.String END_MINUTE = "endMinute";
        public static final android.database.Cursor query(android.content.ContentResolver p0, java.lang.String[] p1, long p2, long p3) { return null; }
        public static final android.database.Cursor query(android.content.ContentResolver p0, java.lang.String[] p1, long p2, long p3, java.lang.String p4) { return null; }
    }

    public static final class Reminders implements android.provider.BaseColumns, android.provider.CalendarContract.RemindersColumns, android.provider.CalendarContract.EventsColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.database.Cursor query(android.content.ContentResolver p0, long p1, java.lang.String[] p2) { return null; }
    }

    protected static interface RemindersColumns {
        public static final java.lang.String EVENT_ID = "event_id";
        public static final java.lang.String MINUTES = "minutes";
        public static final int MINUTES_DEFAULT = -1;
        public static final java.lang.String METHOD = "method";
        public static final int METHOD_DEFAULT = 0;
        public static final int METHOD_ALERT = 1;
        public static final int METHOD_EMAIL = 2;
        public static final int METHOD_SMS = 3;
        public static final int METHOD_ALARM = 4;
    }

    protected static interface SyncColumns extends android.provider.CalendarContract.CalendarSyncColumns {
        public static final java.lang.String ACCOUNT_NAME = "account_name";
        public static final java.lang.String ACCOUNT_TYPE = "account_type";
        public static final java.lang.String _SYNC_ID = "_sync_id";
        public static final java.lang.String DIRTY = "dirty";
        public static final java.lang.String MUTATORS = "mutators";
        public static final java.lang.String DELETED = "deleted";
        public static final java.lang.String CAN_PARTIALLY_UPDATE = "canPartiallyUpdate";
    }

    public static final class SyncState implements android.provider.SyncStateContract.Columns {
        public static final android.net.Uri CONTENT_URI = null;
    }
}
