package com.celestial;
import java.util.Scanner;
import java.io.InputStream;

public class MsgLineReader extends MsgReader implements IElementReader
{
	public MsgLineReader(CustomPrompt cp)
	{
		super(cp); //cALLING CONSTRUCTOR FROM PARENTS
	}
    @Override
    public String readFromKeyboard( InputStream is)
    {
    	Scanner theScanner = new Scanner(is);
    	itsPrompt.prompt("Enter a line of Text (hit enter):");
    	return theScanner.nextLine();
    }


}
