package cn.jarlen.jsonparser.jsondata;

/**
 * DESCRIBE:
 * Created by hjl on 2017/2/15.
 */

public class AppsBean {
    /**
     * headerId : 0
     * label : 便民服务
     * appName : 社保卡服务
     * iconUrl : sbkfw
     * start : action.sbkfw
     */

    private int headerId;
    private String label;
    private String appName;
    private String iconUrl;
    private String start;

    public int getHeaderId() {
        return headerId;
    }

    public void setHeaderId(int headerId) {
        this.headerId = headerId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }
}
