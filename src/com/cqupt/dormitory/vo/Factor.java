package com.cqupt.dormitory.vo;
/**
 * 条件查询 键-值类
 * @author Bern
 *
 */
public class Factor {
	String name;	//条件名称
	String value;	//条件值
	
	public Factor() {}
	
	/**
	 * 构造函数
	 * @param name	条件名称
	 * @param value	条件值
	 */
	public Factor(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
