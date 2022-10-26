package com.celestial;

public class MsgReader
{
	protected IPrompt itsPrompt;
	public MsgReader(IPrompt cp)
	{
		itsPrompt=cp;
	}
	public void setPrompt(IPrompt cp)
	{
		itsPrompt=cp;
	}
}
