package com.example.demo.dto.merchants;

/**
 * 商家信息
 * @author Administrator
 *
 */
public class MerchantsDto {
	private String merchantsId;		//商家ID
	private String merchantsName;	//商家名称
	
	public String getMerchantsId() {
		return merchantsId;
	}
	public void setMerchantsId(String merchantsId) {
		this.merchantsId = merchantsId;
	}
	public String getMerchantsName() {
		return merchantsName;
	}
	public void setMerchantsName(String merchantsName) {
		this.merchantsName = merchantsName;
	}
	
}
