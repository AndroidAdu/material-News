package com.mindimps.init.model;

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
}
