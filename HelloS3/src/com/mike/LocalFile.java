package com.mike;

import java.io.File;


public class LocalFile
{
	String dir_name;
	
	public void LocalFile()
	{
		dir_name = null;
	}
	
	public void LocalFile(String dir_name)
	{
		this.dir_name = dir_name;
	}

	public String getDir_name() {
		return dir_name;
	}

	public void setDir_name(String dir_name) {
		this.dir_name = dir_name;
	}

	public void get_listing()
	{
		File dir = new File(dir_name);
		if(!dir.isDirectory())
		{
			System.out.println("Not a directory");
			return;
		}
		
		File[] fileList = dir.listFiles();
		
		for(int i = 0; i < fileList.length; i++)
		{
			if(fileList[i].isDirectory())
			{
			    System.out.println("Dir: " + fileList[i].getName() + " Time: " + fileList[i].lastModified());
			}
			else
			{
			    System.out.println("file: " + fileList[i].getName() + " Time: " + fileList[i].lastModified());				
			}
		}
		
		
	}
	
	

}
