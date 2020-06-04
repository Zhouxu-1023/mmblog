package com.mm.blog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author: z_houx
 * @create: 2020-06-02 22:03
 * @Description:文章类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    private Integer id;
    private String title;
    private String articleContent;
    private String articleSummary;
    private Date createdTime;
    private Date updateTime;
    private Integer del;

    private List<Comment> comments;//一个文章对应的评论集合


}
