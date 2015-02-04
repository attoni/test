package test;
class LateBinding
{
    public static void main(String args[])
       {
        A m = new B();
        System.out.println(m.x);
        m.met1();
        m.met2();
        //m.met3();     This line cause compile time error. Thus we comment this line.
       }
}