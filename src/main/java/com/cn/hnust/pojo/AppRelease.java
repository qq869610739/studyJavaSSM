package com.cn.hnust.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class AppRelease implements Serializable {
    private String id;

    /**
     * APP名称
     */
    private String appname;

    /**
     * 手機系統版本
     */
    private String system;

    /**
     * APP版本信息
     */
    private String appversion;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * git发布版本
     */
    private String releaseversion;

    /**
     * 更新自动叠加
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