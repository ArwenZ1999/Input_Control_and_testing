package com.celestial;

public class FunckyPrompt implements IPrompt
{
	@Override
	public void prompt(String msg)
	{
		System.out.print("["+msg+"]");
	}
}
