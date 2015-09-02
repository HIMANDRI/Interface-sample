interface MyInter
{
  

  void connect();
  void disconnect();
 
}
class OracleDb implements MyInter
{
  public void connect()
   {
     System.out.println("oracle data base is connecting");
   }
  public void disconnect()
   {
     System.out.println("oracle data base is disconnecting");
   }
}
class UseInterface 
{
   public static void main(String args[])
  {
   MyInter mi;
   
     
    od.connect();
 
   od.disconnect();
  }
}
