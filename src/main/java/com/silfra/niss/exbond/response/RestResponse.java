
package com.silfra.niss.exbond.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Result")
public class RestResponse<T> {
	private boolean status;
	private String message;
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
