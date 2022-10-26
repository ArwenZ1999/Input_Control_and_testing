package com.celestial;
import java.util.Scanner;
import java.io.InputStream;

public class MsgLineReader extends ElementReader
{
	

    public String readFromKeyboard( InputStream is)
    {
    	Scanner theScanner = new Scanner(is);
    	prompt("Enter a line of Text (hit enter):");
    	return theScanner.nextLine();
    }

}
