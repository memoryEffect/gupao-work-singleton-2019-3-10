package lazysingleton;

/**
 * Created by mzcsh on 2019/3/11.
 */
public enum EnumSingleton {
    INSTANCE;
    private Object date;

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
