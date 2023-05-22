package com.yupi.springbootinit.model.dto.picture;

import com.yupi.springbootinit.common.PageRequest;
import lombok.Data;

import java.io.Serializable;

@Data
public class PictureQueryRequest extends PageRequest implements Serializable {

        private static final long serialVersionUID = 4553987000103422695L;
        private String searchText;

}
