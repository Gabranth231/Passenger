package programTest.gmit;
public class Passenger {
    private String Title;
    private String Name;
    private String ID;
    private long PhoneNum;
    private int Age;

    public Passenger(String title, String name, String ID, long phoneNum, int age) {
        Title = title;
        Name = name;
        this.ID = ID;
        PhoneNum = phoneNum;
        Age = age;
    }

    public String getTitle() {
        return Title;
    }

    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }

    public long getPhoneNum() {
        return PhoneNum;
    }

    public int getAge() {
        return Age;
    }

    public void setTitle(String title) {
        if(title.equals("Mr")||title.equals("Mrs")||title.equals("Ms")){
            Title =title;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}
