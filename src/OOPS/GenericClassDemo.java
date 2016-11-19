
package OOPS;

class AA<T>
{
    T ob;
    void add(T ob)
    {
        this.ob=ob;
    }
    T get()
    {
        return ob;
    }
}
class GenericClassDemo
{
    public static void main(String args[])
    {
        AA<Integer> i=new AA<Integer>();
        i.add(1);
        System.out.println(i.get());
    }
}
