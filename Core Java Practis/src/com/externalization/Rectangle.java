package com.externalization;

public class Rectangle {

	private int length;
	  private int width;

	  public Rectangle(int width, int length) {
	   this.length=length;
	   this.width=width;
	  }

	  @Override
	  public String toString() {
	    return  " width: " + width + " length: " + length;
	  }

	  public int getLength() {
	    return length;
	  }

	  public void setLength(int length) {
	    this.length = length;
	  }

	  public int getWidth() {
	    return width;
	  }

	  public void setWidth(int width) {
	    this.width = width;
	  }
}
