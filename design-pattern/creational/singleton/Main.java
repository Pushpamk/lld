class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getSingletonObj();
        Singleton obj2 = Singleton.getSingletonObj();
        System.out.println(obj1.hashCode() + " " + obj2.hashCode());
    }
}