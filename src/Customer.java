
class Customer extends User
{
    String username;
    String password; //to be hashed 
    Wallet w;
    Location loc;
    boolean isInTrip;
    @Override void StoreInDB()
    {
        int a;
        //override it properly pls
    }
}