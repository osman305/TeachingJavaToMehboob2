public class Immutable {

    int i;
    Immutable(int i){
        this.i = i;
    }

    public Immutable modifying(int i){

        if(this.i==i){
            return this;
        }else
            return new Immutable(i);
    }
}
