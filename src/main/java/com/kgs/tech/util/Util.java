package com.kgs.tech.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {
	
	public static String toCSV(List<String> array) { 
		String result = ""; 
		
		if (!(array == null || array.size() == 0)) { 
			StringBuilder sb = new StringBuilder(); 
			for (String s : array) { 
				sb.append(s).append(","); 
			} 
			result = sb.deleteCharAt(sb.length() - 1).toString(); 
		} 
	return result; 
}

	public static List<String> csvToList(String str) {
		if(str == null || str.isEmpty()) {
			return null;
		}else {
			List<String> list = new ArrayList<String>(Arrays.asList(str.split(",")));

			return list;
		}
		
	}

}
