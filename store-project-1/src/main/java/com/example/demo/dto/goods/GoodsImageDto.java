package com.example.demo.dto.goods;

import org.springframework.stereotype.Component;

import com.example.demo.dto.BaseDto;

/**
 * 图片信息
 * @author Administrator
 *
 */
@Component
public class GoodsImageDto extends BaseDto{
	private String imageId;		//图片Id
	private String imageName;	//图片名称
	private String imageUrl;	//图片地址(url链接)
	
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
