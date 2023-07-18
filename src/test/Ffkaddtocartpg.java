package test;


import org.testng.annotations.Test;

import basepg.Baseclass;
import page.Funkforhirepgg;

public class Ffkaddtocartpg extends Baseclass{

	@Test
	public void adddtocart() {
		Funkforhirepgg fh=new Funkforhirepgg(driver);
		fh.clicker();
		fh.elem();
		fh.atk();
		fh.vCart();
	      
	}
}
