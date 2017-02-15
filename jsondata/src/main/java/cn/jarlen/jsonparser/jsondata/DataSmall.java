package cn.jarlen.jsonparser.jsondata;

import java.util.List;

/**
 * DESCRIBE:
 * Created by hjl on 2017/2/15.
 */

public class DataSmall {

    /**
     * status : 200
     * message : 返回成功
     * apps : [{"headerId":0,"label":"便民服务","appName":"社保卡服务","iconUrl":"sbkfw","start":"action.sbkfw"},{"headerId":0,"label":"便民服务","appName":"有事找民警","iconUrl":"yszmj","start":"action.yszmj"},{"headerId":3,"label":"交管","appName":"机动车违章查询","iconUrl":"jdcwzcx","start":"action.jdcwzcx"},{"headerId":0,"label":"便民服务","appName":"天眼","iconUrl":"ty","start":""},{"headerId":3,"label":"交管","appName":"驾考预约","iconUrl":"jkyy","start":""},{"headerId":0,"label":"便民服务","appName":"工商信息查询","iconUrl":"gsxxcx","start":""},{"headerId":3,"label":"交管","appName":"违章缴费","iconUrl":"wzjf","start":""},{"headerId":1,"label":"户政","appName":"身份证丢失补发","iconUrl":"sfzdsbf","start":""},{"headerId":1,"label":"户政","appName":"购房入户","iconUrl":"gfrh","start":""},{"headerId":2,"label":"出入境","appName":"出入境预约","iconUrl":"crjyy","start":""},{"headerId":0,"label":"便民服务","appName":"全民曝光","iconUrl":"qmbg","start":""}]
     */

    private int status;
    private String message;
    private List<AppsBean> apps;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<AppsBean> getApps() {
        return apps;
    }

    public void setApps(List<AppsBean> apps) {
        this.apps = apps;
    }
}
