package com.mindimps.module.init.model;

import com.mindimps.base.model.Badges;
import com.mindimps.base.model.Creator;
import com.mindimps.base.model.Properties;
import com.mindimps.base.model.Tags;
import com.mindimps.base.model.Users;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by duxueyang on 17/2/24.
 * 广告实体类
 */

public class ADEntity implements Serializable {
    private String id;
    private String name;
    private long create_date;
    private long update_date;
    private String createdBy;
    private String lastModifiedBy;
    private int version;
    private int status;
    private Properties properties;
    private String enName;
    private String cnName;
    private String title;
    private String url;
    private String imageUrl;
    private int type;
    private int sort;
    private int desc;
    private Creator creator;
    private ArrayList<Users> users;
    private ArrayList<Tags> tags;
    private Badges badges;
    private String webLink;   //网络的其他的链接
    private String androidVersion;
    private String iosVersion;
    private int initType;
    private String reviewVersion;
    private int hidePayment;
    private String adType;
    private String adOid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreate_date() {
        return create_date;
    }

    public void setCreate_date(long create_date) {
        this.create_date = create_date;
    }

    public long getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(long update_date) {
        this.update_date = update_date;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getDesc() {
        return desc;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public ArrayList<Users> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Users> users) {
        this.users = users;
    }

    public ArrayList<Tags> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tags> tags) {
        this.tags = tags;
    }

    public Badges getBadges() {
        return badges;
    }

    public void setBadges(Badges badges) {
        this.badges = badges;
    }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(String iosVersion) {
        this.iosVersion = iosVersion;
    }

    public int getInitType() {
        return initType;
    }

    public void setInitType(int initType) {
        this.initType = initType;
    }

    public String getReviewVersion() {
        return reviewVersion;
    }

    public void setReviewVersion(String reviewVersion) {
        this.reviewVersion = reviewVersion;
    }

    public int getHidePayment() {
        return hidePayment;
    }

    public void setHidePayment(int hidePayment) {
        this.hidePayment = hidePayment;
    }

    public String getAdType() {
        return adType;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }

    public String getAdOid() {
        return adOid;
    }

    public void setAdOid(String adOid) {
        this.adOid = adOid;
    }
}
