package com.fpoly.sd18306.model;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductModel {
	
	private int id;

	@NotEmpty(message = "Tên không được bỏ trống")
	@Length(min = 3, message = "Tên không được dưới 3 kí tự")
	private String product_name;
	
	@NotEmpty(message = "Giá không được bỏ trống")
	private int price;
	
	@NotEmpty(message = "Số lượng trong kho không được bỏ trống")
	private int in_stock;
	
	@NotEmpty(message = "Mô tả không được bỏ trống")
	private String description;
	
	@NotEmpty(message = "Hình ảnh không được bỏ trống")
	private String images;
}
