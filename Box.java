class Box
{
double W,h,l;
Box()
{
W=3;
h=3;
l=3;
}
void display()
{
double vol=W*h*l;
System.out.println("volume of box:"+vol);
class  Construct
{
public static void main(String args[])
{
Box obj=new  Box();
obj.display();
}
}
}
}