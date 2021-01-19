public class person {
    String name;
    String address;

    person(String name, String address){
        this.name = name;
        this.address = address;
    }

    String getName(){
        return this.name;
    }

    String getAddress(){
        return this.address;
    }

    void setAddress(String address){
        this.address = address;
    }

    String getData(){
        return this.name+"("+this.address+")";
    }
}
