package edu.umb.cs680.hw15;

import java.time.LocalDateTime;

public class Link extends FSElement {
	private FSElement target;
	public Link(Directory parent, String name, int size, LocalDateTime creationTime, FSElement target)
	{
		super(parent, name, size, creationTime);
		this.target = target;
		parent.appendChild(this);
	}
	public FSElement getTarget()
	{
		return target;
	}

	public boolean isDirectory()
	{
		return false;
	}
	
	public boolean isFile()
	{
		return false;
	}
	
	public boolean isLink()
	{
		return true;
	}

}