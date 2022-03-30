package SE311LAB2.WEDNESDAY;

import java.util.ArrayList;

public class Car
{
    private String model;
    private ArrayList<Parts> parts;



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<Parts> getParts() {
        return parts;
    }

    public void setParts(ArrayList<Parts> parts) {
        this.parts = parts;
    }

    public void showModelInfo()
    {
         parts.get(1);
    }

    public void addParts(Parts part)
    {
        parts.add(part);


    }
}
