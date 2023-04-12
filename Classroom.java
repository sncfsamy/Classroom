public class Classroom {
    public static void main(String ...arg) {
        Wilder pierre = new Wilder("Pierre",false);
        Wilder paul = new Wilder("Paul",false);
        Wilder jacque = new Wilder("Jacque",true);
        System.out.println(pierre.whoAmI());
        System.out.println(paul.whoAmI());
        System.out.println(jacque.whoAmI());
    }
}
