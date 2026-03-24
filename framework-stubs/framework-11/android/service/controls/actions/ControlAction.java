package android.service.controls.actions;

public abstract class ControlAction {
    private static final java.lang.String TAG = "ControlAction";
    private static final java.lang.String KEY_ACTION_TYPE = "key_action_type";
    private static final java.lang.String KEY_TEMPLATE_ID = "key_template_id";
    private static final java.lang.String KEY_CHALLENGE_VALUE = "key_challenge_value";
    public static final android.service.controls.actions.ControlAction ERROR_ACTION = null;
    public static final int TYPE_ERROR = -1;
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_MODE = 4;
    public static final int TYPE_COMMAND = 5;
    private static final int NUM_RESPONSE_TYPES = 6;
    public static final int RESPONSE_UNKNOWN = 0;
    public static final int RESPONSE_OK = 1;
    public static final int RESPONSE_FAIL = 2;
    public static final int RESPONSE_CHALLENGE_ACK = 3;
    public static final int RESPONSE_CHALLENGE_PIN = 4;
    public static final int RESPONSE_CHALLENGE_PASSPHRASE = 5;
    private final java.lang.String mTemplateId = null;
    private final java.lang.String mChallengeValue = null;
    public static final boolean isValidResponse(int p0) { return false; }
    public abstract int getActionType();
    private ControlAction() {}
    ControlAction(java.lang.String p0, java.lang.String p1) {}
    ControlAction(android.os.Bundle p0) {}
    public java.lang.String getTemplateId() { return null; }
    public java.lang.String getChallengeValue() { return null; }
    android.os.Bundle getDataBundle() { return null; }
    static android.service.controls.actions.ControlAction createActionFromBundle(android.os.Bundle p0) { return null; }
    public static android.service.controls.actions.ControlAction getErrorAction() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActionType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResponseResult {
    }
}
