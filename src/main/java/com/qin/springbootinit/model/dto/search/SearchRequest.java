package com.qin.springbootinit.model.dto.search;

import com.qin.springbootinit.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
@EqualsAndHashCode(callSuper = true)
@Data
public class SearchRequest extends PageRequest implements Serializable {

    private static final long serialVersionUID = -2379876573862661233L;
    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 类型
     */
    private String type;

}
