package com.ygbc.brain.business.management.api.dto.algorithm;

import com.ygbc.brain.base.dto.BaseDTO;

import javax.validation.constraints.NotNull;

public class QueryAlgorithmDetailReqDTO extends BaseDTO{

    @NotNull(message = "请选择一个算法")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
