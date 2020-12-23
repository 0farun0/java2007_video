package com.qf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("video")
public class Video {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String title;

    private Integer time;

    private String detail;

    @TableField("speaker_id")
    private Integer speakerId;

    @TableField("course_id")
    private Integer courseId;

    @TableField("video_url")
    private String videoUrl;

    @TableField("img_url")
    private String imageUrl;

    @TableField("play_num")
    private Integer playNum;

    private Speaker speaker;


}