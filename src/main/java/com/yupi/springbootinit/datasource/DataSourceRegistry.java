package com.yupi.springbootinit.datasource;

import com.yupi.springbootinit.model.enums.SearchTypeEnum;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author qin
 * @version 1.0
 * @project Aggregate-Search-BackEnd
 * @description 数据源注册
 * @date 2023/5/24 20:18:44
 */
@Component
public class DataSourceRegistry {
    @Resource
    private PostDataSource postDataSource;
    @Resource
    private UserDataSource userDataSource;
    @Resource
    private PictureDataSource pictureDataSource;
    private Map<String, DataSource<T>> typeDataSourcesMap;

    @PostConstruct
    public void doInit() {
        typeDataSourcesMap = new HashMap() {{
            put(SearchTypeEnum.POST.getValue(), postDataSource);
            put(SearchTypeEnum.USER.getValue(), userDataSource);
            put(SearchTypeEnum.PICTURE.getValue(), pictureDataSource);
        }};
    }

    public DataSource getDataSourceByType(String type) {
        if (typeDataSourcesMap == null) {
            return null;
        }
        return typeDataSourcesMap.get(type);
    }

}
