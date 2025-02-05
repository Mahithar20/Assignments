class Program
{
    //Application Execution starts here
    static void Main()
    {
        //display title
        System.Console.WriteLine("***********Harsha Bank ***********************");
        System.Console.WriteLine("::Login Page::");

        //declare necessary variables to store username & password
        string userName = null, password = null;

        //read userName from Keyboard
        System.Console.Write("Username:");
        userName = System.Console.ReadLine();


        //read password from Keyboard only if username is entered
        if (userName != "")
        {
            System.Console.Write("Password:");
            password = System.Console.ReadLine();
        }

        //check usename and password
        if (userName == "system" && password == "manager")
        {
            //declare variable to store menue choice
            int mainMenuChoice = -1;
            do
            {
                //show main menu
                System.Console.WriteLine("\n:::Main Menu::");
                System.Console.WriteLine("1. Customers");
                System.Console.WriteLine("2. Accounts");
                System.Console.WriteLine("3. FUnd Transfer");
                System.Console.WriteLine("4. Funds Transfer Statement");
                System.Console.WriteLine("5. Account Statement");
                System.Console.WriteLine("0. Exit");

                //accept menu choice from keyboard
                System.Console.Write("Enter choice ");
                mainMenuChoice = int.Parse(System.Console.ReadLine());

                //switch case to check menu choice
                switch (mainMenuChoice)
                {
                    case 1: CustomersMenu();break;
                    case 2: AccountsMenu(); break;
                    case 3: //To DO : Display FUnd Transfer Menu
                        break;
                    case 4: //To DO : Display Funds Transfer Statement Menu
                        break;
                    case 5: //To DO : Display Account Statement Menu
                        break;
                }
            } while (mainMenuChoice != 0);
        }

        else
        {
            System.Console.WriteLine("Invalid username or password");
        }

            //about to exit
            System.Console.WriteLine("Thank You! Visit Again");

    }

    static void CustomersMenu()
    {
        //variable to store customers menu
        int customersMenuChoice = -1;

        //do-while loop starts

        do
        {
            //print customers menu
            System.Console.WriteLine("\n::Customers Menu::");
            System.Console.WriteLine("1.Add Customer");
            System.Console.WriteLine("2.Delete Customer");
            System.Console.WriteLine("3.Update Customer");
            System.Console.WriteLine("4.View Customer");
            System.Console.WriteLine("0.Back To Main Menu");

            //accept customers menu choice 
            System.Console.WriteLine("Enter the Choice:");
            customersMenuChoice = System.Convert.ToInt32(System.Console.ReadLine());
            
        } while (customersMenuChoice != 0);

    }

    static void AccountsMenu()
    {
        //variable to store accounts menu
        int accountsMenuChoice = -1;

        //do-while loop starts

        do
        {
            //print Accounts menu
            System.Console.WriteLine("\n::Accounts Menu::");
            System.Console.WriteLine("1.Add Account");
            System.Console.WriteLine("2.Delete Account");
            System.Console.WriteLine("3.Update Account");
            System.Console.WriteLine("4.View Accounts");
            System.Console.WriteLine("0.Back To Main Menu");

            //accept customers menu choice 
            System.Console.WriteLine("Enter the Choice:");
            accountsMenuChoice = System.Convert.ToInt32(System.Console.ReadLine());

        } while (accountsMenuChoice != 0);
    }
}
