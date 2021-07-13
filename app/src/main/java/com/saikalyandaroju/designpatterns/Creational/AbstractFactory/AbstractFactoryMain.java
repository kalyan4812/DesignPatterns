package com.saikalyandaroju.designpatterns.Creational.AbstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AnimalFactory animalFactory=AnimalFactory.getAnimalFactory(AnimalType.WILD);
        Animal animal=animalFactory.getAnimal("Lion");
        animal.special();


        AnimalFactory animalFactory2=AnimalFactory.getAnimalFactory(AnimalType.DOMESTIC);
        Animal animal2=animalFactory2.getAnimal("Dog");
        animal2.special();
    }

}
/* other example.
abstract class College
{
public abstract Display getBranchName();
public abstract Display getCount();
};


class CSE extends College
{
public Display getBranchName()
{
return new Display("CSE");
}
public Display getCount()
{
return new Display("120");
}
};


class IT extends College
{
public Display getBranchName()
{
return new Display("IT");
}
public Display getCount()
{
return new Display("90");
}
};


class MCA extends College
{

public Display getBranchName()
{
return new Display("MCA");
}
public Display getCount()
{
return new Display("60");
}
};


class Display
{
public String value;
public Display(String s)
{
this.value=s;
}
public String getValue()
{
return value;
}
};

public class AbstractFactoryPatternTest
{
private College cname;
public static void main(String[] args)
{
AbstractFactoryPatternTest af=new AbstractFactoryPatternTest();
College c=af.getCollege("CSE");
System.out.println();
System.out.println("Object is created for: "+c.getClass());
System.out.println();
System.out.println("Branch Name Is:"+c.getBranchName().getValue());
System.out.println();
System.out.println(c.getBranchName().getValue()+"Branch
Contains "+c.getCount().getValue()+" No.Of Students");
}


//Factory Pattern Logic
public College getCollege(String s)
{
if(s.equals("CSE"))
cname=new CSE();
else if (s.equals("IT"))
cname=new IT();
else if (s.equals("MCA"))
cname=new MCA();
return cname;
} }


 */

