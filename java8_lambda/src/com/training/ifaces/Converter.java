package com.training.ifaces;
@FunctionalInterface//it does not allow more than one method
public interface Converter<T, R> {
	
	public R convert(T value);
	
	

}
