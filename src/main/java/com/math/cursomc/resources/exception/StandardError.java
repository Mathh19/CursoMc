package com.math.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long timeSamp;
	
	
	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Long getTimeSamp() {
		return timeSamp;
	}


	public void setTimeSamp(Long timeSamp) {
		this.timeSamp = timeSamp;
	}


	public StandardError(Integer status, String msg, Long timeSamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeSamp = timeSamp;
	}
	
}
