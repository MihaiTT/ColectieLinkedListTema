import java.util.Objects;

public class Town {
    private String name;
    private int kilometri;
    @Override
     public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Town town = (Town) o;
        return kilometri == town.kilometri && name.equals(town.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,kilometri);
    }
    public int getKilometri(){
        return kilometri;
    }
    public String getName(){
        return this.name;
    }
    public Town(String name,int kilometri){
        this.name=name;
        this.kilometri=kilometri;
    }
}
