package kadryTools;

import java.io.Serializable;
import java.util.ArrayList;

public class DataToFile implements Serializable {
    private ArrayList<Employee> data = new ArrayList<>();

    public DataToFile(){
    };

    public DataToFile(ArrayList<Employee> data) {
        this.data = data;
    }
    public ArrayList<Employee> get(){
        return data;
    }
}
