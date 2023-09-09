package pxu.com.model;

public class Product {
	private int code;
	private String name;
	private float price;
	private String img;
	
	
	public Product(int code, String name, float price, String img) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.img = img;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public Product() {
		super();
	}
	
	
	
}
