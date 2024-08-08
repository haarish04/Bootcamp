public class SingleObject {

    private SingleObject(){}
    private static SingleObject instance = null;

    public static synchronized SingleObject getInstance(){
        if(instance == null)
            instance = new SingleObject();

        return instance;
    }

    @Override
    public Object clone(){
        return null;
    }

    public void showMessage(){
        System.out.println(instance.hashCode());

    }
    
}
