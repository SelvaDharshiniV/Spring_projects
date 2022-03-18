package com.example.demo;

import java.lang.reflect.Field;

import com.example.demo.annotation.MyColumn;
import com.example.demo.annotation.MyTable;
import com.example.demo.entity.Book;

public class Application {

	public static void main(String[] args) {
		Book book= new Book();
		MyTable table=book.getClass().getAnnotation(MyTable.class);
		Class<Book> bkClass= (Class<Book>) book.getClass();
	MyColumn columnOne=null;
	String dataType="";
			try {
				Field bookField = bkClass.getDeclaredField("bookNumber");
				Class type=bookField.getType();
				if(type.getName().equals("int")) {
					dataType="number";
				}
				columnOne=bookField.getAnnotation(MyColumn.class);
//				System.out.println(columnOne.name());
			} catch (NoSuchFieldException | SecurityException e) {
				e.printStackTrace();
			}
		
		String tableName= table.name();
		String col1=columnOne.name();
		String sql="Create table " +tableName+" ("+col1+" "+dataType+")";
		System.out.println(sql);

	}

}
