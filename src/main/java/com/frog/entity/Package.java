package com.frog.entity;

import com.frog.verifybean.VerifiableBean;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author bufflu
 * @since 2019-09-23
 */
@VerifiableBean(exclude = {"id", "describe"})
public class Package implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String modelId;

    private Integer effective;

    private String describe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }
    public Integer getEffective() {
        return effective;
    }

    public void setEffective(Integer effective) {
        this.effective = effective;
    }
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Package{" +
            "id=" + id +
            ", name=" + name +
            ", modelId=" + modelId +
            ", effective=" + effective +
            ", describe=" + describe +
        "}";
    }
}
