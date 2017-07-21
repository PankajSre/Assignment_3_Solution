package com.niit.datamunger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;

import java.util.Map;


public class CSVDataReader extends DataReader {

	BufferedReader bufferedReader;
	String fileName;

	public CSVDataReader(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public Header getCSVHeader() {
		Header header=new Header();
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			String line = bufferedReader.readLine();
			String columns[] = line.split(",");
			int i = 0;
			int size=columns.length;
			
			
			header.setHeader(columns);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return header;
	}

	@Override
	public String[] getHeaderDataType() {

		String []headerDataType=null;
		int i=0;
		try {

			bufferedReader = new BufferedReader(new FileReader(fileName));
			bufferedReader.readLine();
			String line = bufferedReader.readLine();
			String columns[] = line.split(",");
			headerDataType=new String[columns.length];
			for (String column : columns) {
				if (isNumeric(column)) {
					headerDataType[i]="Number";
					
				} else {
					headerDataType[i]="String";
					
				}
				i++;
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return headerDataType;
	}

	@Override
	public String[] getData() {
		
		
		return null;
	}
	
	public static boolean isNumeric(String column)
	{
		try
		{
			double number = Double.parseDouble(column);
			return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	}
}
