package Test_cases;

import org.testng.annotations.Test;

import Base_Class.Base_Class;
import Pages.Login_page;
import Pages.PMI_page;

public class Test_Cases extends Base_Class {

	@Test(priority = 1)
	public void loginwithvalid() {
		Login_page login= new Login_page();
		login.orangelogin();
	}
	@Test(priority = 2)
	public void loginwith_invalid() {
		Login_page login= new Login_page();
		login.orangeinvalidlog();
		
	}
	@Test(priority = 3)
	public void Pimtestpage() throws Exception {
		PMI_page pmi=new PMI_page();
		pmi.PMI_adding_functon();
		
	}
	@Test(priority = 4)
	public void TC_PMI_02() {
		PMI_page pmi2=new PMI_page();
		pmi2.PMI_edting_function();
	}
	
	@Test(priority=5)
	public void TC_PMI_03() {
		PMI_page pmi3=new PMI_page();
		pmi3.PMI_page_3();
	}
	
}
	
