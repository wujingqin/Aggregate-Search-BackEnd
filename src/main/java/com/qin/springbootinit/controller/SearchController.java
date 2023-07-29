package com.qin.springbootinit.controller;

import com.qin.springbootinit.common.BaseResponse;
import com.qin.springbootinit.common.ResultUtils;
import com.qin.springbootinit.manager.SearchFacade;
import com.qin.springbootinit.model.dto.search.SearchRequest;
import com.qin.springbootinit.model.vo.SearchV0;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

    @Resource
    private SearchFacade searchFacade;

    @PostMapping("/all")
    public BaseResponse<SearchV0> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
        return ResultUtils.success(searchFacade.searchAll(searchRequest, request));
    }

}