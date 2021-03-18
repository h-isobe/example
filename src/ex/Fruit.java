package ex;

import java.io.Serializable;

public class Fruit implements Serializable {
  private String name;
  private int price;

  public Fruit() {}
  public Fruit(String name, int price) {
	  this.name = name;
	  this.price = price;
    }
    public String getName() {
    	return this.name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public int getPrice() {
    	return this.price;
    }
    public void setPrice(int price) {
    	this.price = price;
    }
  }
