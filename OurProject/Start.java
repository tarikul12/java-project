bimport java.lang.*;
import classes.*;
import fileio.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Start
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String username = "admin";
		String password = "password";
		System.out.println("\t\t-------------------------------------------------------------------------------");
		System.out.println("\t\t-------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t---To access the program please log in first---");
		System.out.print("\t\t\t\t\tAdmin User Name : ");
		String adminUser = sc.next();
		System.out.print("\t\t\t\t\tAdmin password : ");
		String adminPassword = sc.next();

		if(adminUser.equals(username) && adminPassword.equals(password))
		{
			System.out.println("\t\t-------------------------------------------------------------------------------");
			System.out.println("\t\t-------------------------------------------------------------------------------");
			System.out.println("\t\t\t\t\t---Successfully Logged In!!---");
			Library b = new Library();
			
			FileReadWriteDemo frwd = new FileReadWriteDemo();
			
			System.out.println("\t\t-------------------------------------------------------------------------------");
			System.out.println("\t\t-------------------------------------------------------------------------------");
			System.out.println("\t\t|\t\tWelCome to Group 3's Library Management System                |");
			System.out.println("\t\t|Program by : S M Faisal, Sanjida Jahan, MD Arik Ahmed Zelan, MD. Nazmul ISlam|");
			System.out.println("\t\t-------------------------------------------------------------------------------");
			System.out.println("\t\t-------------------------------------------------------------------------------");
			
			boolean repeat = true;
			
			while(repeat)
			{
				System.out.println("");
				System.out.println("\t\t\tWhat do you want to do?");
				System.out.println("\t\t\t1. Employee Management");
				System.out.println("\t\t\t2. Reader Management");
				System.out.println("\t\t\t3. Reader-Account Management");
				System.out.println("\t\t\t4. Reader Membership Transactions[Renew Membership & Cancel Membership]");
				System.out.println("\t\t\t5. Book Management");
				System.out.println("\t\t\t6. Exit");
				
				System.out.println();

				int choice=0;

				boolean done=false; 
				while(!done)
				{
					try
					{
						System.out.print("\t\tWhat is you choice: ");
						choice = sc.nextInt();
						done=true;
					}
					catch(InputMismatchException e)
					{
						String str=sc.nextLine();
						System.out.println();
						System.out.println("\t\tThis is a invalid input!!! You entered \""+str+"\" which is a string");
						
						System.out.println("\t\tPleasae Enter a whole number. ");
						System.out.println();
					}
				}
				
				switch(choice)
				{
					case 1:

						System.out.println("\t\t-------------------------------------------------------------------------------");
						System.out.println("\t\tYou have chose Employee Management");
						System.out.println("\t\t-------------------------------------------------------------------------------");

						System.out.println();
						System.out.println("\t\t\tYou have the following options:");
						System.out.println("\t\t\t1. Insert New Employee");
						System.out.println("\t\t\t2. Remove Existing Employee");
						System.out.println("\t\t\t3. Search an Employee");
						System.out.println("\t\t\t4. Show All Employees");
						System.out.println("\t\t\t5. Go Back");
						
						System.out.println();
						System.out.print("\t\tEnter you option: ");
						int option1 = sc.nextInt();

						switch(option1)
						{
							case 1:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Insert New Employee");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								
								System.out.print("\t\t\tEnter Employee ID: ");
								String empId1 = sc.next();
								System.out.print("\t\t\tEnter Employee Name: ");
								String name1 = sc.next();
								System.out.print("\t\t\tEnter Employee Salary: ");
								double salary1 = sc.nextDouble();
								
								Employee e1 = new Employee();
								e1.setEmpId(empId1);
								e1.setName(name1);
								e1.setSalary(salary1);
								
								if(b.insertEmployee(e1))
								{
									System.out.println("\t\tEmployee " + e1.getEmpId() + " has been Inserted");
								}
								else
								{
									System.out.println("\t\tEmployee " + e1.getEmpId() + " can NOT be Inserted");
								}
								System.out.println();
								break;
								
							case 2:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Remove an Employee");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								
								System.out.print("\t\t\tEnter an Employee ID for Removing: ");
								String empId2 = sc.next();
								
								Employee e2 = b.searchEmployee(empId2);
								
								if(e2 != null)
								{
									System.out.println("\t\t### Employee Found for Removing ###");
									if(b.removeEmployee(e2))
									{
										System.out.println("\t\tEmployee " + e2.getEmpId() + " has been Removed");
									}
								}
								else
								{
									System.out.println("\t\t### Employee NOT Found and Can NOT be Removed ###");
								}
								System.out.println();
								break;
								
							case 3: 
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Search an Employee");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								
								System.out.print("\t\tEnter an Employee ID for searching: ");
								String empId3 = sc.next();
								
								Employee e3 = b.searchEmployee(empId3);
								
								if(e3 != null)
								{
									System.out.println("\t\t### Employee Found ###");
									System.out.println("\t\tEmployee ID: " + e3.getEmpId());
									System.out.println("\t\tEmployee Name: " + e3.getName());
									System.out.println("\t\tEmployee Salary: " + e3.getSalary());
								}
								else
								{
									System.out.println("\t\t### Employee NOT Found ###");
								}
								System.out.println();
								break;
								
							case 4:
								
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Show All Employees");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								
								b.showAllEmployees();
								
								break;

							case 5:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Go Back");
								System.out.println("\t\t-------------------------------------------------------------------------------");

								break;
								
							default:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tInvalid Option");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								break;
						}
						System.out.println();
						break;

					case 2:

						System.out.println("\t\t-------------------------------------------------------------------------------");
						System.out.println("\t\tYou have chose Reader Management");
						System.out.println("\t\t-------------------------------------------------------------------------------");

						System.out.println();
						System.out.println("\t\tYou have the following options:");
						System.out.println("\t\t\t1. Insert New Readers");
						System.out.println("\t\t\t2. Remove Existing Readers");
						System.out.println("\t\t\t3. Search a Readers");
						System.out.println("\t\t\t4. Show All Readers");
						System.out.println("\t\t\t5. Go Back");
						
						System.out.println();
						System.out.print("\t\tEnter you option: ");
						int option2 = sc.nextInt();
						
						switch(option2)
						{
							case 1:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Insert New Reader");
								System.out.println("\t\t-------------------------------------------------------------------------------");

								System.out.print("\t\t\tEnter Reader NID: ");
								int	nid1 = sc.nextInt();
								System.out.print("\t\t\tEnter Reader Name: ");
								String name1 = sc.next();
								System.out.print("\t\t\tEnter Reader Age: ");
								int age1 = sc.nextInt();
								
								Reader c1 = new Reader(nid1, name1, age1);
								
								if(b.insertReader(c1))
								{
									System.out.println("\t\tReader " + c1.getNid() + " has been Inserted");
								}
								else
								{
									System.out.println("\t\tReader " + c1.getNid() + " Can NOT be Inserted");
								}
								System.out.println();
								break;
								
							case 2:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Remove a Reader");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								
								System.out.print("\t\t\tEnter an Reader NID for Removing: ");
								int rdNId2 = sc.nextInt();
								
								Reader r2 = b.searchReader(rdNId2);
								
								if(r2 != null)
								{
									System.out.println("\t\t### Reader Found for Removing ###");
									if(b.removeReader(r2))
									{
										System.out.println("\t\tReader " + r2.getNid() + " has been Removed");
									}
								}
								else
								{
									System.out.println("\t\t### Reader NOT Found and Can NOT be Removed ###");
								}
								System.out.println();
								
								break;
								
							case 3: 
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Search a Reader");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								
								System.out.print("\t\tEnter an Reader NID for searching: ");
								int rdNId3 = sc.nextInt();
								
								Reader r3 = b.searchReader(rdNId3);
								
								if(r3 != null)
								{
									System.out.println("\t\t### Reader Found ###");
									System.out.println("\t\tReader NID: " + r3.getNid());
									System.out.println("\t\tReader Name: " + r3.getName());
									System.out.println("\t\tReader Age: " + r3.getAge());
								}
								else
								{
									System.out.println("\t\t### Reader NOT Found ###");
								}
								System.out.println();
								break;
								
								
							case 4:
								
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Show All Reader");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								
								b.showAllReaders();
								
								break;
								
							case 5:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Go Back");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								break;
								
							default:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tInvalid Option");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								break;
						}
						System.out.println();
						break;

					case 3:

						System.out.println("\t\t-------------------------------------------------------------------------------");
						System.out.println("\t\tYou have chose Reader-Account Management");
						System.out.println("\t\t-------------------------------------------------------------------------------");
						
						System.out.println();
						System.out.println("\t\tYou have the following options:");
						System.out.println("\t\t\t1. Insert New Account for a Reader");
						System.out.println("\t\t\t2. Remove Existing Account of a Reader");
						System.out.println("\t\t\t3. Search an Account for a Reader");
						System.out.println("\t\t\t4. Show All Accounts of a Reader");
						System.out.println("\t\t\t5. Go Back");
						
						System.out.println();
						System.out.print("\t\tEnter you option: ");
						int option3 = sc.nextInt();
						
						switch(option3)
						{
							case 1:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Insert an Account for a Reader");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								
								System.out.print("\t\t\tEnter Reader NID: ");
								int nid1 = sc.nextInt();
								
								Reader r1 = b.searchReader(nid1);
								
								if(r1 != null)
								{
									System.out.println("\t\t### Valid Reader ###");
									
									System.out.println("\t\tWhich type of Account do you want?");
									System.out.println("\t\t\t1. Associate Membership Account");
									System.out.println("\t\t\t2. Supported Membership Account");
									System.out.println("\t\t\t3. InstitutionalMembershipAccount");
									System.out.println("\t\t\t4. Go Back");
									System.out.println();
									
									System.out.print("\t\tYour Type: ");
									int type = sc.nextInt();
									
									Account a = null;
									
									if(type == 1)
									{
										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.println("\t\tCreating a Associate Membership Account");
										System.out.println("\t\t-------------------------------------------------------------------------------");
										
										System.out.print("\t\t\tEnter Account Number : ");
										int an = sc.nextInt();
										System.out.print("\t\t\tEnter Account Holder Name : ");
										String ahn = sc.next();
										System.out.print("\t\t\tEnter Account Balance : ");
										double bl = sc.nextDouble();
										System.out.print("\t\t\tEnter Account Membership Duration : ");
										double amad = sc.nextDouble();
										
										Account ama = new AssociateMembershipAccount(an, ahn, bl, amad);
										
										a = ama;
									}
									else if(type == 2)
									{
										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.println("\t\tCreating a SupportedMembershipAccount");
										System.out.println("\t\t-------------------------------------------------------------------------------");
										
										System.out.print("\t\t\tEnter Account Number : ");
										int an = sc.nextInt();
										System.out.print("\t\t\tEnter Account Holder Name : ");
										String ahn = sc.next();
										System.out.print("\t\t\tEnter Account Balance : ");
										double bl = sc.nextDouble();
										System.out.print("\t\t\tEnter Discount Rate : ");
										double dr = sc.nextDouble();
										
										Account sma = new SupportedMembershipAccount(an, ahn, bl, dr);
										
										a = sma;
									}

									else if(type == 3)
									{
										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.println("\t\tCreating a Institutional Membership Account");
										System.out.println("\t\t-------------------------------------------------------------------------------");
										
										System.out.print("\t\t\tEnter Account Number : ");
										int an = sc.nextInt();
										System.out.print("\t\t\tEnter Account Holder Name : ");
										String ahn = sc.next();
										System.out.print("\t\t\tEnter Account Balance : ");
										double bl = sc.nextDouble();
										System.out.print("\t\t\tEnter Account Membership Duration : ");
										double imad = sc.nextDouble();
										
										Account ima = new InstitutionalMembershipAccount(an, ahn, bl, imad);
										
										a = ima;
									}

									else if(type == 4)
									{
										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.println("\t\tGoing Back.....");
										System.out.println("\t\t-------------------------------------------------------------------------------");
									}
									else
									{
										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.println("\t\tInvalid Type");
										System.out.println("\t\t-------------------------------------------------------------------------------");
									}
									
									if(a != null)
									{
										if(r1.insertAccount(a))
										{
											System.out.println("\t\tAccount "+ a.getAccountNumber()+" has been inserted for NID : " + r1.getNid());
										}
										else
										{
											System.out.println("\t\tAccount "+ a.getAccountNumber()+" can NOT be inserted for NID : " + r1.getNid());
										}
									}
								}
								else
								{
									System.out.println("\t\t### Invalid Reader.. Account Can NOT be Created ###");
								}
								System.out.println();
								break;
								
							case 2:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Remove an Account for a Reader");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								break;
								
							case 3: 
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Search an Account for a Reader");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								break;
								
							case 4:
								
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Show All Accounts for a Reader");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								
								System.out.print("\t\t\tEnter Customer NID: ");
								int nid4 = sc.nextInt();
								
								Reader r4 = b.searchReader(nid4);
								
								if(r4 != null)
								{
									System.out.println("");
									r4.showDetails();
									r4.showAllAccounts();
								}
								else
								{
									System.out.println("\t\t### Invalid Reader ###");
								}
								System.out.println();
								break;
								
							case 5:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Go Back");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								break;
								
							default:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tInvalid Option");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								break;
						}
						System.out.println();
						break;

					case 4:

						System.out.println("\t\t-------------------------------------------------------------------------------");
						System.out.println("\t\tYou have chose Reader Management");
						System.out.println("\t\t-------------------------------------------------------------------------------");
						
						System.out.println();
						System.out.println("\t\tYou have the following options:");
						System.out.println("\t\t\t1. Renew Membership");
						System.out.println("\t\t\t2. Remove Membership");
						System.out.println("\t\t\t3. Show All Operaions");
						System.out.println("\t\t\t4. Go Back");
						
						System.out.println();
						System.out.print("\t\tEnter you option: ");
						int option4 = sc.nextInt();
						
						switch(option4)
						{
							case 1:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Renew Membership");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								
								System.out.print("\t\t\tEnter Reader NID: ");
								int nid1 = sc.nextInt();
								
								Reader r1 = b.searchReader(nid1);
								
								if(r1 != null)
								{
									System.out.println("\t\t### Valid Reader ###");
									
									System.out.print("\t\t\tEnter Account Number : ");
									int an = sc.nextInt();
								
									Account a = r1.searchAccount(an);
									
									if(a != null)
									{
										System.out.println("\t\t### Valid Account ###");
										
										System.out.println();
										System.out.println("\t\tCurrent Balance : " + a.getBalance());
										
										System.out.print("\t\t\tEnter Deposit money to Renew Membership : ");
										double am = sc.nextDouble();
										
										if(a.renewMembership(am))
										{
											System.out.println("\t\t### Account renew Successfull ###");
											System.out.println("\t\tNew Balance : " + a.getBalance());
											frwd.writeInFile("\t\t"+r1.getNid() + " has deposited amount " + am + " in account number " + a.getAccountNumber());	
										}
										else
										{
											System.out.println("\t\t### Invalid Amount ###");
										}									
									}
									else
									{
										System.out.println("\t\t### Invalid Account ###");
									}
								}
								else
								{
									System.out.println("\t\t### Invalid Reader ###");
								}
								System.out.println();
								break;
								
							case 2:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Remove Membership");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								
								System.out.print("\t\tEnter Reader NID: ");
								int nid2 = sc.nextInt();
								
								Reader r2 = b.searchReader(nid2);
								
								if(r2 != null)
								{
									System.out.println("\t\t### Valid Reader ###");
									
									System.out.print("\t\t\tEnter Account Number : ");
									int an = sc.nextInt();
								
									Account a = r2.searchAccount(an);
									
									if(a != null)
									{
										System.out.println("\t\t### Valid Account ###");
										
										System.out.println();
										System.out.println("\t\tCurrent Balance : " + a.getBalance());
										
										System.out.print("\t\t\tEnter Withdraw Amount: ");
										double am = sc.nextDouble();
										
										if(a.removeMembership(am))
										{
											System.out.println("\t\t### Membership Successfully Canceled ###");
											System.out.println("\t\tNew Balance : " + a.getBalance());
											frwd.writeInFile("\t\t"+r2.getNid() + " has withdrawn amount " + am + " from account number " + a.getAccountNumber());
										}
										else
										{
											System.out.println("\t\t### Invalid Amount ###");
										}									
									}
									else
									{
										System.out.println("\t\t### Invalid Account ###");
									}
								}
								else
								{
									System.out.println("\t\t### Invalid Reader ###");
								}
								System.out.println();
								break;
								
							case 3: 
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to See Transaction History");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								
								frwd.readFromFile();
								
								break;
								
							case 4:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Go Back");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								break;
								
							default:
							
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tInvalid Option");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								break;
						}
						System.out.println();
						
						break;

					case 5:

								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Book Management");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tPlease choose your option");
								System.out.println("\t\t\t1. For Employee");
								System.out.println("\t\t\t2. For Reader");
								System.out.println("\t\t\t3. Go Back");
								System.out.println("");
								System.out.print("\t\tEnter you option: ");
								int option5 = sc.nextInt();
								// Employee employee = new Employee();

								switch(option5)
								{
									case 1: //for employee
										{
											System.out.println("\t\t-------------------------------------------------------------------------------");
											System.out.println("\t\tYou have chose Book Management for Employee");
											System.out.println("\t\t-------------------------------------------------------------------------------");
											System.out.println("\t\t\t1. Insert New Book");
											System.out.println("\t\t\t2. Remove Book");
											System.out.println("\t\t\t3. Search Books");
											System.out.println("\t\t\t4. Show all Books");
											System.out.println("\t\t\t5: Go Back");
											System.out.println("");
											System.out.print("\t\tEnter you option: ");
											int option6 = sc.nextInt();

											switch(option6)
											{
												case 1:

													System.out.println("\t\t-------------------------------------------------------------------------------");
													System.out.println("\t\tYou have chose to Insert New Book");
													System.out.println("\t\t-------------------------------------------------------------------------------");
													System.out.println("\t\tWhich type of books do you want to insert?");
													System.out.println("\t\t\t1. Story Book");
													System.out.println("\t\t\t2. Text Book");
													System.out.println("\t\t\t3: Go Back");
													System.out.println();

													System.out.print("\t\tEnter you option: ");
													int option7 = sc.nextInt();

													if(option7==1)
													{
														System.out.println("\t\t-------------------------------------------------------------------------------");
														System.out.println("\t\tYou have chose to Insert Story Books");
														System.out.println("\t\t-------------------------------------------------------------------------------");

														System.out.print("\t\t\tISBN : ");
														String sisbn=sc.next();
														System.out.print("\t\t\tBook Title : ");
														String sbooktitle=sc.next();
														System.out.print("\t\t\tBook Author Name : ");
														String sauthorName=sc.next();
														System.out.print("\t\t\tPrice : ");
														double sprice=sc.nextDouble();
														System.out.print("\t\t\tAvailable Quantity : ");
														int savailablequantity=sc.nextInt();
														System.out.print("\t\t\tCategory : ");
														String scategory=sc.next();

														Book sb1 = new StoryBook(sisbn,sbooktitle,sauthorName,sprice,savailablequantity,scategory);

														if(b.insertBook(sb1)==true)
														{
															System.out.println("\t\t---Story Book inserted---");
															System.out.println();
														}
														else
														{
															System.out.println("\t\t---Story Book not inserted---");
															System.out.println();
														}

													}

													else if(option7==2)
													{
														System.out.println("\t\t-------------------------------------------------------------------------------");
														System.out.println("\t\tYou have chose to Insert Text Books");
														System.out.println("\t\t-------------------------------------------------------------------------------");

														System.out.print("\t\t\tISBN : ");
														String tisbn=sc.next();
														System.out.print("\t\t\tBook Title : ");
														String tbooktitle=sc.next();
														System.out.print("\t\t\tBook Author Name : ");
														String tauthorName=sc.next();
														System.out.print("\t\t\tPrice : ");
														double tprice=sc.nextDouble();
														System.out.print("\t\t\tAvailable Quantity : ");
														int tavailablequantity=sc.nextInt();
														System.out.print("\t\t\tStandard : ");
														int tstandard=sc.nextInt();

														Book sb2 = new TextBook(tisbn,tbooktitle,tauthorName,tprice,tavailablequantity,tstandard);

														if(b.insertBook(sb2)==true)
														{
															System.out.println("\t\t---Text Book inserted---");
															System.out.println();
														}
														else
														{
															System.out.println("\t\t---Text Book not inserted---");
															System.out.println();
														}
													}

													else if(option7>3)
													{
														System.out.println("\t\tInvalid Option");
													}

													else
													{
														continue;
													}

													break;

												case 2:

														System.out.println("\t\t-------------------------------------------------------------------------------");
														System.out.println("\t\tYou have chose to Remove Books");
														System.out.println("\t\t-------------------------------------------------------------------------------");

														System.out.print("\t\t\tEnter the ISBN of the book: ");
														String disbn = sc.next();

														Book b1 = b.searchBook(disbn);

														if(b.removeBook(b1)==true)
														{
															System.out.println("\t\tBook removed");
														}
														else
														{
															System.out.println("\t\tBook not found and can not be removed ");
														}

													break;

												case 3:
												
													System.out.println("\t\t-------------------------------------------------------------------------------");
													System.out.println("\t\tYou have chose to Search Book");
													System.out.println("\t\t-------------------------------------------------------------------------------");

													System.out.print("\t\tEnter the isbn of the book: ");
													String sisbn = sc.next();

													Book b2 = b.searchBook(sisbn);

													if(b2!=null)
													{
														System.out.println("\t\t--Book Found--");
														System.out.println("\t\tBook ISBN : "+b2.getIsbn());
														System.out.println("\t\tBook Title : "+b2.getBookTitle());
														System.out.println("\t\tBook Author Name : "+b2.getAuthorName());
														System.out.println("\t\tBook price : "+b2.getPrice());
													}
													else
													{
														System.out.println("\t\t--Book not Found--");
													}

												break;

												case 4:

													System.out.println("\t\t-------------------------------------------------------------------------------");
													System.out.println("\t\tYou have chose to show all Books");
													System.out.println("\t\t-------------------------------------------------------------------------------");

													b.showAllBooks();

												break;

												case 5:

													System.out.println("\t\t-------------------------------------------------------------------------------");
													System.out.println("\t\tYou have chose to Go Back");
													System.out.println("\t\t-------------------------------------------------------------------------------");
													
													break;

												default:

													System.out.println("\t\t-------------------------------------------------------------------------------");
													System.out.println("\t\tInvalid Choice...");
													System.out.println("\t\t-------------------------------------------------------------------------------");

													break;	

											}
											
										}

										break;

									case 2: //for reader

										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.println("\t\tYou have chose Book Management for Readers");
										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.println("\t\t\t1. Search Books");
										System.out.println("\t\t\t2. Show all Books");
										System.out.println("\t\t\t3: Go Back");
										System.out.println("");
										System.out.print("\t\tEnter you option: ");
										int option8 = sc.nextInt();

										switch(option8)
										{
											case 1:
												System.out.println("\t\t-------------------------------------------------------------------------------");
												System.out.println("\t\tYou have chose to Search Book");
												System.out.println("\t\t-------------------------------------------------------------------------------");

												System.out.print("\t\tEnter the isbn of the book: ");

												String rsisbn = sc.next();

												Book b3 = b.searchBook(rsisbn);

												if(b3!=null)
												{
													System.out.println("\t\t--Book Found--");
													System.out.println("\t\tBook ISBN : "+b3.getIsbn());
													System.out.println("\t\tBook Title : "+b3.getBookTitle());
													System.out.println("\t\tBook Author Name : "+b3.getAuthorName());
													System.out.println("\t\tBook price : "+b3.getPrice());
												}
												else
												{
													System.out.println("\t\t--Book not Found--");
												}

											break;

												
											case 2:

												System.out.println("\t\t-------------------------------------------------------------------------------");
												System.out.println("\t\tYou have chose to show Books");
												System.out.println("\t\t-------------------------------------------------------------------------------");

												b.showAllBooks();

											break;

											case 3:
												System.out.println("\t\t-------------------------------------------------------------------------------");
												System.out.println("\t\tYou have chose to Go Back");
												System.out.println("\t\t-------------------------------------------------------------------------------");
													
											break;

												default:

													System.out.println("\t\t-------------------------------------------------------------------------------");
													System.out.println("\t\tInvalid Choice...");
													System.out.println("\t\t-------------------------------------------------------------------------------");

												break;		
											}

										break;	

									case 3:

										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.println("\t\tYou have chose to Go Back");
										System.out.println("\t\t-------------------------------------------------------------------------------");
										
										break;

									default:

										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.println("\t\tInvalid Choice...");
										System.out.println("\t\t-------------------------------------------------------------------------------");

										break;	
								}	
					break;

					case 6:

						System.out.println("\t\t-------------------------------------------------------------------------------");
						System.out.println("\t\tYou have chose to exit");
						System.out.println("\t\t-------------------------------------------------------------------------------");

						repeat = false;
						break;

					default:

						System.out.println("\t\t-------------------------------------------------------------------------------");
						System.out.println("\t\tInvalid Choice...");
						System.out.println("\t\t-------------------------------------------------------------------------------");

						break;								
				}
			}
		}

		else
		{
			System.out.println("\t\tUser Name or password is incorrect!!!");
		}


		
		
	}
}