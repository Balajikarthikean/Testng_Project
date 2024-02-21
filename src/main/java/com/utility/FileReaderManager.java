package com.utility;

import com.base.BaseClass;

public class FileReaderManager extends BaseClass{
	private FileReaderManager frm;
	
	public static FileReaderManager getInstanFileReaderManager() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
		
	}
	
	public static Configuration getInstanConfiguration() {
		Configuration c = new Configuration();
		return c;
		
	}

}
