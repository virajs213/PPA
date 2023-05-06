class AbstractDemo
{
    public static void main(String Arg[])
    {  
        //RBI robj = new RBI();
        SBI sobj = new SBI();
        BOM bobj = new BOM();

        sobj.DisplayRules();
        bobj.DisplayRules();

        float fRet = 0.0f;
        fRet = sobj.CalculateROI();
        System.out.println("ROI od SBI is : "+fRet);  //5.7

         fRet = bobj.CalculateROI();
        System.out.println("ROI od BOM is : "+fRet);  //7.7
        

    }
}
abstract class RBI
{
  public abstract float CalculateROI();
  //virtual float CalculateROI = 0
  public void DisplayRules()
  {
    System.out.println("You have to Submit Aadhar Card and PAN Card");
        System.out.println("Minimum Balance is 10,000");

  } 
}

class SBI extends RBI
{
   public float CalculateROI()
   {
    return 5.7f;
   }
}

class BOM extends RBI
{
       public float CalculateROI()
       {
        return 7.7f;
       }
}

