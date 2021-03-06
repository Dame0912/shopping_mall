package com.dame.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 二级分类
 */
public class BaseCatalog2 implements Serializable {

    @Id
    @Column
    private String id;

    /**
     * 名称
     */
    @Column
    private String name;

    /**
     * 一级分类id
     */
    @Column
    private String catalog1Id;

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

    public String getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(String catalog1Id) {
        this.catalog1Id = catalog1Id;
    }
}
