package programTest.gmit;
public class Passenger {
    private String title;
    private String name;
    private String ID;
    private String phone;
    private int age;

    public Passenger(String title, String name, String ID, String phoneNum, int age) {
        setTitle(title);
        setName(name);
        setID(ID);
        setPhone(phoneNum);
        setAge(age);
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

    public String getPhone() {
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

    public void setID(String ID) {
        if(ID.length() >=10){
            this.ID = ID;
        }
        else{
            throw new IllegalArgumentException("Invalid ID Provided");
        }
    }

    public void setPhone(String phone) {
        if(phone.length()>=7){
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("Invalid Phone Provided");
        }
    }

    public void setAge(int age) {
        if(age >= 16){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("Invalid Age Provided");
        }
    }
}
