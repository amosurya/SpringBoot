package com.externalization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteCust {
	public static void main(String args[]) {
	    Box mybox = new Box(11, 200, 40);
	    ObjectOutputStream out = null;
	    try {
	      out = new ObjectOutputStream(new FileOutputStream("D:/box.ser"));
	      out.writeObject(mybox);
	      System.out.println("Wrote \"" + mybox + "\" to file");
	    }
	    catch (IOException e) {
	      System.err.println("Error writing object: " + e.getMessage());
	    }
	    finally {
	      try {
	        out.close();
	      }
	      catch (IOException e) {
	        System.err.println(e.getMessage());
	      }
	    }
	  }

}
