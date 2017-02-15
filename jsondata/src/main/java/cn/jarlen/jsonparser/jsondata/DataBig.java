package cn.jarlen.jsonparser.jsondata;

import java.util.List;

/**
 * DESCRIBE:
 * Created by hjl on 2017/2/15.
 */

public class DataBig {


    /**
     * status : 200
     * message : 返回成功
     * content : {"type":"app","creat_at":"1212121212","desc":"测试","author":"jarlen","from":"支付宝","to":"test","pics":[{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024228197.jpg","alt":"1"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024229536.jpg","alt":"2"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024229925.jpg","alt":"3"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024229573.jpg","alt":"4"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024230523.jpg","alt":"5"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024230892.jpg","alt":"6"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024231704.jpg","alt":"7"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024231152.jpg","alt":"8"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024232704.jpg","alt":"9"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024232559.jpg","alt":"10"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024233624.jpg","alt":"11"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024233561.jpg","alt":"12"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024234107.jpg","alt":"13"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024234435.jpg","alt":"14"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024235445.jpg","alt":"15"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024236743.jpg","alt":"16"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024237795.jpg","alt":"17"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024237104.jpg","alt":"18"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024238707.jpg","alt":"19"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024239233.jpg","alt":"20"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024239430.jpg","alt":"21"}],"apps":[{"headerId":0,"label":"便民服务","appName":"社保卡服务","iconUrl":"sbkfw","start":"action.sbkfw"},{"headerId":0,"label":"便民服务","appName":"有事找民警","iconUrl":"yszmj","start":"action.yszmj"},{"headerId":3,"label":"交管","appName":"机动车违章查询","iconUrl":"jdcwzcx","start":"action.jdcwzcx"},{"headerId":0,"label":"便民服务","appName":"天眼","iconUrl":"ty","start":""},{"headerId":3,"label":"交管","appName":"驾考预约","iconUrl":"jkyy","start":""},{"headerId":0,"label":"便民服务","appName":"工商信息查询","iconUrl":"gsxxcx","start":""},{"headerId":3,"label":"交管","appName":"违章缴费","iconUrl":"wzjf","start":""},{"headerId":1,"label":"户政","appName":"身份证丢失补发","iconUrl":"sfzdsbf","start":""},{"headerId":1,"label":"户政","appName":"购房入户","iconUrl":"gfrh","start":""},{"headerId":2,"label":"出入境","appName":"出入境预约","iconUrl":"crjyy","start":""},{"headerId":0,"label":"便民服务","appName":"全民曝光","iconUrl":"qmbg","start":""}]}
     */

    private int status;
    private String message;
    private ContentBean content;

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

    public ContentBean getContent() {
        return content;
    }

    public void setContent(ContentBean content) {
        this.content = content;
    }

    public static class ContentBean {
        /**
         * type : app
         * creat_at : 1212121212
         * desc : 测试
         * author : jarlen
         * from : 支付宝
         * to : test
         * pics : [{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024228197.jpg","alt":"1"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024229536.jpg","alt":"2"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024229925.jpg","alt":"3"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024229573.jpg","alt":"4"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024230523.jpg","alt":"5"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024230892.jpg","alt":"6"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024231704.jpg","alt":"7"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024231152.jpg","alt":"8"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024232704.jpg","alt":"9"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024232559.jpg","alt":"10"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024233624.jpg","alt":"11"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024233561.jpg","alt":"12"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024234107.jpg","alt":"13"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024234435.jpg","alt":"14"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024235445.jpg","alt":"15"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024236743.jpg","alt":"16"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024237795.jpg","alt":"17"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024237104.jpg","alt":"18"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024238707.jpg","alt":"19"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024239233.jpg","alt":"20"},{"url":"http://www.cygpm.com/uploadfile/2015/0511/20150511024239430.jpg","alt":"21"}]
         * apps : [{"headerId":0,"label":"便民服务","appName":"社保卡服务","iconUrl":"sbkfw","start":"action.sbkfw"},{"headerId":0,"label":"便民服务","appName":"有事找民警","iconUrl":"yszmj","start":"action.yszmj"},{"headerId":3,"label":"交管","appName":"机动车违章查询","iconUrl":"jdcwzcx","start":"action.jdcwzcx"},{"headerId":0,"label":"便民服务","appName":"天眼","iconUrl":"ty","start":""},{"headerId":3,"label":"交管","appName":"驾考预约","iconUrl":"jkyy","start":""},{"headerId":0,"label":"便民服务","appName":"工商信息查询","iconUrl":"gsxxcx","start":""},{"headerId":3,"label":"交管","appName":"违章缴费","iconUrl":"wzjf","start":""},{"headerId":1,"label":"户政","appName":"身份证丢失补发","iconUrl":"sfzdsbf","start":""},{"headerId":1,"label":"户政","appName":"购房入户","iconUrl":"gfrh","start":""},{"headerId":2,"label":"出入境","appName":"出入境预约","iconUrl":"crjyy","start":""},{"headerId":0,"label":"便民服务","appName":"全民曝光","iconUrl":"qmbg","start":""}]
         */

        private String type;
        private String creat_at;
        private String desc;
        private String author;
        private String from;
        private String to;
        private List<PicsBean> pics;
        private List<AppsBean> apps;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCreat_at() {
            return creat_at;
        }

        public void setCreat_at(String creat_at) {
            this.creat_at = creat_at;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public List<PicsBean> getPics() {
            return pics;
        }

        public void setPics(List<PicsBean> pics) {
            this.pics = pics;
        }

        public List<AppsBean> getApps() {
            return apps;
        }

        public void setApps(List<AppsBean> apps) {
            this.apps = apps;
        }

        public static class PicsBean {
            /**
             * url : http://www.cygpm.com/uploadfile/2015/0511/20150511024228197.jpg
             * alt : 1
             */

            private String url;
            private String alt;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }
        }
    }
}
