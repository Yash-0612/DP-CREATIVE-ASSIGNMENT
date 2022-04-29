class Test
{
  public static void main(String args[])
  {      
    System.out.println("-------------STEAMED MOMOS-------------");
     Momos v = new SteamedMomos();
     v.prepareMomos();
     System.out.println("");
     System.out.println("-------------FRIED MOMOS-------------");
     Momos p = new FriedMomos();
     p.prepareMomos();
  }
}
