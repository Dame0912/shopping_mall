package com.dame.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Sku图片信息，其图片信息来源于spu
 */
public class SkuImage implements Serializable {

    @Id
    @Column
    private String id;

    /**
     * skuId
     */
    @Column
    private String skuId;

    /**
     * 图片名称（冗余）
     */
    @Column
    private String imgName;

    /**
     * 图片路径(冗余)
     */
    @Column
    private String imgUrl;

    /**
     * Spu商品图片Id
     */
    @Column
    private String spuImgId;

    /**
     * 是否是默认图片
     */
    @Column
    private String isDefault;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSpuImgId() {
        return spuImgId;
    }

    public void setSpuImgId(String spuImgId) {
        this.spuImgId = spuImgId;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
}
