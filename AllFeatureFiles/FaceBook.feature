Feature: Test the Facebook Application

  Scenario Outline: Test register page functionality
    Given user is on register page
    When user entered "<firstname>" ,"<lastname>","<username>","<password>","<reEmail>","<birthDay>","<birthMonth>", "<birthYear>" and "<gender>"

    Examples: 
      | firstname | lastname   | username         | password   | reEmail          | birthDay | birthMonth | birthYear | gender |
      | sanjay    | Manjarekar | sanjay@gmail.com | sanjay@123 | sanjay@gmail.com |       15 | Jun        |      2000 | Male   |
      | Ajay      | Ahire      | ajay@gmail.com   | ajay@123   | ajay@gmail.com   |       20 | May        |      2002 | Female |
      | Ganesh    | shinde     | ganesh@gmail.com | ganga@123  | ganesh@gmail.com |       25 | Apr        |      2001 | custom |
