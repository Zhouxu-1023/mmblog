package com.mm.blog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: z_houx
 * @create: 2020-06-02 22:09
 * @Description:评论回复类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Replay {

    private Integer id;
    private String replayContent;
    private Date createdTime;
    private Integer del;
}
