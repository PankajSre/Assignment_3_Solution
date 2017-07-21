package com.niit.datamunger.test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import com.niit.datamunger.CSVDataReader;
import com.niit.datamunger.Header;

public class CSVDataReaderTest {

	private static CSVDataReader dataFileReader;
	
	@BeforeClass
	public static void init()
	{
		dataFileReader= new CSVDataReader("C:/Scala/emp.csv");	
	}
	
	@Test
	public void testHeaderColumns()
	{
		Header header=dataFileReader.getCSVHeader();
		assertNotNull(header);
		for(String head: header.getHeader())
		{
			System.out.print(head+"   ");
		}
	}
	@Test
	public void testHeaderColumnCount()
	{
		int count=0;
		Header headerColumns=dataFileReader.getCSVHeader();
		for(String header: headerColumns.getHeader())
		{
			count++;
		}
		System.out.println("\nColumn Count is : "+count);
		assertEquals(5, count);
	}
	@Test
	public void testHeaderColumnAvailability()
	{
		Header headerColumns=dataFileReader.getCSVHeader();
	    assertEquals("Column Match",5, headerColumns.getHeader().length);
	}
	@Test
	public void testHeaderColumnDataType()
	{
		String[] headerColumns=dataFileReader.getHeaderDataType();
	    assertEquals("Number",headerColumns[3]);
	}

	

}
