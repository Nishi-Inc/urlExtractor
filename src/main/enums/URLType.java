package enums;

/**
 * @author Nishi Inc
 * Date: 28/11/13
 * Time: 3:21 PM
 * @since v0.1.0
 */
public enum URLType {
    RSS("rss");

    private String displayName;

    private URLType(String displayName) {
        this.setDisplayName(displayName);
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
