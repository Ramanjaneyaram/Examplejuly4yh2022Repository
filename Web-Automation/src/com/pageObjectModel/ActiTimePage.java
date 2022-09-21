package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	//WebElement for User Name Text Field
		private WebElement username;
		
		public WebElement getUserName()
		{
			return username;
		}

		//WebElement for Password Text Field
		private WebElement pwd;
		public WebElement getPassword()
		{
			return pwd;
		}
		
		//WebElement for Login Button
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement oLogin;
		public WebElement getLogin()
		{
			return oLogin;
		}
		//Web element for user
		@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
		private WebElement Users;
		public WebElement getUsers()
		{
			return Users;
		}
		//Web element for AddUsers
		@FindBy(xpath = "//*[@id=\'createUserDiv\']/div/div[2]")
		private WebElement AddUser;
		public WebElement getAddUser()
		{
			return AddUser;
		}
		//Web element for firstName
		@FindBy(name="firstName")
		private WebElement firstName;
		public WebElement getfirstName()
		{
			return firstName;
		}
		//web element for Last name
		@FindBy(name="lastName")
		private WebElement lastName;
		public WebElement getlastName()
		{
			return lastName;
		}
		//web element for email
	    @FindBy(name="email")
		private WebElement email;
		public WebElement getemail()
		{
			return email;
		}
		
		//web element for userDataLightBox_usernameField
		private WebElement userDataLightBox_usernameField;
		public WebElement getusername()
		{
			return userDataLightBox_usernameField;
		}
		

		//web element for userDataLightBox_usepasswordField
	    
		private WebElement password;
		public WebElement getusepasswordField()
		{
			return password;
		}
		
		//web element for userDataLightBox_passwordCopyField
		private WebElement userDataLightBox_passwordCopyField;
		public WebElement getuserDataLightBox_passwordCopyField()
		{
			return userDataLightBox_passwordCopyField;
		}
		
		
		//Web element for Create user
		@FindBy(xpath = "//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		private WebElement Createuser;
		public WebElement getCreateuser()
		{
			return Createuser;
		}
		//Web element for FirstNameandlastnamr
		@FindBy(xpath = "//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement FirstNameandlastnamr;
		public WebElement getFirstNameandlastnamr()
		{
			return FirstNameandlastnamr;
		}
		//web element for Delete user
		private WebElement userDataLightBox_deleteBtn;
		public WebElement getDeleteUser()
		{
			return userDataLightBox_deleteBtn;
		}
		
		//Web element for Save changes
		@FindBy(xpath = "//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		private WebElement SaveChanges;
		public WebElement getSaveChanges()
		{
			return SaveChanges;
		}

		//Web element for Task
		@FindBy(xpath = "//*[@id=\"topnav\"]/tbody/tr/td[3]/a")
		private WebElement Task;
		public WebElement getTask()
		{
			return Task;
		}
		//Web element for Add new Customer
		@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")
		private WebElement AddNew;
		public WebElement getAddnew()
		{
			return AddNew;
		}
		//Web element for  new Customer
		@FindBy(xpath = "/html/body/div[14]/div[1]")
		private WebElement NewCustomer;
		public WebElement getNewCustomer()
		{
			return NewCustomer;
		}	
		//Web element for customer Name
		private WebElement customerLightBox_nameField;
		public WebElement getcustomerLightBox_nameField()
		{
			return customerLightBox_nameField;
		}
		
		//Web element for AddCustomerDiscription
		private WebElement customerLightBox_descriptionField;
		public WebElement getcustomerLightBox_descriptionField()
		{
			return customerLightBox_descriptionField;
		}
		//Web element for CreateCustomer
		@FindBy(xpath = "//*[@id=\'customerLightBox_commitBtn\']/div/span")
		private WebElement CreateCustomer;
		public WebElement getCreateCustomer()
		{
			return CreateCustomer;
		}
		//Web element for modifySettingmark
		@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement modifysetting;
		public WebElement getmodifysetting()
		{
			return modifysetting;
		}
		
		//Web element for modifyDiscription
		@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
		private WebElement modifyDiscription;
		public WebElement getmodifyDiscription()
		{
			return modifyDiscription;
		}
		//Web element for modifyCancel
		@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
		private WebElement modifyCancel;
		public WebElement getmodifyCancel()
		{
			return modifyCancel;
		}	
		
		//Web element for DeleteAction
		@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
		private WebElement DeleteAction;
		public WebElement getDeleteAction()
		{
			return DeleteAction;
		}
		//Web element for DeleteCust
		@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
		private WebElement Deletecust;
		public WebElement getDeletecust()
		{
			return Deletecust;
		}
		//Web element for New Project
		@FindBy(xpath = "/html/body/div[14]/div[2]")
		private WebElement newproject;
		public WebElement getnewproject()
		{
			return newproject;
		}
		//Web element for project dicsription
		
		private WebElement projectPopup_projectDescriptionField;
		public WebElement getprojectPopup_projectDescriptionField()
		{
			return projectPopup_projectDescriptionField;
		}
		//Web element for CreateTaskblockbutton
		
		private WebElement createTasksBlockButton;
		public WebElement getcreateTasksBlockButton()
		{
			return createTasksBlockButton;
	    }
		//Web element for enter taskname
		@FindBy(xpath = "//*[@id=\"projectPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
		private WebElement Entertaskname;
		public WebElement getEntertaskname()
		{
			return Entertaskname;
	    }
		
		//Web element for taskDiscriptionmark
		@FindBy(xpath = "//*[@id=\"descriptionElement\"]/img")
		private WebElement TaskDiscritptionmark;
		public WebElement getTaskDiscritptionmark()
		{
			return TaskDiscritptionmark;
		}
		
		//Web element for projectPopup_projectNameField
		
		private WebElement projectPopup_projectNameField;
		public WebElement getprojectPopup_projectNameField()
		{
			return projectPopup_projectNameField;
	    }
		//Web element for saveButton
		
		private WebElement scbutton;
		public WebElement getscbutton()
		{
			return scbutton;
			    }
		//Web element for DeletePermenentlyCustome
		@FindBy(xpath = "//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")
		private WebElement DeletePermenentlyCustome;
		public WebElement getDeletePermenentlyCustome()
		{
			return DeletePermenentlyCustome;
		}
		//Web element for 
		//(xpath = "//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")
		//private WebElement DeletePermenentlyCustome;
		//public WebElement getDeletePermenentlyCustome()
		{
			//return DeletePermenentlyCustome;
		}
		//WebElement for FlyOutWindow
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyOutWindow()
		{
			return gettingStartedShortcutsPanelId;
		}
		
		//WebElement for Logout Link
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		public WebElement getLogoutLink()
		{
			return oLogout;
		}
		

}
