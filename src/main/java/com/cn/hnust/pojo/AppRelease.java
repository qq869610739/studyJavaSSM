package com.cn.hnust.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class AppRelease implements Serializable {
    private String id;

    /**
     * APP����
     */
    private String appname;

    /**
     * �֙Cϵ�y�汾
     */
    private String system;

    /**
     * APP�汾��Ϣ
     */
    private String appversion;

    /**
     * ����ʱ��
     */
    private Date createTime;

    /**
     * git�����汾
     */
    private String releaseversion;

    /**
     * �����Զ�����
     */
    private Integer versioncode;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getReleaseversion() {
        return releaseversion;
    }

    public void setReleaseversion(String releaseversion) {
        this.releaseversion = releaseversion;
    }

    public Integer getVersioncode() {
        return versioncode;
    }

    public void setVersioncode(Integer versioncode) {
        this.versioncode = versioncode;
    }
}