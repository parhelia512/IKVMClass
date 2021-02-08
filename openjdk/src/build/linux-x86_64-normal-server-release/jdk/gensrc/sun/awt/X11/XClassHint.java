// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XClassHint extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 16; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XClassHint(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XClassHint() {
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
	public long get_res_name(int index) { log.finest(""); return Native.getLong(pData+0)+index*Native.getLongSize(); }
	public long get_res_name() { log.finest("");return Native.getLong(pData+0); }
	public void set_res_name(long v) { log.finest(""); Native.putLong(pData + 0, v); }
	public long get_res_class(int index) { log.finest(""); return Native.getLong(pData+8)+index*Native.getLongSize(); }
	public long get_res_class() { log.finest("");return Native.getLong(pData+8); }
	public void set_res_class(long v) { log.finest(""); Native.putLong(pData + 8, v); }


	String getName() {
		return "XClassHint"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(80);

		ret.append("res_name = ").append( get_res_name() ).append(", ");
		ret.append("res_class = ").append( get_res_class() ).append(", ");
		return ret.toString();
	}


}



