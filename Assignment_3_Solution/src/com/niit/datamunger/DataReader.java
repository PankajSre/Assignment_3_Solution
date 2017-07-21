package com.niit.datamunger;

import java.util.List;
import java.util.Map;

public abstract class DataReader {

	public abstract Header getCSVHeader();
	public abstract String[] getHeaderDataType();
	public abstract String[] getData();
}
