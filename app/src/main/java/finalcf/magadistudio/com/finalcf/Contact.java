package finalcf.magadistudio.com.finalcf;

/**
 * Created by hrido on 12/17/2017.
 */

public class Contact {

    int _id;
    String _name;


    public Contact(){

    }

    public Contact(int  id, String name){
        this._id = id;
        this._name = name;

    }
    public Contact( String name){

        this._name = name;

    }


    public int getID(){
        return this._id;
    }


    public void setID(int id){
        this._id = id;
    }

    public String getName(){
        return this._name;
    }

    public void setName(String name){
        this._name = name;
    }


}
