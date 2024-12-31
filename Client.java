class Parent {
protected int x;
public Parent (int x) {
this.x = x;
}
public int Test () {
if (x >= 0)
return x+10;
else return x;
}
}
class Child extends Parent {
public Child (int x) {
super(x);
}
public int Test () {
if (x > 0)
return x+10;
else return x;
}
}
public class Client {
public static void main (String[] args) {
Parent p1 = new Parent(0);
Parent p2 = new Child(0);
if (p1.Test() == p2.Test())
System.out.println("运算结果一致");
else
System.out.println("运算结果不一致");
System.out.println(p1.Test());
System.out.println(p2.Test());
}


}