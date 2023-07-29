package com.qin.springbootinit.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 *
 * @param <T>
 */
public interface DataSource<T> {
    /**
     * desc:
     * @param: * @param searchText
     * @param pageNum
     * @param pageSize
     * @return: Page<T>
     * @author: qin
     * @date: 2023/5/24 05:13
     */
    Page<T> doSearch(String searchText, long pageNum, long pageSize);
}
