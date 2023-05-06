class Generic1
{
    public static <T> void Display(T Arr[])
    {
      for(T no : Arr)  //For Each
      {
        System.out.println(no);
      }
      /*
      for(int i  = 0; i< Arr.length;i++)
      {
        System.out.println(Arr[i]);
      }*/
    }

    public static void main(String Arg[])
    {
         Integer A[] = {10,20,30,40};
         Float B[] = {50.1f,60.1f,70.1f};
         Double C[] = {50.45,60.56,70.78};

         Display(A);
         Display(B);
         Display(C);

    }
}