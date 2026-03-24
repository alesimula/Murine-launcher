package android.health.connect;

public class HealthConnectManager {
    public static final java.lang.String ACTION_HEALTH_CONNECT_MIGRATION_READY = "android.health.connect.action.HEALTH_CONNECT_MIGRATION_READY";
    public static final java.lang.String ACTION_HEALTH_HOME_SETTINGS = "android.health.connect.action.HEALTH_HOME_SETTINGS";
    public static final java.lang.String ACTION_MANAGE_HEALTH_DATA = "android.health.connect.action.MANAGE_HEALTH_DATA";
    public static final java.lang.String ACTION_MANAGE_HEALTH_PERMISSIONS = "android.health.connect.action.MANAGE_HEALTH_PERMISSIONS";
    public static final java.lang.String ACTION_REQUEST_EXERCISE_ROUTE = "android.health.connect.action.REQUEST_EXERCISE_ROUTE";
    public static final java.lang.String ACTION_REQUEST_HEALTH_PERMISSIONS = "android.health.connect.action.REQUEST_HEALTH_PERMISSIONS";
    public static final java.lang.String ACTION_SHOW_MIGRATION_INFO = "android.health.connect.action.SHOW_MIGRATION_INFO";
    public static final java.lang.String CATEGORY_HEALTH_PERMISSIONS = "android.intent.category.HEALTH_PERMISSIONS";
    public static final int DATA_DOWNLOAD_COMPLETE = 4;
    public static final int DATA_DOWNLOAD_FAILED = 3;
    public static final int DATA_DOWNLOAD_RETRY = 2;
    public static final int DATA_DOWNLOAD_STARTED = 1;
    public static final int DATA_DOWNLOAD_STATE_UNKNOWN = 0;
    public static final java.lang.String EXTRA_EXERCISE_ROUTE = "android.health.connect.extra.EXERCISE_ROUTE";
    public static final java.lang.String EXTRA_SESSION_ID = "android.health.connect.extra.SESSION_ID";
    HealthConnectManager() {}
    public void insertRecords(java.util.List<android.health.connect.datatypes.Record> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.health.connect.InsertRecordsResponse, android.health.connect.HealthConnectException> p2) {}
    @android.annotation.NonNull
    public <T extends java.lang.Object> void aggregate(android.health.connect.AggregateRecordsRequest<T> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.health.connect.AggregateRecordsResponse<T>, android.health.connect.HealthConnectException> p2) {}
    public <T extends java.lang.Object> void aggregateGroupByDuration(android.health.connect.AggregateRecordsRequest<T> p0, java.time.Duration p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.util.List<android.health.connect.AggregateRecordsGroupedByDurationResponse<T>>, android.health.connect.HealthConnectException> p3) {}
    public <T extends java.lang.Object> void aggregateGroupByPeriod(android.health.connect.AggregateRecordsRequest<T> p0, java.time.Period p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.util.List<android.health.connect.AggregateRecordsGroupedByPeriodResponse<T>>, android.health.connect.HealthConnectException> p3) {}
    public void deleteRecords(android.health.connect.DeleteUsingFiltersRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.health.connect.HealthConnectException> p2) {}
    public void deleteRecords(java.util.List<android.health.connect.RecordIdFilter> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.health.connect.HealthConnectException> p2) {}
    public void deleteRecords(java.lang.Class<? extends android.health.connect.datatypes.Record> p0, android.health.connect.TimeRangeFilter p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Void, android.health.connect.HealthConnectException> p3) {}
    public void getChangeLogs(android.health.connect.changelog.ChangeLogsRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.health.connect.changelog.ChangeLogsResponse, android.health.connect.HealthConnectException> p2) {}
    public void getChangeLogToken(android.health.connect.changelog.ChangeLogTokenRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.health.connect.changelog.ChangeLogTokenResponse, android.health.connect.HealthConnectException> p2) {}
    public void fetchDataOriginsPriorityOrder(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.health.connect.FetchDataOriginsPriorityOrderResponse, android.health.connect.HealthConnectException> p2) {}
    public void updateDataOriginPriorityOrder(android.health.connect.UpdateDataOriginPriorityOrderRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.health.connect.HealthConnectException> p2) {}
    public void queryAllRecordTypesInfo(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.util.Map<java.lang.Class<? extends android.health.connect.datatypes.Record>, android.health.connect.RecordTypeInfoResponse>, android.health.connect.HealthConnectException> p1) {}
    public int getRecordRetentionPeriodInDays() { return 0; }
    public void setRecordRetentionPeriodInDays(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.health.connect.HealthConnectException> p2) {}
    public void queryAccessLogs(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.util.List<android.health.connect.accesslog.AccessLog>, android.health.connect.HealthConnectException> p1) {}
    public <T extends android.health.connect.datatypes.Record> void readRecords(android.health.connect.ReadRecordsRequest<T> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.health.connect.ReadRecordsResponse<T>, android.health.connect.HealthConnectException> p2) {}
    public void updateRecords(java.util.List<android.health.connect.datatypes.Record> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.health.connect.HealthConnectException> p2) {}
    @android.annotation.NonNull
    public void getContributorApplicationsInfo(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.health.connect.ApplicationInfoResponse, android.health.connect.HealthConnectException> p1) {}
    public void stageAllHealthConnectRemoteData(java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.health.connect.restore.StageRemoteDataException> p2) throws java.lang.NullPointerException {}
    public void updateDataDownloadState(int p0) {}
    @android.annotation.NonNull
    public void getHealthConnectDataState(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.health.connect.HealthConnectDataState, android.health.connect.HealthConnectException> p1) {}
    @android.annotation.NonNull
    public void queryActivityDates(java.util.List<java.lang.Class<? extends android.health.connect.datatypes.Record>> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.util.List<java.time.LocalDate>, android.health.connect.HealthConnectException> p2) {}
    public void startMigration(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, android.health.connect.migration.MigrationException> p1) {}
    public void finishMigration(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, android.health.connect.migration.MigrationException> p1) {}
    public void writeMigrationData(java.util.List<android.health.connect.migration.MigrationEntity> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.health.connect.migration.MigrationException> p2) {}
    public void insertMinDataMigrationSdkExtensionVersion(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.health.connect.migration.MigrationException> p2) {}
    public static boolean isHealthPermission(android.content.Context p0, java.lang.String p1) { return false; }
    @android.annotation.NonNull
    public static java.util.Set<java.lang.String> getHealthPermissions(android.content.Context p0) { return null; }
}
