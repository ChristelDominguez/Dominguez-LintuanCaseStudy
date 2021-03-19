public class Main{

    public static void main(String[] args) {
        
        CarDealers c1 = new  CarDealers();
        CarDealers c2 = new  CarDealers(); 
        CarDealers c3 = new  CarDealers(); 
        CarDealers c4 = new  CarDealers(); 
        CarDealers c5 = new  CarDealers(); 
      double rewardMoney;
       
       System.out.println("Program by: Christel Pauline Dominguez and Danfer Lintuan");
       c1.setcarModel(1);
       c1.setSales(20000);
       c1.setAdd("Mayantoc Tarlac"); 
       System.out.println("Address: " + c1.getAddr());
       rewardMoney = c1.rewardMoney(c1.getCarModel(),c1.getAmmount());
       System.out.println("The reward money for car model 1 BMW: " + rewardMoney+ " or " + 500000*.10);
      
       c2.setcarModel(2);
       c2.setSales(15000);
       c2.setAdd("Tarlac City"); 
       System.out.println("Address: " + c2.getAddr());
       rewardMoney = c2.rewardMoney (c2.getCarModel(), c2.getAmmount());
       System.out.println ("The reward money for car model 2 Pajero: " +rewardMoney+" or " + 10000*.12);
    
       c3.setcarModel(3);
       c3.setSales(28500);
        c3.setAdd("Lapaz, Tarlac"); 
       System.out.println("Address: " + c3.getAddr());
       rewardMoney = c3.rewardMoney(c3.getCarModel(),c3.getAmmount());
       System.out.println ("The reward money for car model 3 Honda Civic: " +rewardMoney);
       
       c4.setcarModel(4);
       c4.setSales(50000);
         c4.setAdd("Camiling Tarlac"); 
       System.out.println("Address: " + c4.getAddr());
       rewardMoney = c4.rewardMoney(c4.getCarModel(),c4.getAmmount());
       System.out.println ("The reward money for car model 4 Chevrolet: " +rewardMoney);
       
       c5.setcarModel(3);
       c5.setSales(10000);
         c5.setAdd("Santa Ignacia Tarlac"); 
       System.out.println("Address: " + c5.getAddr());
       rewardMoney = c5.rewardMoney(c5.getCarModel(),c5.getAmmount());
       System.out.println ("The reward money for car model 5 Other Model: " +rewardMoney);    
    
}
