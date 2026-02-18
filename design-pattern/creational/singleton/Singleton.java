class Singleton {
    private static volatile Singleton instance;

    // prevents bypass from reflection
    private Singleton(){
        if (instance != null)
            throw new RuntimeException("cant create the object"); // uncheck exception
    }

    public static Singleton getSingletonObj() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                    return instance;
                }
            }
        }
        return instance;
    }
}