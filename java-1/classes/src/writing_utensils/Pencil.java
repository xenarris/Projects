package writing_utensils;

public class Pencil
{
    //attributes (fields)
    public String type;
    public String color;
    public boolean eraser;
    public double size;

    //constructor (special method used for assembling objects)
    public Pencil(String newType, String newColor, boolean hasEraser, double newSize)
    {
        //assign my fields with my constructor arguments
        type = newType;
        color = newColor;
        eraser = hasEraser;
        size = newSize;
    }

    public Pencil()
    {
        //assign some default values
        type = "not mechanical";
        color = "yellow";
        eraser = true;
        size = 1;
    }
}
