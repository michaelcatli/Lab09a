int gcf;
public static int getGCF(int num1, int num2){
  double div; int den, int rem;
  do{
    rem = num1%num2;
    if (rem==0){
      gcf = num2;
    }
    else{
      num1=num2;
      num2=rem;
    }
  }
  while (rem!=0);
  return gcf;
}
