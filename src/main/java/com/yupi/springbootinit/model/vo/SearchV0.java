package com.yupi.springbootinit.model.vo;

import com.yupi.springbootinit.model.entity.Picture;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/*
*
*    聚合搜索
* */
@Data
public class SearchV0 implements Serializable {
    private static final long serialVersionUID = -6184709096651721467L;

    private List<UserVO> userList;

    private List<PostVO> postList;

    private  List<Picture> pictureList;

    private  List<?> dataList;
}
