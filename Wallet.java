class Wallet
{
    double money;
    Wallet()
    {
        money = 0;
    }
    boolean RemoveMoney(double price)
    {
        if(money < price)
        {
            return false;
        }
        else
        {
            money -= price;
            if(money  == 0)
            {
                //send an alert that wallet is empty
            }
            return true;
        }
    }
    double GetMoney()
    {
        return money;
    }
    boolean AddMoney(double amount)
    {
        if(amount <= 0)
        {
            return false;
        }
        else{
            money += amount;
            return true;
        }
    }
}