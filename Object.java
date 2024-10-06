class Demo
{
public static void main(String[]args){
    int a=10;String b="manish";
    void show()
    {
        System.out.println(a+""+b);
    }
}
}
class Object
{
    public static void main(String[] args)
    {
        Demo r=new Demo();
        r.show();
    }
}