package com.aliner.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author aliner
 * @date 2023/12/19 14:55
 */
@Data
public class Video {

    Integer id;

    String playUrl;

    String coverUrl;

    Date createTime;

    Integer authID;

    Integer favoriteCount;

    Integer commentCount;

    String title;
}
