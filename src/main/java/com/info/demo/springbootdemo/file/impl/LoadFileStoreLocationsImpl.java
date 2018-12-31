package com.info.demo.springbootdemo.file.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.info.demo.springbootdemo.file.LoadFileStoreLocationService;

@Service
public class LoadFileStoreLocationsImpl implements LoadFileStoreLocationService{

	@Override
	public String loadFileLocation(String filelocation) throws IOException {
		
		File tempFile  = File.createTempFile(filelocation, "D:/Workspace/WorkingWorkSpace/SpringBootApp/src/main/resources/file");
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
		writer.write("Writing data into temp file!!!");
		
		
		return "file is uploaded";
	}

}
