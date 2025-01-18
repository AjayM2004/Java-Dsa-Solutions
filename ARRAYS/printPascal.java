import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	static ArrayList<Long> eachRow(int rowNo)
	{   ArrayList<Long> row = new ArrayList<>();
		long res = 1;
		row.add(res);
        for(int i=1;i<rowNo;i++)
		{
			res = res * (rowNo-i);
			res = res / i;
			row.add(res);
		}
		return row;
	}
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
       ArrayList<ArrayList<Long>> triangle = new ArrayList<>();
       for(int i=1;i<=n;i++)
	   {
		   triangle.add(eachRow(i));
	   }
	   return triangle;
	}
}
