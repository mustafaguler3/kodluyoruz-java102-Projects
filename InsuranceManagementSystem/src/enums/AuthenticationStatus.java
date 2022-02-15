package enums;

public enum AuthenticationStatus {
    SUCCESS (true),
    FAIL (false);

    boolean result;

    AuthenticationStatus(boolean result){
        this.result = result;
    }
}
