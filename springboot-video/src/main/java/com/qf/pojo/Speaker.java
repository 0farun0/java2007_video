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
@TableName("speaker")
public class Speaker {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField("speaker_name")
    private String speakerName;

    @TableField("speaker_job")
    private String speakerJob;

    @TableField("speaker_img_url")
    private String headImgUrl;

    @TableField("speaker_desc")
    private String speakerDesc;


}