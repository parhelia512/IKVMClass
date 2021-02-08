// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XdbeSwapInfo extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 16; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XdbeSwapInfo(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XdbeSwapInfo() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public long get_swap_window() { log.finest("");return (Native.getLong(pData+0)); }
	public void set_swap_window(long v) { log.finest(""); Native.putLong(pData+0, v); }
	public int get_swap_action() { log.finest("");return (Native.getInt(pData+8)); }
	public void set_swap_action(int v) { log.finest(""); Native.putInt(pData+8, v); }


	String getName() {
		return "XdbeSwapInfo"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(80);

		ret.append("swap_window = ").append( get_swap_window() ).append(", ");
		ret.append("swap_action = ").append( get_swap_action() ).append(", ");
		return ret.toString();
	}


}



