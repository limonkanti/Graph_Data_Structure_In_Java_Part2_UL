
package designPattern;

public class FactoryClass 
{
    public Shape getShape(String shapeType)
    {
        if(shapeType==null)
        {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE"))
        {
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("TRIANGLE"))
        {
            return new Triangle();
        }
        return null;
    }
}
