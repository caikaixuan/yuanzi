package com.ygbc.brain.business.management.api.dto.algorithm;

import com.alibaba.fastjson.JSONArray;
import com.ygbc.brain.base.dto.BaseDTO;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class UpdateAlgorithmReqDTO extends BaseDTO{

    @NotNull(message = "请选择要更新的算法")
    private Long id;

    @NotBlank(message = "请输入算法名称")
    private String name;

    @NotBlank(message = "请输入算法中文名称")
    private String nameCn;

    @NotBlank(message = "请输入算法英文名称")
    private String nameEn;

    @NotBlank(message = "请输入算法描述")
    private String remark;

    @NotNull(message = "请输入算法参数")
    private JSONArray arguments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public JSONArray getArguments() {
        return arguments;
    }

    public void setArguments(JSONArray arguments) {
        this.arguments = arguments;
    }
}
