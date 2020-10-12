package main;

import java.util.ArrayList;

public class StringRecreate {
	
	public ArrayList<Character>string;
	
	public StringRecreate() {}
	
	public StringRecreate(String a) {
		char []b = a.toCharArray();
		this.string = new ArrayList<Character>();
		System.out.println(string.size());
		for(int i = 0; i < b.length; i++) {
			this.string.add(b[i]);
		}
		
	}
	
	@Override
	public String toString() {
		
		String a = "";
		
		for(Character i: this.string) {
			a += i;		
		}
		
		return a;
	}
	
	public Character charAt(int a) {
		
		return this.string.get(a);
	}
	
	public void concat(String a) {
		char []b = a.toCharArray();
		int c = this.string.size();
		for (int i = 0; i < b.length; i++) {
			this.string.add(c + i, b[i]);
		}		
		
	}
	
	public int indexOf(char a) {
		for(int i=0; i < this.string.size(); i++) {
			if (this.string.get(i) == a) {
				return i;
			}
		}
		return -1;
	}
	
	public int length() {
		return this.string.size();
	}
	
	public void toLowerCase() {
		for (int i = 0; i < this.string.size(); i++)
		{
			Character a = this.string.get(i).toLowerCase(this.string.get(i));
			this.string.set(i, a);
		}
	}
	
	public void toUpperCase() {
		for (int i = 0; i < this.string.size(); i++)
		{
			Character a = this.string.get(i).toUpperCase(this.string.get(i));
			this.string.set(i, a);
		}
	}
}
