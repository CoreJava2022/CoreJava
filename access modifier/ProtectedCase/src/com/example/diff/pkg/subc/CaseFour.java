package com.example.diff.pkg.subc;

import com.example.non.subc.Four;

public class CaseFour extends Four {

	public CaseFour() {
		super("Rutuja","Dabhade");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaseFour four=new CaseFour();
		four.show();
		System.out.println("My id is:: "+four.id+" And My name is:: "+four.name);
	}

}
