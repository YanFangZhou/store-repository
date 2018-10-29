package com.example.demo.dto.goods;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.example.demo.dto.BaseDto;

/**
 * 商品信息
 * @author Administrator
 *
 */
@Component
public class GoodsDto extends BaseDto{
	private String goodsId;				//商品ID
	private String goodsName;			//商品名称
	private String goodsDescribe;		//商品描述
	private GoodsImageDto goodsImage;	//商品图片
	private TypeDto  goodsType;			//商品类别
	private BigDecimal goodsPrice;		//商品价格
	
	public TypeDto getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(TypeDto goodsType) {
		this.goodsType = goodsType;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsDescribe() {
		return goodsDescribe;
	}
	public void setGoodsDescribe(String goodsDescribe) {
		this.goodsDescribe = goodsDescribe;
	}
	public GoodsImageDto getGoodsImage() {
		return goodsImage;
	}
	public void setGoodsImage(GoodsImageDto goodsImage) {
		this.goodsImage = goodsImage;
	}
	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
}
