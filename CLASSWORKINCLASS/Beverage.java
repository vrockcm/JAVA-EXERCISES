package CLASSWORKINCLASS;
import java.util.*;

public abstract class Beverage
{
    private String description;
    private double volume; // in ounces

    public Beverage (String desc, double vol)
    {
        description = desc;
        volume = vol;
    }

    public String getDescription () { return description; }

    public double getVolume () { return volume; }

    public void setDescription (String d) { description = d; }

    public void setVolume (double v) { volume = v; }

    public String toString ()
    {
        return description + ", " + volume + " oz.";
    }
}

class Milk extends Beverage
{
    public Milk (double v)
    {
        super("Milk", v);
    }
}

class Water extends Beverage
{
    public Water (double v)
    {
        super("Water", v);
    }
}

class Juice extends Beverage
{
    protected String flavor;

    public Juice (String f, double v)
    {
        super("juice", v);
        flavor = f;
    }

    public String getFlavor() { return flavor; }

    public void setFlavor (String f) { flavor = f; }

    public String toString()
    {
        return flavor + " " + super.toString();
    }
}

abstract class SoftDrink extends Beverage implements Carbonated
{
    private String brand;

    public SoftDrink (String b, String type, double v)
    {
        super(type, v);
        brand = b;
    }

    public String getBrand () { return brand; }

    public String toString ()
    {
        return brand + " " + super.toString();
    }
}

class Cola extends SoftDrink implements Caffeinated
{
    public Cola (String b, double v)
    {
        super(b, "cola", v);
    }

    public String fizz () { return "sss..."; }
}

class RootBeer extends SoftDrink
{
    public RootBeer (String b, double v)
    {
        super(b, "root beer", v);
    }

    public String fizz () { return "hiss..."; }
}

abstract class Brewed extends Beverage
{
    private boolean isCold;

    public Brewed (String type, double v, boolean i)
    {
        super(type, v);
        isCold = i;
    }

    public boolean isIced () { return isCold; }

    public String toString ()
    {
        String temp = "";

        if (isCold == true)
        {
            temp = "Iced ";
        }

        temp = temp + super.toString();

        return temp;
    }
}

class Coffee extends Brewed
{
    protected ArrayList<CoffeeOption> addOns;

    public Coffee (double vol, boolean iced)
    {
        super("Coffee", vol, iced);
        addOns = new ArrayList<CoffeeOption> ();
    }

}

class Tea extends Brewed
{
    protected ArrayList<TeaOption> addOns;

    public Tea (double vol, boolean iced)
    {
        super("Tea", vol, iced);
        addOns = new ArrayList<TeaOption> ();
    }

}

abstract class Option
{
    private String description;

    public Option (String d) { description = d; }

    public String getDescription () { return description; }

    public String toString ()
    {
        return description;
    }
}

class Cream extends Option implements CoffeeOption, TeaOption
{
    public Cream () { super("cream"); }
}

class Sugar extends Option implements CoffeeOption, TeaOption
{
    public Sugar () { super("sugar"); }
}

class Flavoring extends Option implements CoffeeOption
{
    private String flavor;

    public Flavoring (String f)
    {
        super("flavoring");
        flavor = f;
    }

    public String toString()
    {
        return flavor + " " + super.toString();
    }
}

class Lemon extends Option implements TeaOption
{
    public Lemon () { super("lemon"); }
}

class Honey extends Option implements TeaOption
{
    public Honey () { super("honey"); }
}

interface Carbonated
{
    public String fizz ();
}

interface Caffeinated { }

interface CoffeeOption { }

interface TeaOption { }