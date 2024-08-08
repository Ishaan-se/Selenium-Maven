package day16;

import org.testng.annotations.Test;

public class GroupingTestNg {
  @Test (priority = 1, groups = {"sanity", "regression","functional"})
  void LoginByEmail() {
	  System.out.println("Email login");
  }
  
  @Test (priority = 2, groups = {"sanity"})
  void LoginByFacebook() {
	  System.out.println("Facebook login");
  }
  
  @Test (priority = 3, groups = {"sanity"})
  void LoginByTwitter() {
	  System.out.println("Twitter login");
  }
  
  @Test (priority = 4, groups = {"sanity", "regression","functional"})
  void SignUpEmail() {
	  System.out.println("Email signup");
  }
  
  @Test (priority = 5, groups = {"regression"})
  void SignUpFacebook() {
	  System.out.println("Facebook signup");
  }
  
  @Test (priority = 6, groups = {"regression"})
  void SignUpTwitter() {
	  System.out.println("Twitter signup");
  }
  
  @Test (priority = 7, groups = {"sanity", "regression","functional"})
  void PaymentInRupees() {
	  System.out.println("Rupee payement");
  }
  
  @Test (priority = 8, groups = {"sanity"})
  void PaymentInDollars() {
	  System.out.println("Dollar payments");
  }
  
  @Test (priority = 9, groups = {"regression"})
  void PaymentReturnByBank() {
	  System.out.println("Bank payments");
  }

}