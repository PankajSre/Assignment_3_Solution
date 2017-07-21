package com.niit.datamunger;

import java.util.List;
import java.util.Map;

public class DataMungar {

	public static void main(String[] args) {
		DataReader dataReader= new CSVDataReader("C:/Scala/emp.csv");
		Header header = dataReader.getCSVHeader();
		String[] dataType=dataReader.getHeaderDataType();
		
		System.out.println("Header columns :");
		for(String headercolumn : header.getHeader())
		{
			System.out.print(headercolumn+"   ");
		}
		System.out.println("\nData Types of Csv file Columns:");
		for(String data : dataType)
		{
			System.out.print(data+"   ");
		}
	
	}
}
