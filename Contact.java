import java.util.ArrayList;
class Contact
{
public static void main(String[] arg)
{
ArrayList <String> con= new ArrayList <String>();
con.add("pavitra");
con.add("dharanitha");
con.add("harini");
con.add("pramila");
for(String con1:con)
{
System.out.println(con1);
}
System.out.println("retrive;"+con.get(3));
System.out.println("update;"+con.set(1,"monkey"));
System.out.println("delete;"+con.remove(1));
}
} 