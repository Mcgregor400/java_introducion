package inheritance.animal;

public class Horse extends Animal {

    private  int rating;
    public  Horse(String name, int age, int rating){
        super(name,age);
        this.rating = rating;
    }
    @Override
    public void voice(){
    //    super.voice();
        System.out.println("Horse "+ getName()+ " says :Ihaha!");
    }
    public void  ride (int speed){

        System.out.println("Horse " + getName()+ "rides with "+ rating+ "rides with"+speed + "km/h");
    }
}
