package com.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Box extends Rectangle implements Externalizable {
	  private int height;
	//  required no-argument constructor for Externalizable mechanism
	  public Box() {
	    // Remember that the Rectangle class has not any no-argument constructor
	    this(0, 0, 0);  // calls the next in the is class constructor w/arguments
	  }
	  public Box(int width, int length, int height) {
	    super(width, length); // calls the superclass constructor w/arguments
	    this.height = height;
	  }
	// reads the serialized data
	  public void readExternal(ObjectInput in) throws IOException {
	    setHeight(in.readInt());
	    setWidth(in.readInt());
	    setLength(in.readInt());
	  }
	// write the serialized data
	  public void writeExternal(ObjectOutput out) throws IOException {
	    out.writeInt(getHeight());
	    out.writeInt(getWidth());
	    out.writeInt(getLength());
	  }

	  @Override
	  public String toString() {
	    return "Height: " + height+ super.toString();
	  }

	  public int getHeight() {
	    return height;
	  }

	  public void setHeight(int height) {
	    this.height = height;
	  }
	}
