package com.mm.blog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: z_houx
 * @create: 2020-06-02 22:06
 * @Description:文章分类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    private Integer id;
    private String categoryName;
    private Date createdTime;
    private Date updateTime;
    private Integer del;
}
