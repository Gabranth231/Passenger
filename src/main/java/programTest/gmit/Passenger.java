package programTest.gmit;
public class Passenger {
    private String title;
    private String name;
    private String ID;
    private long phone;
    private int age;

    public Passenger(String title, String name, String ID, long phoneNum, int age) {
        setTitle(title);
        setName(name);
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public long getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setTitle(String title) {
        if(title.equals("Mr")||title.equals("Mrs")||title.equals("Ms")){
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Invalid title Provided");
        }
    }

    public void setName(String name) {
        if(name.length()>=3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Invalid name Provided");
        }
    }
}
