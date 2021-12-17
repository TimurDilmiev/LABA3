public class ObjectsACLASS extends ObjectsINT{
    ObjectsACLASS (String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
    public String stay(){
        return name + "стоит";
    }
    public String putOn(){
        return "на";
    }

}
