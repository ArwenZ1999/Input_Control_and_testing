package com.celestial;

import java.util.Scanner;

public class MsgElementReader extends ElementReader 
{
	@Override
	protected void prompt()
	{
		System.out.print("enter a token):");
	}
	@Override
	public String readFromKeyboard(InputStream is )
	{
		Scanner theScanner=new Scanner(is);
		prompt();
		return theScanner.next();
	}

}
