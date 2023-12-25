package com.aliner.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author aliner
 * @date 2023/12/19 14:48
 */

@Data
public class User {

    Integer id;

    String name;

    String password;

    Date createTime;

    Integer followCount;

    Integer followerCount;

    String avatar;

    String backgroundImagel;

    String signature;

    Integer totalFavorited;

    Integer workCount;

    Integer favoriteCount;


}
