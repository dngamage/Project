package com.birds;

import com.util.Messages;

import java.util.Locale;

public class Rooster extends Chicken
{

	public void sing(){	System.out.println("I am saying Cock-a-doodle-doo");}

	public void singLocal(){System.out.println(Messages.getString("rooster.sound"));}

}