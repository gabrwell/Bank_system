package enums;

public enum StatusAccount {

    ACTIVE("Active"),
    INACTIVE("Inactive"),
    BLOCKED("Blocked judiacly"),
    ENDED("Ended");

    private final String description;

    StatusAccount(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }
}
