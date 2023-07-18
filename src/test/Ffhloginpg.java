package test;


import org.testng.annotations.Test;

import basepg.Baseclass;
import page.Funkforhirepgg;

public class Ffhloginpg extends Baseclass{
	
@Test
public void login()
{
	Funkforhirepgg gd=new Funkforhirepgg(driver);
	gd.flog();
	gd.setvalue("shain.chandran@gmail.com", "iamtheking");
	gd.buttonsn();
}
}
