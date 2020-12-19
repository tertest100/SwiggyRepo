package stepdef;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomSwiggy {
	
	
@FindBy(linkText= "Sign up")
	WebElement signup;

@FindBy(id = "mobile")
 WebElement phoneN;

@FindBy(id = "name") WebElement nameU;


@FindBy(id = "email")
WebElement emailu;

@FindBy(id = "password")
WebElement passU;

@FindBy(xpath = "//a[contains(text(),'CONTINUE')]")
WebElement conbutton;

@FindBy(xpath = "//a[text()='Kolkata']")
WebElement KolkattaClick;

@FindBy(xpath = "//div[contains(@class, '_21ghd') and text() = 'Find Food']")

WebElement  FoodFind;




@FindBy(xpath = "//div[contains(@class, '_2peD4')]")
WebElement tangratype;



public void clicklink()

{
	signup.click();
	
}

public void enterphone(String phone)
{
	phoneN.sendKeys(phone);
	
}

public void entername(String name)
{
	nameU.sendKeys(name);
}

public void enteremail(String email)
{
	emailu.sendKeys(email);
}

public void sendpassword(String password)
{
	passU.sendKeys(password);
}
public void clickcontinue()
{
	conbutton.click();
}

public void ClickKolkatta()
{
	KolkattaClick.click();
	
}

public void Clickfindfood()
{
	FoodFind.click();
	
}


public void typetangra()
{
	tangratype.click();
}
}
