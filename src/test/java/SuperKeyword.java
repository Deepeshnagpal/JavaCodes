class M
{


    public static void print()
    {
        System.out.println('C');
    }
}

class N extends M
{
    public static void print()
    {
        System.out.println('F');
    }
}
public class SuperKeyword
{
    public static void main(String[] args)
    {
        M m = new N();
        m.print();
    }
}