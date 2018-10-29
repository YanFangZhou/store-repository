package com.example.demo.dto.goods;

/**
 * 类别信息
 * @author Administrator
 *
 */
public class TypeDto {
	private String typeId;		//类别Id
	private String typeName;	//类别名称
	private String typeDesc;	//类别描述
	
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeDesc() {
		return typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}
}
