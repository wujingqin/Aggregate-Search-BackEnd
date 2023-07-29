package com.qin.springbootinit.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qin.springbootinit.model.dto.post.PostQueryRequest;
import com.qin.springbootinit.model.vo.PostVO;
import com.qin.springbootinit.service.PostService;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author qin
 * @version 1.0
 * @project Aggregate-Search-BackEnd
 * @description 文章数据源
 * @date 2023/5/24 05:18:26
 */
@Service
public class PostDataSource implements DataSource<PostVO>{


    @Resource
    private PostService postService;

    @Override
    public Page<PostVO> doSearch(String searchText, long pageNum, long pageSize) {
        PostQueryRequest postQueryRequest = new PostQueryRequest();
        postQueryRequest.setSearchText(searchText);
        postQueryRequest.setCurrent(pageNum);
        postQueryRequest.setPageSize(pageSize);
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        Page<PostVO> postVOPage = postService.listPostVOByPage(postQueryRequest, request);
        return postVOPage;
    }
}
