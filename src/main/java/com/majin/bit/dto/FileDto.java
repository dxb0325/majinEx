package com.majin.bit.dto;

import org.springframework.web.multipart.MultipartFile;

public class FileDto {
	
	private MultipartFile Filedata;

	public MultipartFile getFiledata() { 
		
		return Filedata; 
		
	}
	
	public void setFiledata(MultipartFile filedata) { 
	
		Filedata = filedata; 
		
	}
    
}

