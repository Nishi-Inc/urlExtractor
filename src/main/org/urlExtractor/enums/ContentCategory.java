package org.urlExtractor.enums;

/**
 * @author Nishi Inc.
 * Date: 28/11/13
 * Time: 7:45 PM
 * @since 0.0.1
 */
public enum ContentCategory {
    BLOG("Blog"),
    NEWS("News"),
    CELEBRITY("Celebrity"),
    SCIENCEANDTECHNOLOGY("Science & Technology");

    private String displayName;

    private ContentCategory(String displayName) {
        this.setDisplayName(displayName);
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
