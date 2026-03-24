package android.provider;

public final class Telephony {
    private static final java.lang.String TAG = "Telephony";
    private Telephony() {}

    public static interface ThreadsColumns extends android.provider.BaseColumns {
        public static final java.lang.String DATE = "date";
        public static final java.lang.String RECIPIENT_IDS = "recipient_ids";
        public static final java.lang.String MESSAGE_COUNT = "message_count";
        public static final java.lang.String READ = "read";
        public static final java.lang.String SNIPPET = "snippet";
        public static final java.lang.String SNIPPET_CHARSET = "snippet_cs";
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String ERROR = "error";
        public static final java.lang.String HAS_ATTACHMENT = "has_attachment";
        public static final java.lang.String ARCHIVED = "archived";
    }

    public static final class Threads implements android.provider.Telephony.ThreadsColumns {
        @android.annotation.UnsupportedAppUsage
        private static final java.lang.String[] ID_PROJECTION = null;
        @android.annotation.UnsupportedAppUsage
        private static final android.net.Uri THREAD_ID_CONTENT_URI = null;
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri OBSOLETE_THREADS_URI = null;
        public static final int COMMON_THREAD = 0;
        public static final int BROADCAST_THREAD = 1;
        private Threads() {}
        public static long getOrCreateThreadId(android.content.Context p0, java.lang.String p1) { return 0L; }
        public static long getOrCreateThreadId(android.content.Context p0, java.util.Set<java.lang.String> p1) { return 0L; }
    }

    public static interface TextBasedSmsColumns {
        public static final int MESSAGE_TYPE_ALL = 0;
        public static final int MESSAGE_TYPE_INBOX = 1;
        public static final int MESSAGE_TYPE_SENT = 2;
        public static final int MESSAGE_TYPE_DRAFT = 3;
        public static final int MESSAGE_TYPE_OUTBOX = 4;
        public static final int MESSAGE_TYPE_FAILED = 5;
        public static final int MESSAGE_TYPE_QUEUED = 6;
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String THREAD_ID = "thread_id";
        public static final java.lang.String ADDRESS = "address";
        public static final java.lang.String DATE = "date";
        public static final java.lang.String DATE_SENT = "date_sent";
        public static final java.lang.String READ = "read";
        public static final java.lang.String SEEN = "seen";
        public static final java.lang.String STATUS = "status";
        public static final int STATUS_NONE = -1;
        public static final int STATUS_COMPLETE = 0;
        public static final int STATUS_PENDING = 32;
        public static final int STATUS_FAILED = 64;
        public static final java.lang.String SUBJECT = "subject";
        public static final java.lang.String BODY = "body";
        public static final java.lang.String PERSON = "person";
        public static final java.lang.String PROTOCOL = "protocol";
        public static final java.lang.String REPLY_PATH_PRESENT = "reply_path_present";
        public static final java.lang.String SERVICE_CENTER = "service_center";
        public static final java.lang.String LOCKED = "locked";
        public static final java.lang.String SUBSCRIPTION_ID = "sub_id";
        public static final java.lang.String MTU = "mtu";
        public static final java.lang.String ERROR_CODE = "error_code";
        public static final java.lang.String CREATOR = "creator";
    }

