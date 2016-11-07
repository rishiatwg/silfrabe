package com.silfra.niss.exbond.response;

public class RestRequest<T> {
	
	public T data;
	
	public RestRequest(T input) {
		data = input;
	}
}
