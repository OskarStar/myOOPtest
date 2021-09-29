package OOP;

public class Animal {

    private String animalWalk;
    private String wannaEat;

    public void jump(){
        System.out.println("Животные пригают ");
    }

    public void setWannaEat(String wannaEat) {
        this.wannaEat = wannaEat;
    }
    public String getWannaEat(){
        System.out.println(wannaEat);
        return wannaEat;
    }

    public void getAnimalWalk(String wannaEat) {
        if (wannaEat.equals("Покушал")){
            System.out.println("пошли гулять");
        }else {
            System.out.println("Еще голоден");
        }
    }
}