    public static interface TextBasedSmsChangesColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String ID = "_id";
        public static final java.lang.String ORIG_ROW_ID = "orig_rowid";
        public static final java.lang.String SUB_ID = "sub_id";
        public static final java.lang.String TYPE = "type";
        public static final int TYPE_UPDATE = 0;
        public static final int TYPE_DELETE = 1;
        public static final java.lang.String NEW_READ_STATUS = "new_read_status";
    }

    public static final class Sms implements android.provider.BaseColumns, android.provider.Telephony.TextBasedSmsColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
        private Sms() {}
        public static java.lang.String getDefaultSmsPackage(android.content.Context p0) { return null; }
        public static android.database.Cursor query(android.content.ContentResolver p0, java.lang.String[] p1) { return null; }
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public static android.database.Cursor query(android.content.ContentResolver p0, java.lang.String[] p1, java.lang.String p2, java.lang.String p3) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static android.net.Uri addMessageToUri(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Long p5, boolean p6, boolean p7) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static android.net.Uri addMessageToUri(int p0, android.content.ContentResolver p1, android.net.Uri p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.Long p6, boolean p7, boolean p8) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static android.net.Uri addMessageToUri(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Long p5, boolean p6, boolean p7, long p8) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static android.net.Uri addMessageToUri(int p0, android.content.ContentResolver p1, android.net.Uri p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.Long p6, boolean p7, boolean p8, long p9) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static boolean moveMessageToFolder(android.content.Context p0, android.net.Uri p1, int p2, int p3) { return false; }
        @android.annotation.UnsupportedAppUsage
        public static boolean isOutgoingFolder(int p0) { return false; }

        public static final class Sent implements android.provider.BaseColumns, android.provider.Telephony.TextBasedSmsColumns {
            public static final android.net.Uri CONTENT_URI = null;
            public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
            private Sent() {}
            @android.annotation.UnsupportedAppUsage
            public static android.net.Uri addMessage(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.Long p4) { return null; }
            @android.annotation.UnsupportedAppUsage
            public static android.net.Uri addMessage(int p0, android.content.ContentResolver p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Long p5) { return null; }
        }

        public static final class Outbox implements android.provider.BaseColumns, android.provider.Telephony.TextBasedSmsColumns {
            public static final android.net.Uri CONTENT_URI = null;
            public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
            private Outbox() {}
            @android.annotation.UnsupportedAppUsage
            public static android.net.Uri addMessage(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.Long p4, boolean p5, long p6) { return null; }
            public static android.net.Uri addMessage(int p0, android.content.ContentResolver p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Long p5, boolean p6, long p7) { return null; }
        }

        public static final class Intents {
            public static final int RESULT_SMS_HANDLED = 1;
            public static final int RESULT_SMS_GENERIC_ERROR = 2;
            public static final int RESULT_SMS_OUT_OF_MEMORY = 3;
            public static final int RESULT_SMS_UNSUPPORTED = 4;
            public static final int RESULT_SMS_DUPLICATED = 5;
            public static final java.lang.String ACTION_CHANGE_DEFAULT = "android.provider.Telephony.ACTION_CHANGE_DEFAULT";
            public static final java.lang.String EXTRA_PACKAGE_NAME = "package";
            public static final java.lang.String SMS_DELIVER_ACTION = "android.provider.Telephony.SMS_DELIVER";
            public static final java.lang.String SMS_RECEIVED_ACTION = "android.provider.Telephony.SMS_RECEIVED";
            public static final java.lang.String DATA_SMS_RECEIVED_ACTION = "android.intent.action.DATA_SMS_RECEIVED";
            public static final java.lang.String WAP_PUSH_DELIVER_ACTION = "android.provider.Telephony.WAP_PUSH_DELIVER";
            public static final java.lang.String WAP_PUSH_RECEIVED_ACTION = "android.provider.Telephony.WAP_PUSH_RECEIVED";
            public static final java.lang.String SMS_CB_RECEIVED_ACTION = "android.provider.Telephony.SMS_CB_RECEIVED";
            public static final java.lang.String SMS_CARRIER_PROVISION_ACTION = "android.provider.Telephony.SMS_CARRIER_PROVISION";
            public static final java.lang.String SMS_EMERGENCY_CB_RECEIVED_ACTION = "android.provider.Telephony.SMS_EMERGENCY_CB_RECEIVED";
            public static final java.lang.String SMS_SERVICE_CATEGORY_PROGRAM_DATA_RECEIVED_ACTION = "android.provider.Telephony.SMS_SERVICE_CATEGORY_PROGRAM_DATA_RECEIVED";
            public static final java.lang.String SIM_FULL_ACTION = "android.provider.Telephony.SIM_FULL";
            public static final java.lang.String SMS_REJECTED_ACTION = "android.provider.Telephony.SMS_REJECTED";
            public static final java.lang.String MMS_DOWNLOADED_ACTION = "android.provider.Telephony.MMS_DOWNLOADED";
            @java.lang.Deprecated
            public static final java.lang.String SECRET_CODE_ACTION = "android.provider.Telephony.SECRET_CODE";
            public static final java.lang.String ACTION_DEFAULT_SMS_PACKAGE_CHANGED = "android.provider.action.DEFAULT_SMS_PACKAGE_CHANGED";
            public static final java.lang.String EXTRA_IS_DEFAULT_SMS_APP = "android.provider.extra.IS_DEFAULT_SMS_APP";
            public static final java.lang.String ACTION_EXTERNAL_PROVIDER_CHANGE = "android.provider.action.EXTERNAL_PROVIDER_CHANGE";
            public static final java.lang.String ACTION_DEFAULT_SMS_PACKAGE_CHANGED_INTERNAL = "android.provider.action.DEFAULT_SMS_PACKAGE_CHANGED_INTERNAL";
            public static final java.lang.String ACTION_SMS_MMS_DB_CREATED = "android.provider.action.SMS_MMS_DB_CREATED";
            public static final java.lang.String EXTRA_IS_INITIAL_CREATE = "android.provider.extra.IS_INITIAL_CREATE";
            public static final java.lang.String ACTION_SMS_MMS_DB_LOST = "android.provider.action.SMS_MMS_DB_LOST";
            public static final java.lang.String EXTRA_IS_CORRUPTED = "android.provider.extra.IS_CORRUPTED";
            private Intents() {}
            public static android.telephony.SmsMessage[] getMessagesFromIntent(android.content.Intent p0) { return null; }
        }

        public static final class Inbox implements android.provider.BaseColumns, android.provider.Telephony.TextBasedSmsColumns {
            public static final android.net.Uri CONTENT_URI = null;
            public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
            private Inbox() {}
            @android.annotation.UnsupportedAppUsage
            public static android.net.Uri addMessage(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.Long p4, boolean p5) { return null; }
            @android.annotation.UnsupportedAppUsage
            public static android.net.Uri addMessage(int p0, android.content.ContentResolver p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Long p5, boolean p6) { return null; }
        }

        public static final class Draft implements android.provider.BaseColumns, android.provider.Telephony.TextBasedSmsColumns {
            public static final android.net.Uri CONTENT_URI = null;
            public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
            private Draft() {}
            @android.annotation.UnsupportedAppUsage
            public static android.net.Uri addMessage(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.Long p4) { return null; }
            @android.annotation.UnsupportedAppUsage
            public static android.net.Uri addMessage(int p0, android.content.ContentResolver p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Long p5) { return null; }
        }

        public static final class Conversations implements android.provider.BaseColumns, android.provider.Telephony.TextBasedSmsColumns {
            public static final android.net.Uri CONTENT_URI = null;
            public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
            public static final java.lang.String SNIPPET = "snippet";
            public static final java.lang.String MESSAGE_COUNT = "msg_count";
            private Conversations() {}
        }
    }

    public static final class ServiceStateTable {
        public static final java.lang.String AUTHORITY = "service-state";
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String SERVICE_STATE = "service_state";
        public static final java.lang.String VOICE_REG_STATE = "voice_reg_state";
        public static final java.lang.String DATA_REG_STATE = "data_reg_state";
        public static final java.lang.String VOICE_ROAMING_TYPE = "voice_roaming_type";
        public static final java.lang.String DATA_ROAMING_TYPE = "data_roaming_type";
        public static final java.lang.String VOICE_OPERATOR_ALPHA_LONG = "voice_operator_alpha_long";
        public static final java.lang.String VOICE_OPERATOR_ALPHA_SHORT = "voice_operator_alpha_short";
        public static final java.lang.String VOICE_OPERATOR_NUMERIC = "voice_operator_numeric";
        public static final java.lang.String DATA_OPERATOR_ALPHA_LONG = "data_operator_alpha_long";
        public static final java.lang.String DATA_OPERATOR_ALPHA_SHORT = "data_operator_alpha_short";
        public static final java.lang.String DATA_OPERATOR_NUMERIC = "data_operator_numeric";
        public static final java.lang.String IS_MANUAL_NETWORK_SELECTION = "is_manual_network_selection";
        public static final java.lang.String RIL_VOICE_RADIO_TECHNOLOGY = "ril_voice_radio_technology";
        public static final java.lang.String RIL_DATA_RADIO_TECHNOLOGY = "ril_data_radio_technology";
        public static final java.lang.String CSS_INDICATOR = "css_indicator";
        public static final java.lang.String NETWORK_ID = "network_id";
        public static final java.lang.String SYSTEM_ID = "system_id";
        public static final java.lang.String CDMA_ROAMING_INDICATOR = "cdma_roaming_indicator";
        public static final java.lang.String CDMA_DEFAULT_ROAMING_INDICATOR = "cdma_default_roaming_indicator";
        public static final java.lang.String CDMA_ERI_ICON_INDEX = "cdma_eri_icon_index";
        public static final java.lang.String CDMA_ERI_ICON_MODE = "cdma_eri_icon_mode";
        public static final java.lang.String IS_EMERGENCY_ONLY = "is_emergency_only";
        public static final java.lang.String IS_DATA_ROAMING_FROM_REGISTRATION = "is_data_roaming_from_registration";
        public static final java.lang.String IS_USING_CARRIER_AGGREGATION = "is_using_carrier_aggregation";
        public static final java.lang.String OPERATOR_ALPHA_LONG_RAW = "operator_alpha_long_raw";
        public static final java.lang.String OPERATOR_ALPHA_SHORT_RAW = "operator_alpha_short_raw";
        private ServiceStateTable() {}
        public static android.net.Uri getUriForSubscriptionIdAndField(int p0, java.lang.String p1) { return null; }
        public static android.net.Uri getUriForSubscriptionId(int p0) { return null; }
        public static android.content.ContentValues getContentValuesForServiceState(android.telephony.ServiceState p0) { return null; }
    }

    public static interface RcsColumns {
        public static final boolean IS_RCS_TABLE_SCHEMA_CODE_COMPLETE = false;
        public static final java.lang.String AUTHORITY = "rcs";
        public static final android.net.Uri CONTENT_AND_AUTHORITY = null;
        public static final int TRANSACTION_FAILED = -2147483648;
        public static final long TIMESTAMP_NOT_SET = 0L;

        public static interface RcsUnifiedThreadColumns extends android.provider.Telephony.RcsColumns.RcsThreadColumns, android.provider.Telephony.RcsColumns.Rcs1To1ThreadColumns, android.provider.Telephony.RcsColumns.RcsGroupThreadColumns {
            public static final java.lang.String THREAD_TYPE_COLUMN = "thread_type";
            public static final int THREAD_TYPE_1_TO_1 = 0;
            public static final int THREAD_TYPE_GROUP = 1;
        }

        public static interface RcsUnifiedMessageColumns extends android.provider.Telephony.RcsColumns.RcsIncomingMessageColumns, android.provider.Telephony.RcsColumns.RcsOutgoingMessageColumns {
            public static final java.lang.String UNIFIED_MESSAGE_URI_PART = "message";
            public static final android.net.Uri UNIFIED_MESSAGE_URI = null;
            public static final java.lang.String UNIFIED_INCOMING_MESSAGE_VIEW = "unified_incoming_message_view";
            public static final java.lang.String UNIFIED_OUTGOING_MESSAGE_VIEW = "unified_outgoing_message_view";
            public static final java.lang.String MESSAGE_TYPE_COLUMN = "message_type";
            public static final int MESSAGE_TYPE_INCOMING = 1;
            public static final int MESSAGE_TYPE_OUTGOING = 0;
        }

        public static interface RcsUnifiedEventHelper extends android.provider.Telephony.RcsColumns.RcsParticipantEventColumns, android.provider.Telephony.RcsColumns.RcsThreadEventColumns {
            public static final java.lang.String RCS_EVENT_QUERY_URI_PATH = "event";
            public static final android.net.Uri RCS_EVENT_QUERY_URI = null;
        }

        public static interface RcsThreadEventColumns {
            public static final java.lang.String PARTICIPANT_JOINED_URI_PART = "participant_joined_event";
            public static final java.lang.String PARTICIPANT_LEFT_URI_PART = "participant_left_event";
            public static final java.lang.String NAME_CHANGED_URI_PART = "name_changed_event";
            public static final java.lang.String ICON_CHANGED_URI_PART = "icon_changed_event";
            public static final java.lang.String EVENT_ID_COLUMN = "event_id";
            public static final java.lang.String EVENT_TYPE_COLUMN = "event_type";
            public static final java.lang.String TIMESTAMP_COLUMN = "origination_timestamp";
            public static final java.lang.String SOURCE_PARTICIPANT_ID_COLUMN = "source_participant";
            public static final java.lang.String DESTINATION_PARTICIPANT_ID_COLUMN = "destination_participant";
            public static final java.lang.String NEW_ICON_URI_COLUMN = "new_icon_uri";
            public static final java.lang.String NEW_NAME_COLUMN = "new_name";
        }

        public static interface RcsThreadColumns {
            public static final java.lang.String RCS_THREAD_URI_PART = "thread";
            public static final android.net.Uri RCS_THREAD_URI = null;
            public static final java.lang.String RCS_THREAD_ID_COLUMN = "rcs_thread_id";
        }

        public static interface RcsParticipantHelpers extends android.provider.Telephony.RcsColumns.RcsParticipantColumns {
            public static final java.lang.String RCS_PARTICIPANT_WITH_ADDRESS_VIEW = "rcs_participant_with_address_view";
            public static final java.lang.String RCS_PARTICIPANT_WITH_THREAD_VIEW = "rcs_participant_with_thread_view";
        }

        public static interface RcsParticipantEventColumns {
            public static final java.lang.String ALIAS_CHANGE_EVENT_URI_PART = "alias_change_event";
            public static final java.lang.String NEW_ALIAS_COLUMN = "new_alias";
        }

        public static interface RcsParticipantColumns {
            public static final java.lang.String RCS_PARTICIPANT_URI_PART = "participant";
            public static final android.net.Uri RCS_PARTICIPANT_URI = null;
            public static final java.lang.String RCS_PARTICIPANT_ID_COLUMN = "rcs_participant_id";
            public static final java.lang.String CANONICAL_ADDRESS_ID_COLUMN = "canonical_address_id";
            public static final java.lang.String RCS_ALIAS_COLUMN = "rcs_alias";
        }

        public static interface RcsOutgoingMessageColumns extends android.provider.Telephony.RcsColumns.RcsMessageColumns {
            public static final java.lang.String OUTGOING_MESSAGE_URI_PART = "outgoing_message";
            public static final android.net.Uri OUTGOING_MESSAGE_URI = null;
        }

        public static interface RcsMessageDeliveryColumns extends android.provider.Telephony.RcsColumns.RcsOutgoingMessageColumns {
            public static final java.lang.String DELIVERY_URI_PART = "delivery";
            public static final java.lang.String DELIVERED_TIMESTAMP_COLUMN = "delivered_timestamp";
            public static final java.lang.String SEEN_TIMESTAMP_COLUMN = "seen_timestamp";
        }

        public static interface RcsMessageColumns {
            public static final java.lang.String MESSAGE_TYPE_COLUMN = "rcs_message_type";
            public static final java.lang.String MESSAGE_ID_COLUMN = "rcs_message_row_id";
            public static final java.lang.String GLOBAL_ID_COLUMN = "rcs_message_global_id";
            public static final java.lang.String SUB_ID_COLUMN = "sub_id";
            public static final java.lang.String STATUS_COLUMN = "status";
            public static final java.lang.String ORIGINATION_TIMESTAMP_COLUMN = "origination_timestamp";
            public static final java.lang.String MESSAGE_TEXT_COLUMN = "rcs_text";
            public static final java.lang.String LATITUDE_COLUMN = "latitude";
            public static final java.lang.String LONGITUDE_COLUMN = "longitude";
        }

        public static interface RcsIncomingMessageColumns extends android.provider.Telephony.RcsColumns.RcsMessageColumns {
            public static final java.lang.String INCOMING_MESSAGE_URI_PART = "incoming_message";
            public static final android.net.Uri INCOMING_MESSAGE_URI = null;
            public static final java.lang.String SENDER_PARTICIPANT_ID_COLUMN = "sender_participant";
            public static final java.lang.String ARRIVAL_TIMESTAMP_COLUMN = "arrival_timestamp";
            public static final java.lang.String SEEN_TIMESTAMP_COLUMN = "seen_timestamp";
        }

        public static interface RcsGroupThreadColumns extends android.provider.Telephony.RcsColumns.RcsThreadColumns {
            public static final java.lang.String RCS_GROUP_THREAD_URI_PART = "group_thread";
            public static final android.net.Uri RCS_GROUP_THREAD_URI = null;
            public static final java.lang.String OWNER_PARTICIPANT_COLUMN = "owner_participant";
            public static final java.lang.String GROUP_NAME_COLUMN = "group_name";
            public static final java.lang.String GROUP_ICON_COLUMN = "group_icon";
            public static final java.lang.String CONFERENCE_URI_COLUMN = "conference_uri";
        }

        public static interface RcsFileTransferColumns {
            public static final java.lang.String FILE_TRANSFER_URI_PART = "file_transfer";
            public static final android.net.Uri FILE_TRANSFER_URI = null;
            public static final java.lang.String FILE_TRANSFER_ID_COLUMN = "rcs_file_transfer_id";
            public static final java.lang.String SESSION_ID_COLUMN = "session_id";
            public static final java.lang.String CONTENT_URI_COLUMN = "content_uri";
            public static final java.lang.String CONTENT_TYPE_COLUMN = "content_type";
            public static final java.lang.String FILE_SIZE_COLUMN = "file_size";
            public static final java.lang.String SUCCESSFULLY_TRANSFERRED_BYTES = "transfer_offset";
            public static final java.lang.String TRANSFER_STATUS_COLUMN = "transfer_status";
            public static final java.lang.String WIDTH_COLUMN = "width";
            public static final java.lang.String HEIGHT_COLUMN = "height";
            public static final java.lang.String DURATION_MILLIS_COLUMN = "duration";
            public static final java.lang.String PREVIEW_URI_COLUMN = "preview_uri";
            public static final java.lang.String PREVIEW_TYPE_COLUMN = "preview_type";
        }

        public static interface RcsEventTypes {
            public static final int PARTICIPANT_ALIAS_CHANGED_EVENT_TYPE = 1;
            public static final int PARTICIPANT_JOINED_EVENT_TYPE = 2;
            public static final int PARTICIPANT_LEFT_EVENT_TYPE = 4;
            public static final int ICON_CHANGED_EVENT_TYPE = 8;
            public static final int NAME_CHANGED_EVENT_TYPE = 16;
        }

        public static interface RcsCanonicalAddressHelper {
            public static long getOrCreateCanonicalAddressId(android.content.ContentResolver p0, java.lang.String p1) { return 0L; }
        }

        public static interface Rcs1To1ThreadColumns extends android.provider.Telephony.RcsColumns.RcsThreadColumns {
            public static final java.lang.String RCS_1_TO_1_THREAD_URI_PART = "p2p_thread";
            public static final android.net.Uri RCS_1_TO_1_THREAD_URI = null;
            public static final java.lang.String FALLBACK_THREAD_ID_COLUMN = "rcs_fallback_thread_id";
        }
    }

    public static final class MmsSms implements android.provider.BaseColumns {
        public static final java.lang.String TYPE_DISCRIMINATOR_COLUMN = "transport_type";
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri CONTENT_CONVERSATIONS_URI = null;
        public static final android.net.Uri CONTENT_FILTER_BYPHONE_URI = null;
        public static final android.net.Uri CONTENT_UNDELIVERED_URI = null;
        public static final android.net.Uri CONTENT_DRAFT_URI = null;
        public static final android.net.Uri CONTENT_LOCKED_URI = null;
        public static final android.net.Uri SEARCH_URI = null;
        public static final int SMS_PROTO = 0;
        public static final int MMS_PROTO = 1;
        public static final int NO_ERROR = 0;
        public static final int ERR_TYPE_GENERIC = 1;
        public static final int ERR_TYPE_SMS_PROTO_TRANSIENT = 2;
        public static final int ERR_TYPE_MMS_PROTO_TRANSIENT = 3;
        public static final int ERR_TYPE_TRANSPORT_FAILURE = 4;
        public static final int ERR_TYPE_GENERIC_PERMANENT = 10;
        public static final int ERR_TYPE_SMS_PROTO_PERMANENT = 11;
        public static final int ERR_TYPE_MMS_PROTO_PERMANENT = 12;
        private MmsSms() {}

        public static final class WordsTable {
            public static final java.lang.String ID = "_id";
            public static final java.lang.String SOURCE_ROW_ID = "source_id";
            public static final java.lang.String TABLE_ID = "table_to_use";
            public static final java.lang.String INDEXED_TEXT = "index_text";
            private WordsTable() {}
        }

        public static final class PendingMessages implements android.provider.BaseColumns {
            public static final android.net.Uri CONTENT_URI = null;
            public static final java.lang.String PROTO_TYPE = "proto_type";
            public static final java.lang.String MSG_ID = "msg_id";
            public static final java.lang.String MSG_TYPE = "msg_type";
            public static final java.lang.String ERROR_TYPE = "err_type";
            public static final java.lang.String ERROR_CODE = "err_code";
            public static final java.lang.String RETRY_INDEX = "retry_index";
            public static final java.lang.String DUE_TIME = "due_time";
            public static final java.lang.String LAST_TRY = "last_try";
            public static final java.lang.String SUBSCRIPTION_ID = "pending_sub_id";
            private PendingMessages() {}
        }
    }

    public static final class Mms implements android.provider.Telephony.BaseMmsColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri REPORT_REQUEST_URI = null;
        public static final android.net.Uri REPORT_STATUS_URI = null;
        public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
        @android.annotation.UnsupportedAppUsage
        public static final java.util.regex.Pattern NAME_ADDR_EMAIL_PATTERN = null;
        private Mms() {}
        public static android.database.Cursor query(android.content.ContentResolver p0, java.lang.String[] p1) { return null; }
        public static android.database.Cursor query(android.content.ContentResolver p0, java.lang.String[] p1, java.lang.String p2, java.lang.String p3) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static java.lang.String extractAddrSpec(java.lang.String p0) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static boolean isEmailAddress(java.lang.String p0) { return false; }
        @android.annotation.UnsupportedAppUsage
        public static boolean isPhoneNumber(java.lang.String p0) { return false; }

        public static final class Sent implements android.provider.Telephony.BaseMmsColumns {
            public static final android.net.Uri CONTENT_URI = null;
            public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
            private Sent() {}
        }

        public static final class Rate {
            public static final android.net.Uri CONTENT_URI = null;
            public static final java.lang.String SENT_TIME = "sent_time";
            private Rate() {}
        }

        public static final class Part implements android.provider.BaseColumns {
            public static final android.net.Uri CONTENT_URI = null;
            public static final java.lang.String MSG_ID = "mid";
            public static final java.lang.String SEQ = "seq";
            public static final java.lang.String CONTENT_TYPE = "ct";
            public static final java.lang.String NAME = "name";
            public static final java.lang.String CHARSET = "chset";
            public static final java.lang.String FILENAME = "fn";
            public static final java.lang.String CONTENT_DISPOSITION = "cd";
            public static final java.lang.String CONTENT_ID = "cid";
            public static final java.lang.String CONTENT_LOCATION = "cl";
            public static final java.lang.String CT_START = "ctt_s";
            public static final java.lang.String CT_TYPE = "ctt_t";
            public static final java.lang.String _DATA = "_data";
            public static final java.lang.String TEXT = "text";
            private Part() {}
        }

        public static final class Outbox implements android.provider.Telephony.BaseMmsColumns {
            public static final android.net.Uri CONTENT_URI = null;
            public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
            private Outbox() {}
        }

        public static final class Intents {
            public static final java.lang.String CONTENT_CHANGED_ACTION = "android.intent.action.CONTENT_CHANGED";
            public static final java.lang.String DELETED_CONTENTS = "deleted_contents";
            private Intents() {}
        }

        public static final class Inbox implements android.provider.Telephony.BaseMmsColumns {
            public static final android.net.Uri CONTENT_URI = null;
            public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
            private Inbox() {}
        }

        public static final class Draft implements android.provider.Telephony.BaseMmsColumns {
            public static final android.net.Uri CONTENT_URI = null;
            public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
            private Draft() {}
        }

        public static final class Addr implements android.provider.BaseColumns {
            public static final java.lang.String MSG_ID = "msg_id";
            public static final java.lang.String CONTACT_ID = "contact_id";
            public static final java.lang.String ADDRESS = "address";
            public static final java.lang.String TYPE = "type";
            public static final java.lang.String CHARSET = "charset";
            private Addr() {}
        }
    }

    public static final class CellBroadcasts implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String GEOGRAPHICAL_SCOPE = "geo_scope";
        public static final java.lang.String SERIAL_NUMBER = "serial_number";
        public static final java.lang.String PLMN = "plmn";
        public static final java.lang.String LAC = "lac";
        public static final java.lang.String CID = "cid";
        public static final java.lang.String V1_MESSAGE_CODE = "message_code";
        public static final java.lang.String V1_MESSAGE_IDENTIFIER = "message_id";
        public static final java.lang.String SERVICE_CATEGORY = "service_category";
        public static final java.lang.String LANGUAGE_CODE = "language";
        public static final java.lang.String MESSAGE_BODY = "body";
        public static final java.lang.String DELIVERY_TIME = "date";
        public static final java.lang.String MESSAGE_READ = "read";
        public static final java.lang.String MESSAGE_FORMAT = "format";
        public static final java.lang.String MESSAGE_PRIORITY = "priority";
        public static final java.lang.String ETWS_WARNING_TYPE = "etws_warning_type";
        public static final java.lang.String CMAS_MESSAGE_CLASS = "cmas_message_class";
        public static final java.lang.String CMAS_CATEGORY = "cmas_category";
        public static final java.lang.String CMAS_RESPONSE_TYPE = "cmas_response_type";
        public static final java.lang.String CMAS_SEVERITY = "cmas_severity";
        public static final java.lang.String CMAS_URGENCY = "cmas_urgency";
        public static final java.lang.String CMAS_CERTAINTY = "cmas_certainty";
        public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
        public static final java.lang.String[] QUERY_COLUMNS = null;
        private CellBroadcasts() {}
    }

    public static final class Carriers implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri SIM_APN_URI = null;
        public static final android.net.Uri DPC_URI = null;
        public static final android.net.Uri FILTERED_URI = null;
        public static final android.net.Uri ENFORCE_MANAGED_URI = null;
        public static final java.lang.String ENFORCE_KEY = "enforced";
        public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";
        public static final java.lang.String NAME = "name";
        public static final java.lang.String APN = "apn";
        public static final java.lang.String PROXY = "proxy";
        public static final java.lang.String PORT = "port";
        public static final java.lang.String MMSPROXY = "mmsproxy";
        public static final java.lang.String MMSPORT = "mmsport";
        public static final java.lang.String SERVER = "server";
        public static final java.lang.String USER = "user";
        public static final java.lang.String PASSWORD = "password";
        public static final java.lang.String MMSC = "mmsc";
        public static final java.lang.String MCC = "mcc";
        public static final java.lang.String MNC = "mnc";
        public static final java.lang.String NUMERIC = "numeric";
        public static final java.lang.String AUTH_TYPE = "authtype";
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String PROTOCOL = "protocol";
        public static final java.lang.String ROAMING_PROTOCOL = "roaming_protocol";
        public static final java.lang.String CURRENT = "current";
        public static final java.lang.String CARRIER_ENABLED = "carrier_enabled";
        @java.lang.Deprecated
        public static final java.lang.String BEARER = "bearer";
        @java.lang.Deprecated
        public static final java.lang.String BEARER_BITMASK = "bearer_bitmask";
        public static final java.lang.String NETWORK_TYPE_BITMASK = "network_type_bitmask";
        public static final java.lang.String MVNO_TYPE = "mvno_type";
        public static final java.lang.String MVNO_MATCH_DATA = "mvno_match_data";
        public static final java.lang.String SUBSCRIPTION_ID = "sub_id";
        public static final java.lang.String PROFILE_ID = "profile_id";
        @android.annotation.SystemApi
        public static final java.lang.String MODEM_PERSIST = "modem_cognitive";
        @android.annotation.SystemApi
        public static final java.lang.String MAX_CONNECTIONS = "max_conns";
        @android.annotation.SystemApi
        public static final java.lang.String WAIT_TIME_RETRY = "wait_time";
        @android.annotation.SystemApi
        public static final java.lang.String TIME_LIMIT_FOR_MAX_CONNECTIONS = "max_conns_time";
        @android.annotation.SystemApi
        public static final java.lang.String MTU = "mtu";
        @android.annotation.SystemApi
        public static final java.lang.String EDITED_STATUS = "edited";
        @android.annotation.SystemApi
        public static final java.lang.String USER_VISIBLE = "user_visible";
        @android.annotation.SystemApi
        public static final java.lang.String USER_EDITABLE = "user_editable";
        @android.annotation.SystemApi
        public static final int UNEDITED = 0;
        @android.annotation.SystemApi
        public static final int USER_EDITED = 1;
        @android.annotation.SystemApi
        public static final int USER_DELETED = 2;
        public static final int USER_DELETED_BUT_PRESENT_IN_XML = 3;
        @android.annotation.SystemApi
        public static final int CARRIER_EDITED = 4;
        public static final int CARRIER_DELETED = 5;
        public static final int CARRIER_DELETED_BUT_PRESENT_IN_XML = 6;
        public static final java.lang.String OWNED_BY = "owned_by";
        public static final int OWNED_BY_DPC = 0;
        public static final int OWNED_BY_OTHERS = 1;
        @android.annotation.SystemApi
        public static final java.lang.String APN_SET_ID = "apn_set_id";
        @android.annotation.SystemApi
        public static final int NO_APN_SET_ID = 0;
        public static final java.lang.String CARRIER_ID = "carrier_id";
        public static final java.lang.String SKIP_464XLAT = "skip_464xlat";
        public static final int SKIP_464XLAT_DEFAULT = -1;
        public static final int SKIP_464XLAT_DISABLE = 0;
        public static final int SKIP_464XLAT_ENABLE = 1;
        private Carriers() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Skip464XlatStatus {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface EditStatus {
        }
    }

    public static final class CarrierId implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String AUTHORITY = "carrier_id";
        public static final java.lang.String CARRIER_NAME = "carrier_name";
        public static final java.lang.String CARRIER_ID = "carrier_id";
        public static final java.lang.String SPECIFIC_CARRIER_ID = "specific_carrier_id";
        public static final java.lang.String SPECIFIC_CARRIER_ID_NAME = "specific_carrier_id_name";
        public static final java.lang.String PARENT_CARRIER_ID = "parent_carrier_id";
        private CarrierId() {}
        public static android.net.Uri getUriForSubscriptionId(int p0) { return null; }
        public static android.net.Uri getSpecificCarrierIdUriForSubscriptionId(int p0) { return null; }

        public static final class All implements android.provider.BaseColumns {
            public static final java.lang.String MCCMNC = "mccmnc";
            public static final java.lang.String GID1 = "gid1";
            public static final java.lang.String GID2 = "gid2";
            public static final java.lang.String PLMN = "plmn";
            public static final java.lang.String IMSI_PREFIX_XPATTERN = "imsi_prefix_xpattern";
            public static final java.lang.String SPN = "spn";
            public static final java.lang.String APN = "apn";
            public static final java.lang.String ICCID_PREFIX = "iccid_prefix";
            public static final java.lang.String PRIVILEGE_ACCESS_RULE = "privilege_access_rule";
            public static final android.net.Uri CONTENT_URI = null;
            public All() {}
        }
    }

    public static interface CarrierColumns extends android.provider.BaseColumns {
        public static final java.lang.String MCC = "mcc";
        public static final java.lang.String MNC = "mnc";
        public static final java.lang.String KEY_TYPE = "key_type";
        public static final java.lang.String MVNO_TYPE = "mvno_type";
        public static final java.lang.String MVNO_MATCH_DATA = "mvno_match_data";
        public static final java.lang.String PUBLIC_KEY = "public_key";
        public static final java.lang.String KEY_IDENTIFIER = "key_identifier";
        public static final java.lang.String EXPIRATION_TIME = "expiration_time";
        public static final java.lang.String LAST_MODIFIED = "last_modified";
        public static final android.net.Uri CONTENT_URI = null;
    }

    public static interface CanonicalAddressesColumns extends android.provider.BaseColumns {
        public static final java.lang.String ADDRESS = "address";
    }

    public static interface BaseMmsColumns extends android.provider.BaseColumns {
        public static final int MESSAGE_BOX_ALL = 0;
        public static final int MESSAGE_BOX_INBOX = 1;
        public static final int MESSAGE_BOX_SENT = 2;
        public static final int MESSAGE_BOX_DRAFTS = 3;
        public static final int MESSAGE_BOX_OUTBOX = 4;
        public static final int MESSAGE_BOX_FAILED = 5;
        public static final java.lang.String THREAD_ID = "thread_id";
        public static final java.lang.String DATE = "date";
        public static final java.lang.String DATE_SENT = "date_sent";
        public static final java.lang.String MESSAGE_BOX = "msg_box";
        public static final java.lang.String READ = "read";
        public static final java.lang.String SEEN = "seen";
        public static final java.lang.String TEXT_ONLY = "text_only";
        public static final java.lang.String MESSAGE_ID = "m_id";
        public static final java.lang.String SUBJECT = "sub";
        public static final java.lang.String SUBJECT_CHARSET = "sub_cs";
        public static final java.lang.String CONTENT_TYPE = "ct_t";
        public static final java.lang.String CONTENT_LOCATION = "ct_l";
        public static final java.lang.String EXPIRY = "exp";
        public static final java.lang.String MESSAGE_CLASS = "m_cls";
        public static final java.lang.String MESSAGE_TYPE = "m_type";
        public static final java.lang.String MMS_VERSION = "v";
        public static final java.lang.String MESSAGE_SIZE = "m_size";
        public static final java.lang.String PRIORITY = "pri";
        public static final java.lang.String READ_REPORT = "rr";
        public static final java.lang.String REPORT_ALLOWED = "rpt_a";
        public static final java.lang.String RESPONSE_STATUS = "resp_st";
        public static final java.lang.String STATUS = "st";
        public static final java.lang.String TRANSACTION_ID = "tr_id";
        public static final java.lang.String RETRIEVE_STATUS = "retr_st";
        public static final java.lang.String RETRIEVE_TEXT = "retr_txt";
        public static final java.lang.String RETRIEVE_TEXT_CHARSET = "retr_txt_cs";
        public static final java.lang.String READ_STATUS = "read_status";
        public static final java.lang.String CONTENT_CLASS = "ct_cls";
        public static final java.lang.String DELIVERY_REPORT = "d_rpt";
        @java.lang.Deprecated
        public static final java.lang.String DELIVERY_TIME_TOKEN = "d_tm_tok";
        public static final java.lang.String DELIVERY_TIME = "d_tm";
        public static final java.lang.String RESPONSE_TEXT = "resp_txt";
        @java.lang.Deprecated
        public static final java.lang.String SENDER_VISIBILITY = "s_vis";
        @java.lang.Deprecated
        public static final java.lang.String REPLY_CHARGING = "r_chg";
        @java.lang.Deprecated
        public static final java.lang.String REPLY_CHARGING_DEADLINE_TOKEN = "r_chg_dl_tok";
        @java.lang.Deprecated
        public static final java.lang.String REPLY_CHARGING_DEADLINE = "r_chg_dl";
        @java.lang.Deprecated
        public static final java.lang.String REPLY_CHARGING_ID = "r_chg_id";
        @java.lang.Deprecated
        public static final java.lang.String REPLY_CHARGING_SIZE = "r_chg_sz";
        @java.lang.Deprecated
        public static final java.lang.String PREVIOUSLY_SENT_BY = "p_s_by";
        @java.lang.Deprecated
        public static final java.lang.String PREVIOUSLY_SENT_DATE = "p_s_d";
        @java.lang.Deprecated
        public static final java.lang.String STORE = "store";
        @java.lang.Deprecated
        public static final java.lang.String MM_STATE = "mm_st";
        @java.lang.Deprecated
        public static final java.lang.String MM_FLAGS_TOKEN = "mm_flg_tok";
        @java.lang.Deprecated
        public static final java.lang.String MM_FLAGS = "mm_flg";
        @java.lang.Deprecated
        public static final java.lang.String STORE_STATUS = "store_st";
        @java.lang.Deprecated
        public static final java.lang.String STORE_STATUS_TEXT = "store_st_txt";
        @java.lang.Deprecated
        public static final java.lang.String STORED = "stored";
        @java.lang.Deprecated
        public static final java.lang.String TOTALS = "totals";
        @java.lang.Deprecated
        public static final java.lang.String MBOX_TOTALS = "mb_t";
        @java.lang.Deprecated
        public static final java.lang.String MBOX_TOTALS_TOKEN = "mb_t_tok";
        @java.lang.Deprecated
        public static final java.lang.String QUOTAS = "qt";
        @java.lang.Deprecated
        public static final java.lang.String MBOX_QUOTAS = "mb_qt";
        @java.lang.Deprecated
        public static final java.lang.String MBOX_QUOTAS_TOKEN = "mb_qt_tok";
        @java.lang.Deprecated
        public static final java.lang.String MESSAGE_COUNT = "m_cnt";
        @java.lang.Deprecated
        public static final java.lang.String START = "start";
        @java.lang.Deprecated
        public static final java.lang.String DISTRIBUTION_INDICATOR = "d_ind";
        @java.lang.Deprecated
        public static final java.lang.String ELEMENT_DESCRIPTOR = "e_des";
        @java.lang.Deprecated
        public static final java.lang.String LIMIT = "limit";
        @java.lang.Deprecated
        public static final java.lang.String RECOMMENDED_RETRIEVAL_MODE = "r_r_mod";
        @java.lang.Deprecated
        public static final java.lang.String RECOMMENDED_RETRIEVAL_MODE_TEXT = "r_r_mod_txt";
        @java.lang.Deprecated
        public static final java.lang.String STATUS_TEXT = "st_txt";
        @java.lang.Deprecated
        public static final java.lang.String APPLIC_ID = "apl_id";
        @java.lang.Deprecated
        public static final java.lang.String REPLY_APPLIC_ID = "r_apl_id";
        @java.lang.Deprecated
        public static final java.lang.String AUX_APPLIC_ID = "aux_apl_id";
        @java.lang.Deprecated
        public static final java.lang.String DRM_CONTENT = "drm_c";
        @java.lang.Deprecated
        public static final java.lang.String ADAPTATION_ALLOWED = "adp_a";
        @java.lang.Deprecated
        public static final java.lang.String REPLACE_ID = "repl_id";
        @java.lang.Deprecated
        public static final java.lang.String CANCEL_ID = "cl_id";
        @java.lang.Deprecated
        public static final java.lang.String CANCEL_STATUS = "cl_st";
        public static final java.lang.String LOCKED = "locked";
        public static final java.lang.String SUBSCRIPTION_ID = "sub_id";
        public static final java.lang.String CREATOR = "creator";
    }
}
