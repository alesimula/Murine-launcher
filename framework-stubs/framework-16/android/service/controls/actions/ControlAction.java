package android.service.controls.actions;

public abstract class ControlAction {
    @android.annotation.NonNull
    public static final android.service.controls.actions.ControlAction ERROR_ACTION = null;
    public static final int TYPE_ERROR = -1;
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_MODE = 4;
    public static final int TYPE_COMMAND = 5;
    public static final int RESPONSE_UNKNOWN = 0;
    public static final int RESPONSE_OK = 1;
    public static final int RESPONSE_FAIL = 2;
    public static final int RESPONSE_CHALLENGE_ACK = 3;
    public static final int RESPONSE_CHALLENGE_PIN = 4;
    public static final int RESPONSE_CHALLENGE_PASSPHRASE = 5;
    public static final boolean isValidResponse(int p0) { return false; }
    public abstract int getActionType();
    ControlAction(java.lang.String p0, java.lang.String p1) {}
    ControlAction(android.os.Bundle p0) {}
    @android.annotation.NonNull
    public java.lang.String getTemplateId() { return null; }
    @android.annotation.Nullable
    public java.lang.String getChallengeValue() { return null; }
    @android.annotation.NonNull
    android.os.Bundle getDataBundle() { return null; }
    @android.annotation.NonNull
    static android.service.controls.actions.ControlAction createActionFromBundle(android.os.Bundle p0) { return null; }
    @android.annotation.NonNull
    public static android.service.controls.actions.ControlAction getErrorAction() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActionType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResponseResult {
    }
}
