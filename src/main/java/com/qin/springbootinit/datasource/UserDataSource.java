package com.qin.springbootinit.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qin.springbootinit.model.dto.user.UserQueryRequest;
import com.qin.springbootinit.model.vo.UserVO;
import com.qin.springbootinit.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qin
 * @version 1.0
 * @project Aggregate-Search-BackEnd
 * @description 用户数据源
 * @date 2023/5/24 05:19:25
 */
@Service
public class UserDataSource implements DataSource<UserVO> {


    @Resource
    private UserService userService;

    @Override
    public Page<UserVO> doSearch(String searchText, long pageNum, long pageSize) {
        UserQueryRequest userQueryRequest = new UserQueryRequest();
        userQueryRequest.setUserName(searchText);
        userQueryRequest.setCurrent(pageNum);
        userQueryRequest.setPageSize(pageSize);
        Page<UserVO> userVOPage = userService.listUserVOByPage(userQueryRequest);
        return userVOPage;
    }
}
