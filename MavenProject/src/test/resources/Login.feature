Feature: Login  Test On Web Application 
@signupvalidation 
Scenario Outline: Data driving new user sign-up 
	Given  navigates to sivvi.com 
	Then   close the popup message 
	Then   click on Register button 
	Then   he/she select the gender 
	Then   he/she provides the first name as "<firstName>" 
	Then   he/she provides the last name as "<lastName>" 
	Then   he/she provides the email as "<email>" 
	Then   he/she provides the confirm email again as "<confirmEmail>" 
	Then   he/she provides the password as "<password>" 
	Then   he/she provides the confirm password again as "<conPassword>" 
	Then   he/she check the checkbox button 
	Then   he/she click on Continue button 
	Then   he/she close the application 
	Then   he/she Verify "<firstnameVal>" for "<firstName>" validation message for first name 
	Then   he/she verify "<lastNameVal>" for "<lastName>" validation message for last name 
	Then   he/she verfiy "<Emailval>" for "<email>" validation message for email 
	Then   he/she verfiy "<confirmEmailval>" for "<confirmEmail>" validation message for confirm email 
	Then   he/she Verify "<passwordVal>" for "<password>" validation message for password 
	Then   he/she Verify "<ConfirmpasswordVal>" for "<conPassword>" validation message for confirm password 
	Then   Then "<SignupErrorMsg>" for "<firstName>" for "<lastName>" for "<email>" for confirm "<email>" for "<password>" and for confirm "<password>" validation for all invalid credentials 
	
	#Then login should be successful
	Examples: 
		|firstName  |  lastName |  email                    |   confirmEmail         | password        |conPassword       | firstnameVal    | lastNameVal    | Emailval               |  confirmEmailval     | passwordVal     |   ConfirmpasswordVal    | SignupErrorMsg |
		|           |           |                           |                        |                 |                  |This is reqiured |This is reqiured|This is reqiured        |This is reqiured      |This is reqiured | This is reqiured        |                |
		|     test  |           |                           |                        |                 |                  |                 |This is reqiured|This is reqiured        |This is reqiured      |This is reqiured |This is reqiured         |                |  
		|      test | qa        |                           |                        |                 |                  |                 |                |  This is reqiured      |  This is reqiured    |This is reqiured |This is reqiured         |                |
		|    test   | qa        |     test.qaa@@gmail.com   |                        |                 |                  |                 |                |please enter valid email| This is reqiured     |This is reqiured |This is reqiured         |                |
		|   test    |qa         | test.shadab@gmail.com     | test.shadab@gmail.com  |                 |                  |                 |                |                        |                      | This is reqiured|This is reqiured         |                |
		|  test     |qa         |test.shadab1@gmail.com     |test.shadab1@gmail.com  |sha1234          |123456            |                 |                |                        |                      |                 |password doesn't matches |                |
		|test       |qa         |test.shadab1@gmail.com     |test.shadab1@gmail.com  |sha1234          |sha1234           |                 |                |                        |                      |                 |                         |There is already an account with this email address| 
		|test       |qa         |test.shadab12@gmail.com    |test.shadab12@gmail.comn| sha1234        n | sha1234         |                 |                |                        |                      |                 |                         |                           |                 