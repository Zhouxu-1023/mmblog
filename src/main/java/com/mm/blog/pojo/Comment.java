package com.mm.blog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: z_houx
 * @create: 2020-06-02 22:08
 * @Description:评论类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private Integer id;
    private String commentContent;
    private Date createdTime;
    private Integer del;
}
